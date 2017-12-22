import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner kd = new Scanner(System.in);
        System.out.println("Hello, player!");
        System.out.println("What is your name?");
        System.out.println("");
        String myname = kd.nextLine();
        System.out.println("Welcome, "+myname+ ".");
        Objects.human player = makePlayer(myname);

        Objects.dog fido = new Objects.dog(4,1);
        fido.printHi();

    }
    public static Objects.human makePlayer(String name){
        Objects.human me = new Objects.human(name);
        return me;
    }
}
