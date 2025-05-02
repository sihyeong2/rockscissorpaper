import java.util.Random;
import java.util.Scanner;

public class Ksh20221070_mid1 {
	

	public static void main(String[] args) {
	Random cp = new Random();
	Scanner in = new Scanner(System.in);
	String[] rsp = {"가위", "바위", "보"};
	
	while(true) {
		System.out.println("가위(0),바위(1),보(2)중 하나를 입력하세요 : ");
		int com = cp.nextInt(3);
		int user = in.nextInt(); 

		if (user < 0 || user > 2) {
			System.out.println("잘못 입력하셨습니다.");
			continue;
		}
		if (user == com) {
			System.out.println("유저의 선택: " + rsp[user]);
			System.out.println("컴퓨터의 선택: " + rsp[com]);
			System.out.println("비겼습니다.");
			continue;
		}
		else if((user == 0 && com == 2) || (user == 1 && com == 0) || (user == 2 && com == 1)) {
			System.out.println("유저의 선택: " + rsp[user]);
			System.out.println("컴퓨터의 선택: " + rsp[com]);
			System.out.println("유저의 승리!");
			break;
		}
		else{
			System.out.println("유저의 선택: " + rsp[user]);
			System.out.println("컴퓨터의 선택: " + rsp[com]);
			System.out.println("컴퓨터의 승리!");
			break;
		}	
	}
	}
}
