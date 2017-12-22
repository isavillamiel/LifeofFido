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
    private class human{}
    public class kid extends human{}

}


