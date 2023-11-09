import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Collections;
public class Lab2 {
    /**public static void main(String[] args) {
        System.out.println("Введите размер массива: ");
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++){
            a[i] = (int)(Math.random() * ((10+10)+1))-10;
        }
        System.out.println("Массив элементов:");
        printMass(mass);
        for (int i = 0; i < n/2; i++){
            int temp = mass[i];
            mass[i] = mass[n - i - 1];
            mass[n - i - 1] = temp;
        }
        System.out.println("Развёрнутый массив:");
        printMass(mass);
    }
    public static void printMass(int[] arr){
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }**/
    /**public static void main(String[] args) {
        System.out.println("Введите размер массива: ");
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] x = new int[n];
        for (int i = 0; i < n; i++){
            x[i] = (int)(Math.random() * ((10+10)+1))-10;
        }
        System.out.println("Массив элементов:");
        for (int i = 0; i < n; i++){
            System.out.print(x[i] + " ");
        }
        System.out.println();
        List<Integer> arr = new ArrayList<Integer>();
        for (int i = 0; i < n; i++){
            if (x[i] < 0){
                arr.add(x[i]/2);
            }
        }
        Collections.sort(arr);
        System.out.println("Сжатый и отсортированный массив:\n" + arr);
    }**/
    /**public static void main(String[] args) {
        System.out.println("Введите размер матрицы: ");
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int m = s.nextInt();
        int mass[][] = new int[n][m];
        for (int i = 0; i < n; i++){
            for (int j = 0; j < m; j++){
                mass[i][j] = (int)(Math.random() * ((10+10)+1))-10;
            }
        }
        printMass(mass);
        System.out.println(vector(mass));;
    }
    public static void printMass(int arr[][]){
        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j <arr[i].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static int vector(int arr[][]){
        System.out.println("Введите заданное значение:");
        Scanner s = new Scanner(System.in);
        int arg = s.nextInt();
        System.out.println("Введите строку в которой считать:");
        int str = s.nextInt();
        int B = 0;
        for (int j = 0; j <arr[str].length; j++){
            if (arr[str-1][j] < arg){
                B += 1;
            }
        }
        return B;
    }**/
    public static void main(String[] args) {
        System.out.println("Введите размер матрицы: ");
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int mass[][] = new int[n][n];
        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                mass[i][j] = (int)(Math.random() * ((10+10)+1))-10;
            }
        }
        for (int i = 0; i < mass.length; i++){
            for (int j = 0; j <mass[i].length; j++){
                System.out.print(mass[i][j] + " ");
            }
            System.out.println();
        }
        double result = 1;
        int count = 0;
        for (int i = 0; i < mass.length; i++) {
            for (int j = 0; j < mass.length; j++) {
                if (i + j == mass.length - 1 && mass[i][j] > 0) {
                    result *= mass[i][j];
                    count++;
                }
            }
        }
        System.out.println(Math.pow(result, 1.0 / count));
    }
}
