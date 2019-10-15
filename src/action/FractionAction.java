package action;
import java.util.Arrays;
import java.util.Scanner;

import bean.Fraction;
import calculus.FractionCalc;

public class FractionAction {
	Scanner scan = new Scanner(System.in);
		public Fraction[] createFractionArray(int n) {
			
			Fraction a[] = new Fraction[n];
			for(int i = 0; i < n; i++)
			{
				a[i] = new Fraction(scan.nextInt(), scan.nextInt());	
			}
			
			return a;
		}
		
		public void showFractionArray(Fraction [] a) {
			System.out.println(Arrays.toString(a));
		}
		
		public void task(Fraction [] a) {
			for(int i = 0; i < a.length; i++) {
				if ( i % 2 == 0)
					if (i < a.length - 1)
						a[i] = FractionCalc.add(a[i], a[i+1]);
			}
		}
}
