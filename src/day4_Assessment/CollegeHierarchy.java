// 4. create hierarchical inhertance
package day4_Assessment;

	class After12thCollege {
	    After12thCollege() {
	        System.out.println("After 12th, you can join college.");
	    }

	    void showCourses() {
	        System.out.println("Courses: Engineering, Medical, Other Courses");
	    }
	}

	class Engineering extends After12thCollege {
	    Engineering() {
	        super();
	        System.out.println("Welcome to Engineering Stream.");
	    }

	    void showBranches() {
	        System.out.println("Engineering has branches: IT, Mechanical, CS");
	    }
	}

	class Medical extends After12thCollege {
	    Medical() {
	        super();
	        System.out.println("Welcome to Medical Stream.");
	    }

	    void showBranches() {
	        System.out.println("Medical has branches: MBBS, BDS");
	    }
	}

	class OtherCourses extends After12thCollege {
	    OtherCourses() {
	        super();
	        System.out.println("Welcome to Other Courses Stream.");
	    }

	    void showBranches() {
	        System.out.println("Other Courses: BCA, BBA");
	    }
	}

	class IT extends Engineering {
	    IT() {
	        super();
	        System.out.println("You selected IT Branch.");
	    }
	}

	class Mechanical extends Engineering {
	    Mechanical() {
	        super();
	        System.out.println("You selected Mechanical Branch.");
	    }
	}

	class CS extends Engineering {
	    CS() {
	        super();
	        System.out.println("You selected CS Branch.");
	    }
	}

	class MBBS extends Medical {
	    MBBS() {
	        super();
	        System.out.println("You selected MBBS Course.");
	    }
	}

	class BDS extends Medical {
	    BDS() {
	        super();
	        System.out.println("You selected BDS Course.");
	    }
	}

	class BCA extends OtherCourses {
	    BCA() {
	        super();
	        System.out.println("You selected BCA Course.");
	    }
	}

	class BBA extends OtherCourses {
	    BBA() {
	        super();
	        System.out.println("You selected BBA Course.");
	    }
	}

	public class CollegeHierarchy {
	    public static void main(String[] args) {
	        System.out.println("---- IT Student ----");
	        IT itStudent = new IT();

	        System.out.println("\n---- MBBS Student ----");
	        MBBS mbbsStudent = new MBBS();

	        System.out.println("\n---- BCA Student ----");
	        BCA bcaStudent = new BCA();
	    }
	}
	
/* 
output
 ---- IT Student ----
After 12th, you can join college.
Welcome to Engineering Stream.
You selected IT Branch.

---- MBBS Student ----
After 12th, you can join college.
Welcome to Medical Stream.
You selected MBBS Course.

---- BCA Student ----
After 12th, you can join college.
Welcome to Other Courses Stream.
You selected BCA Course.
*/


