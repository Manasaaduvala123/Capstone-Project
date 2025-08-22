package day1_day2_Assessment;

public class Fibboancci {
	int n = 10;
    int a = 0;
    int b = 1;
    for (int i = 0; i < n; i++) {
        System.out.println(a);
        int temp = a + b;
        a = b;
        b = temp;
    }
}
}
