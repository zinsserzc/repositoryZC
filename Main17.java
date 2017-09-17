package test;

import java.util.Scanner;

public class Main17 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String mns = scanner.nextLine();
		String[] mn = mns.split(" ");
		int m = Integer.parseInt(mn[1]);
		int n = Integer.parseInt(mn[0]);
		String abcds = scanner.nextLine();
		String[] abcd = abcds.split(" ");
		int a = Integer.parseInt(abcd[0]);
		int b = Integer.parseInt(abcd[1]);
		int c = Integer.parseInt(abcd[2]);
		int d = Integer.parseInt(abcd[3]);
		String xyzs = scanner.nextLine();
		String[] xyz = xyzs.split(" ");
		int x = Integer.parseInt(xyz[0]);
		int y = Integer.parseInt(xyz[1]);
		int z = Integer.parseInt(xyz[2]);
		int count1 = n/a;
		int count2 = m/b;
		int countb = count1>count2?count2:count1;
//		int count1L = (n-countb*a)/d;
//		int count2L = (m-countb*b)/c;
//		int total1 = countb*x+count1L*z+count2L*y;
//		int total2 = n/d*z+m/c*y;
		int maxTotal = 0;
		for(int i = 0;i<=countb;i++){
			int cs = countb-i;
			int count1s = (n-cs*a)/d;
			int count2s = (m-cs*b)/c;
			int totals = cs*x+count1s*z+count2s*y;
			if(totals>maxTotal) maxTotal = totals;
		}
		System.out.println(maxTotal);
//		int countc = countb-1;
//		int count1Lc = (n-countc*a)/d;
//		int count2Lc = (m-countc*b)/c;
//		int total3 = countc*x+count1Lc*z+count2Lc*y;
//		if(total1>total2){
//			if(total1>maxTotal){
//				System.out.println(total1);
//			}else {
//				System.out.println(maxTotal);
//			}
//		}else {
//			if(total2>maxTotal){
//				System.out.println(total2);
//			}else {
//				System.out.println(maxTotal);
//			}
//		}
	}
	
}
