package lotto_number_generator;
import java.util.*;
public class lotto_number_generator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int inum;
		int bonus = 0;
		int [] lotto = new int [6];
		int i, j;
		int temp;
		
		System.out.println("로또 프로그램이 시작됩니다.");
		System.out.println("");
		
		while(true) {
			
			System.out.println("---------- 로또 번호 생성기 메뉴 ----------");
			System.out.println("1. 추첨   2. 보기   3. 끝내기");
			System.out.println("-------------------------------------");
			inum = sc.nextInt();
			
			if(inum == 1) {
				for(i = 0; i < 6; i++) {
					lotto[i] = (int)(Math.random() * 45) + 1;
					bonus = (int)(Math.random() * 45) + 1;
					if(lotto[i] == bonus) {
						i--;
					}
					for(j = 0; j < i; j++) {
						if(lotto[i] == lotto[j])
							i--;
					}
				}
				System.out.println("로또 번호 생성 완료");
				System.out.println("보너스 번호 생성 완료\n\n");
				
			}
			
			else if(inum == 2) {
				for(i = 0; i < 6; i++) {
					for(j = i; j < 6; j++) {
						if(lotto[i] > lotto[j]) {
							temp = lotto[i];
							lotto[i] = lotto[j];
							lotto[j] = temp;
						}
					}
				}
				for(i = 0; i < 6; i++) {
					System.out.printf(">>> %d\n", lotto[i]);
				}
				System.out.printf("(보너스 번호)>>> %d\n\n", bonus);
			
			}
			
			else {
				System.out.printf("Good Luck!");
				break;
			}
		}//while end

	}
}