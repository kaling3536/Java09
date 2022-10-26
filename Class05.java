package test;

class CCount {
	private static int cnt = 0;

	public CCount() {
		count();
	}

	private static void count() {
		cnt++;
	}

	public static void setZero() {
		cnt = 0;
	}

	public static void setValue(int n) {
		cnt = n;
	}

	public static void show() {
		System.out.println("cnt=" + cnt);
	}
}

public class hw9_5 {

	public static void main(String[] args) {
		new CCount();
		new CCount();
		CCount.show();

		CCount.setZero();
		System.out.println("using setZero()...");
		CCount.show();

		CCount.setValue(10);
		System.out.println("using setValue(10)...");
		CCount.show();
	}

}

(d) cnt 要用類別變數,因為 cnt 要用來計算 CCount 類別所建立的物件個數,因此可以
    宣告成類別變數,讓所有 CCount 類別的物件共用。
(e) count() method 可以宣告成實例函數與類別函數。但由於 count()宣告成實例函數
    時,由物件呼叫,對 count()來說並沒有特別的意義,因此建議將 count()宣告成類
    別函數。
