package test.monprojet;

import java.util.HashMap;
import java.util.Set;

public class PortMonnaie {
	
	private HashMap<String,Integer> contenu;
	
	public HashMap<String,Integer> getContenu(){
		return contenu ;
	}

	public PortMonnaie() {
		contenu = new HashMap<String,Integer>();
	}

	public void ajouteSomme(SommeArgent sa) throws UniteDistincteException {
		 
		 String theKey = sa.getUnite();
		 Integer SommeAlreadyIn = contenu.get(theKey);
		 
		 if (SommeAlreadyIn == null) {
			 contenu.put(theKey, sa.getQuantite());
		 } 
		 else {
			 Integer alredyInPort = contenu.get(theKey);
			 Integer somme = alredyInPort + sa.getQuantite();
		     contenu.put(theKey, somme);
		 }
	}

	public String toString() {
		Set<String> AllKeys = contenu.keySet();
		String aux =("Port Have :");
		for (String theKey : AllKeys) {
			aux = aux + contenu.get(theKey) + " " + theKey;
		}
		return aux.toString();
	 }

	public boolean equals(Object input) {
		 if (!(input instanceof PortMonnaie)) return false;
		 else {
			 Set<String> allTheKeys = contenu.keySet();
			 Set<String> AllTheInputKey = ((PortMonnaie)input).getContenu().keySet();
			 if (!allTheKeys.equals(AllTheInputKey)) return false;
			 PortMonnaie pm = (PortMonnaie)input;
			 for (String Key : allTheKeys) {
				 if (contenu.get(Key).intValue() != pm.getContenu().get(Key).intValue())return false;	 
			 }	
		 }
		 return true;
	  }

}
