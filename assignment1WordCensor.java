import java.util.Objects;
import java.util.Scanner;

public class assignment1WordCensor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String sentence = scanner.nextLine();
        String word = scanner.nextLine();
        String newWord = scanner.nextLine();
        String output = WordCensor(sentence, word, newWord);
        System.out.println(output);
    }
    static String WordCensor(String sentence, String word, String newWord){
        String result="";
        String[] words=sentence.split("\\s+");
        for (int i=0;i<words.length;i++){
        result+= (words[i].equals(word)) ? newWord : words[i];
        if(i!= words.length-1){
            result+=" ";//add space between words except for the last one
        }
        }
        return result;
    }
}