package AvaliativaSomativa;

public class Principallivro {
	
	public static void main(String[] args) {
		
		Livro livro1  = new  Livro ( "O enigma", 120, "Kaiky Morelli");
		
		livro1.getNome();
		livro1.getAutor();
		livro1.getPaginas();
		
		
		System.out.println( livro1.getNome());
		System.out.println( livro1.getAutor());
	    System.out.println( livro1.getPaginas());
		
		
	}

}
