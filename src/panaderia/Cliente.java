package panaderia;

public class Cliente {
    private String nombre;
    private int nit;

    public Cliente(String nombre, int nit){
        this.nombre = nombre;
        this.nit = nit;
    }
    public String getNombreC() {
        return nombre;
    }

    public void setNombreC(String nombreC) {
        this.nombre = nombreC;
    }

    public int getNit() {
        return nit;
    }

    public void setNit(int nit) {
        this.nit = nit;
    }
}
