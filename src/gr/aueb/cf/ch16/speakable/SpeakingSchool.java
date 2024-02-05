package gr.aueb.cf.ch16.speakable;

public class SpeakingSchool {
    /**
     * Private field is an instance type Cat.
     * Class SpeakingSchool is tightly coupling with class Cat.
     * We cannot have as field an instance type of Dog.
     */
    private final Cat cat;

    public SpeakingSchool() {
        cat = new Cat();
    }

    public void learnToSpeak() {
        cat.speak();
    }
}
