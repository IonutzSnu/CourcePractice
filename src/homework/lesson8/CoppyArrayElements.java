package homework.lesson8;

public class CoppyArrayElements {
    public static void main(String[] args) {
        int[] arr1 = {7, 9, 7, 5, 7, 2};
        int[] arr2 = new int[arr1.length];

        for (int i = 0; i < arr1.length; i++)
            arr2[i] = arr1[i];

        System.out.print("First array is: " + " ");
        for (int i = 0; i < arr1.length; i++)
            System.out.print(arr1[i] + " ");

        System.out.print("\nCopied array is:" + " ");
        for (int i = 0; i < arr2.length; i++)
            System.out.print(arr2[i] + " ");
    }
}
