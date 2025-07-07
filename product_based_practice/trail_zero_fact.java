formulaa= n/5+n/5^2+n/5^3...


class Main {
    public static void main(String[] args) {
        int num = 100;
        int ans = 0;
        int power = 5;

        while (num / power > 0) {
            ans += num / power;
            power *= 5;
        }

        System.out.println( ans);
    }
}
