
package andreaortez_examen1p2;

public class PC_Escritorio extends PC{
    private int RAM, capacidad;
    private String tipo, tarjeta;

    public PC_Escritorio() {
    }

    public PC_Escritorio(int RAM, int capacidad, String tipo, String tarjeta, int IP, int mascara, String host) {
        super(IP, mascara, host);
        this.RAM = RAM;
        this.capacidad = capacidad;
        this.tipo = tipo;
        this.tarjeta = tarjeta;
    }

    public int getRAM() {
        return RAM;
    }

    public void setRAM(int RAM) {
        this.RAM = RAM;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getTarjeta() {
        return tarjeta;
    }

    public void setTarjeta(String tarjeta) {
        this.tarjeta = tarjeta;
    }
    
    @Override
    public String toString() {
        return super.toString() + "PC_Escritorio{" + "RAM=" + RAM + ", capacidad=" + capacidad + ", tipo=" + tipo + '}';
    }
    
}
