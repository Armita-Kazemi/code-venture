import java.util.Scanner;

public class assignment1OddEvenCounter {
    public static void main(String[] args){
        Scanner scanner =new Scanner(System.in);
        String number= scanner.nextLine();
        boolean searchForEven = scanner.nextBoolean();
        int output = OddEvenCounter(number,searchForEven);
        System.out.println(output);
    }
    static int OddEvenCounter(String number,boolean searchForEven){
        int count=0;
        for (int i=0;i<number.length();i++){
            char digit = number.charAt(i);
            if((searchForEven && digit % 2 == 0) || (!searchForEven && digit % 2 != 0)){
                count++;
            }
        }
        return count;
        }
}
