public class Rec {
	/**
	 * = number of the digits in the decimal representation of n. e.g.
	 * numDigits(0) = 1, numDigits(3) = 1, numDigits(34) = 2. numDigits(1356) =
	 * 4. Precondition: n >= 0.
	 */
	public static int numDigits(int n) {

		if (n < 0) {
			n = n * (-1);
		}

		if (n > 0) {
			n = n / 10;
			return 1 + numDigits(n);
		} else {
			return 0;
		}

	}

	/**
	 * = sum of the digits in the decimal representation of n. e.g. sumDigits(0)
	 * = 0, sumDigits(3) = 3, sumDigits(34) = 7, sumDigits(345) = 12.
	 * Precondition: n >= 0.
	 */
	public static int sumDigits(int num) {
		if (num <= 0) {
			return 0;
		} else if ((num > 0) && (num < 10)) {
			return num;
		} else {
			return (num % 10) + sumDigits((int) Math.floor(num / 10));
		}
	}

	/**
	 * = a copy of s with to_remove_char removed. Example: removeChar("abeabe",
	 * 'e') = "abab".
	 */

	public static String removeChar(String s, char to_remove_char) {
		if (s.length() > 0) {
			if (s.charAt(0) == to_remove_char) {
				return removeChar(s.substring(1), to_remove_char);
			} else {
				return s.substring(0, 1).concat(
						removeChar(s.substring(1), to_remove_char));
			}
		} else
			return s.substring(0);

	}

	/**
	 * = a copy of s with characters in reverse order. Example:
	 * reverse("abcdefg") = "gfedcba".
	 */
	public static String reverse(String s) {
		if( s.length() == 0 || s.equals(null) ) {
			return "";
		}
		if( s.length() > 1 ) {
			return s.substring(s.length()-1) + reverse( s.substring(0, s.length()-1)  );
		}
		else {
			return s.substring(0);
		}
	}

	public static void main(String[] args) {
		System.out.println(numDigits(123));
		System.out.println(numDigits(123456));
		System.out.println(numDigits(1));
		System.out.println(numDigits(0));
		System.out.println("-----------------");
		System.out.println(sumDigits(123));
		System.out.println(sumDigits(123456));
		System.out.println(sumDigits(1));
		System.out.println(sumDigits(0));
		System.out.println("-----------------");
		System.out.println(removeChar("eawabbcceccddeeaaeeeee", 'e'));
		System.out.println(removeChar("acacacacac", 'a'));
		System.out.println("-----------------");
		System.out.println(reverse("aaabbbaccabda"));
		System.out.println(reverse("abbcccdeaaa"));
		System.out.println(reverse("AMANAPLANACANALPANAMA"));
	}
}
