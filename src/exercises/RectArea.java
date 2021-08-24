package exercises;
import java.util.Scanner;
public class RectArea {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Input the length");
        double length = input.nextDouble();
        System.out.println("input the width");
        double width = input.nextDouble();
        double area = length * width;
        System.out.println("the area is " + area);
    }
}
