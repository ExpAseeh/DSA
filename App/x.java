import java.util.Scanner;

public class x {

    private static Scanner myInput = new Scanner(System.in);

    public static void print(String msg) {
        System.out.print(msg);
    }

    public static void printLn(String msg) {
        System.out.println(msg);
    }

    public static String strInput(String msg) {
        print(msg);
        return myInput.nextLine();
    }

    public static int intInput(String msg) {
        print(msg);
        return myInput.nextInt();
    }

}
