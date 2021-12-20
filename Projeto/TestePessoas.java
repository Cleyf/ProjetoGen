package Projeto;

import java.util.Scanner;

public class TestePessoas {

	public static void main(String[] args) {
		Desempregado desempregado = new Desempregado(null,null,0);
		Gerente gerente = new Gerente("Gerente",9500);
		
		Scanner leia = new Scanner(System.in);
		
		
		for (int x=0;x<3;x++)
		{
		desempregado.cadastro();
		desempregado.ajuda();
		}
		gerente.imprimirinfo();
		gerente.cadastro();
		gerente.ajuda();
		
				

	}

}