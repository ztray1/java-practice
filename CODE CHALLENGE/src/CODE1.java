import java.util.Arrays;

class judgefunction {
	static boolean HasArrayTwoCandidates(int A[], int array_size, int sum) {
		int l, r;
		Arrays.sort(A);
		l = 0;
		r = array_size - 1;
		while (l < r) {
			if (A[l] + A[r] == sum)
				return true;
			else if (A[l] + A[r] < sum)
				l = l + 1;
			else
				r = r - 1;
		}
		return false;
	}

	public static void main(String args[]) {
		int A[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 11 };
		int n = 30;
		int array_size = A.length;

		if (HasArrayTwoCandidates(A, array_size, n))
			System.out.println("Array has two elements and the sum of them equals S");
		else
			System.out.println("Array doesn't have two elements and the sum of them equals S");

	}

}
