package gestionemerende;

import java.util.Vector;

public class Istituto {

	private String nome;
	private Vector <Classe> classi;
	
	public String getNome() {
		return nome;
	}

	public Istituto(String nome) {
		super();
		
		
		if((nome!=null)&&(nome.length()>0)){
			this.nome = nome;
		}
		else{
			throw new IllegalArgumentException("nome non valido");
		}
		
		classi = new Vector <Classe>();
		
	}
	
	public void addClasse(Classe c) {
		if(c != null)
			this.classi.add(c);
		else
			throw new IllegalArgumentException("c cannot be null");
	}

	public Vector<Classe> getClassi() {
		return classi;
	}

	@Override
	public String toString() {
		return "Istituto [nome=" + nome + ", classi=" + classi + "]";
	}
}
