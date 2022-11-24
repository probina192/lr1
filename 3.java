import java.util.Scanner;

public class Main {
    public static double pow(int value, int powValue) {
        double result = 1;
        boolean flag = true;
        if (powValue < 0) {
            powValue *= -1;
            flag = false;
        }
        for (int i = 1; i <= powValue; i++) {
            if (flag) {
                result = result * value;
            }
            else {
                result = result / value;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("x: ");
        int x = scan.nextInt();
        int n;
        while (true) {
            System.out.print("n (-15<n<15): ");
            n = scan.nextInt();
            if (n > -15 & n < 15) {
                break;
            }
            System.out.println("Введите число из диапазона!");

        }
        double result = pow(x,n);
        System.out.println(result);
    }
}