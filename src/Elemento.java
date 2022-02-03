import java.util.Scanner;

public class Elemento {
	private String nome;
	private String identificador;
	private String origem;
	private String destino;
	private Elemento proximo;

	public Elemento(){

	}

	public Elemento(String nome, String identificador, String origem, String destino) {
		this.nome = nome;
		this.identificador = identificador;
		this.origem = origem;
		this.destino = destino;
		this.proximo = null;
	}


	public String getIdentificador() {
		return identificador;
	}

	public void setIdentificador(String identificador) {
		this.identificador = identificador;
	}

	public String getOrigem() {
		return origem;
	}

	public void setOrigem(String origem) {
		this.origem = origem;
	}

	public String getDestino() {
		return destino;
	}

	public void setDestino(String destino) {
		this.destino = destino;
	}

	public Elemento getProximo() {
		return proximo;
	}

	public void setProximo(Elemento proximo) {
		this.proximo = proximo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}
