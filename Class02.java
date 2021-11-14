package Class02;

class CRectangle{
	int width;
	int height;
	
	public CRectangle() {
		this(10,8);
		System.out.println("constructor called");
	}
	public CRectangle(int w , int h) {
		width = w;
		height = h;
	}
//	public CRectangle() {
//		width = 10;
//		height = 8;
//	}
	void show() {
		System.out.println(width + " , " + height);
	}
}

public class Class02 {

	public static void main(String[] args) {
		CRectangle cr1 = new CRectangle();
		cr1.show();
	}
}
//其實就上下對調就好了...我嘗試了好久，裡面的建構值執行完才可以執行其他的動作。