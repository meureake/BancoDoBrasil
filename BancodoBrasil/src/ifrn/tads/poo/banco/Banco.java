package ifrn.tads.poo.banco;
import ifrn.tads.poo.banco.agencia.*;
import java.util.ArrayList;;

public class Banco {
	private String nome;
	private int numero;
	private ArrayList<Agencia> agencias = new ArrayList<Agencia>();
	
	Banco(int numero, String nome){
		this.nome = nome;
		this.numero = numero;
	}
	
	public Agencia buscarAgencia(int numero){
				
		for(int i=0; i< agencias.size();i++){
			
			if(agencias.get(i).getNumero()==numero){
				return agencias.get(i);
			}
		}
		return null;
	}
	
	public void adicionarAgencia(Agencia a){
		
	}
}
