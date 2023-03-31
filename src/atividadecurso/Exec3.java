package atividadecurso;

import java.util.Scanner;

public class Exec3 {
	
public static void main (String[] args)	{
	
  Scanner scanner = new Scanner(System.in);
  
  int salario;
   System.out.println("digite o seu salario:");
    double  salario1 = scanner.nextDouble();
    
    double descontoInss;
   
   
   if(salario1 <= 600) {
    double descontoInss1 = 0;
   }
   else if(salario1 > 600 && salario1 <= 1200) {
	System.out.println(descontoInss = salario1 * 0.2); 
   }
   else if(salario1 > 1200 && salario1 <= 2000 ) {
	 System.out.println(descontoInss = salario1 * 0.25);   
   }
   else if(salario1 > 2000) {
	 System.out.println(descontoInss = salario1 * 0.3);  
   }
   
   
    
  
  
  
  
}

}
