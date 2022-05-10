import java.util.ArrayList;
import java.util.Scanner;

public class FifthItem {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();
        System.out.println("Enter at least five words then press Enter to see the fifth item");

        while (true) {
            String input = scanner.nextLine();
            while (true) {
                if (input.equals("")) {
                    System.out.println("The fifth item in the list is " + list.get(4));
                    break;
                } else {
                    list.add(input);
                }
            }

        }
    }
}
