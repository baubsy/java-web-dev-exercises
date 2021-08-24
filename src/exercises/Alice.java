package exercises;
import java.util.Scanner;
public class Alice {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String alice = "Alice was beginning to get very tired of sitting by her sister on the bank, and of having nothing to do: once or twice she had peeped into the book her sister was reading, but it had no pictures or conversations in it, 'and what is the use of a book,' thought Alice 'without pictures or conversation?'";
        System.out.println("Enter a search term");
        String search = input.nextLine();
        boolean contained = alice.toUpperCase().contains(search.toUpperCase());
        if(contained){
            System.out.println("Found!");
        } else{
            System.out.println("Not Found!");
        }
        System.out.println(alice.indexOf(search));
        int index = alice.indexOf(search);
        System.out.println(search.length());
        int length = search.length();
        String cutAlice = alice.substring(0, index - 1) + alice.substring(index + length);
        System.out.println(cutAlice);
    }
}
