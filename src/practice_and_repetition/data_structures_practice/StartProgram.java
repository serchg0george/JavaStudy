package practice_and_repetition.data_structures_practice;

import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;
import java.util.LinkedList;

public class StartProgram {
    public static void main(String[] args) {
        StartProgram startProgram = new StartProgram();

        startProgram.addToLinkedList();

        startProgram.printStack();

        startProgram.printQueue();
    }

    public void addToLinkedList(){
        LinkedListLinky<String> linkedList = new LinkedListLinky<>();
        Scanner in = new Scanner(System.in);
        String insertToLinkedList;

        while (true){
            System.out.println("Enter string (or 'n' to exit): ");
            insertToLinkedList = in.nextLine();

            if (insertToLinkedList.equals("n")){
                break;
            }
            linkedList.addToLinkedList(insertToLinkedList);
        }
        linkedList.iterate();
    }

    public void printStack() {
        Stack<String> stringStack = new Stack<>();
        stringStack.push("First added element");
        stringStack.push("Second added element");
        stringStack.push("Third added element");
        stringStack.push("Fourth added element");
        stringStack.push("Fifth added element");

        while(!stringStack.isEmpty()){
            String elements = stringStack.pop();
            System.out.println(elements);
        }
        System.out.println(stringStack.empty());
    }

    public void printQueue() {

        Queue<String> stringQueue = new LinkedList<>();
        stringQueue.add("First added element");
        stringQueue.add("Second added element");
        stringQueue.add("Third added element");
        stringQueue.add("Fourth added element");
        stringQueue.add("Fifth added element");

        while(!stringQueue.isEmpty()){
            String elements = stringQueue.peek();
            System.out.println(elements);
            stringQueue.remove();
        }
        System.out.println(stringQueue.isEmpty());
    }
}
