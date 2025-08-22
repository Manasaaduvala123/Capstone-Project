package day4_Assessment;
public class OverloadingAddMethod {
	    public int add(int a, int b) {
	        return a + b;
	    }

	    public int add(int a, int b, int c) {
	        return a + b + c;
	    }

	    public double add(double a, double b) {
	        return a + b;
	    }

	    public static void main(String[] args) {
	    	OverloadingAddMethod calc = new OverloadingAddMethod();
	        System.out.println("Addition two integers: " + calc.add(10, 20));
	        System.out.println("Addition three integers: " + calc.add(10, 20, 30));
	        System.out.println("Addition two floating point numbers: " + calc.add(10.5, 20.3));
	    }
	}

/*
output
Addition two integers: 30
Addition three integers: 60
Addition two floating point numbers: 30.8
*/