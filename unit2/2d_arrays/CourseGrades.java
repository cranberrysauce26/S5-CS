/*input
10118
4
*/
import java.util.*;
public class CourseGrades {

	static final int[][] grades = new int[][] {
		{10118, 74, 71, 84, 52, 91},
		{10218, 67, 70, 75, 76, 53},
		{10318, 53, 95, 81, 87, 96},
		{10418, 76, 67, 64, 78, 71},
		{10518, 85, 84, 83, 86, 84},
		{10618, 71, 70, 71, 69, 78},
		{10718, 97, 51, 88, 75, 84},
		{10818, 89, 85, 86, 91, 92},
		{10918, 68, 84, 52, 93, 76},
		{11018, 100, 88, 84, 92, 95},
		{11118, 41, 68, 52, 43, 50},
		{11218, 89, 96, 94, 99, 91}
	};

	static void getGrades(int id) {
		for (int i = 0; i < grades.length; ++i) {
			if (grades[i][0] == id) {
				for (int j = 1; j < grades[i].length; ++j) System.out.printf("%d ", grades[i][j]);
				System.out.println();
				return;
			}
		}
		System.out.println("Could not find student");
	}

	static void showGrades(int t) {
		for (int i = 0; i < grades.length; ++i) System.out.printf("%d ", grades[i][t]);
		System.out.println();
	}


	static void testAvg(int t) {
		int sum = 0;
		for (int i = 0; i < grades.length; ++i) sum += grades[i][t];
		
		System.out.println( (double)sum / (double)grades.length );
	}

	static void studentAvg(int id) {
		int sum = 0;
		for (int i = 0; i < grades.length; ++i) {
			if (grades[i][0] == id) {
				for (int j = 1; j < grades[i].length; ++j) sum += grades[i][j];
				System.out.println( (double)sum / (double) (grades[i].length-1) );
				return;
			}
		}
		System.out.println("Could not find student");
	}

	static void testMedian(int t) {
		int[] a = new int[grades.length];
		for (int i = 0; i < grades.length; ++i) a[i] = grades[i][t];
		Arrays.sort(a);
		int m = a.length >> 1;
		if (a.length % 2 == 0) System.out.println( 0.5 * ( (double) a[m] + (double) a[m-1]) );
		else System.out.println(a[m]);
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.printf("Enter a student number:\n");
		int studentId = scan.nextInt();
		System.out.printf("Here are the grades for your student\n");
		getGrades(studentId);
		System.out.printf("Here is your student's average\n");
		studentAvg(studentId);

		System.out.printf("Enter a test number (counting from 1)\n");
		int test = scan.nextInt();
		System.out.printf("Here are the grades for that test\n");
		showGrades(test);

		System.out.printf("Here's the test's mean\n");

		testAvg(test);
		System.out.printf("Here's the test's median\n");

		testMedian(test);
		scan.close();
	}
}