package Class04;

class CBox{
	private int length;
	private int width;
	private int height;
	
	public CBox(int l , int w , int h) {
		length = l;
		width = w;
		height = h;
	}
	public void show() {
		System.out.print("length=" + length);
		System.out.print(", width=" + width);
		System.out.println(", height=" + height);
	}
}

public class Class04 {
	public static void main(String[] args) {
		CBox box1 = new CBox(1 , 2 , 3);
		box1.show();
	}
}
//在物件裡面加入資料就好了
