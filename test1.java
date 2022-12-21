package hhh;
import java.util.Scanner;
public class test1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
				int x1;
				int x2 = 0;
				int x3 = 0;
				System.out.println("密碼輸入測試");
				System.out.print("請輸入數密碼:");
				 x1 = sc.nextInt();
				while (true) {
				System.out.print("請在輸入一次密碼:");
				 x2 = sc.nextInt();
				if (x1 == x2) {
					System.out.print("密碼正確");
					break;
				}
				else if (x1 != x2) {
					System.out.print("與第一次輸入的不同!\n");
					x3 ++;
					if (x3 == 3) {
						 throw  new  RuntimeException("輸入三次錯誤！程式停止！");
					}
					}
				}
		      }
	     }
