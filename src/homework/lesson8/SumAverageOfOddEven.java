package homework.lesson8;

public class SumAverageOfOddEven {
    public static void main(String[] args) {
        int[] arr = {3, 6, 4, 3, 8, 5, 4};
        int arrSum = 0;
        float arrAverage = 0;
        for (int i = 0; i < arr.length; i++)
            arrSum += arr[i];
            System.out.println("Array sum of number is:" + " " + arrSum);

        for (int num : arr)
            arrAverage += num;
            arrAverage = (arrSum / arr.length);
            System.out.println("Average of number is:" + " " + arrAverage);

        System.out.print("Odd Numbers:");
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2!=0){
                System.out.print(i);
            }
        }
        System.out.print("\nEven Numbers:");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                System.out.print(arr[i]);

            }
        }
    }
}