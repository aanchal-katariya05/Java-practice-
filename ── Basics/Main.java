public class Main {
    public static void main(String[] args) {

        String s = "aanchalkatariya005@gmail.com";

        String letter = "";
        String number = "";
        String special = "";

        for (int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);

            if (Character.isLetter(ch)) {
                letter = letter + ch;
            }

            else if (Character.isDigit(ch)) {
                number = number + ch;
            }

            else {
                special = special + ch;
            }
        }

        System.out.println("Letters = " + letter);
        System.out.println("Numbers = " + number);
        System.out.println("Special Characters = " + special);
    }
}