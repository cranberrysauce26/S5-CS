public class Grades {

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

	public static void main(String[] args) {
		for (int i = 0; i < grades.length; ++i) 
			if (grades[i][0] == 10318)
				System.out.printf("%d\n", grades[i][3]);

		int sum = 0;
		for (int i = 0; i < grades.length; ++i) {
			if (grades[i][0] == 10918) {
				for (int j = 1; j < grades[i].length; ++j) {
					sum += grades[i][j];
				}
				double avg = (double)sum / (double) (grades[i].length-1);
				System.out.println(avg);
				break;
			}
		}
	}
}