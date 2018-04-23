package offer;

public class _9JumpFloorII {

	public static void main(String[] args) {

	}

	public int JumpFloorII(int target) {
		if(target==1) 
			return 1;
		if(target==2)
			return 2;
		return 2*JumpFloorII(target-1);
	}
}
