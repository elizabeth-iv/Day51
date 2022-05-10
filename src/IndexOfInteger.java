import java.util.ArrayList;
import java.util.Scanner;

public class IndexOfInteger {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        System.out.println("Enter as many integers as you like then press 0");

        while (true) {
            int input = scanner.nextInt();

            if (input == 0) {
                System.out.println("Done entering integers into the list\n What number are you looking for in the list?");
                int number = scanner.nextInt();
                for (int i = 0; i <= (list.size()-1); i++) {
                    if (list.get(i) == number) {
                        System.out.println(number + " is the index of " + i);
                    }
                }
            } else {
               list.add(input);
            }
        }

    }
}
