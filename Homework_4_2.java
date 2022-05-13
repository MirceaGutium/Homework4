import java.util.Scanner;

class Homework_4_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int unit = scanner.nextInt();

        if (unit < 1)
            System.out.println("No army");

        else if (unit <= 19)
            System.out.println("Pack");

        else if (unit >= 250 && unit <=999)
            System.out.println("Zounds");

        else if (unit >= 1000)
            System.out.println("Legion");
    }
}
