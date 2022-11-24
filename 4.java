import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n;
        while (true) {
            System.out.print("Колличество точек: ");
            n = scan.nextInt();
            if (n>=0){ break;}
            System.out.println("Введите натуальное число!");
        }
        int r;
        while (true) {
            System.out.print("Радиус окружности: ");
            r = scan.nextInt();
            if (r>=0){ break;}
            System.out.println("Введите натуальное число!");
        }
        int result = 0;
        for (int i = 0; i < n; i++){
            System.out.print("X ");
            System.out.print(i+1);
            System.out.print(" точки: ");
            double x = scan.nextDouble();

            System.out.print("Y ");
            System.out.print(i+1);
            System.out.print(" точки: ");
            double y = scan.nextDouble();

            if (x*x + y*y <= r*2) {
                result +=1;
            }
        }
        System.out.print(result);
        System.out.println(" точек попало в окружность");
    }
}