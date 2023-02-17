package andreaortez_examen1p2;

public class PC {

    protected int IP, mascara;
    protected String host;

    public PC() {
    }

    public PC(int IP, int mascara, String host) {
        this.IP = IP;
        this.mascara = mascara;
        this.host = host;
    }

    public int getIP() {
        return IP;
    }

    public void setIP(int IP) {
        this.IP = IP;
    }

    public int getMascara() {
        return mascara;
    }

    public void setMascara(int mascara) {
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
        return "PC{" + "IP=" + IP + ", mascara=" + mascara + ", host=" + host + '}';
    }
    
}
