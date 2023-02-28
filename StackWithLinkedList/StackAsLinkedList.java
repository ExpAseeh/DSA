class StackAsLinkedList {
    Node root;

    public boolean isEmpty() {
        return root == null;
    }

    public void push(Student data) {
        if (isEmpty()) {
            root=new Node(data);
        }else{
            Node temp = root;
            Node newnNode = new Node(data);
            newnNode.next = temp;
        }
        System.out.println("Pushed into Stack");
        
    }

    public Student pop() {
        if (isEmpty()) {
            System.out.println("Stack is Empty");
            return null;
        }
        Student data = root.data;
        root = root.next;
        return data;
    }

    public Student peek() {
        if (isEmpty()) {
            System.out.println("Stack is Empty");
            return null;
        }
        return root.data;
    }
}
