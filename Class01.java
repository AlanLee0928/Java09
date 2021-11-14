package Class01;

class CRectangle{
	int width;
	int height;
	
	public CRectangle(int w , int h) {
		width = w;
		height = h;
	}
	public CRectangle() {
		width = 10;
		height = 8;
	}
//	public CRectangle() {
//		this.width = 9;
//		this.height = 7;
//	}
	void show() {
		System.out.println(width + " , " + height);
	}
}

public class Class01 {
	public static void main(String[] args) {
		CRectangle cr1 = new CRectangle(5 , 2);
		cr1.show();
		CRectangle cr2 = new CRectangle();
		cr2.show();
	}
}