package cineGenFlix;

import java.util.Scanner;

public class Filme {
	
	static Scanner ler = new Scanner(System.in);
	//METODO	
	public static void iniciar() {
		System.out.println("Bem-Vindo ao GenFlix!");
		
		System.out.println("Digite seu e-mail: ");
		String nome = ler.nextLine();
		
		System.out.println("Digite sua senha: ");
		String senha = ler.nextLine();
		
		System.out.println("Escolha o genero : " + 
				"\nA. Ação" + "\nB. Terror" + "\nC. Comedia" + "\nD. Drama" + "\nE. Suspense");
		char oGenero = ler.next().charAt(0);
		
		System.out.println("Escolha o filme" + 
				"\nA. Doutor Estranho no Multiverso da Loucura" + "\nB. Morbius" + "\nC. BATMAN");
        char film = ler.next().charAt(0);
        
        
		
		
	
	}
	

}
