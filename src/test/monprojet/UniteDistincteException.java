package test.monprojet;

public class UniteDistincteException extends Exception{
	
	private SommeArgent somme1, somme2;
	private PortMonnaie portMonnaie;

	public UniteDistincteException(SommeArgent sa1, SommeArgent sa2) {
			somme1 = sa1;
			somme2 = sa2;
	}

	public UniteDistincteException(PortMonnaie portM, SommeArgent sa) {
		portMonnaie = portM;
		somme1 = sa;
	}

	
//	@Override
//	public String toString() {
//		return "UniteDistincteException [PortMonnaie=" + portM + ", somme2=" + sa + "]";
//	}
	
	@Override
	public String toString() {
		return "UniteDistincteException [somme1=" + somme1 + ", somme2=" + somme2 + "]";
	}
	
	

}
