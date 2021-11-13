package Class07;

class power{
	int a;
	void power(int x , int n) {
		a = x;
		for(int i = 1 ; i < n ; i++) {
			a = a * x;
		}
	}
	void show() {
		System.out.println(a);
	}
}
public class Class07 {
	public static void main(String[] args) {
		power p = new power();
		p.power(2 , 5);
		p.show();
		p.power(3 , 2);
		p.show();
	}
}