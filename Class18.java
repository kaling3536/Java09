package test;

public class hw9_18 {
	public static void main(String args[]) {
		(new CCircle(1.0) {
			void show() {
				System.out.println("area=" + pi * radius * radius);
			}
		}).show();
	}

	static class CCircle {
		public double pi = 3.14;
		public double radius;

		public CCircle(double r) {
			radius = r;
		}
	}
}
