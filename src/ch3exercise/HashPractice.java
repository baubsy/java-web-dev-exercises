package ch3exercise;
import java.util.HashMap;
import java.util.Scanner;
public class HashPractice {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String student = "temp";
        int id = 0;
        HashMap<Integer, String> students = new HashMap<>();

        System.out.println("Enter a student name then a id or nothing to finish");
        while(!student.equals("")){
            student = input.nextLine();
            id = input.nextInt();
            students.put(id, student);
        }
    }
}
