package andreaortez_examen1p2;

public class Laptop extends PC{
    private String marca, RGB, definicion;

    public Laptop() {
    }

    public Laptop(String marca, String definicion, String RGB, String IP, String mascara, String host) {
        super(IP, mascara, host);
        this.marca = marca;
        this.RGB = RGB;
        this.definicion = definicion;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getRGB() {
        return RGB;
    }

    public void setRGB(String RGB) {
        this.RGB = RGB;
    }

    public String getDefinicion() {
        return definicion;
    }

    public void setDefinicion(String definicion) {
        this.definicion = definicion;
    }

    @Override
    public String toString() {
        return super.toString() + "\nMarca= " + marca + "\nDefinición de pantalla= " + definicion + "\nRGB en el teclado= " + RGB;
    }
    
}
