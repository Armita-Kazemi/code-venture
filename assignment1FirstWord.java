import java.util.Scanner;

public class assignment1FirstWord {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        String wordA =scanner.nextLine();
        String wordB =scanner.nextLine();
        String result = FirstWord(wordA,wordB );
        System.out.println(result);
    }
    static String FirstWord(String wordA,String wordB){
        int minlength=Math.min(wordA.length(),wordB.length());
        String result=" ";
        boolean differenceFound=false;
        for(int i=0;i<minlength;i++){
            if (wordA.charAt(i)>wordB.charAt(i)) {
                result = wordA;
                differenceFound=true;
                break;
            } else if (wordA.charAt(i)<wordB.charAt(i)) {
                result=wordB;
                differenceFound=true;
                break;
            }
        }
        if(!differenceFound){
            return (wordA.length()>wordB.length()) ? wordB :wordA;
        }
        return result;
    }
}
