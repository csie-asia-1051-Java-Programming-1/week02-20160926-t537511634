package hw;

import java.util.Scanner;
public class hw03_105021029 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn = new Scanner(System.in);
		System.out.println("輸入一個 4 位數的整數，代表西洋的年份，系統會判別這個年份是否為閏年:");
		int y = scn.nextInt();
		if(y % 4 == 0 && y % 100 != 0){
			System.out.print("此年份為閏年");
	}else if(y % 400 == 0){
		System.out.print("此年份為閏年");
	}else if(y % 400 != 0 && y % 100 == 0){
		System.out.print("此年份不為閏年");
	}

	}

}
