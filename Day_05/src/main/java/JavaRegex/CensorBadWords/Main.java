package JavaRegex.CensorBadWords;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static String censoredWord(String[] array,String input){
        for (String s : array){
            input = input.replaceAll(s,"****");
        }
        return input;
    }
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter text:");
        String input = scanner.nextLine();
        String[] array = {"damn","stupid"};
        System.out.println("Original String : "+ input);

        System.out.println("New String : " + censoredWord(array,input));
    }
}
