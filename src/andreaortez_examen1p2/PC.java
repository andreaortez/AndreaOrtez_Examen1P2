package andreaortez_examen1p2;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class PC {

    static Scanner sc = new Scanner(System.in);

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

    public void Ping(String ip2) {
        CRUD c = new CRUD();
        int t = c.pcs.indexOf(this.IP);
        boolean valid = false;

        for (PC a : c.pcs) {
            if (a.getIP().equals(ip2)) {
                valid = true;
                String[] x = this.IP.split(".");
                String[] y = ip2.split(".");
                if (x[0] == y[0]) {
                    String binarioF = Validar(x[3]);
                    int binarioX = Binario(Integer.parseInt(binarioF));
                    binarioF = Validar(y[3]);
                    int binarioY = Binario(Integer.parseInt(binarioF));

                    String[] mask1 = c.pcs.get(t).getMascara().split(".");
                    String[] mask2 = a.getMascara().split(".");

                    if (mask1[4].length() == 8 && mask2[4].length() == 8) {
                        int mascara1 = Binario(Integer.parseInt(mask1[4]));
//                        int mascara2 = Binario(Integer.parseInt(mask2[4]));
                        int pos = 24 + Posicion(String.valueOf(mascara1));
//                        int pos2 = 24 + Posicion(String.valueOf(mascara2));

//                        int posF;
//                        if (pos1 < pos2) {
//                            posF = pos1;
//                        } else {
//                            posF = pos2;
//                        }

                        boolean comp = Comparacion(String.valueOf(binarioX), String.valueOf(binarioY), pos);

                        if (comp) {//Ping éxitoso
                            System.out.println(c.pcs.get(t).getHost() + "#ping:" + this.IP + "\n");
                            System.out.println("Pinging to " + this.IP + " 32 bits of data:");
                            for (int i = 0; i < 4; i++) {
                                System.out.println("Reply from " + this.IP + ": bytes=32 time=37ms TTL=46");
                            }
                            System.out.println("\n Ping statistics for " + this.IP + ":");
                            System.out.println("    Packets: Sent = 4, Received = 4, Lost = 0 (0% Lost)");
                            System.out.println(c.pcs.get(t).getHost() + "#");
                        }

                    } else {
                        System.out.println("La máscara de red no es válida");
                        break;
                    }
                } else if (valid == false) {//Computadora Inalcanzable
                    System.out.println(c.pcs.get(t).getHost() + "#ping:" + this.IP + "\n");
                    System.out.println("Pinging to " + this.IP + " 32 bits of data:");
                    for (int i = 0; i < 4; i++) {
                        System.out.println("Reply from " + this.IP + ": Destination host unreachable");
                    }
                    System.out.println("\n Ping statistics for " + this.IP + ":");
                    System.out.println("    Packets: Sent = 4, Received = 0, Lost = 4 (100% Lost)");
                    System.out.println(c.pcs.get(t).getHost() + "#");
                }
            } else {//Ping sin respuesta
                System.out.println(c.pcs.get(t).getHost() + "#ping:" + this.IP + "\n");
                System.out.println("Pinging to " + this.IP + " 32 bits of data:");
                for (int i = 0; i < 4; i++) {
                    System.out.println("Request timed out ");
                }
                System.out.println("\n Ping statistics for " + this.IP + ":");
                System.out.println("    Packets: Sent = 4, Received = 0, Lost = 4 (100% Lost)");
                System.out.println(c.pcs.get(t).getHost() + "#");
            }
        }

    }

    public static int Binario(int x) {
        if (x <= 1) {
            return x;
        } else {
            return x % 2 + Binario(x / 2) * 10;
        }
    }

    public static String Validar(String x) {
        String a = "";
        if (x.length() < 8) {
            int cant = 8 - x.length();
            for (int i = 0; i < cant; i++) {
                a += 0;
            }
            return a + x;
        } else {
            return x;
        }
    }

    public static int Posicion(String x) {
        int cont = 0;
        for (int i = 0; i < x.length(); i++) {
            if (x.charAt(i) == 1) {
                cont++;
            }
        }
        return cont;
    }

    public static boolean Comparacion(String x, String y, int pos) {
        boolean resp = false;
        for (int i = 0; i < pos; i++) {
            if (x.charAt(i) == y.charAt(i)) {
                resp = true;
            } else {
                return resp;
            }
        }
        return resp;
    }

}
