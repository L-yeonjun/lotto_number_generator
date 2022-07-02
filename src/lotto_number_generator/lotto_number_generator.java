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
		
		System.out.println("�ζ� ���α׷��� ���۵˴ϴ�.");
		System.out.println("");
		
		while(true) {
			
			System.out.println("---------- �ζ� ��ȣ ������ �޴� ----------");
			System.out.println("1. ��÷   2. ����   3. ������");
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
				System.out.println("�ζ� ��ȣ ���� �Ϸ�");
				System.out.println("���ʽ� ��ȣ ���� �Ϸ�\n\n");
				
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
				System.out.printf("(���ʽ� ��ȣ)>>> %d\n\n", bonus);
			
			}
			
			else {
				System.out.printf("Good Luck!");
				break;
			}
		}//while end

	}
}