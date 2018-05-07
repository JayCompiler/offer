package offer;

public class _52isNumeric {

	public static void main(String[] args) {
		System.out.println(isNumeric("123.45e+6".toCharArray()));
	}

	public static boolean isNumeric(char[] str) {
		int dotindex = -1;
		int eindex = -1;
		boolean flag = true;
		for (int i = 0; i < str.length; i++) {
			if (str[i] < '0' || str[i] > '9') {
				if ((str[i] != '.') && (str[i] != 'e') && (str[i] != 'E')&&str[i] != '+'
						&&str[i] != '-') {
					System.out.println("1");
					flag = false;
					break;
				}
			}
			// �ж�.�ĸ�������ͳ�Ƴ�λ��
			if (str[i] == '.') {
				if (dotindex != -1) {
					flag = false;
					break;
				} else {
					dotindex = i;
				}
			}
			// �ж������ŵ�λ���Ƿ����
			if (str[i] == '+' || str[i] == '-') {
				if (i != 0) {
					if (str[i - 1] != 'e' && str[i - 1] != 'E') {
						flag = false;
						break;
					}
				}
			}
			if (str[i] == 'e' || str[i] == 'E') {
				if (eindex != -1) {
					flag = false;
					break;
				} else {
					eindex = i;
				}
			}
		}
		if (dotindex == 0 || eindex == str.length - 1 || (dotindex > eindex && eindex != -1)) {
			flag = false;
		}

		return flag;
	}
}
