package test;

class Caaa {
	private int value;

	public Caaa() {
		value = 10;
		System.out.println("value=" + value);
	}

	public Caaa(int i) {
		value = i;
		System.out.println("value=" + value);
	}
}

public class hw9_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Caaa obj1 = new Caaa();
		Caaa obj2 = new Caaa(12);
	}

}

(b) 21 行的程式碼會呼叫第 6 行沒有引數的建構元 Caaa()。22 行的程式碼會呼叫第 11
行有引數的建構元 Caaa(int i)。
(c) Caaa 類別不能宣告成 public,因為一個檔案裡只能有一個 public 的類別,而且與程
式儲存的文字檔名相同。如果要將 Caaa 類別宣告成 public,則必須將 Caaa 類別另
存成一個檔案,同時該檔案的名稱要為 Caaa.java。
(d) 由於成員 value 在 hw9_3.java 中沒有被其他類別使用,因此當 value 宣告成 public,
並不會對本範例有任何的影響。
