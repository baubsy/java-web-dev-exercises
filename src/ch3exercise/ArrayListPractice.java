package ch3exercise;
import java.util.ArrayList;
public class ArrayListPractice {
    public static void main(String[] args){
        ArrayList<Integer> nums = new ArrayList<>();
        for(int i = 1; i < 11; i++){
            nums.add(i);
        }

        System.out.println(arrSum(nums));

        ArrayList<String> testWords = new ArrayList<>();
        testWords.add("cow");
        testWords.add("four");
        testWords.add("horse");
        System.out.println(fiveWord(testWords).toString());
    }
    public static int arrSum(ArrayList<Integer> arr){
        int sum = 0;
        for(int num : arr){
            if(0 == num % 2){
                sum += num;
            }
        }
        return sum;
    }
    public static ArrayList<String> fiveWord(ArrayList<String> arr){
        ArrayList<String> words = new ArrayList<>();
        for(String word : arr){
            if(word.length() == 5){
                words.add(word);
            }
        }
        return words;
    }
}
