import java.util.Scanner;

public class challangeArray {

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        //sort descending

        int[] numbers = getArray(5);
        int[] afterSort = sortIntegers(numbers);
        printArray(numbers);


        printArray(afterSort);


    }

    public static int[] getArray(int volumen) {
        System.out.println("Enter " + volumen + " numbers");
        int[] array = new int[volumen];

        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();

        }

        return array;
    }

    public static void printArray(int[] tablica) {

        for (int i = 0; i < tablica.length; i++) {
            int time = i + 1;
            System.out.println("Element " + time + ", type value was " + tablica[i]);
        }

    }

    public static int[] sortIntegers(int[] array) {
        int[] sortArray = new int[array.length];
        for (int i = 0; i < sortArray.length; i++) {
            sortArray[i] = array[i];

        }
        boolean flag = true;
        int temp;

        while (flag) {
            flag = false;
            for (int i = 0; i < sortArray.length - 1; i++) {
                if (sortArray[i] < sortArray[i + 1]) {
                    temp = sortArray[i];
                    sortArray[i] = sortArray[i + 1];
                    sortArray[i + 1] = temp;
                    flag = true;

                }


            }
        }
        return sortArray;
    }
}
