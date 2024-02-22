public class enu {
    // public enum Seasons{SUMMA, WINTA, SPRING, COLDASFUCK, HOTASFUCK}

    public static void main(String[] args) {
        enum Season{
            HOTASFUCK,
            COLDASFUCK,
            FINEASFUCK
        }

        Season s = Season.HOTASFUCK;
        System.out.println(s);
    }
}
