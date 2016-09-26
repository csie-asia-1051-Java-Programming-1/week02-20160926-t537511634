package ex;
/*
 * Topic: 有一圓形，直徑為200，且中心座標為(0,0)。
 * 	請寫一支程式可以輸入「點」的座標，並判斷「點」是否在圓形的範圍內。
 * 	如果「點」的位置剛好在邊界的話也算是在圓形範圍內(例：x=100，y=0)。
 * Date: 2016/09/26
 * Author: 105021029 汪元浩
 */

import java.util.Scanner;
public class ex02_105021029 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn = new Scanner(System.in);
		System.out.println("有一圓形，直徑為200，且中心座標為(0,0)");
		System.out.println("輸入座標後系統可判斷是否在圓內請輸入座標:");	
		System.out.println("請輸入x座標:");	
		int a = scn.nextInt();
		System.out.println("請輸入y座標:");	
		int b = scn.nextInt();
		int c = (int)Math.sqrt((int)Math.pow(a, 2) + (int)Math.pow(b, 2));
		if(c <= 100){
			System.out.print("在圓形範圍內");
	}else if(c > 100){
		System.out.print("不在圓形範圍內");
	}

}
}
