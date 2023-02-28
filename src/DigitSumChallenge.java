public class DigitSumChallenge {

    public static void main(String[] args) {
        System.out.println(sumDigits(1234));
    }

    public static int sumDigits(int number) {
        if (number < 0) return -1;
        int sum = 0;
        int n = number;
        while (n > 0) {
            sum += n % 10;
            n = n / 10;
        }
        return sum;
    }
}
