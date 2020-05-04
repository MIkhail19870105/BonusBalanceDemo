public class main {
    public static void main(String[] args) {
        float balance = (int) -1000.55555468464;
        // Указал cast для округления баланса
        float replenishment = (int) 1024.768;
        // Указал cast для округления суммы пополнения
        int bonuspercent;
        if (replenishment >= 1000) {
            bonuspercent = 1;
        }
        else {
            bonuspercent = 0;
        }
        // Задал бонусный процент в формате целого числа для упрощения арифметической операции
        int bonusbalance = (int) (replenishment * bonuspercent / 100);
        // Формула расчета бонусного баланса при условиях заданных в if-else с округлением до целых чисел
        int totalbalance = (int) (balance + replenishment + bonusbalance);
        // Формула расчета общего баланса с учетом округления до целых чисел
        System.out.println(bonusbalance);
        System.out.println(totalbalance);
    }
}
