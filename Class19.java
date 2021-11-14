package Class19;

class Data{
	private String name;
	private Test score;
	
	public class Test{
		int english , math;
		
		public Test(int eng , int m) {
			english = eng;
			math = m;
		}
		
		double avg() {
			return (english + (double)math) / 2;
		}
	}
	
	public Data(String a , int b , int c) {
		name = a;
		score = new Test(b , c);
	}
	
	void show() {
		System.out.println("�ǥͩm�W:" + name);
		System.out.println("�^�妨�Z:" + score.english);
		System.out.println("�ƾǦ��Z:" + score.math);
		System.out.println("�������Z:" + score.avg());
	}
}

public class Class19 {
	public static void main(String[] args) {
		Data stu = new Data("Annie" , 85 , 92);
		stu.show();
	}
}