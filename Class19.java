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
		System.out.println("學生姓名:" + name);
		System.out.println("英文成績:" + score.english);
		System.out.println("數學成績:" + score.math);
		System.out.println("平均成績:" + score.avg());
	}
}

public class Class19 {
	public static void main(String[] args) {
		Data stu = new Data("Annie" , 85 , 92);
		stu.show();
	}
}