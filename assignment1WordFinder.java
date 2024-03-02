import java.util.Scanner;

public class assignment1WordFinder {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        String sentence = scanner.nextLine();
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        String result = wordFinder(sentence , n);
        System.out.println(result);
    }
    static String wordFinder(String sentence,int n){
       String[] words = sentence.split("\\s+");
       if(n<=0){
           return "n must be positive!";
       }
       if(n>words.length){
           return "Number = "+n+" is out Of Bound";
       }else{
           return words[n-1];
       }
    }
}
