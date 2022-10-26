package test01;

class CRational {                       // 分數類別
	int n;
	int d;

	public void setN(int num) {           // 設定分子
		n = num;
	}

	public void setD(int num) {           // 設定分母
		d = num;
	}

	public void setND(int num, int den) {
		n = num;
		d = den;
	}
}

public class hw9_10b {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CRational aaa = new CRational();
		CRational bbb = new CRational();
		aaa.setN(2);
		aaa.setD(5);
		show(aaa);
		bbb.setND(3, 7);
		show(bbb);
	}

	public static void show(CRational obj) {	// 顯示分數
		System.out.println(obj.n + "/" + obj.d);
	}
}
