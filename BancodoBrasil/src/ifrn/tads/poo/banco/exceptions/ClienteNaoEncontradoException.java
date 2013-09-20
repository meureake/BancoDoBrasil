package ifrn.tads.poo.banco.exceptions;

public class ClienteNaoEncontradoException extends Exception{
	private String nomeCliente;
	/**
	 * 
	 */
	private static final long serialVersionUID = -7255189259052172019L;
	/**
	 * 
	 */
	public ClienteNaoEncontradoException(String nomeCliente){
		this.nomeCliente = nomeCliente;
	}
	
	

	public String getMessage(){
		return "Nenhum cliente com o nome: " + nomeCliente + " foi encontrado em nosso sistema.";
	}
}
