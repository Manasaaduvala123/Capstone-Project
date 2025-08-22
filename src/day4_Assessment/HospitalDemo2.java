// 5. Hierarchical inheritance 2nd example
package day4_Assessment;

interface Doctor
{
	void operation();
	void OPD();
}
interface Nurse
{
	void dailyCheck();
	void documentation();
}
interface Accountant
{
	void payment();
	void query();
}
class Patient implements Doctor, Nurse, Accountant
{
	public void operation()
	{
		System.out.println("Doctor came to perform operation");
	}
	public void OPD()
	{
		System.out.println("OPD is done");
	}
	public void dailyCheck()
	{
		System.out.println("Nurse came to done the regular checkup");
	}
	public void documentation()
	{
		System.out.println("Documentation is done");
	}
	public void payment()
	{
		System.out.println("payment is done");
	}
	public void query()
	{
		System.out.println("Accountant verified queries");
	}
}
public class HospitalDemo2 {
	public static void main(String args[])
	{
		Patient p=new Patient();
		p.operation();
		p.OPD();
		p.dailyCheck();
		p.documentation();
		p.payment();
		p.query();
	}

}

/*
output
Doctor came to perform operation
OPD is done
Nurse came to done the regular checkup
Documentation is done
payment is done
Accountant verified queries
*/
