package DSA;
import java.util.Arrays;

public class Implement{ 
public static void main(String[] args, Object size){
     int totalCapacity;
     int[] stackArray;
     int top;

    ArrayStack(size) {
        totalCapacity = size;
        stackArray = new int[totalCapacity];
        top = -1;
    }

    public void push(int value) {
        if (top < totalCapacity - 1) {
            top++;
            stackArray[top] = value;
            System.out.println("Succesfully pushed");
        } else {
            System.out.println("Stack is full");
        }
    }

    public int pop() {
        if (top >= 0) {
            int poppedValue = stackArray[top];
            top--;
            System.out.println("Succusfully Popped" );
            return poppedValue;
        } else {
            System.out.println("Empty stsck");
            return -1;
        }
    }

    public static void main(String[] args) {
        ArrayStack stack = new ArrayStack(8);
        stack.push(97);
        stack.push(289);
        stack.pop();
        stack.push(4455);
        stack.push(50);
        stack.push(6);
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
    }
  }

private static void ArrayStack(Object size) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'ArrayStack'");
}
}

    
    