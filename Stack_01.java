package dsa450;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Stack_01 {
    public static void main(String args[]){
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter size of stack");
       int capacity = sc.nextInt();
       MyStack ms = new MyStack(capacity);
       MyUtility mu = new MyUtility();
       mu.printStack(ms);

       int resInteger=-100;
       while(resInteger!=-200) {
           System.out.println("Which operation you want to perform?Choose 1 for push,2 for pop, 3 for peek, 4 for print stack, 5 for exit");
           resInteger = sc.nextInt();

           if (resInteger == 1 && !mu.isStackFull(ms)) {
               mu.push(sc, ms);
           }
           if (resInteger == 2) {
               mu.pop(sc, ms);
           }
           if (resInteger == 3) {
               mu.peek(sc, ms);
           }
           if (resInteger == 4){
               mu.printStack(ms);
           }
           if (resInteger == 5) {
               resInteger = -200;
           }
       }

    }
}

class MyStack{
    private int[] arr;

    private int capacity;
    private int top = -1;

    public MyStack(int capacity) {
        this.arr = new int[capacity];
        this.capacity = capacity;
        for(int i=0;i<arr.length;i++){
            this.arr[i] = -1000;
        }
    }

    public int[] getArr() {
        return arr;
    }

    public void setArr(int[] arr) {
        this.arr = arr;
    }

    public int getTop() {
        return top;
    }

    public void setTop(int top) {
        this.top = top;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public void push(int element){
        //check overflow condition
        if(top==capacity-1){//if true, stack is full, cannot take any more element
            throw new RuntimeException("Stack is full to it's capacity.Unable to push");
        }
        else {
            arr[++top] = element;
        }
    }

    public int pop(){
        //check underflow condition
        if(top==-1)//if true,stack is already empty, cannot pop
        {
            throw new RuntimeException("stack is already empty, cannot pop");
        }
        int result = arr[top];
        arr[top] = -1000;
        top--;
        return result;
    }

    public void peek(){
        if(top==-1)//if true,stack is already empty, cannot peek
        {
            throw new RuntimeException("stack is empty, cannot peek");
        }
        System.out.println(arr[top]);
    }
}

class MyUtility{
    public void printStack(MyStack ms){
        System.out.println("Printing Stack");
        int arr[] = ms.getArr();
        for(int item:arr){
          System.out.println(item);
        }
    }

    public boolean isStackFull(MyStack ms){
        boolean result = false;
        if(ms.getTop()==ms.getCapacity()-1){
            result = true;
            System.out.println("Stack is full");
        }
        return result;
    }

    public boolean isStackEmpty(MyStack ms){
        boolean result = false;
        if(ms.getTop()==-1){
            result = true;
            System.out.println("Stack is empty");
        }
        return result;
    }

    public void push(Scanner sc,MyStack ms){
        boolean flag = true;
        String resString = "";
        do{
            System.out.println("Do you want to insert any element?Y/N");
            resString = sc.next().toLowerCase();
            if(resString.equals("y")){
                System.out.println("Enter integer element to be inserted:");
                int element = sc.nextInt();
                ms.push(element);
                this.printStack(ms);
            }
            else
            {
                flag = false;
            }
        }while(!this.isStackFull(ms) && flag);
    }

    public void pop(Scanner sc,MyStack ms){
        boolean flag = true;
        String resString = "";
        do{
            System.out.println("Do you want to remove the top element of stack?Y/N");
            resString = sc.next().toLowerCase();
            if(resString.equals("y")){
                ms.pop();
                this.printStack(ms);
            }
            else
            {
                flag = false;
            }
        }while(!this.isStackEmpty(ms) && flag);
    }

    public void peek(Scanner sc,MyStack ms){
       ms.peek();
    }
}
