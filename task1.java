package Exceptions1;

public class task1 {
    public static void main(String[] args) {
        String[] sArray = {"15460", null, "tohkjbkjbjkb"};
        int[] array = {1,2,3,4,5,6,7,8,9,10,11,12};
        division(10, 0);
        printValueByIndex(array,12);
        printStringArray(sArray);

    }
    // division by zero
    public static void division(double a, double b){
        if(b ==  0) throw new ArithmeticException("division by zero is not possible in this calculator");
        double result = a/b;
        System.out.printf("division result: %f.\n", result);
    }
    // out of bounds
    public static void printValueByIndex(int[] array, int index){
        if(index > array.length-1) throw new ArrayIndexOutOfBoundsException("There is no element with such an index");
        else System.out.printf("An element with an index %d : %d.\n",index, array[index]);
    }

    // Null pointer exception
    public static void printStringArray(String[] sArray){
        for (String item: sArray){
            if(item == null) throw new NullPointerException("There is no such element");
            System.out.println(item);
        }
    }
}