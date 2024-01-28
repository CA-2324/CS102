public class q5 {
	public static void main(String[] args) {
        int value = swapDigitPairs(123);
        System.out.println(value); // adjacent digits are swapped. rightmost digit left alone
        int value2 = swapDigitPairs(123456);
        System.out.println(value2);
    }

    public static int swapDigitPairs(int value) {
		int swapped = 0;
		int lastDigit = value % 10;
		value /= 10;

		while (value > 0) {
			int nextLastDigit = value % 10;
			value /= 10;

			swapped = (swapped * 10) + nextLastDigit;
			swapped = (swapped * 10) + lastDigit;

			lastDigit = value % 10;
			value /= 10;
		}

		swapped = (swapped * 10) + lastDigit;
		return swapped;
	}
}