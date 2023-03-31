package atividadecurso;

import java.util.Scanner;

public class Exec5 {
	
public static void main (String[] args) {
	
Scanner scanner = new Scanner (System.in);

int numero;

System.out.println("Digite o seu número:");
numero = scanner.nextInt();

if(numero > 20) {
int metade = numero / 2;
 System.out.println("A metade do número é:" + metade);
	
}


}

}
