import java.util.ArrayList;
import java.util.Scanner;

public class SumOfList {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        System.out.println("Enter as many integers as you like then press 0 and enter then\nI'll tell you how many you did");
        while (true) {
            int number = scanner.nextInt();

            if (number == 0) {
                break;
            } else {
                list.add(number);
            }
        }
        int add = 0;
        for (int i = 0; i < list.size(); i++) {
            add =-list.get(i);
        }
        System.out.println("The integers on the list were: " + list + " and the sum is: " + add);

    }
}
