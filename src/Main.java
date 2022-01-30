public class Main {
    public static void main(String[] args) {
       //Данные:
        int balance = 1605;
        int refill = 6000;
        int sum_bonus = refill / 100;




        //Логика:

        int total;
        if (refill >=1000) { total= balance + refill + sum_bonus; }
        else { total = balance + refill; }

        System.out.println("Ваш Баланс = " + total + " руб.");
        System.out.println("Бонус составил = " + sum_bonus + " руб.");




















        // Объявляете переменные для входных данных и
        // параметров программы: начального счёта,
        // суммы пополнения и тп

        // Условным оператором проверяете превысила ли
        // сумма пополнения порог и для этих двух разных
        // сценариев рассчитываете сумму бонуса и выводите
        // на экран.
    }
}