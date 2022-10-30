import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Array_task_plus");
        task1();
        task2();
        task3();
        task4();
        task5();


    }

    private static void task5() {
        System.out.println("Task 9/ все пары чисел");
        int[] arr = { -6, 2, 5, -8, 8, 10, 4, -7, 12, 1};
        int sum = -2;
        for (int k : arr) {
            for (int j = arr.length - 1; j != -1; j--) {
                if (k + arr[j] == sum) {
                    System.out.printf("Сумма чисел %d и %d = %d\n", k, arr[j], sum);
                }
            }
        }
    }

    private static void task4() {
        System.out.println("Task 8/ встречается на собеседованиях ");
        int[] arr = { -6, 2, 5, -8, 8, 10, 4, -7, 12, 1};
        int sum = -2;
        for (int k : arr) {
            for (int j = arr.length - 1; j != -1; j--) {
                if (k + arr[j] == sum) {
                    System.out.printf("Сумма чисел %d и %d = %d\n", k, arr[j], sum);
                }
            }
            break;
        }
    }

    private static void task3() {
        System.out.println("Task 7/ преобразование массива.");
        int[] arr = {5, 4, 3, 2, 1};
        System.out.println(Arrays.toString(arr));
//        Arrays.sort(arr);

        int head = 0;
        int tail = arr.length - 1;

        while (head < tail) {
            int tmp = arr[head];
            arr[head++] = arr[tail];
            arr[tail--] = tmp;
        }
        System.out.println(Arrays.toString(arr));

    }

    private static void task2() {
        System.out.println("Task 6/ переработать код");
        int[] arr = {5, 4, 3, 2, 1};
        int[] arrCopy = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            arrCopy[i] = arr[arrCopy.length -1 -i];
        }
        System.out.println(Arrays.toString(arrCopy));
    }

    private static void task1() {
        System.out.println("Task 5/ Создайте матрицу 3х3 ");
        int[][] matrix = new int[3][3];
        for (int i = 0; i < matrix.length; i++) {
            matrix[i][i] =1;
            matrix[i][matrix.length - 1 - i] = 1;
        }
        for (int[] row : matrix) {
            for (int column : row) {
                System.out.print(column + " ");
            }
            System.out.println();
        }
    }
}