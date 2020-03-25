package Epam_Junit.Junit_Tdd;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

//import org.junit.jupiter.api.Assertions.assertEquals;
public class Junit
{
	/* TODO LIST
	 * 1.A in first two characters : ABCD => BCD
	 * 2.A in first two characters : AABCD => BCD
	 * 3.A not in first two characters : BCAAD => BCAAD
	 * 4.A not in given String : BBNF => BBNF
	 * 5.Length of String is 1 and only character is A : A => ''
	 * 6.Length of String is 1 and character is not A: B => B
	 * 7.AA => ''
	 * 8.AB => B
	 * 9.'' => ''
	 * 10.BC => BC
	 */
    @Test
    void test1()
    {
    	RemoveA removea=new RemoveA();
    	String result=removea.removeA("ABCD");
    	assertEquals("BCD",result);
    }
    @Test
    void test2()
    {
    	RemoveA removea=new RemoveA();
    	String result=removea.removeA("AABCD");
    	assertEquals("BCD",result);
    }
    @Test
    void test3()
    {
    	RemoveA removea=new RemoveA();
    	String result=removea.removeA("BCAAD");
    	assertEquals("BCAAD",result);
    }
    @Test
    void test4()
    {
    	RemoveA removea=new RemoveA();
    	String result=removea.removeA("BBNF");
    	assertEquals("BBNF",result);
    }
    @Test
    void test5()
    {
    	RemoveA removea=new RemoveA();
    	String result=removea.removeA("A");
    	assertEquals("",result);
    }
    @Test
    void test6()
    {
    	RemoveA removea=new RemoveA();
    	String result=removea.removeA("B");
    	assertEquals("B",result);
    }
    @Test
    void test7()
    {
    	RemoveA removea=new RemoveA();
    	String result=removea.removeA("AA");
    	assertEquals("",result);
    }
    @Test
    void test8()
    {
    	RemoveA removea=new RemoveA();
    	String result=removea.removeA("AB");
    	assertEquals("B",result);
    }
    @Test
    void test9()
    {
    	RemoveA removea=new RemoveA();
    	String result=removea.removeA("");
    	assertEquals("",result);
    }
    @Test
    void test10()
    {
    	RemoveA removea=new RemoveA();
    	String result=removea.removeA("BC");
    	assertEquals("BC",result);
    }
}
