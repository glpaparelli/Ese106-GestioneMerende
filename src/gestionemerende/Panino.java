package gestionemerende;

public class Panino extends Articolo{

	boolean vegetariano;
	boolean carneSuina;
	
	public Panino(String codice, String descrizione, double costoUnitario,
			double apportoCalorico, boolean verdura, boolean suino) {
		super(codice, descrizione, costoUnitario, apportoCalorico);
		
		this.vegetariano = verdura;
		this.carneSuina = suino;
		
		if(this.vegetariano = true){
			this.carneSuina = false;
		}
		if(this.carneSuina = true){
			this.vegetariano = false;
		}
		if((verdura == true ) && (suino == true)){
			throw new IllegalArgumentException("You are confused...");
		}
		
		
	}

	public boolean isVegetariano() {
		return vegetariano;
	}

	public boolean isCarneSuina() {
		return carneSuina;
	}

}
