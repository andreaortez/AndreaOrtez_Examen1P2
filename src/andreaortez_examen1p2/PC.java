package andreaortez_examen1p2;

public class PC {
    protected String IP, mascara, host;

    public PC() {
    }

    public PC(String IP, String mascara, String host) {
        this.IP = IP;
        this.mascara = mascara;
        this.host = host;
    }

    public String getIP() {
        return IP;
    }

    public void setIP(String IP) {
        this.IP = IP;
    }

    public String getMascara() {
        return mascara;
    }

    public void setMascara(String mascara) {
        this.mascara = mascara;
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    @Override
    public String toString() {
        return "Hostname= " + host + "\nDireccion IP= " + IP + "\nMáscara de red= " + mascara;
    }
    
}
