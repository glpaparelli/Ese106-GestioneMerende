package gestionemerende;

import java.util.Vector;

public class Ordine {

	private String codice;
	private Vector <Articolo> articoli;
	private Classe classe;
	
	public Ordine(String codice) {
		super();
		
		if(codice != null){
			this.codice = codice;
		}
		else{
			throw new IllegalArgumentException("codice non può essere null");
		}
		
		articoli = new Vector <Articolo>();
	}

	public Vector<Articolo> getArticoli() {
		return articoli;
	}

	public String getCodice() {
		return codice;
	}
	
	public void addArticolo(Articolo a){
		
		if(a!=null){
			articoli.add(a);
		}
		else 
			throw new IllegalArgumentException("a cannot be null");
		
		
	}

	public int getNumeroArticoli() {
	
		return articoli.size();
	}
	
	public Classe getClasse() {
		return classe;
	}
	
	public double getCostoTotale() {
		double r = 0;
		for(Articolo a: articoli)
			r += a.getCostoUnitario();
		return r;
	}
		
	public void setClasse(Classe classe) {
		if(classe != null){
			this.classe = classe;
		}
		else 
			throw new IllegalArgumentException();
	}

	@Override
	public String toString() {
		return "Ordine [codice=" + codice + ", numeroArticoli=" + articoli.size()
				+ ", classe=" + classe + "]";
	}
	
}
