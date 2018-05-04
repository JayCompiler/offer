package offer;

public class _34InversePairs {
	static int res = 0;

	public static void main(String[] args) {
		int[] array = { 1, 2, 3, 4, 5, 6, 7, 0 };
		InversePairs(array);
		System.out.println(res);
		// for (int i : array) {
		// System.out.println(i);
		// }
	}
	public static int InversePairs(int[] array) {
		if (array.length == 0 || array == null) {
			return 0;
		}
		ishelp(array, 0, array.length - 1);
		return res;
	}

	private static void ishelp(int[] array, int start, int end) {
		if (start >= end) {
			return;
		}
		int medium = (start + end) / 2;
		ishelp(array, start, medium);
		ishelp(array, medium + 1, end);
		merge(array, start, medium, end);

	}

	private static void merge(int[] array, int start, int medium, int end) {
		int[] tmp = new int[end - start + 1];
		int i = start, j = medium + 1, k = 0;
		while (i <= medium && j <= end) {
			if (array[i] <= array[j])
				tmp[k++] = array[i++];
			else {
				tmp[k++] = array[j++];
				res += (medium - i + 1);
				if (res >= 1000000007) {
					res = res % 1000000007;
				}
			}
		}
		while (i <= medium)
			tmp[k++] = array[i++];
		while (j <= end)
			tmp[k++] = array[j++];
		for (k = 0; k < tmp.length; k++)
			array[start + k] = tmp[k];
	}
}
