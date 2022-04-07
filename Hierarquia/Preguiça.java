package Hierarquia;

public class Preguiça extends ClasseAnimal {
	
	private String dormir;
	private String comerBroto;
	
	public void subirEmArvore() 
	{
		System.out.println("..subindo na árvore");
	}

	public String getDormir() {
		return dormir;
	}

	public void setDormir(String dormir) {
		this.dormir = dormir;
	}

	public String getComerBroto() {
		return comerBroto;
	}

	public void setComerBroto(String comerBroto) {
		this.comerBroto = comerBroto;
	}

}
