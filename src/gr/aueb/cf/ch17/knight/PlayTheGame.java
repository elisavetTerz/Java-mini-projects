package gr.aueb.cf.ch17.knight;

public class PlayTheGame {

    public static void main(String[] args) {
        IKnight joa = new Knight();
        IKnight saintGeorge = new Knight();

//        joa.embarkOnMission(new IMission() {
//            //embark is callback
//            @Override
//            public void embark() {
//                System.out.println("Save the princess");
//            }
//        });

//        saintGeorge.embarkOnMission(new IMission() {
//            @Override
//            public void embark() {
//                killTheDragon();
//            }
//        });
        //With functional interfaces we can use Lambdas and can make our code shorter
        //Only Functional Interfaces can be replaced with Lambdas!!!
//        joa.embarkOnMission(() -> System.out.println("Save the princess"));
//        saintGeorge.embarkOnMission(() -> killTheDragon());

        joa.embarkOnMission(PlayTheGame::saveThePrincess);
        saintGeorge.embarkOnMission(PlayTheGame::killTheDragon);
    }


    public static void killTheDragon() {
        System.out.println("Kill the Dragon");
    }
    public static void saveThePrincess() {
        System.out.println("Save the Princess");
    }
}
