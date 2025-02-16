package JUnitTesting.stringUtilityMethods;

public class Main {
    public static void main(String[] args) {
        StringUtils utils = new StringUtils();
        System.out.println("Reverse: " + utils.reverse("hello"));
        System.out.println("Is palindrome: " + utils.isPalindrome("madam"));
        System.out.println("To uppercase: " + utils.toUpperCase("hello"));
    }
}
