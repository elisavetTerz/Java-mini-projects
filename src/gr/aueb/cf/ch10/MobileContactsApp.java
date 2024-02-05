package gr.aueb.cf.ch10;

import java.util.Arrays;
import java.util.Scanner;

/**
 * This is an app
 * takes as data an array with user's mobile contact info: firstname, lastname, mobile
 * Create contact - Read: Select contact's info - Update contact's info and Delete
 * Reusable - Scalable - Maintainable - Testable : MODULARIZATION
 * Layered Technic - Delegation pattern:
 * Controller (Validation) - Service layers - CRUD methods - Data source
 */

public class MobileContactsApp {

    //global declarations: all methods have access
    //Scanner is a class, we declare it as final for compile time safety (avoid programmings errors)
    final static Scanner in = new Scanner(System.in);
    final static String[][] contacts = new String[500][3]; //If we have primitives we write Final
    static int pivot = -1; //we need pivot to know in which position in our table we insert-create a record

    public static void main(String[] args) {

    }

    /*
     * Controllers
     */

    public static String insertContactController(String[] contact) {
        String response = "";
        String[] errorsArray;
        if (contact == null) return "nullError";
        try {
            //errorsArray = validate(contact)
            errorsArray = validateInsertContact(contact);
            if (!errorsArray[0].isEmpty() || !errorsArray[1].isEmpty() || !errorsArray[2].isEmpty()) {
                for (String message : errorsArray) {
                    response += message + "\n";
                }
                return response; //validation failure
            }
            insertContactService(contact);
            response = "OK"; //success
        } catch (Exception e) {
            return e.getMessage(); //exception failure
        }
        return response;
    }
    //errorsArray = validate(contact)
    public static String[] validateInsertContact(String[] contact) {
        String[] errorsArray = new String[] {"", "", ""};
//regex: \S:not space character (match the words without spaces)
        if (contact[0].matches("\\S+") || contact[0].length() < 2) {
            errorsArray[0] = "InvFirstname";
        }
        if (contact[1].matches("\\S+") || contact[1].length() < 2) {
            errorsArray[1] = "InvLastname";
        }
        if (contact[2].matches("\\S+") || contact[2].length() != 10) {
            errorsArray[1] = "InvPhone";
        }
        return errorsArray;
    }


    /*
     * Service Layer
     */
    public static String[] getContactByPhoneNumberService(String phoneNumber) throws Exception {
        String[] contact;

        try {
            contact = getContactByPhoneNumber(phoneNumber);
            if (contact.length == 0) {
                throw new Exception("Contact not found");
            }
            return contact;
        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        }
    }

    public static String[][] getAllContactsService() throws Exception {
        String[][] allContacts;

        try {
            allContacts = getAllContacts();
            if (allContacts.length == 0) {
                throw new Exception("List is empty");
            }
            return allContacts;
        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        }
    }

    public static void insertContactService(String... contact) throws Exception {
        boolean isInserted = false;
        if (contact.length != 3) return;

        try {
            isInserted = insertContact(contact[0], contact[1], contact[2]);
            if (!isInserted) {
                throw new Exception("Phone already exists");
            }
        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        }
    }

    public static void updateContactService(String... contact) throws Exception {
        boolean isUpdated = false;
        if (contact.length != 3) return;

        try {
            isUpdated = updateContact(contact[0], contact[1], contact[2]);
            if (!isUpdated) {
                throw new Exception("Contact does not exist");
            }
        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        }
    }

    public static void deleteContactService(String phoneNumber) throws Exception {
        boolean isDeleted = false;

        try {
            isDeleted = deleteContact(phoneNumber);
            if (!isDeleted) {
                throw new Exception("Contact does not exist");
            }
        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        }
    }


    /*
     * CRUD Methods - CRUD Layer. Create Return Update Delete
     */

    /**
     * This is a helpful method
     * Search contacts: if contact found returns the position i of contact in the table
     * if not found returns -1
     * @param phoneNumber
     * @return
     */
    public static int getByPhoneNumber(String phoneNumber) {
        //pivot starts from -1 and shows the position we are
        for (int i =  0; i <= pivot; i++) {
            if(contacts[i][2].equals(phoneNumber)) {
                return i;
            }
        }
        return -1;
    }

    public static boolean isFull(String [][] contacts) {
        return (pivot == contacts.length - 1);
    }

    /**
     * CRUD: Create
     * @param firstname
     * @param lastname
     * @param phoneNumber
     * @return
     */
    public static boolean insertContact(String firstname, String lastname, String phoneNumber) {
        boolean inserted = false;

        if(isFull(contacts)) return false;

        if(getByPhoneNumber(phoneNumber) != 1) {
            return false;
        }
        pivot++;
        contacts[pivot][0] = firstname;
        contacts[pivot][1] = lastname;
        contacts[pivot][2] = phoneNumber;
        return true;
    }

    /**
     * CRUD: Update
     * @param firstname
     * @param lastname
     * @param phoneNumber
     * @return
     */
    public static boolean updateContact(String firstname, String lastname, String phoneNumber) {
        int positionToUpdate = getByPhoneNumber(phoneNumber);
        if (positionToUpdate == -1) {
            return false;
        }
        contacts[positionToUpdate][0] = firstname;
        contacts[positionToUpdate][1] = lastname;
        return true;
    }

    /**
     * CRUD: Delete
     * @param phoneNumber ,we need only one parameter which is the key (id) of the contact we want to delete
     *                    we choose to use phoneNumber as key to find the contact
     * @return
     */
    public static boolean deleteContact(String phoneNumber) {
        int positionToDelete = getByPhoneNumber(phoneNumber);

        if (positionToDelete == -1) {
            return false;
        }
        //This is a method which copies indexes automatically, we do not need to do it manually
        //last parameters shows how many fields I want  to copy
        System.arraycopy(contacts, positionToDelete + 1, contacts, positionToDelete, pivot - positionToDelete);
        pivot--;
        return true;
    }

    public static String[] getContactByPhoneNumber(String phoneNumber) {
        int position = getByPhoneNumber(phoneNumber);
        //if contact not found return empty array (string with length=0) else return the contact
        return (position == -1) ? new String[] {} : contacts[position];
    }

    public static String[][] getAllContacts() {
        // Arrays return from 0 til length-1, so if we want to return until pivot we need to write pivot+1
        //++pivot or pivot+1
        return Arrays.copyOf(contacts, pivot + 1);
    }
}
