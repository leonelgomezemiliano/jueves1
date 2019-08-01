package jueves1;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class bicicleteria {

    private List<bicicleta> bici;
    private float ganancias = 0;
    private Integer cantidadDeVentas = 0;

    public bicicleteria() {
        bici = new ArrayList<>();
        cantidadDeVentas = 0;
        ganancias = 0;
    }

    public void addBicicleta(bicicleta nuevaBici) {
        bici.add(nuevaBici);
    }

    public void venderBicicleta(bicicleta bicicletavendida) {
        bici.remove(bicicletavendida);
        cantidadDeVentas++;
        ganancias = ganancias+bicicletavendida.getPrecio();
    }

    public void buscarBici(String nroDeSerie) {
        boolean encontrado = false;
        for (int i = 0; i < bici.size(); i++) {
            if (bici.get(i).getNroDeSerie().equalsIgnoreCase(nroDeSerie)) {
                System.out.println("El numero de serie de su bicicleta es: " + bici.get(i).getNroDeSerie());
                encontrado = true;
            }
        }
        if (!encontrado) {
            System.out.println("No se ah encontrado el numero de serie");
        }
    }

    public void mostrar() {
        for (int i = 0; i <bici.size(); i++) {
            if (bici.get(i).getAño()<bici.get(i).getAño()) {
                
            }
        }
            System.out.println("" + bici.size());
        
    }
}
