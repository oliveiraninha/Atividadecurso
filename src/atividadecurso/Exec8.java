package atividadecurso;

import java.util.Scanner;

public class Exec8 {
	
public static void main (String [] args) {
	
Scanner scanner = new Scanner(System.in);

int numb1 , numb2;

System.out.println("digite o primeiro número:");
double numb11 = scanner.nextDouble();

System.out.println("digite o seu segundo número:");
double numb21 = scanner.nextDouble();

if(numb11 > numb21) {
	System.out.println(numb11 + "," + numb21);
}else {
  System.out.println(numb21 + "," + numb11);
}

}



}
