import java.util.Scanner;

/**
 * run
 */
public class run {

    public static void main(String[] args) {
        Queue q = new Queue(10);
        Scanner scanner=new Scanner(System.in);
        q.enqueue(new student(100, "Aseeh"));
        q.display();

        System.out.println("Enter Student Name :");
    }
}