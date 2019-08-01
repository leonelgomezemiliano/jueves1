package jueves1;

import java.util.ArrayList;

public class bicicleteria {

    private ArrayList<bicicleta> bici;
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
        ganancias = ganancias + bicicletavendida.getPrecio();
    }

    public void buscarBici(String nroDeSerie) {
        boolean encontrado = false;
        for (int i = 0; i < bici.size(); i++) {
            if (bici.get(i).getNroDeSerie().equalsIgnoreCase(nroDeSerie)) {
                System.out.println("El numero de serie de su bicicleta es: " + bici.get(i));
                encontrado = true;
            }
        }
        if (!encontrado) {
            System.out.println("No se ah encontrado el numero de serie");
        }
    }

    ArrayList<bicicleta> ordenar() {
        bicicleta auxiliar;
        boolean qsy = true;
        for (int j = 0; j < bici.size() && qsy==true ; j++) {
            qsy = false;
            for (int i = 0; i < bici.size()-i-j; i++) {
                if (bici.get(i).getAño() > bici.get(i + 1).getAño()) {
                    auxiliar = bici.get(i + 1);
                    bici.set(i + 1, bici.get(i));
                    bici.set(i, auxiliar);
                    qsy = true;
                }
            }
        }
        return bici;
    }

    public void mostrar() {
        System.out.println(bici.toString());

    }
}
