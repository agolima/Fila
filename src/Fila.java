
public class Fila {

	private int qnt;
	private Elemento ultimo;
	private Elemento primeiro;

	public Fila(){
		this.qnt = 0;
		this.primeiro = null;
		this.ultimo = primeiro;
	}

	public void addFilaEspera(Elemento e){
		if(this.qnt == 0){
			this.primeiro = e;
			this.ultimo = e;
			qnt++;

		}else{
			this.ultimo.setProximo(e);
			this.ultimo = e;
			qnt++;
		}
		System.out.println();
	}

	public void numeroEsperando(){
		System.out.println("O Número de aviões esperando para decolar: " + this.qnt);
		System.out.println();
	}

	public void autorizarDecolagem(){


		if (this.qnt == 0) {
			System.err.println("Não existem aviões na lista de espera.");
		}else{
			System.out.println("O avião: ");
			System.out.println("Nome: " + this.primeiro.getNome());
			System.out.println("Identificador: " + this.primeiro.getIdentificador());
			System.out.println("Origem: " + this.primeiro.getOrigem());
			System.out.println("Destino: " + this.primeiro.getDestino());
			System.out.println("Está autorizado a descolar");

			this.qnt--;

			this.primeiro = primeiro.getProximo();
		}
		System.out.println();
	}
	public void listarCaracteristicas(){

		if (this.qnt == 0) {
			System.err.println("Impossível listar. Não existem aviões na lista de espera.");
		}else{
			System.out.println("Nome: " + this.primeiro.getNome());
			System.out.println("Identificador: " + this.primeiro.getIdentificador());
			System.out.println("Origem: " + this.primeiro.getOrigem());
			System.out.println("Destino: " + this.primeiro.getDestino());
			System.out.println("Está autorizado a descolar");
		}
		System.out.println();
	}

	public void listar(){

		Elemento e = this.primeiro;

		if (this.qnt == 0) {
			System.err.println("Impossível listar. Não existem aviões na lista de espera.");
		}else{
			while ( e != null) {
				System.out.println("Nome da Aeronave: " + e.getNome());
				System.out.println("Identificador: " + e.getIdentificador());
				System.out.println("Origem: " + e.getOrigem());
				System.out.println("Destino: " + e.getDestino());
				System.out.println();

				e = e.getProximo();
			}
		}
		System.out.println();
	}

	public int getQnt() {
		return qnt;
	}
	public void setQnt(int qnt) {
		this.qnt = qnt;
	}
	public Elemento getUltimo() {
		return ultimo;
	}
	public void setUltimo(Elemento ultimo) {
		this.ultimo = ultimo;
	}
	public Elemento getPrimeiro() {
		return primeiro;
	}
	public void setPrimeiro(Elemento primeiro) {
		this.primeiro = primeiro;
	}

}
