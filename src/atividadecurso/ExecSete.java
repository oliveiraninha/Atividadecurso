package atividadecurso;

import java.util.Scanner;

public class ExecSete {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int numb1, numb2;
		System.out.println("digite o primeiro numero:");
		numb1 = scanner.nextInt();

		System.out.println("digite o segundo numero:");
		numb2 = scanner.nextInt();

		if (numb1 == numb2) {
			System.out.println("os numeros são iguais\n");
		} else {
			System.out.println("os valores são diferentes\n");

		}

		if (numb1 > numb2) {
			System.out.println("o primeiro é maior que o segundo\n");
		} 
		
          if (numb1<numb2) {
			System.out.println("o segundo é maior que o primeiro\n");

		}

	}
}
