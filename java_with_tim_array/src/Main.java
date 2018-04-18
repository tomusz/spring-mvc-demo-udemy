import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    private static GroceryList groceryList = new GroceryList();

    public static void main(String[] args) {
        boolean quit = false;
        int choice = 0;
        printInstructions();
        while (!quit) {
            System.out.println("Enter your choice");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 0:
                    printInstructions();
                    break;
                case 1:
                    groceryList.printGroceryList();
                    break;
                case 2:
                    addItem();
                    break;
                case 3:
                    modifyItem();
                    break;
                case 4:
                    removeItem();
                    break;
                case 5:
                    searchForItem();
                    break;
                case 6:
                    prossesArrayList();
                case 7:
                    quit = true;
                    break;
            }
        }

    }


    public static void printInstructions() {

        System.out.println("\nPick what you would like to do:");
        System.out.println("\t1. Show Grocery List");
        System.out.println("\t2. Add item to Grocery List");
        System.out.println("\t3. Modify Item in Grocery List");
        System.out.println("\t4. Delete Item form Grocery List");
        System.out.println("\t5. Search for item in Grocery List");
        System.out.println("\t6. Quit ");
        System.out.println("\t0. For instructions ");

    }

    public static void addItem() {
        System.out.println("Please enter Grocery Item name ");
        groceryList.addGroceryItme(scanner.nextLine());
    }

    public static void modifyItem() {
        System.out.print("Enter old item name: ");
        String oldItem = scanner.nextLine();
        scanner.nextLine();
        System.out.print("Enter new item name: ");
        String newItem = scanner.nextLine();
        System.out.println();
        groceryList.modifyGroceryItem(oldItem, newItem);

        System.out.println("You have just changed old item with new " + newItem);
    }

    public static void removeItem() {

        System.out.print("Enter item name for delete: ");
        String deletedItem = scanner.nextLine();
        System.out.println();
        groceryList.removeGroceryItem(deletedItem);
        System.out.println("Item removed");

    }

    public static void searchForItem() {

        System.out.print("Enter name of searched item: ");
        String name = scanner.nextLine();
        System.out.println();
        if (groceryList.onFile(name)) {
            System.out.println(name + " is on the list");
        } else {
            System.out.println("No " + name + " on the list, sorry.");
        }

    }

    public static void prossesArrayList(){
        ArrayList<String> newArray = new ArrayList<String>();
        newArray.addAll(groceryList.getGroceryList());

        ArrayList<String> nextArray = new ArrayList<String>(groceryList.getGroceryList());

        String[] myArray = new String[groceryList.getGroceryList().size()];
        myArray = groceryList.getGroceryList().toArray(myArray);
    }

}
