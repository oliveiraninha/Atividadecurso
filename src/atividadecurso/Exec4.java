package atividadecurso;

import java.util.Scanner;

public class Exec4 {
	
public static void main (String[] args) {
	
 Scanner input = new Scanner(System.in);
 
 double numb1, numb2, result;
 char operador;
 
 System.out.println("digite o primeiro número:");
 numb1 = input.nextDouble();
 
 System.out.println("digite o segundo número:");
 numb2 = input.nextDouble();
 
 System.out.println("digite o operador (+, -, * ou /:)");
 operador = input.next().charAt(0);
 
 switch(operador) {
 
 case '+':
   result = numb1 + numb2;
   System.out.println(" numb1 + numb2 = " + result);
   break;
   
 case '-':
	result = numb1 - numb2;
	System.out.println("numb1 - numb2 =" + result);
	break;
	
 case '*':
	result = numb1 * numb2;
	System.out.println("numb1 * numb2 =" + result);
	break;
	
 case '/':
	 if(numb2==0) {
		System.out.println("Não é possivel dividir por zero!!"); 
	 }else {
		result = numb1 / numb2;
		 System.out.println("numb1 / numb2 =" + result);
	 }
	 break;
	 
	 default:
		System.out.println("Operador invalido!!"); 
		break;
		

 }
 
 input.close();


 
 
  
 

	  
  }
}



