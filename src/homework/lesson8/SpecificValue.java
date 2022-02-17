package homework.lesson8;

public class SpecificValue{
    public static void main(String[] args) {
        int[] num = {5, 87, 3, 457, 576};
        int toFind = 56;
        boolean found = false;

        for (int n : num) {
            if (n == toFind) {
                found = true;
                break;
            }
        }

        if(found)
            System.out.println(toFind + " is found.");
        else
            System.out.println(toFind + " is not found.");
    }
}
