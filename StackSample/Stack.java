class Stack {
    Student[] arr = new Student[max];
    int top ;
    static final int max=1000 ;
    
    public Stack(){
        top=-1;
    }
    public boolean isEmpty() {
        return top == -1;
    }
    
    
    public boolean push(Student data) {
        if (top>=(max-1)) {
            System.out.println("Stack overflow");
            return false;
        } else {
            arr[++top] = data;
            System.out.println("Pushed into stack");
            return true;
        }
    }
    
    public Student pop() {
        if (top<0) {
            System.out.println("Stack underflow");
            return null;
        } else {
            Student data = arr[top--];
            return data;
        }
        
    }
    
    public Student peek() {
        if (top<0) {
            System.out.println("Stack underflow");
            return null;
        } else {
            return arr[top];
        }
    }
}

