package atividadecurso;

import java.util.Scanner;

public class Exec2 {
	
public static void main (String[] args) {
	
	Scanner scanner = new Scanner(System.in);
	

 
   int idade;
   
   System.out.println("digite a sua idade:");
   idade = scanner.nextInt();
	   
 
 if(idade < 5) {
	 System.out.println("Bebê\n");
 }
 else if(idade >=5 && idade <=7) {
	 System.out.println("Infantil A\n");
 }
 else if(idade >=8 && idade <=10) {
	 System.out.println("Infantil B\n");
 }
 else if(idade >=11 && idade <=13) {
	 System.out.println("Juvenil A\n");
	
 }
 else if(idade >=14 && idade <=17) {
	 System.out.println("Juvenil B\n");
 }
 else if(idade >=18) {
	 System.out.println("Adulto\n");
 }
 else {
	 System.out.println("Sem categoria\n");
 }
  }
 
 
  

 










}












