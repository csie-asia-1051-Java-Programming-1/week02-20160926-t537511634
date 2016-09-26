package ex;
/*
 * Topic: 假設某個停車場的費率是停車2小時以內，每半小時30元，超過2小時，但未滿4小時的部份，
 * 	每半小時40元，超過4小時以上的部份，每半小時60元，未滿半小時部分不計費。
 * 	如果您從早上10點23分停到下午3點20分，請撰寫程式計算共需繳交的停車費。
 * Date: 2016/09/26
 * Author: 105021029 汪元浩
 */

import java.util.Scanner;
public class ex03_105021029 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn = new Scanner(System.in);
		
		System.out.println("請輸入您開始的停車時間(ex:1820 ->18 enter 20 enter):");
		int a = scn.nextInt();
		int b = scn.nextInt();
		System.out.println("請輸入您結束的停車時間(ex:1820 ->18 enter 20 enter):");
		int c = scn.nextInt();
		int d = scn.nextInt();
		int h = (Math.abs(a-c)*2);
	    int m = (d-b);
	    int p = 0;
	    if(a < 0 || b < 0 || c < 0 || d < 0 ){
			System.out.print("輸入錯誤");
		}
		if(m >= 30){
			h++;
		}else if(m < 30){
			h--;
		}
		if(h <= 2){
			p=h*30;			
		}else if(h > 2 && h <= 4){
			p=(h-4)*40+120;
		}else if(h > 4){
			p=(h-8)*60+280;
		}
		System.out.print("總停車費為:"+ p);
	}

}
