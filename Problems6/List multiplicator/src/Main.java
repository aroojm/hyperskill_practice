import java.util.List;

/**
    Class to modify
*/
class ListMultiplicator {

	/**
	 Repeats original list content provided number of times
	 @param list list to repeat
	 @param n times to repeat, should be zero or greater
	 */
	public static void multiply(List<?> list, int n) {
		// Add implementation here
		if (n == 0) {
			list.clear();
		} else {
			multiplyCaptured(list, n);
		}

	}
	private static <T> void multiplyCaptured(List<T> list, int n) {
		int len = list.size();
		for (int i = 1; i < n; i++) {
			for (int j = 0; j < len; j++) {
				list.add(list.get(j));
			}
		}
	}
}