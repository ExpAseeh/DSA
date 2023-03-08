public class Queue {
    private static int front,rear,capacity;
    private static student queueList[];

    Queue(int c){
        front=rear=0;
        capacity=c;
        queueList=new student[capacity];

    }

    void enqueue(student data){
        if (capacity==rear) {
            System.out.println("Queue is full");
            return;
        }else{
            queueList[rear]=data;
            rear++;
        }
        return;
    }
    
    void deQueue(){
        if (front==rear){
            System.out.println("Queue is Empty");
            return;
        }
        else{
            for(int i=0;i<rear;i++){
                queueList[i]=queueList[i+1];
            }
        }
        
        if(rear<capacity){
            queueList[rear]=null;
            rear--;
        }
        return;
    }

    void display(){
        int i;
        if (front==rear){
            System.out.println("Queue is Empty");
            return;
        }
        for(i=front;i<rear;i++){
            System.out.println("ID : "+queueList[i].getId()+"\nName : "+queueList[i].getName());
        }
        return;
    }

    void front(){
        
        if (front==rear){
            System.out.println("Queue is Empty");
            return;
        }
        System.out.println("ID : "+queueList[front].getId()+"Name : "+queueList[front].getName());
        return;
    }

}
