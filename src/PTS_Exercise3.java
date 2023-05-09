// Count from 1 to 100 and write "X" if can be divided by 3 or "Y" if by 5 and "Z" if both

public class PTS_Exercise3 {
    public PTS_Exercise3() {
        int i;
        String x = "";
        for (i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                x = "Z";
            } else {
                if (i % 3 == 0) {
                    x = "X";
                }
                if (i % 5 == 0) {
                    x = "Y";
                }
            }
            System.out.println(i + " = " + x);
            x = "";
        }
    }
}
