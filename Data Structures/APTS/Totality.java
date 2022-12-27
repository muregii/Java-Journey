public class Totality {
    public int sum (int[] a, String stype) {
        int value = 0;
        switch (stype) {
            case "odd":
                for(int i = 1;i<a.length;i+=2) {
                    value += a[i];
                }
            case "even":
                for (int i = 0; i<a.length;i+=2) {
                    value += a[i];
                }
            default:
            for (int i : a) {
                value += i;
            }

        }
       return value;

    }
}