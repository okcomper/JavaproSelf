package chap4;

public class Self2 {

	public static void main(String[] args) {

		int floor = '2';
		
		switch(floor) {
		
		case '1':
			System.out.println("약국");
			break;
			
		case '2':
			System.out.println("정형외과");
			break;
			
		case '3':
			System.out.println("피부과");
			break;
			
		case '4':
			System.out.println("치과");
			break;
			
		case '5':
			System.out.println("헬스장");
			break;
			
		default:
			System.out.println("없는 층입니다.");
			
		}
		
	}

}
