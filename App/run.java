/**
 * run
 */
public class run {

    public static void main(String[] args) {
        mainMenu();
    }

    public static void mainMenu() {
        
        x.printLn("Welcome to DSA-LABS");
        x.printLn("-------------------");
        x.printLn("Choose an option");
        x.printLn("1. Student Details ");
        x.printLn("2. Teacher Details");
        x.printLn("3. Exit");
        String ch=x.strInput("Choice : ");

        switch (ch) {
            case "1":
                
                break;
            case "2":
            x.print("Teacher");
                
                break;
        
            default:
            x.print("invalid choice");
                break;
        }

        
    }
}