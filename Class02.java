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
//���N�W�U��մN�n�F...�ڹ��դF�n�[�A�̭����غc�Ȱ��槹�~�i�H�����L���ʧ@�C