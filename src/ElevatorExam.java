import java.util.Scanner;

public class ElevatorExam {

	public static void main(String[] args) throws Exception {
		Elevator e = new Elevator();// 객체 생성
		e.currFloor = 1;
		e.floorMax = 4;
		e.floorMin = 1;
		e.weight = 550;
	    e.nopsMax = 8;//8명
		Scanner scan = new Scanner(System.in);
		
		int menuNum = 0;
		
		System.out.println("현재 계신 층을 눌러주세요.");
		switch (scan.next()) {
		case "1상":
			e.currFloor = 1;
			e.openDoor();
			System.out.println("탑승했습니다.");
			e.closeDoor();
			
			System.out.println("현재층으로 이동합니다.");
			
			break;

		default:
			break;
		}
		
		
		
		while (true) {
			System.out.println("===메뉴를 선택하세요===");
			System.out.println("1:층이동");
			System.out.println("2:현재층");
			System.out.println("0:종료");
			menuNum = scan.nextInt();

			switch (menuNum) {
			case 0:
				System.exit(0);
			case 1:
				System.out.println("탑승인원은 몇명입니까?");
				e.nops +=scan.nextInt();
				if(e.nops > e.nopsMax) {
					System.out.println("미안합니다. 최씨성은 내리세요.");
				}
				System.out.println("이동할 층을 눌러 주세요");
				int finishFloor = scan.nextInt();// 숫자를 받아야함

				if (finishFloor <= e.floorMax && finishFloor >= e.floorMin) {
					System.out.println("현재 층은" + e.currFloor);
					System.out.println("이동할 층은" + finishFloor);
					if(e.currFloor < finishFloor) {
						e.upFloor(e.currFloor, finishFloor);
					}else {
						e.downFloor(e.currFloor, finishFloor);
					}
					
					e.currFloor = finishFloor;
//					e.upFloor();
//					e.upFloor();
//					e.upFloor();
				} else {
					System.out.println("처음부터 다시 하세요.");
				}

				break;
			case 2:
				System.out.println("현제층은"+e.currFloor+"입니다.");
				break;
			default:
				break;

			}

//		System.out.println("■ 이동할 층을 눌러주세요");
//		int finishFloor= scan.nextInt();//숫자를 받아야함.
//		System.out.println("이동할 층은"+finishFloor);
			if (menuNum == 0)
				break;
		}

//		e.openDoor();
//		e.closeDoor();
//		e.downFloor();
//		e.downFloor();
//		e.downFloor();
//		e.openDoor();
//		e.closeDoor();

	}
}
