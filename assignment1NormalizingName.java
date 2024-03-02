import java.util.Scanner;

public class assignment1NormalizingName {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        String firstName= scanner.next();
        String lastName=scanner.next();
        String output=NormalizingName(firstName,lastName);
        System.out.println(output);
    }
    static String NormalizingName(String firstName,String lastName){
        firstName=firstName.toLowerCase();
        lastName=lastName.toLowerCase();
        String normalizedFirstName =firstName.substring(0,1).toUpperCase()+firstName.substring(1);
        String normalizedLastName=lastName.substring(0,1).toUpperCase()+lastName.substring(1);
        return normalizedFirstName + " " + normalizedLastName;
    }
}
