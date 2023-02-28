public class isEvenNumber {

    public static void main(String[] args) {
        int evenTotal = 0;
        int oddTotal = 0;
        int i = 4;
        while (i <= 20) {
            i++;

            if (isEven(i)) {
                System.out.println(i + " is an even number");
                evenTotal++;
            } else {
                oddTotal++;
            }
            if (evenTotal >= 5) {
                break;
            }
        }
        System.out.println("Total Even: " + evenTotal + " Total Odd: " + oddTotal);
    }

    public static boolean isEven(int number) {
        return number % 2 == 0;
    }
}
