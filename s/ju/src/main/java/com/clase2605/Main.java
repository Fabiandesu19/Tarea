package com.clase2605;

import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
String[] Productos = {" MOUSE", " TECLADO", "MONITOR", "TARJ. GRAFICA", "CABLES", "CARGADORES"};
double[] Precio= {5.15, 8.92, 114.15, 568.91, 3.00, 22.00};
int[] Cantidad = {5, 10, 20 , 5 , 6, 7};
Scanner sc = new Scanner(System.in);
System.out.println("Ingrese los precios de los productos: ");
 
for (int i = 0; i < Productos.length; i++){
    System.out.println("Para" + Productos[i] +" con el precio de $" + Precio[i]);
    String input = sc.nextLine();
    System.out.println("Para salir escriba exit ");
    if(input == "exit")
        System.exit(0);
    else{
        Cantidad[i] = Integer.parseInt(input);
    }
 
 
}
sc.close();
for (int i = 0; i < Productos.length; i++){
    System.out.println("Producto " + Productos +
    ", Precio; " + Precio[i] +
    ", Cantidad: " + Cantidad[i]);
}
 
 
 
    }
}