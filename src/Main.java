import java.util.Scanner;

public class Main {
    static String removeSpace(String text) {
        String r = "";
        for (int i=0; i < text.length(); i++) {
            if (text.charAt(i) != ' ') {
                r += text.charAt(i);
            }
        }
        return r;
    }

    public static void main(String[] args) {
        // Skriv en metod som tar en text som parameter och returnerar
        // texten med alla mellanslag borttagna.

        Scanner input = new Scanner(System.in);
        System.out.print("Ange en text: ");
        String text = input.nextLine();

        System.out.println(removeSpace(text));
    }
}