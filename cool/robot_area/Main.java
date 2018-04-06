public class Main {

	private static final int BLOCKED = -1;
	private static final int VISITED = 1;

	private static final int FORWARD = 0;
	private static final int RIGHT = 1;
	private static int BACK = 2;
	private static int LEFT = 3;

	private static int NORTH = 0;
	private static int EAST = 1;
	private static int SOUTH = 2;
	private static int WEST = 3;

	public static void main(String[] args) {
		System.out.printf("%d\n", area());
	}

	private static int area() {
		
		Robot r = new Robot();

		while (r.check(FORWARD) != BLOCKED) step(r);

		int x=0, y=0, area=0, dir=EAST;

		r.turn(RIGHT);

		do {
			// update x and y, the position along the perimeter

			if (dir==NORTH) {
				++y;
			} else if (dir==EAST) {
				area -= y;
				++x;
			} else if (dir == SOUTH) {
				--y;
			} else {
				area += y;
				--x;
			}

			// update the robot's position and orientation

			if (r.check(FORWARD) != -1) {
				step(r);
				if (r.check(LEFT) != -1) {
					r.turn(LEFT);
					dir = (dir+LEFT)%4;
					step(r);
				}
			} else {
				r.turn(RIGHT);
				dir = (dir+RIGHT)%4;
			}
		} while (x!=0 || y!=0 || dir != EAST);
		
		return area;
	}

	// paints square and then steps forward
	private static void step(Robot r) {
		r.paint(VISITED);
		r.move(FORWARD);
	}
}