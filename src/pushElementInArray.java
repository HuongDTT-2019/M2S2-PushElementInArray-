import java.util.Scanner;

public class pushElementInArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] array;
        System.out.println("Enter the size of array:");
        int size = input.nextInt();
        array = new int[size];
        int i = 0;
        while (i < array.length) {
            System.out.print("Enter element " + (i + 1) + ": ");
            array[i] = input.nextInt();
            i++;
        }
        System.out.println("Enter the value of array:");
        int input_value = input.nextInt();
        System.out.println("Enter the index of array:");
        int index = input.nextInt();
        insertElement(array, input_value, index);
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + " ");
        }

    }

    public static void insertElement(int[] array, int x, int index) {
        for (int i = 0; i < array.length; i++) {
            if (index <= 1 || index >= array.length - 1) {
                System.out.println("can't insert into array");
                break;
            } else if (i == index) {
                for (int j = index; j < array.length; j++) {
                    int temp = array[j];
                    array[j] = x;
                    array[j + 1] = temp;
                    break;
                }
            }
        }
    }
}
