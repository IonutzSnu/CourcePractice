package homework.lesson6;


public class TernaryConstruct {
    public static void main(String[] args) {
        int colorCode;
        String s = "102";
    }

    public static void color(String colorCode) {
        String color;
        color = colorCode.equals("100") ? "Yellow" : colorCode.equals("101") ? "Green" : colorCode.equals("102") ? "Red" : "Invalid";
        System.out.println("Color with number " + "is :" + color);
    }
}

