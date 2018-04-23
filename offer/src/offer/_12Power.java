package offer;

public class _12Power {

	public static void main(String[] args) {

	}

	public double Power(double base, int exponent) {
		if (base == 0.0) {
			return 0;
		}
		if (exponent == 0) {
			return 1;
		}
		double exp = 1.0;
		if (exponent > 0) {
			for (int i = 1; i <= exponent; i++) {
				exp = base * exp;
			}
		}
		if(exponent<0) {
			double temp=1/base;
			for (int i = 1; i <= -exponent; i++) {
				exp = temp * exp;
			}
		}
		return exp;
	}
}
