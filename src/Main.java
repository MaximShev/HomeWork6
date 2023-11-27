public class Main {
    public static void main(String[] args) {
/// Задача 1
    for (int i = 1; i <= 10; i++) {
        System.out.println(i);
        }
/// Задача 2
    for (int a = 10; a >= 1; a--) {
        System.out.println(a);
    }
/// Задача 3
    for (int b = 0; b <= 17; b = b + 2) {
        System.out.println(b);
        }
/// Задача 4
    for (int c = 10; c >= -10; c--) {
        System.out.println(c);
    }
/// Задача 5
    for (int age = 1904; age <= 2096; age = age + 4) {
        System.out.println(age);
    }
/// Задача 6
    for (int d = 7; d <= 98; d = d + 7) {
        System.out.println(d);
    }
/// Задача 7
    for (int e = 2; e <= 512; e = e * 2) {
        System.out.println(e);
    }
/// Задача 8
    int mounth = 0;
    int total = 0;
    int saving = 29000;
        for (; mounth <= 12; mounth++) {
            total = total + saving;
            System.out.println("Месяц " + mounth + ", сумма накомплений равна " + total + " рублей");
        }
/// Задача 9
    int mounth1 = 0;
    int total1 = 0;
    int saving1 = 29000;
    int bid = 100;
    for (; mounth1 <= 12; mounth1++) {
        total1 = total1 + total1/bid;
        total1 = total1 + saving1;
        System.out.println("Месяц " + mounth1 + ", сумма накомплений равна " + total1 + " рублей");
    }
/// Задача 10
    int f = 2;
    for (int g = 1; g <= 10; g++) {
        System.out.println(f + "*" + g + "=" + (f*g));
    }
/// Задания выполнены
    }
}