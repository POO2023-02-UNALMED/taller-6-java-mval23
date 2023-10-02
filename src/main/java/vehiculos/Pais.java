package vehiculos;

import java.util.ArrayList;
public class Pais {
    private String nombre;
    private int ventas;
    public static ArrayList<Pais> paises = new ArrayList<Pais>();

    public static Pais paisMasVendedor() {
        Pais paisConMasVentas = Pais.paises.get(0);
        int maxVentas = 0;
        for (Pais pais : paises) {
            if (pais.getVentas() > maxVentas) {
                maxVentas = pais.getVentas();
                paisConMasVentas = pais;
            }
        }
        return paisConMasVentas;
    }

    public Pais(String nombre) {
        this.nombre = nombre;
        this.ventas = 0;
        paises.add(this);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String n) {
        nombre = n;
    }

    public int getVentas() {
        return ventas;
    }
    public void setVentas(int v) {
        ventas = v;
    }
    public void vender() {
        this.ventas++;
    }
}
