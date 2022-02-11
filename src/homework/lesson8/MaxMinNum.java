package homework.lesson8;

public class MaxMinNum {
    public static void main(String[] args) {
        int[] arr = {43, 65, 23, 89, 54};
        int nummax = arr[0];
        int nummin = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (nummax < arr[i]) {
                nummax = arr[i];
            } else if (nummin > arr[i]) {
                nummin = arr[i];
            }
        }
        System.out.println("Maximum number = " + nummax);
        System.out.println("Minimum number = " + nummin);
    }
}
