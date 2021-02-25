package test.monprojet.test;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import test.monprojet.SommeArgent;
import test.monprojet.UniteDistincteException;

public class TestSommeArgent {
	
	SommeArgent m12CHF ;
	SommeArgent m14CHF ;
	SommeArgent m14DTN;
	SommeArgent m14USD;
	
	static int beforcounter = 1;
	static int Aftercounter = 1;


	@Before
	public void before() {
		 m12CHF = new SommeArgent(12,"CHF");
		 m14CHF = new SommeArgent(14,"CHF");
		 m14DTN = new SommeArgent(14,"DTN");
		 m14USD = new SommeArgent(14,"USD");
		System.out.println(beforcounter +"befor");
		beforcounter++;
	}
	
	@After
	public void last() {
		System.out.println(Aftercounter+"After");
		Aftercounter++;
	}
	
	
	@Test()
	public void equals() throws UniteDistincteException {

		SommeArgent expected = new SommeArgent(26,"CHF");
		SommeArgent result = m12CHF.add(m14CHF);
		Assert.assertTrue(expected.equals(result));
		Assert.assertEquals(m12CHF, m12CHF);
		Assert.assertEquals(m12CHF, new SommeArgent(12, "CHF"));
		Assert.assertTrue(!m14USD.equals(m14CHF));

	}
	
	@Test(expected = UniteDistincteException.class)
	public void notEquals() throws UniteDistincteException {
		SommeArgent expected = new SommeArgent(26,"CHF");
		SommeArgent result = m14DTN.add(m14CHF);
		Assert.assertTrue(expected.equals(result));
	}
	
	




}
