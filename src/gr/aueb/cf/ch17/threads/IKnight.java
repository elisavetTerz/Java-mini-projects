package gr.aueb.cf.ch17.threads;

public interface IKnight {

    //Table with 3 missions
    IMission[] missions = {
            new KillTheDragonMission(),
            new SaveThePrincess(),
            new KillTheDragonMission()
    };

    //polymorphic: takes as parameter an instance: Functional Interface
    void embarkOnMission(IMission mission);
}
