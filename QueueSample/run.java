/**
 * run
 */
public class run {

    public static void main(String[] args) {
        Queue q = new Queue(10);
        
        q.enqueue(new student(100, "Aseeh"));
        q.Display();
    }
}