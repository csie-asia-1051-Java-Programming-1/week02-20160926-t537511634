package hw;

import java.util.Scanner;
public class hw01_105021029 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn = new Scanner(System.in);
		
		System.out.println("媽媽請小明去菜市場買水果，給了小明m元， 請輸入M:");
		int m = scn.nextInt();
		System.out.println("小明到了水果攤買了a1顆蘋果， 請輸入a1:");
		int a1 = scn.nextInt();
		System.out.println("a2顆柳丁， 請輸入a2:");
		int a2 = scn.nextInt();
		System.out.println("及a3顆桃子， 請輸入a3:");
		int a3 = scn.nextInt();
		System.out.println("1顆蘋果15元，1顆柳丁20元，1顆桃子30元");
		int s = a1*15+ a2*20+ a3*30;
		int t = 0;
		if(s > m){
			t = m - s;
		}else if(s < m){
		System.out.println("0");
		}
		int c = t

	}

}
