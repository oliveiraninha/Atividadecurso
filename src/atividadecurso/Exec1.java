package atividadecurso;

import java.util.Scanner;

public class Exec1 {
	
 public static void main(String[] args) {
	 
	 Scanner scanner = new Scanner(System.in);
	 
	 int numb1,numb2,numb3;
	 System.out.println("digite o primeiro numero:");
	 numb1 = scanner.nextInt();
	 
	 System.out.println("digite o segundo numero:");
	 numb2 = scanner.nextInt();
	 
	 System.out.println("digite o terceiro numero:");
	 numb3 = scanner.nextInt();
	 
	 if(numb1 == numb2 && numb2 == numb3) {
		 System.out.println("os numeros são iguais!!");
	 }
	  
	 else if (numb1 != numb2 && numb2 != numb3){
		 System.out.println("os numeros são diferentes!!");
		 
	 
	 {	 
	  
		int maior = numb1;
		
	if(numb2 > maior) {
		maior = numb2;
		
	 }
	if(numb3 > maior) {
		maior = numb3;
		
	}
	 {
	
	
	System.out.println(" o maior numero é " + maior);}
	


	 }
	 
	 
	 
			 
 }
 
}
 
}


