package homework.practice_with_linked_list;
Hom
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class LinkedListImplementation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> booksLinkedList = new LinkedList<>();
        boolean isAddNewBook = true;
        while (isAddNewBook) {
            System.out.println("Do you want to add new book? Please enter Y/N ");
            String yesNoStatement = scanner.nextLine();
            if (yesNoStatement.equals("Y")) {
                System.out.println("Enter book name, please.");
                String bookName = scanner.nextLine();
                booksLinkedList.add(bookName);
            } else if (yesNoStatement.equals("N")) {
                isAddNewBook = false;
            } else {
                System.out.println("We have exception here");
            }

        }

        System.out.println("Count of books in library and their names: " + booksLinkedList.toArray().length + "  " + booksLinkedList);

    }
}
