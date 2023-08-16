package com.mycompany.calculadora;
import java.util.Scanner;
public class Calculadora {

public static void main(String[] args) {
System.out.println("------Calculadora------\n1.Suma\n2.Resta\n3.Multiplicación\n4.División\n5.Función seno\n6.Función coseno"
        + "\n7.función tangente\n8.Raíz enésima\n9.Potencia enésima\n10.Calculo de IVA");
Scanner op = new Scanner (System.in);
int opc=op.nextInt();
double num1, num2, rta;
switch (opc){
    case 1:
        System.out.println("Digite los numeros que desea sumar");
        Scanner n = new Scanner(System.in);
        num1=n.nextDouble();
        num2=n.nextDouble();
        rta=num1+num2;
        System.out.println("Rta: "+ rta);        
        break;
    case 2:
        System.out.println("Digite los numeros que desea restar");
        Scanner n1 = new Scanner(System.in);
        num1=n1.nextDouble();
        num2=n1.nextDouble ();
        rta=num1-num2;
        System.out.println("Rta: "+ rta);   
        break;
    case 3:
        System.out.println("Digite los numeros que desea multiplicar");
        Scanner n3 = new Scanner(System.in);
        num1=n3.nextDouble();
        num2=n3.nextDouble();
        rta=num1*num2;
        System.out.println("Rta: "+ rta);   
        break;
    case 4: 
        System.out.println("Digite los numeros que desea dividir");
        Scanner n4 = new Scanner(System.in);
        num1=n4.nextDouble();
        num2=n4.nextDouble();
        if (num2>0){
        rta=num1/num2;
        System.out.println("Rta: "+ rta);   
        }else{
        System.out.println("Error: no se puede dividir entre 0"); 
        }
        break;
    case 5:
          System.out.println("Digite el ángulo");
        Scanner n5 = new Scanner(System.in);
        num1=n5.nextFloat();
        num2=Math.toRadians(num1);
        rta=Math.sin(num2);
        System.out.println("Rta: "+ rta);   
        break;
    case 6:
        System.out.println("Digite el ángulo");
        Scanner n6 = new Scanner(System.in);
        num1=n6.nextFloat();
        num2=Math.toRadians(num1);
        rta=Math.cos(num2);
        System.out.println("Rta: "+ rta);   
        break;
    case 7:
        System.out.println("Digite el ángulo");
        Scanner n7 = new Scanner(System.in);
        num1=n7.nextFloat();
        num2=Math.toRadians(num1);
        double a=Math.sin(num2);
        double b=Math.cos(num2);
        if (b>0){   
        rta=(a/b);
        System.out.println("Rta: "+ rta);   
        }else{
        System.out.println("Error: La función es indeterminada");  
        }

     
        
        break;
    case 8:
        System.out.println("Digite el grado de la raiz y el numero a radicar");
        Scanner n8 = new Scanner(System.in);
        num1=n8.nextDouble();
        num2=n8.nextDouble();
        rta=Math.pow(num2,1/num1);
        System.out.println("Rta: "+ rta);        
        break;
    case 9:
        System.out.println("Digite el grado de la potencia y el numero a potenciar");
        Scanner n9 = new Scanner(System.in);
        num1=n9.nextDouble();
        num2=n9.nextDouble();
        rta=Math.pow(num2,num1);
        System.out.println("Rta: "+ rta);        
        break;
    case 10:
        System.out.println("Digite EL %IVA y el valor al que desea sacarle IVA");
        Scanner n10 = new Scanner(System.in);
        num1=n10.nextDouble();
        num2=n10.nextDouble();
        rta=(num1/100)*num2;
        System.out.println("Rta: "+ rta);        
        break;
        
}

          
    }
}
