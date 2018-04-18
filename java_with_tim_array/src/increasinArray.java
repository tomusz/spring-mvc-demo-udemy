import java.util.Scanner;

public class increasinArray {

    private static Scanner s = new Scanner(System.in);
    private static int[] baseData = new int[10];

    public static void main(String[] args) {

        System.out.println("Enter 10 integers:");
        getInput();
        printArray(baseData);
        resizeArray();
        System.out.println("Enter 12 integers:");
        getInput();
        printArray(baseData);
    }

    private static void getInput() {
        for (int i = 0; i < baseData.length; i++) {
            baseData[i] = s.nextInt();
        }
    }

    private static void printArray(int[] Array) {

        for (int i = 0; i < Array.length; i++) {
            System.out.print(Array[i] + " ");
        }
        System.out.println("");
    }

    private static void resizeArray() {
        int[] orginal = baseData;

        baseData = new int[12];
        for (int i = 0; i < orginal.length; i++) {
            baseData[i] = orginal[i];
        }
    }
}
