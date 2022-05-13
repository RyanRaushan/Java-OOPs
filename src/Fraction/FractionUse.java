package Fraction;

public class FractionUse {
	public static void main(String[] args) {
		Fraction f1 = new Fraction(0, 14);
		f1.print();
		
		Fraction f2 = new Fraction(15, 25);
		f2.print();
		
		f1.add(f2);
		f1.print();
		
		Fraction f3 = new Fraction(10, 20);
		f3.print();
		
		f2.subtraction(f3);
		f2.print();
		
		f2.multiply(f1);
		f2.print();
		
		Fraction f4 = Fraction.add(f1, f2);
		f4.print();		
		
		f4 = Fraction.subtraction(f1, f2);
		f4.print();
		
		f4 = Fraction.multiply(f1, f2);
		f4.print();
	}
}
