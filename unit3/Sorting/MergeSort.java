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

	public static void main(String[] args) {
		Random rand = new Random();
		int N = 10;
		int a[] = new int[N];
		for (int i = 0; i < N; ++i) a[i] = rand.nextInt(100000+1);
		mergeSort(a);
		System.out.println(Arrays.toString(a));
	}
}