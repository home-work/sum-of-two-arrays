import java.util.Random;
import java.util.Scanner;

public class SumOfTwoArrays {
    public static void main(String[] args) {
        int numberOfRows = getNumberOfRows();
        int numberOfColumns = getNumberOfColumns();
        int[][] array_1 = generateArray(numberOfRows,numberOfColumns);
        int[][] array_2 = generateArray(numberOfRows,numberOfColumns);
        System.out.println("Mảng thứ nhất");
        displayArray(array_1);
        System.out.println("\nMảng thứ hai");
        displayArray(array_2);
        System.out.println("\nMa trận tổng");
        displayArray(sumOfArrays(numberOfRows,numberOfColumns,array_1,array_2));

    }

    private static void displayArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }
    }

    private static int[][] generateArray(int numberOfRows,int numberOfColumns) {
        Random random = new Random();
        int[][] array = new int[numberOfRows][numberOfColumns];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = random.nextInt(100) + 1;
            }
        }
        return array;
    }

    private static int getNumberOfRows() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào số hàng của hai ma trận:");
        return scanner.nextInt();
    }

    private static int getNumberOfColumns() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào số cột của hai ma trận:");
        return scanner.nextInt();
    }

    private static int[][] sumOfArrays(int numberOfRows, int numberOfColumns, int[][] array_1, int[][] array_2) {
        int[][] arraySum=new int[numberOfRows][numberOfColumns];
        for (int i = 0; i < arraySum.length; i++) {
            for (int j = 0; j < arraySum[i].length; j++) {
                arraySum[i][j] = array_1[i][j] + array_2[i][j];
            }
        }
        return arraySum;
    }
}
