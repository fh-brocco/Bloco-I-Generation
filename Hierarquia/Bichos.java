package Hierarquia;

public class Bichos {

	public static void main(String[] args) {
		
		Cachorro dog =new Cachorro();
		Cavalo horse = new Cavalo();
		Preguiça sloth= new Preguiça();
		
		dog.setLatido("auauau!");
		horse.setPastar("mastigando...");
		sloth.setDormir("zzz...");
		
		dog.setNome("Arlindo");
		dog.setIdade(5);
		horse.setNome("Flecha");
		horse.setIdade(4);
		sloth.setNome("Zé");
		sloth.setIdade(3);
		
		
		System.out.println("Cachorro "+dog.getNome()+","+dog.getIdade()+" anos"+" : "+dog.getLatido());
		System.out.println("Cavalo "+horse.getNome()+","+horse.getIdade()+" anos"+" : "+horse.getPastar());
		System.out.println("preguiça "+sloth.getNome()+","+sloth.getIdade()+" anos"+" : "+sloth.getDormir());
		System.out.println("");

	}

}
