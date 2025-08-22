package day1_day2_Assessment;

public class WrapperClasses {
		public static void main(String[] args) {
			// autoboxing
			int num=10;
			System.out.println("primitive type of data="+num);
			Integer num1=num;
			System.out.println("wrap data="+num1);
			//unboxing
				Integer a=20;
				System.out.println("for object"+a);
				int b=a;
				System.out.println("for primitive data type="+b);
				String str="1234";
				int ab=Integer.parseInt(str);
				System.out.println(ab);
				String n=Integer.toString(num);
				System.out.println(n);
			

		}

	}