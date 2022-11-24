import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int month;
        while (true) {
            System.out.print("Месяц: ");
            month = scan.nextInt();
            if (month > 0 && month < 13) {
                break;
            }
            System.out.println("Введите реальное значение!");
        }

        int day;
        while (true) {
            System.out.print("День: ");
            day = scan.nextInt();
            int maxDayOfMonth;
            switch (month) {
                case 2:maxDayOfMonth = 29;break;
                case 4:maxDayOfMonth = 30;break;
                case 6:maxDayOfMonth = 30;break;
                case 9:maxDayOfMonth = 30;break;
                case 11:maxDayOfMonth = 30;break;
                default: maxDayOfMonth =31; break;
            }
            if (day > 0 && day <= maxDayOfMonth){
                break;
            }
            System.out.println("Введите реальное значение!");
        }
        if (month == 12 || month < 3){
            System.out.println("Зима");
        }
        if (month >2 && month < 6){
            System.out.println("Весна");
        }
        if (month > 5 && month < 9){
            System.out.println("Лето");
        }
        if (month > 9 && month < 12){
            System.out.println("Осень");
        }
    }
}