package offer;

public class _65movingCount {

	public static void main(String[] args) {

	}

	public int movingCount(int threshold, int rows, int cols) {
		boolean[][] flag=new boolean[rows][cols];
		return help(threshold,rows,cols,0,0,flag);
	}

	private int help(int threshold, int rows, int cols, int i, int j, boolean[][] flag) {
		if(i<0||i>rows-1||j<0||j>cols-1||flag[i][j]==true||nums(i)+nums(j)>threshold) return 0;
		flag[i][j]=true;
		return help(threshold, rows, cols, i-1, j, flag)+
				help(threshold, rows, cols, i+1, j, flag)+
				help(threshold, rows, cols, i, j-1, flag)+
				help(threshold, rows, cols, i, j+1, flag)+1;
	}

	private int nums(int i) {
		int sum=0;
		while(i!=0) {
			sum+=i%10;
			i=i/10;
		}
		return sum;
	}
}
