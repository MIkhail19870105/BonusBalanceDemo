public class Main {
    public static void main(String[] args) {
        float Balance = (int) -1000.55555468464;
        float Replenishment = (int) 1024.768;
        int BonusPercent;
        if (Replenishment >= 1000) {
            BonusPercent = 1;
        }
        else {
            BonusPercent = 0;
        }
        int BonusBalance = (int) (Replenishment * BonusPercent / 100);
        int TotalBalance = (int) (Balance + Replenishment + BonusBalance);
        System.out.println(BonusBalance);
        System.out.println(TotalBalance);
    }
}
