package hw;

import java.util.Scanner;
public class hw02_105021029 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scn = new Scanner(System.in);
		
		System.out.println("請輸入性別代號（1代表男性；2代表女性）:");
		int s = scn.nextInt();
		System.out.println("請輸入身高(公分):");
		int h = scn.nextInt();
		double w = 0;
		if(s == 1){
		w = (h - 80 )*0.7;	
		}else{
		w  = (h - 70)*0.6;
		}
		System.out.print("您的標準體重為:" + w);
	}	
}
