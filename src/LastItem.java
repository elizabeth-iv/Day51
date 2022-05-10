import java.util.ArrayList;
import java.util.Scanner;

public class LastItem {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();
        System.out.println("Enter as many words as you like then press Enter and I'll tell you the last one");

        while (true) {
            String input = scanner.nextLine();

            if (input.equals("")) {
                System.out.println("The last Item in the list is: " + (list.get(list.size()-1)));
                break;
            } else {
                list.add(input);
            }
        }
    }
}
