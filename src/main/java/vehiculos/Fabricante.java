package vehiculos;

import java.util.ArrayList;

public class Fabricante {
    private String nombre;

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPais(Pais pais) {
        this.pais = pais;
    }

    private Pais pais;
    private int ventas;
    public static ArrayList<Fabricante> fabricantes = new ArrayList<Fabricante>();

    public Fabricante(String nombre, Pais pais) {
        this.nombre = nombre;
        this.pais = pais;
        this.ventas = 0;
        fabricantes.add(this);
    }

    public static Fabricante fabricaMayorVentas(){
        Fabricante fabricaMayorVentas = Fabricante.fabricantes.get(0);
        int mayorVentas = 0;
        for (Fabricante fabrica : Fabricante.fabricantes) {
            if (fabrica.getVentas() > mayorVentas) {
                mayorVentas = fabrica.getVentas();
                fabricaMayorVentas = fabrica;
            }
        }
        return fabricaMayorVentas;
    }

    public String getNombre() {
        return nombre;
    }

    public Pais getPais() {
        return pais;
    }

    public int getVentas() {
        return ventas;
    }

    public void setVentas(int v) {
        ventas = v;
    }
}
