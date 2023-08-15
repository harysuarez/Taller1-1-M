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
        System.out.println("Digite los numeros que desea restar");
        Scanner n4 = new Scanner(System.in);
        num1=n4.nextDouble();
        num2=n4.nextDouble();
        rta=num1/num2;
        System.out.println("Rta: "+ rta);   
        break;
    case 5:
          System.out.println("Digite el ángulo");
        Scanner n5 = new Scanner(System.in);
        num1=n5.nextFloat();
        num2=Math.toRadians(num1);
        rta=Math.sin(num2);
        System.out.println("Rta: "+ rta);   
        break;
     
}

          
    }
}
