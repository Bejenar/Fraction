package bean;

public class Fraction {
	private int numerator;
	private int denominator;
	
	public int getNumerator() {
		return numerator;
	}

	public int getDenominator() {
		return denominator;
	}

	public void setNumerator(int numerator) {
		this.numerator = numerator;
	}

	public void setDenominator(int denominator) {
		this.denominator = denominator;
	}
	
	public Fraction()
	{
		this.numerator = 1;
		this.denominator = 1;
	}
	
	public Fraction(int numerator, int denominator) {
		this.numerator = numerator;
		this.denominator = denominator;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj == null) return false;
		
		if (obj.getClass() != this.getClass()) return false;
		
		Fraction f = (Fraction)obj;
		return this.denominator * f.getNumerator() == this.numerator * f.getDenominator(); 
	}
	
	@Override
	public String toString() {
		return this.numerator + "/" + this.denominator;
	}
	
	
	
}
