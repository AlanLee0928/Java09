package Class20;

class Data{
	private String name;
	private Test score;
	
	public class Test{
		int english , math;
		
		public Test(int eng , int m) {
			english = eng;
			math = m;
		}
	}
	
	public Data(String a , int b , int c) {
		name = a;
		score = new Test(b , c);
	}
	
	double avg() {
		return (score.english + (double)score.math) / 2;
	}
	
	void show() {
		System.out.println("�ǥͩm�W:" + name);
		System.out.println("�^�妨�Z:" + score.english);
		System.out.println("�ƾǦ��Z:" + score.math);
		System.out.println("�������Z:" + avg());
	}
}

public class Class20 {
	public static void main(String[] args) {
		Data stu = new Data("Annie" , 85 , 92);
		stu.show();
	}
}