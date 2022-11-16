package student;

public class grade {

	public static void main(String[] args) {
		System.out.println(total(40,50,60));
		
	}
	public static int total(int sub1, int sub2, int sub3) {
		int total;
		total = sub1 + sub2 + sub3;
		return total;
	}
	public static float percentage(total) {
		float percentage;
		percentage = (float)(total / 3.0);
		return percentage;
	}

}
