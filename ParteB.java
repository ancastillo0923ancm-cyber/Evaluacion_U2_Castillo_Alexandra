public class ParteB {

    static int sumaPares(int n) {
        if (n < 2) {
            return 0;
        }
        if (n % 2 != 0) {
            return sumaPares(n - 1);
        }
        return n + sumaPares(n - 2);
    }

    static boolean esCapicua(String s) {
        if (s.length() <= 1) {
            return true;
        }
        if (s.charAt(0) != s.charAt(s.length() - 1)) {
            return false;
        }
        return esCapicua(s.substring(1, s.length() - 1));
    }
