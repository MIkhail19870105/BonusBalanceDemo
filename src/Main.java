public class Main {
    public static void main(String[] args) {
        float balance = (int) -1000.55555468464;
        float replenishment = (int) 1024.768;
        int bonusPercent;
        if (replenishment >= 1000) {
            bonusPercent = 1;
        }
        else {
            bonusPercent = 0;
        }
        int bonusBalance = (int) (replenishment * bonusPercent / 100);
        int totalBalance = (int) (balance + replenishment + bonusBalance);
        System.out.println(bonusBalance);
        System.out.println(totalBalance);
    }
}
