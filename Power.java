package Intergers;

public class Power {
    public double myPow(double x, int n) {
        double ans = 1.0;
        long num = n;

        if(n == 0)
            return 1;

        if(n == 1)
            return x;

        if (n < 0) {
            num = -1 * num;
        }
        while (num > 0) {
            if (num % 2 == 0) {
                x = x * x;
                num = num / 2;
            } else {
                ans = ans * x;
                num = num - 1;
            }
        }
        if (n < 0) {
            return (double)(1.0) / (double)(ans);
        }
        return ans;
    }

    public static void main(String[] args) {
        Power power = new Power();
        System.out.println(power.myPow(2.0000,10));
    }
}
