package gr.aueb.cf.ch16.speakable;

import com.sun.source.tree.CaseTree;

/**
 * Interfaces are NOT instantiable.
 * But we can have a variable type of Interface: Polymorphism.
 */

public class Main {

    public static void main(String[] args) {
        ISpeakable alice = new Cat("Alice");
        ISpeakable bob = new Dog("Bob");

        ISpeakable whiteCat = new Cat("White Cat");
        ISpeakable blackDog = new Dog("Black Dog");

        /**
         * Wiring a Cat or a Dog with the class GenericSpeakingSchool.
         * @construction time: inject the whiteCat and blackDog through the GenericSpeakingSchool Constructor.
         */
        GenericSpeakingSchool aliceSpeakingSchool = new GenericSpeakingSchool(whiteCat);
        GenericSpeakingSchool bobSpeakingSchool = new GenericSpeakingSchool(blackDog);

//        alice.speak();
//        bob.speak();
        doSpeak(alice);
        doSpeak(bob);

    }

    /**
     * Polymorphic method bc the
     * @param speakable ,can take different types of instances.
     * We inject @runtime a speakable parameter of any type that implements the ISpeakable Interface.
     * Is an agnostic method (loosely coupled to param).
     */
    public static void doSpeak(ISpeakable speakable) {
        speakable.speak();
    }
}
