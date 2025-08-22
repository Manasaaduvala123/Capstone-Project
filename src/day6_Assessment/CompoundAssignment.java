/*
Compound Assignment Behaviour 
1.	Initialize int x = 5;.
2.	Write two operations:
x = x + 4.5;    // Does this compile? Why or why not?
x += 4.5;       // What happens here?
3.	Print results and explain behavior in comments (implicit narrowing, compile error vs. successful assignment).
 */

package day6_Assessment;
public class CompoundAssignment {
    public static void main(String[] args) {       
        int x = 5;
        // x = x + 4.5;
        //Compile-time error: possible lossy conversion from double to int
        x += 4.5;
        //Works: implicit narrowing conversion
        System.out.println("Value of x after compound assignment: " + x);
    }
}

/*
output:
Value of x after compound assignment: 9
*/