package atividadecurso;

import java.util.Scanner;

public class Exec12 {

public static void main(String[] args) {

Scanner scanner = new Scanner(System.in);

double salariobruto,valordaprestacao;

System.out.println("Informe o salário bruto:");
salariobruto = scanner.nextDouble();

System.out.println("Informe o valor da prestação:");
valordaprestacao = scanner.nextDouble();

double limiteprestacao = salariobruto * 0.3;

if(valordaprestacao <= limiteprestacao) {
	System.out.println("Empréstimo pode ser concedido!!\n");
	
}else {
	System.out.println("Empréstimo não pode ser concedido!!\n");
}

scanner.close();
}

}
