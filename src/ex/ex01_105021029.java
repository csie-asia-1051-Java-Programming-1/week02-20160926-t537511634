
package ex;
/*
 * Topic: 電話公司的計費方式是 600分鐘以下每分鐘0.5元；
 * 	600~1200分鐘電話費以9折計算；1200分鐘以上電話費以79折計算，
 *  讓使用者輸入單月使用分時間(分鐘)，算出電話費(元)
 * Date: 2016/09/26
 * Author: 105021029 汪元浩
 */
import java.util.Scanner;

import javax.lang.model.element.Parameterizable;

import com.sun.xml.internal.bind.v2.model.core.ID;
public class ex01_105021029 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn = new Scanner(System.in);
		System.out.print("讓使用者輸入單月使用時間(分鐘):");
		int m = scn.nextInt();
		double p = 0.5;
		if(m <= 600){
			System.out.print("單月使用電話費為"+m*p);
		}else {
		if(m > 600 && m <1200){
			System.out.print("單月使用電話費為"+m*p*0.9);				
		}else {
		if(m > 1200){
			System.out.print("單月使用電話費為"+m*p*0.79);				
		}else {
		if(m < 0){
			System.out.print("輸入錯誤");				
			}
		}
		
	}
}
}
}
