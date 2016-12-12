import java.util.Scanner;

public class LunarYear {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("연도를 입력 하세요");
	int year = sc.nextInt();
	
	if(year % 400 == 0){
		System.out.println(year+" 년은 윤년 입니다.");
	}else if(year % 100 == 0){
		System.out.println(year+" 년은 평년 입니다.");
	}else if(year % 4 == 0){
		System.out.println(year+" 년은 윤년 입니다.");
	}else{
		System.out.println(year+" 년은 평년 입니다.");
	}
	
	
	sc.close();
	
	}

}
