package atividadecurso;

import java.util.Scanner;

public class Exec11 {

public static void main(String[]args) {

Scanner entrada = new Scanner(System.in);

double altura, pesoideal;
char sexo;

System.out.println("digite a sua altura em metros:");
altura = entrada.nextDouble();

System.out.println("digite o seu sexo (M/F):");
sexo =  entrada.next().charAt(0);

if(sexo == 'M') {
	pesoideal = (72.7 * altura) - 58;
	
}else {
 pesoideal = (62.1 * altura) - 44.7;	
	
}

System.out.printf("o seu peso ideal é  kg:" +  pesoideal);

entrada.close();



}

}
