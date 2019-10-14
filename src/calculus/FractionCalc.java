package calculus;

import bean.Fraction;

public class FractionCalc {

	public static Fraction Add(Fraction a, Fraction b) {
		int n = 1, m = 1;
		if (a.getDenominator() == b.getDenominator()) {
			n = a.getNumerator() + b.getNumerator();
			m = a.getDenominator();
		} else {
			n = a.getDenominator() * b.getDenominator();
			m = a.getNumerator() * b.getDenominator() + b.getNumerator() * a.getDenominator();
		}
		return new Fraction(n, m);
	}
	
	public static Fraction Subtract(Fraction a, Fraction b) {
		int n = 1, m = 1;
		if (a.getDenominator() == b.getDenominator()) {
			n = a.getNumerator() - b.getNumerator();
			m = a.getDenominator();
		} else {
			n = a.getDenominator() * b.getDenominator();
			m = a.getNumerator() * b.getDenominator() - b.getNumerator() * a.getDenominator();
		}
		return new Fraction(n, m);
	}
	
	public static Fraction Multiply(Fraction a, Fraction b) {
		return new Fraction(a.getNumerator() * b.getNumerator(), a.getDenominator() * b.getDenominator());
	}
	
	public static Fraction Divide(Fraction a, Fraction b) {
		return new Fraction(a.getNumerator() * b.getDenominator(), a.getDenominator() * b.getNumerator());
	}
	
	
}
