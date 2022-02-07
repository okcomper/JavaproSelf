package chap4;

public class Self {

	public static void main(String[] args) {

	int score = 90;
	char grade;
	
	if(score >= 90) {
		grade = 'A';
	}
	
	else if(score > 80) {
		grade = 'B';
	}
	
	else if(score > 70) {
		grade = 'C';
	}
	
	else {
		grade = 'F';
	}
	
	System.out.println(score + "점의 학점은 " + grade + "입니다.");

}
}
