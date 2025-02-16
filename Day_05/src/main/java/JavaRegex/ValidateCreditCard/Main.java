package JavaRegex.ValidateCreditCard;

public class Main {
    public class CreditCardValidator {
        public static boolean isValidCardNumber(String cardNumber) {
            return cardNumber != null && cardNumber.matches("^(4\\d{15}|5\\d{15})$");
        }

        public static void main(String[] args) {
            String[] testCards = {
                    "4123456789012345",
                    "5123456789012345",
                    "3123456789012345",
                    "41234567890123",
                    "41234567890123AB"
            };

            for (String card : testCards) {
                System.out.println("Card Number: " + card + " -> Valid: " + isValidCardNumber(card));
            }
        }
    }


}
