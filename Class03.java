package Class03;

class Caaa{
	private int value;
	
	public Caaa(){
		value = 10;
		System.out.println("value=" + value);
	}
	public Caaa(int i) {
		value = i;
		System.out.println("value=" + value);
	}
}

public class Class03 {

	public static void main(String[] args) {
		Caaa obj1 = new Caaa();
		Caaa obj2 = new Caaa(12);
	}
}
//21是沒引數的(value = 10)，22是有引數的(value = i)
//不行，public class只能有一還要跟檔案名稱一樣，所以在創檔的時候就已經有一個了。
//可以喔，因為都還是處於同一個類別中，所以不管是public亦或者是private都沒關西。