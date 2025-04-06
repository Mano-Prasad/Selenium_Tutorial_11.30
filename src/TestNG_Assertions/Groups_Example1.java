package TestNG_Assertions;

import org.testng.annotations.Test;

public class Groups_Example1 
{
	@Test(groups="RT")
	public void m1()
	{
		System.out.println("Regression");
	}
	
	@Test(groups={"SMT", "RT"})
	public void m2()
	{
		System.out.println("Smoke & Regression");
	}

	
	@Test(groups="ST")
	public void m3()
	{
		System.out.println("Sanity");
	}

	
	
	@Test(groups="SMT")
	public void m4()
	{
		System.out.println("Smoke");
	}

	
	@Test(groups={"SMT","ST","RT"})
	public void m5()
	{
		System.out.println("Smoke, Sanity, Regression");
	}

	
	@Test(groups="RT")
	public void m6()
	{
		System.out.println("Regression");
	}

	
	@Test(groups={"SMT","ST"})
	public void m7()
	{
		System.out.println("Smoke, Sanity");
	}

	
	@Test(groups={"ST","RT"})
	public void m8()
	{
		System.out.println("Sanity, Regression");
	}

	@Test(groups="RT")
	public void m9()
	{
		System.out.println("Regression");
	}

	
	@Test(groups="SMT")
	public void m10()
	{
		System.out.println("Smoke");
	}


}
