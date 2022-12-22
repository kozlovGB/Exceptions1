package Exceptions1;//Реализуйте метод, принимающий в качестве аргументов два целочисленных массива, и возвращающий новый массив,
// каждый элемент которого равен частному элементов двух входящих массивов в той же ячейке. Если длины массивов не равны,
// необходимо как-то оповестить пользователя. Важно:
// При выполнении метода единственное исключение, которое пользователь может увидеть - RuntimeException, т.е. ваше

import java.util.Random;

public class task4 {
    public static void main(String[] args) {
        Float[] firstArray = getRandomArray(10);
        Float[] secondArray = getRandomArray(10);

        Float[] divArray = divArrays(firstArray, secondArray);
        printArray(divArray);

        Float[] badArray = divArrays(null, secondArray);
        printArray(badArray);
}

    public static Float[] divArrays(Float[] firstArray, Float[] secondArray) {
        if (firstArray == null || secondArray == null) throw new RuntimeException("Arrays are not defined");
        if(firstArray.length != secondArray.length) throw new RuntimeException("Arrays of different lengths");

        Float[] resultArr = new Float[firstArray.length];
        for (int i = 0; i < resultArr.length; i++) {
            resultArr[i] = firstArray[i]/secondArray[i];
        }
        return resultArr;
    }

    public static Float[] getRandomArray(int length){
        Float[] array = new Float[length];
        Random rnd = new Random();
        for (int i = 0; i < length; i++) {
            array[i] = rnd.nextFloat(1,20);
        }
        return array;
    }

    public static void printArray(Float[] array){
        for (Float number: array){
            System.out.println(number);
        }
    }
}
