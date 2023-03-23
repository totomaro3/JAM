
public class test {

	public static void main(String[] args) {
		for(int m = 1; m<=10; m++) {
			int n = m;
			int count = 1;
			
			while(n != 1) {
				if(n % 4 == 1) {
					int a = (int) ((Math.random() * (3 - 1)) + 1);
					n -= a;
					count++;
					System.out.println((count % 2)+1 +"선수가 "+a+"를 가져갔습니다. 남은 모래"+n);
				}
				else if(n % 4 == 2) {
					n -= 1;
					count++;
					System.out.println((count % 2)+1 +"선수가 1를 가져갔습니다. 남은 모래"+n);
				}
				else if(n % 4 == 3) {
					n -= 2;
					count++;
					System.out.println((count % 2)+1 +"선수가 2를 가져갔습니다. 남은 모래"+n);
				}
				else if(n % 4 == 0) {
					n -= 3;
					count++;
					System.out.println((count % 2)+1 +"선수가 3를 가져갔습니다. 남은 모래"+n);
				}
			}
			System.out.println("남은모래"+m+ "경기에" + (int)((count % 2)+1) +"선수가 이겼습니다");
		}
	}
}
