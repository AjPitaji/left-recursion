import java.util.Scanner;

public class LeftRecursionElimination {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the left-hand side of the production: ");
        String l = scanner.nextLine();//S

        System.out.print("Enter the right-hand side of the production (separated by '|'): ");
        String r = scanner.nextLine();//Sa|Sb|bc

        System.out.println("Input: " + l + "->" + r);

        String[] temp = r.split("\\|");  
        boolean flag = false;

        System.out.println("Productions after eliminating Left Recursion:");

        for (String str : temp) {
            if (str.startsWith(l)) {
                flag = true;
                System.out.println(l + "->" + str.substring(1) + l + "'");
            } else {
                System.out.println(l + "'->" + str + l + "'");
            }
        }

        if (flag) {
            System.out.println(l + "->ε");
        } else {
            System.out.println("The Given Grammar has no Left Recursion");
        }

        scanner.close();
    }
}
