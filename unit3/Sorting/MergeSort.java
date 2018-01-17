import java.util.*;
public class MergeSort {
	static void merge(final int a[], final int b[], int c[]) {
		int i = 0, ai=0, bi=0;
		while (ai < a.length && bi < b.length) {
			if (a[ai] < b[bi]) c[i++] = a[ai++];
			else c[i++] = b[bi++];
		}
		while (ai < a.length) c[i++] = a[ai++];
		while (bi < b.length) c[i++] = b[bi++];
	}

	static void mergeSort(int a[]) {
		if (a.length<=1) return;
		int left[] = new int[a.length/2];
		int right[] = new int[a.length - a.length/2];
		for (int i = 0; i < left.length; ++i) left[i] = a[i];
		for (int i = 0; i < right.length; ++i) right[i] = a[i+left.length];
		mergeSort(left); mergeSort(right);
		merge(left, right, a);
	}

	static void merge2(int a[], int l, int r) {
		int mid = (l+r)/2;
		int[] buff = new int[r-l+1];
		int idx = 0, lo = l, hi = mid+1;

		// 0 <= lo <= mid, mid+1 <= hi <= r
		while (lo <= mid && hi <= r) {
			if (a[lo] < a[hi]) buff[idx++] = a[lo++];
			else buff[idx++] = a[hi++];
		}
		while (lo <= mid) buff[idx++] = a[lo++];
		while (hi <= r) buff[idx++] = a[hi++];
		for (int j = l; j <= r; ++j) a[j] = buff[j-l];
	}

	static void mergeSort2(int a[], int l, int r) {
		if (l<r){
			mergeSort2(a, l, (l+r)/2);
			mergeSort2(a, (l+r)/2+1, r);
			merge2(a, l, r);
		}
	}

	public static void main(String[] args) {
		Random rand = new Random();
		int N = 10;
		int a[] = new int[N];
		for (int i = 0; i < N; ++i) a[i] = rand.nextInt(100000+1);
		mergeSort2(a, 0, a.length-1);
		for (int i = 0; i+1 < a.length; ++i) {
			if (a[i] > a[i+1]) {
				System.out.println("Floled to sort");
				return;
			}
		}
		System.out.println("Succesfully sorted");
	}
}