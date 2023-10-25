// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        int check = 100; //изначально на счете
        int topUpAmount = 900; // сумма пополнения
        int bonusAmount = 0; // Изначальная сумма бонуса
        System.out.println("Сумма баланса до пополнения =" + check);
        System.out.println("Сумма пополнеия составляет = " + topUpAmount);
        int balans = check + topUpAmount;
        System.out.println("Сумма на счёте без учета бонусов " + balans);
        if (topUpAmount > 1000) {
            int bonus = topUpAmount / 100;
            int inputbonus = bonus + balans;
            System.out.println("Начисленные бонусы "+bonus);
            System.out.println("Сумма с учетом бонусов за пополнение =" + inputbonus);
        } else System.out.println("Сумма бонусов ="+ bonusAmount);

    }

}
