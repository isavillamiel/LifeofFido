import java.util.Random;

public class Objects {
    Random gen = new Random();
    static public class dog{

        private int aggression;
        private int attention;
        dog(){
            aggression = 1;
            attention = 1;
        }
        dog(int agro, int att){
            aggression = agro;
            attention = att;
        }
        private void printGr(){
            System.out.println("Grrr..");
        }
        public void printHi(){
            if(aggression < 3){
                System.out.println("woof");
            }
            else{
                printGr();
            }
        }
        public void isAttentive(){
            if(attention < 3){
                System.out.println("Oh look! A squirrel!");
            }
        }
        public void isAggressive(){
            if(aggression > 3){
                System.out.println("This dog wants to fight!");
                printGr();
            }
        }
    }
    public class cat{}
    static public class human{
        private String name;
        private dog pup;
        human(){
            name = "player";
        }
        human(String name1){
            name = name1;
        }
        // need assignment operator for the dog to go to player possession
        human(dog doggie){
        }
    }
    public class kid extends human{}

}


