package chap4;

public class IfExample2 {

	public static void main(String[] args) {

		int age =788;
		int charge;
		
		if (age < 8) {
			
			 charge = 1000;
			 System.out.println("������ �Ƶ��Դϴ�");
		}
		
		else if (age < 14) {
			
			charge = 2000;
			System.out.println("�ʵ��л��Դϴ�.");
						
		}
		
		else if (age < 20) {
			
			charge = 3000;
			System.out.println("û�ҳ� �Դϴ�");
			
		}
		
		else if (age > 60) {
			
			charge = 0;
			System.out.println("��ο���Դϴ�.");
		}
		
		else {
			charge = 4000;
			System.out.println("�����Դϴ�.");
		}
		
		System.out.println("������" + charge + "���Դϴ�.");
	}

}
