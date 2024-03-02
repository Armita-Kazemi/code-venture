import java.util.Scanner;

public class assignment1DoubleChar {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        String input= scanner.next();
        String output=NewWord(input);
        System.out.println(output);

    }
    static String NewWord(String input){
        if (input == null || input.isEmpty()) {
            return input;
        }
        String result="";
        char prevChar=input.charAt(0);
        for(int i=1;i<input.length();i++){
            char currentChar=input.charAt(i);
            if(currentChar!=prevChar){
                result += prevChar;
                prevChar=currentChar;
            }
        }
        result+=prevChar;
    return  result;
    }

}
