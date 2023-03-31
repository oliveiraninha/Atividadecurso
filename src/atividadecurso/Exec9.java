package atividadecurso;

import java.util.Scanner;

public class Exec9 {

public static void main (String[]args) {

Scanner entrada = new Scanner(System.in);

double salario;

System.out.println("digite o salário do funcionário:");
double salario1 = entrada.nextDouble();

System.out.println("digite a quantidade de anos  de trabalho do funcionário:");
int anosdetrabalho = entrada.nextInt();

double bonus;

if(anosdetrabalho >= 5) {
	bonus = salario1 * 0.2;
	
	
}else {
 bonus = salario1 * 0.1;	
}
 System.out.println("O funcionário tem direito a um bônus de R$" + bonus);
}

}
