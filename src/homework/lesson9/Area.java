package homework.lesson9;

import java.util.Scanner;

public class Area {
    float length, width, area;

    void setDim(float length, float width) {

        this.length = length;
        this.width = width;
        area = this.length * this.width;
    }

    float getArea() {
        return area;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Area ar = new Area();
        float l, w;
        System.out.println("Enter the length of rectangle : ");

        l = sc.nextFloat();
        System.out.println("Enter breadth of rectangle : ");
        w = sc.nextFloat();
        ar.setDim(l, w);

        System.out.println("Area of rectangle is = " + ar.getArea());
    }
}