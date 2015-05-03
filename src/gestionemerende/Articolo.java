package gestionemerende;

public class Articolo {

	private String codice;
	private String descrizione;
	private double costoUnitario;
	private double apportoCalorico;
	

	public Articolo(String codice, String descrizione, double costoUnitario,
			double apportoCalorico) {
		super();
		
		if((codice!=null)&&(codice.length()>0)){
			this.codice = codice;
		}
		else 
			throw new IllegalArgumentException();
		
		if((descrizione!=null)&&(descrizione.length()>0)){
			this.descrizione = descrizione;
		}
		else 
			throw new IllegalArgumentException();
		
		if (costoUnitario>0){
			this.costoUnitario = costoUnitario;
		}
		else
			throw new IllegalArgumentException();
		
		if(apportoCalorico>0){
			this.apportoCalorico = apportoCalorico;
		}
		else
			throw new IllegalArgumentException();
		
	}

	
	public double getCostoUnitario() {
		return costoUnitario;
	}
	
	public void setCostoUnitario(double costoUnitario) {
		this.costoUnitario = costoUnitario;
	}
	
	public String getCodice() {
		return codice;
	}
	
	public String getDescrizione() {
		return descrizione;
	}
	
	public double getApportoCalorico() {
		return apportoCalorico;
	}	
	
	
	
	
	
	
}
