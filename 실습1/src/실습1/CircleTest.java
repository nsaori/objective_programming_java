/*<문제> int타입의 x, y, radius라는 속성들을 가지는 Circle클래스와
main메소드를 가지는 CircleTest클래스를 작성하시오.
Circle클래스에서는 equals메소드를 overriding하여 2개의 Circle객체들의 반지름이 같으면 2개의 Circle객체가 동일한 것으로 판별하도록 하라.
Circle클래스의 Constructor는 3개의 매개변수를 가지며 x, y, radius속성들을 초기화한다.
 CircleTest클래스에서는 사용자로부터 2개의 Circle객체의 속성값들을 입력받아서
 Circle객체 2개를 생성하고, 생성된 2개의 Circle객체들이 서로 동일한 것인지 여부를 판별한다.
*/


package 실습1;
import java.util.Scanner;

public class CircleTest {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("원점의 x,y좌표, 원의 반지름을 입력해주세요: ");
		int x = scanner.nextInt();
		int y = scanner.nextInt();
		int r = scanner.nextInt();
		Circle c1 = new Circle(x,y,r);

		System.out.println("원점의 x,y좌표, 원의 반지름을 입력해주세요: ");
		x = scanner.nextInt();
		y = scanner.nextInt();
		r = scanner.nextInt();
		Circle c2 = new Circle(x,y,r);

		System.out.println(c1.equals(c2));

		if(c1.equals(c2)){
			System.out.println("두 원은 같습니다.");
		}
		else{
			System.out.println("두 원은 다릅니다.");
		}

	}

}
