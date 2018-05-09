package offer;

public class _64hasPath {

	public static void main(String[] args) {
	}

	public boolean hasPath(char[] matrix, int rows, int cols, char[] str) {
		int[] flag = new int[matrix.length];
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				if (help(matrix, rows, cols, i, j, str, 0, flag)) {
					return true;
				}
			}
		}
		return false;
	}

	private boolean help(char[] matrix, int rows, int cols, int i, int j, char[] str, int k, int[] flag) {
		int index = i * cols + j;
		if (i < 0 || i >= rows  || j < 0 || j > cols - 1 || flag[index] == 1 || matrix[index] != str[k]) {
			return false;
		}
		if (k == str.length - 1)
			return true;
		flag[index] = 1;
		if (help(matrix, rows, cols, i - 1, j, str, k + 1, flag) || help(matrix, rows, cols, i + 1, j, str, k + 1, flag)
				|| help(matrix, rows, cols, i, j - 1, str, k + 1, flag)
				|| help(matrix, rows, cols, i, j + 1, str, k + 1, flag)) {
			return true;
		}
		flag[index] = 0;
		return false;
	}
}
