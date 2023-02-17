
package andreaortez_examen1p2;

public class PC_Escritorio extends PC{
    private String RAM, capacidad, tipo, tarjeta;

    public PC_Escritorio() {
    }

    public PC_Escritorio(String RAM, String capacidad, String tipo, String tarjeta, int IP, int mascara, String host) {
        super(IP, mascara, host);
        this.RAM = RAM;
        this.capacidad = capacidad;
        this.tipo = tipo;
        this.tarjeta = tarjeta;
    }

    public String getRAM() {
        return RAM;
    }

    public void setRAM(String RAM) {
        this.RAM = RAM;
    }

    public String getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(String capacidad) {
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
        return super.toString() + "\nCapacidad RAM= " + RAM + "\nCapacidad de almacenamiento= " + capacidad + "\nTipo de almacenamiento= " + tipo + "\nTarjeta gráfica= " + tarjeta;
    }
    
}
