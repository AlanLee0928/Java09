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
//21�O�S�޼ƪ�(value = 10)�A22�O���޼ƪ�(value = i)
//����Apublic class�u�঳�@�٭n���ɮצW�٤@�ˡA�ҥH�b���ɪ��ɭԴN�w�g���@�ӤF�C
//�i�H��A�]�����٬O�B��P�@�����O���A�ҥH���ެOpublic��Ϊ̬Oprivate���S����C