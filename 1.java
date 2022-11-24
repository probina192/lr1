import java.util.Scanner;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Date date = new Date();
        Scanner scan = new Scanner(System.in);

        int year;
        while (true){
            System.out.print("Год рождения: ");
            year = scan.nextInt();
            if (year >= 1900 & year <= date.getYear()+1900){
                break;
            }
            System.out.println("Введите реальное значение!");
        }

        int month;
        while (true){
            System.out.print("Месяц рождения: ");
            month = scan.nextInt();
            if (year == date.getYear()+1900 & month > 0 & month <= date.getMonth()+1){
                break;
            }
            if (year == date.getYear()+1900) {
                System.out.println("Введите реальное значение!");
                continue;
            }
            if (month > 0 & month <= 12) {
                break;
            }
            System.out.println("Введите реальное значение!");
        }

        int day;
        while(true){
            System.out.print("День рождения: ");
            day = scan.nextInt();
            if (year == date.getYear()+1900 & month == date.getMonth()+1 & day > 0 & day <= date.getDate()){
                break;
            }
            if (year == date.getYear()+1900 & month == date.getMonth()+1) {
                System.out.println("Введите реальное значение!");
                continue;
            }
            int maxDayOfMonth;
            switch (month){
                case 2: maxDayOfMonth = 29;break;
                case 4: maxDayOfMonth = 30;break;
                case 6: maxDayOfMonth = 30;break;
                case 9: maxDayOfMonth = 30;break;
                case 11: maxDayOfMonth = 30;break;
                default: maxDayOfMonth = 31;break;
            }
            if (day > 0 & day <=maxDayOfMonth) {
                break;
            }
            System.out.println("Введите реальное значение!");
        }

        year = date.getYear()+1900 - year;

        if (month > date.getMonth()){
            year -=1;
            month = 12 - month + date.getMonth()+1;
        }
        else {
            month = date.getMonth()+1 - month;
        }

        if (day > date.getDate()) {
            int maxDayOfMonth;
            switch (month){
                case 2: maxDayOfMonth = 29;break;
                case 4: maxDayOfMonth = 30;break;
                case 6: maxDayOfMonth = 30;break;
                case 9: maxDayOfMonth = 30;break;
                case 11: maxDayOfMonth = 30;break;
                default: maxDayOfMonth = 31;break;
            }
            month -= 1;
            if (month < 0) {
                year -= 1;
                month = 11;
            }
            day = maxDayOfMonth - day + date.getDate();
        }
        else {
            day = date.getDate() - day;
        }

        System.out.print(year);
        System.out.print(" лет, ");
        System.out.print(month);
        System.out.print(" месяцев и ");
        System.out.print(day);
        System.out.print(" дней");
    }
}