package gr.aueb.cf.ch16.speakable;

/**
 * Composition with Interface.
 * Is known as DI (Dependency Injection) or IoC (Inversion of Control).
 * Is a loosely coupled class, bc we inject the instance @runtime.
 */
public class GenericSpeakingSchool {
    private final ISpeakable speakable;

    /**
     * Agnostic method-constructor.
     * Inject @runtime an instance type of ISpeakable.
     * @param speakable , injected instance.
     */
    public GenericSpeakingSchool(ISpeakable speakable) {
        this.speakable = speakable;
    }

    public void learnToSpeak() {
        speakable.speak();
    }
}
