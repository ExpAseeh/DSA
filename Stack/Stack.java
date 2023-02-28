class Stack { 
    int[] arr = new int[max]; 
    int top ; 
    static final int max=1000 ; 
    public Stack(){ 
        top=-1; 
    } 
    public boolean isEmpty() { 
        return top <0; 
    } 
    public boolean push(int data) { 
        if (top>=(max-1)) { 
            System.out.println("Stack overflow"); 
            return false; 
        } else { 
            try { 
                arr[++top] = data; 
                System.out.println("Pushed into stack"); 
            } catch(ArrayIndexOutOfBoundsException e) { 
                System.out.println("Must enter a number between 0 and 999.");
            } 
            return true;
        } 
    } 
    
    public int pop() { 
        if (top<0) { 
            System.out.println("Stack underflow"); 
            return 0; 
        } else { 
            int data = arr[top--]; 
            return data; 
        } 
    } 
    public int peek() { 
        if (top<0) { 
            System.out.println("Stack underflow"); 
            return 0; 
        } else { 
            return arr[top]; 
        } 
    } 
}