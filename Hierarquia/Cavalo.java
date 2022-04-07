package Hierarquia;

public class Cavalo extends ClasseAnimal {
	
	private String relincho;
	private String pastar;

	public void correr() 
	{
		System.out.println("..galopando em um pasto");
	}

	public String getRelincho() {
		return relincho;
	}

	public void setRelincho(String relincho) {
		this.relincho = relincho;
	}

	public String getPastar() {
		return pastar;
	}

	public void setPastar(String pastar) {
		this.pastar = pastar;
	}
	
}
