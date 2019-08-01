package jueves1;

import java.util.Scanner;

public class Jueves1 {

    public static void main(String[] args) {
        bicicleteria nuevaBicicleteria = new bicicleteria();
        Scanner teclado = new Scanner(System.in);
        int opcion;
        String buscar;
        boolean salir = false;
        System.out.println("1. Añade una bicicleta");
        System.out.println("2. mostrar los datos de las bicicletas");
        System.out.println("3. buscar una bicicleta");
        System.out.println("4. vender bicicleta");
        System.out.println("*****************************************");
        while (!salir){
        System.out.println("Ingrese la opcion que desea: ");
        opcion = teclado.nextInt();
        switch (opcion) {
            case 1:
                System.out.println("Ingrese las bicicleta");
                String nroserie;
                nroserie = teclado.next();
                System.out.println("Ingrese el modelo de la bicicleta");
                String modelo;
                modelo = teclado.next();
                System.out.println("Ingrese el precio de la bicicleta");
                float precio;
                precio = teclado.nextFloat();
                System.out.println("Ingrese el año de la bicicleta");
                int año;
                año = teclado.nextInt();
                bicicleta bici = new bicicleta(nroserie, modelo, precio, año);
                nuevaBicicleteria.addBicicleta(bici);
                break;
            case 2:
                nuevaBicicleteria.ordenar();
                nuevaBicicleteria.mostrar();
                break;
            case 3:
                System.out.println("Ingrese el numero de serie de la bicicleta que necesite");
                buscar = teclado.next();
                nuevaBicicleteria.buscarBici(buscar);
                break;
            case 4:
                System.out.println("Ingrese la bicicleta que quiere vender");
                
                nuevaBicicleteria.venderBicicleta(bici);
                break;
            case 5:
                salir = true ;
                break;
            default:
                System.out.println("Solo numeros del 1 al 5");
        }
        
    }
    }

}
