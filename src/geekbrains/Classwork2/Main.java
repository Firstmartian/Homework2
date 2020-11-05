package geekbrains.Classwork2;

 import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] numbers = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};

        Change1to0(numbers);
        newArray();
        array1();
        isMultiSquareArray();
        isArrayHasMaxandMin();
        sumsArray();
        nArray();
    }

    /* Задание 1 (Задать целочисленный массив, состоящий из элементов 0 и 1.
	 Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. С помощью цикла и условия заменить 0 на 1, 1 на 0)
	 */
    public static void Change1to0(int[] inputNumbers) {
        for (int i = 0; i < inputNumbers.length; i++)
            inputNumbers[i] = 1 - inputNumbers[i];
    }
    /* Задание 2 (Задать пустой целочисленный массив размером 8.
     С помощью цикла заполнить его значениями 0 3 6 9 12 15 18 21) */

    public static void newArray() {
        int[] array1 = new int[8];
        for (int i = 0; i < array1.length; i++) {
            array1[i] = i * 3;
            System.out.println(array1[i]);
        }
        System.out.println();
    }
    /* Задание 3 (Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом,
     и числа меньшие 6 умножить на 2)*/

    public static void array1() {
        int[] array = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 6) {
                array[i] = array[i] * 2;
            }
            System.out.println(array[i]);
        }
        System.out.println();
    }
    /* Задание 4 (Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
     и с помощью цикла(-ов) заполнить его диагональные элементы единицами)*/

    public static void isMultiSquareArray() {
        int[][] matrix = new int[3][3];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
               matrix[i][i] = 1;
                matrix[i][matrix[i].length - 1 - i] = 1;
                System.out.print(matrix[i][j] + " ");
                }
            }
        System.out.println();
        System.out.println();
        }
        /* Задание 5 (Задать одномерный массив и найти в нем минимальный и максимальный элементы
         (без помощи интернета)*/

    public static void isArrayHasMaxandMin() {
        int[] minMaxArray = {1, 4, 6, 8, 9, 11};

        int min = minMaxArray[0];
        int max = minMaxArray[0];

        for (int i = 1; i < minMaxArray.length; i++) {
            if (minMaxArray[i] < min) {
                min = minMaxArray[i];
            }
            if (minMaxArray[i] > max) {
                max = minMaxArray[i];
            }
            System.out.println(Arrays.toString(minMaxArray));
            System.out.println("Минимально значение " + min);
            System.out.println("Максимальное значение " +max);
        }
        System.out.println();
    }

    /* Задание 6 (Написать метод, в который передается не пустой одномерный целочисленный массив,
    метод должен вернуть true, если в массиве есть место, в котором сумма левой и правой части массива
    равны. Примеры: checkBalance([2, 2, 2, 1, 2, 2, || 10, 1]) → true, checkBalance([1, 1, 1, || 2, 1])
     → true, граница показана символами ||, эти символы в массив не входят)*/
    public static void sumsArray() {
        int[] sumsArray = {3, 5, 2, 9, 1};
        int sum1 = sumsArray[0] + sumsArray[1] + sumsArray[2];
        int sum2 = sumsArray[3] + sumsArray[4];
        boolean equally = true;
        for (int i = 0; i < sumsArray.length; i++) {
           if(sum1 == sum2){
               System.out.println(equally);
               System.out.println("Стороны равны");
           } else {
               System.out.println("Стороны не равны");
           }
        }
        System.out.println();
    }

    /* Задание 7(Написать метод, которому на вход подается одномерный массив и число n
     (может быть положительным, или отрицательным), при этом метод должен сместить все элементымассива
      на n позиций. Для усложнения задачи нельзя пользоваться вспомогательными массивами.)*/

    public static void nArray() {
        int[] rightShiftArray = { 1, 2, 3, 4, 5,};
        int buffer = rightShiftArray[0];
        rightShiftArray[0] = rightShiftArray[rightShiftArray.length - 1];

        for (int j = 1; j < (rightShiftArray.length - 1); j++) {
            rightShiftArray[rightShiftArray.length - 1] = rightShiftArray[rightShiftArray.length - j - 1];
        }
        rightShiftArray[1] = buffer;
        System.out.println(rightShiftArray[0]);
        System.out.println("Спасибо");
    }

}



