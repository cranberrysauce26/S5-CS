public class StevenMai_A3 {

	public static int linSearch(int[] a, int val, int l, int r) {
		for (int i = l; i <= r; ++i) if (a[i] == val) return i;
		return -1;
	}

	public static int binSearch_i(int[] a, int val, int l, int r) {
		while (l<=r){
			int mid = (l+r)/2;
			if (a[mid] < val) l = mid+1;
			else if (a[mid] > val) r = mid-1;
			else return mid;
		}
		return -1;
	}

	public static int binSearch_r(int[] a, int val, int l, int r) {
		if (l>r) return -1;
		if (l==r) return a[l] == val ? l : -1;

		int mid = (l+r)/2;
		if (a[mid] < val) return binSearch_r(a, val, mid+1, r);
		else if (a[mid] > val) return binSearch_r(a, val, l, mid-1);
		else return mid;
	}
	public static void main(String[] args) {

		int[] a = new int[]{1, 2, 4, 7, 19, 32};

		System.out.println(binSearch_r(a, 19, 0, a.length-1)); // should return 4
		System.out.println(binSearch_r(a, 19, 0, 3)); // should return -1

		System.out.println(binSearch_i(a, 19, 0, a.length-1)); // should return 4
		System.out.println(binSearch_i(a, 19, 0, 3)); // should return -1

		System.out.println(linSearch(a, 19, 0, a.length-1)); // should return 4
		System.out.println(linSearch(a, 19, 0, 3)); // should return -1
	}
}