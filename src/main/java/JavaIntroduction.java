import java.util.Arrays;

public class JavaIntroduction {

    public static void main(String[] args) {
        int additionResult1 = add(1,2);
        int additionResult2 = add(-3,9);
        int additionResult3 = add(11,-11);
        int additionResult4 = add(22,22);


        int subtractionResult1 = subtract(4,9);
        int subtractionResult2 = subtract(-2,-2);
        int subtractionResult3 = subtract(10,9);
        int subtractionResult4 = subtract(100,100);

        int[] additionResults = {additionResult1,additionResult2,additionResult3,additionResult4};
        int[] subtractionResults = {subtractionResult1,subtractionResult2,subtractionResult3, subtractionResult4};

        System.out.println("For loop Results: ");
        printArrayWithForLoop(additionResults);
        printArrayWithForLoop(subtractionResults);

        System.out.println("While loop results: ");
        printArrayWithWhileLoop(additionResults);
        printArrayWithWhileLoop(subtractionResults);

    }
    public static int add(int x, int y) {
        return x + y;
    }
    public static int subtract(int x, int y) {
        return x - y;
    }
    public static void printArrayWithForLoop(int[] arr) {
        for (int j : arr) {
            System.out.println(isEvenOrOdd(j) + " " + j + "\n");
        }
    }
    public static void  printArrayWithWhileLoop(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int cur = arr[i];
            System.out.print(isEvenOrOdd(cur)+ " " + cur + " ");
            i++;
        }
    }
    public static String isEvenOrOdd (int n) {
        if(n % 2 == 0) {
            return "even";
        }
        return "odd";
    }
}
