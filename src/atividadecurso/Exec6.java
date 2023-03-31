package atividadecurso;

import java.util.Scanner;

public class Exec6 {
	
public static void main(String[] args) {

Scanner teclado =  new Scanner(System.in);

System.out.println("Digite um número inteiro:");
int numero = teclado.nextInt();

if(numero >=50 && numero <=100) {
	System.out.println("Pertence ao intervalo\n");

	
}else {
	System.out.println("Não pertence ao intervalo\n");
}

teclado.close();
}

}
