class Stack {
    int[] stck;
    int tos;
    Stack(int size) {
        stck = new int[size];
        tos = -1;
    }
    void push(int n) {
        if (tos == stck.length - 1)
            System.out.println("Stack is full.");
        else
            stck[++tos] = n;
    }
    int pop() {
        if (tos < 0) {
            System.out.println("Stack underflow.");
            return 0;
        } else {
            return stck[tos--];
        }
    }
}
public class LabExercise9 {
    public static void main(String[] args) {
        Stack s = new Stack(5);
        s.push(10);
        s.push(20);
        s.push(30);
        System.out.println("Popped: " + s.pop());
        System.out.println("Popped: " + s.pop());
    }
}