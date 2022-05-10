import java.util.ArrayList;
import java.util.Scanner;

public class HowLarge {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();
        System.out.println("Enter as many words as you like then press Enter and I'll tell you how many you did");

        while (true) {
            String input = scanner.nextLine();

            if (input.equals("")) {
                System.out.println("The fifth item in the list of words you entered was: " + list.size());
                break;
            } else {
                list.add(input);
            }
        }
    }
}
