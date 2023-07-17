import java.util.Scanner;

public class SumOfSubarraySum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of array : ");
        int size = scanner.nextInt();
        System.out.println("Enter the elements of array : ");
        int[] array = new int[size];
        for (int i = 0; i < size; i++){
            array[i] = scanner.nextInt();
        }
        int output = findSumOfSubarraySum(array);
        System.out.println("Output : " + output);
    }

    private static int findSumOfSubarraySum(int[] array) {
        int sum = 0;
        int size = array.length;
        for(int i = 0; i < size; i++){
            sum += (i + 1) * (size - i) * array[i];
        }
        return  sum;
    }
//
//    private static int findSumOfSubarraySum(int[] array) {
//        int totalSum = 0, subarraySum;
//        for (int i = 0; i < array.length; i++){
//            subarraySum = 0;
//            for (int j = i ; j < array.length; j++){
//                subarraySum += array[j];
//                totalSum += subarraySum;
//            }
//        }
//        return totalSum;
//    }


}
