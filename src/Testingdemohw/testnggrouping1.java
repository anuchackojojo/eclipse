package Testingdemohw;

import org.testng.annotations.Test;

public class testnggrouping1 {
	@Test(groups= {"sanity"})
	public void main()
	{
		System.out.println("this is main");
	}
	@Test(groups= {"sanity","smoke"})
	public void main1()
	{
		System.out.println("this is main1");
	}
	@Test(groups= {"regression"})
	public void main2()
	{
		System.out.println("this is main2");
		
	}
    @Test(groups= {"smoke"})
    public void main3()
    {
    	System.out.println("this is main3");
    }
    @Test(groups= {"retest","regression"})
    public void main4()
    {
    	System.out.println("this is main4");
    }
}
