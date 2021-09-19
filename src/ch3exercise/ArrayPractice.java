package ch3exercise;
import java.util.Arrays;

public class ArrayPractice {
    public static void main(String[] args){
        int[] someInts = {1, 1, 2, 3, 5, 8};
        for(int i = 0; i < someInts.length; i++){
            if(someInts[i] % 2 != 0){
                System.out.println(someInts[i]);
            }

        }

        String foxBox = "I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse.";
        String[] foxes = foxBox.split(" ");
        System.out.println(Arrays.toString(foxes));
        String[] periods = foxBox.split("\\.");
        System.out.println(Arrays.toString(periods));
    }
}
