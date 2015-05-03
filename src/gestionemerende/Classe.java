package gestionemerende;

import java.util.*;

public class Classe {

	private String nome;
	private Vector <Ordine> ordini;
		
	public Classe(String nome) {
		super();
		
		if((nome != null)&&(nome.length()>0)){
			this.nome = nome;
		}
		else{
			throw new IllegalArgumentException("nome non valido");
		}
		ordini = new Vector <Ordine>() ;
	}
	
	public Vector<Ordine> getOrdini() {
		return ordini;
	}
	
	public String getNome() {
		return nome;
	}
	
	/*public void addOrdine(Ordine o) throws Exception{
		
		Ordine k;
		if(o!=null){
			for (int i=0; i < ordini.size(); i++){
				k = ordini.elementAt(i);
				if(k.getCodice().equals(o.getCodice())){
					throw new Exception("Ordine " + o.getCodice() + " already present");
				}		
				ordini.add(o);
				o.setClasse(this);	
			}
		}
		else{
			throw new IllegalArgumentException("o cannot be null");
		}	
	}
	*/
	
	public void addOrdine(Ordine o) throws Exception {
		if(o != null) {
			for(Ordine p : this.ordini) {
				if(p.getCodice().equals(o.getCodice()))
					throw new Exception("Ordine " + o.getCodice() + " already present");
			}
			ordini.add(o);
			o.setClasse(this);
		}
		else
			throw new IllegalArgumentException("o cannot be null");
	}
	
	
	
	@Override
	public String toString() {
		return "Classe [nome=" + nome + ", ordini=" + ordini + "]";
	}
}
