package test;

class Data {
	private String name;
	private Test score;

	class Test {
		private int english;
		private int math;

		public Test(int eng, int m) {
			english = eng;
			math = m;
		}

		public double avg() {
			return (english + math) / 2.0;
		}
	}

	public Data(String na, int eng, int ma) {
		name = na;
		score = new Test(eng, ma);
	}

	public void show() {
		System.out.println("學生姓名:" + name);
		System.out.println("英文成績:" + score.english);
		System.out.println("數學成績:" + score.math);
		System.out.println("平均成績:" + score.avg());
	}
}

public class hw9_19 {
	public static void main(String args[]) {
		Data stu = new Data("Annie", 85, 92);
		stu.show();
	}
}
