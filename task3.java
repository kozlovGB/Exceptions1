package Exceptions1;

import java.util.Random;

//Реализуйте метод, принимающий в качестве аргументов два целочисленных массива,
// и возвращающий новый массив, каждый элемент которого равен разности элементов двух входящих массивов в той же ячейке.
// Если длины массивов не равны, необходимо как-то оповестить пользователя.
public class task3 {
    public static void main(String[] args) {
        int[] firstArray = getRandomArray(10);
        int[] secondArray = getRandomArray(9);

        int[] divArray = divArrays(firstArray, secondArray);
        for (int item: divArray){
            System.out.println(item);
        }
    }

    public static int[] divArrays(int[] firstArray, int[] secondArray) {
        if(firstArray.length != secondArray.length) throw new RuntimeException("Arrays of different lengths");
        int[] resultArr = new int[firstArray.length];
        for (int i = 0; i < resultArr.length; i++) {
            resultArr[i] = firstArray[i] - secondArray[i];
        }
        return resultArr;
    }

    public static int[] getRandomArray(int length){
        int[] array = new int[length];
        Random rnd = new Random();
        for (int i = 0; i < length; i++) {
            array[i] = rnd.nextInt(20);
        }
        return array;
    }
}
