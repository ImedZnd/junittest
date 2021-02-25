package test.monprojet.test;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import test.monprojet.PortMonnaie;
import test.monprojet.SommeArgent;
import test.monprojet.UniteDistincteException;

public class TestPorteMonnaie {
	
	PortMonnaie pmn;
	PortMonnaie exp;
	SommeArgent tn1;
	SommeArgent tn2;
	SommeArgent smm;
	SommeArgent swf;
	
	@Before
	public void befor() {
		
		 tn1 = new SommeArgent(200, "DTN");
		 tn2 = new SommeArgent(200, "DTN");
		 smm = new SommeArgent(400, "DTN");
		 exp = new PortMonnaie();
		 pmn = new PortMonnaie();
		 
	}
	
	@Test()
	public void test() throws UniteDistincteException {
		 pmn.ajouteSomme(tn1);
		 pmn.ajouteSomme(tn2);
		 exp.ajouteSomme(smm);
		 Assert.assertTrue(exp.equals(pmn));
		
	}
	

}
