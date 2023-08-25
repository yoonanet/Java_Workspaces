package exam03;

public class NoticeByteType {

	public static void main(String[] args) {
		byte data1 = 20, data2 = 30;
		int sum; //byte sum; //error 
		
		sum = data1 + data2;
		System.out.println(data1 + " + " + data2 + " = " + sum);
	}

}
