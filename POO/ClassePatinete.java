package POO;

public class ClassePatinete {

	public String marca;
	public String modelo;
	public String cor;
	public boolean eletrico;
	public String publico;
	public int bateria;
	public boolean estado;
	
	public void ligar() {
		if(eletrico == true && bateria > 20 && estado == false) {
			estado = true;
			System.out.println("Ligando....");
			System.out.printf("Bateria a %d ...",bateria);
		}
		else if(eletrico == true && bateria <= 20 && estado == false) {
			System.out.println("Sem bateria, por favor, recarregue....");
		}
	}
	
	public void desligar() {
			estado = false;
			System.out.println("Desligando....");
			System.out.println("Não esqueça de colocar para carregar");
		}

	
	public void verificarBateria() {
		if(bateria < 20) {
			System.out.printf("Bateria a %d ...",bateria);
			System.out.println("Colocar para carregar.");
		}
		else if(bateria >=21 && bateria <= 50){
			System.out.printf("Bateria a %d ...",bateria);
			System.out.println("Verificar destino para que a bateria não acabe");
		}
		else if(bateria >=51 && bateria <=99) {
			System.out.printf("Bateria a %d ...",bateria);
			System.out.println("Verificar destino para que a bateria não acabe");
		}
		else {
			System.out.printf("Bateria a %d ...",bateria);
			System.out.println("Bateria totalmente carregado...");
		}
	}
	
	public void verificarPatinete() {
		System.out.printf("Patinete Modelo: %s\nMarca: %s \nCor: %s \nPublico: %s",modelo,marca,cor,publico);
	}
	
}
