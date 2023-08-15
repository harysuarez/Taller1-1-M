package com.mycompany.calculadora;
import java.util.Scanner;
public class Calculadora {

public static void main(String[] args) {
System.out.println("------Calculadora------\n1.Suma\n2.Resta\n3.Multiplicación\n4.División\n5.Función seno\n6.Función coseno"
        + "\n7.función tangente\n8.Raíz enésima\n9.Potencia enésima\n10.Calculo de IVA");
Scanner op = new Scanner (System.in);
int opc=op.nextInt();
float num1, num2, rta;
switch (opc){
    case 1:
        System.out.println("Digite los numeros que desea sumar");
        Scanner n1 = new Scanner(System.in);
        num1=n1.nextFloat();
        Scanner n2 = new Scanner(System.in);
        num2=n2.nextFloat();
        rta=num1+num2;
        System.out.println("Rta: "+ rta);        
        break;
    case 2:
        System.out.println("Digite los numeros que desea sumar");
        Scanner n1 = new Scanner(System.in);
        num1=n1.nextFloat();
        Scanner n2 = new Scanner(System.in);
        num2=n2.nextFloat();
        rta=num1-num2;
        System.out.println("Rta: "+ rta);   
        break;
}


              
    }
}
