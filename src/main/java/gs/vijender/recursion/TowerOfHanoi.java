package gs.vijender.recursion;

public class TowerOfHanoi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TowerOfHanoi toh = new TowerOfHanoi();
		toh.solve(3, 'A', 'B', 'C');
	}

	public void solve(int n, char rodFrom, char rodMiddle, char rodTo) {
		/**
		 * This is a condition where only one disk is left at the start 
		 * rod which is the smallest one
		 */
		if (n == 1) {
			System.out.println("Move disk 1 from rod " + rodFrom + " to rod " + rodTo);
			return;
		}
		// We try to move all the disks to the middle rod other than last
		solve(n - 1, rodFrom, rodTo, rodMiddle);
		System.out.println("Move disk " + n + " from rod " + rodFrom + " to rod " + rodTo);
		/*
		 * After above step we have all n-1 left on the middle rod
		 * now we move to the destination rod rodTo using rodFrom  
		 */
		solve(n - 1, rodMiddle, rodFrom, rodTo);
	}

}
