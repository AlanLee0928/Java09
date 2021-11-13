package Class06;

class add2n{
	int a;
	void add2n(int n){
		for(int i = 1 ; i <= n ; i++) {
			a = a + i;
		}
	}
	void show() {
		System.out.println(a);
	}
}
public class Class06 {
	public static void main(String[] args) {
		add2n ad = new add2n();
		ad.add2n(5);
		ad.show();
		ad.add2n(10);
		ad.show();
	}
}