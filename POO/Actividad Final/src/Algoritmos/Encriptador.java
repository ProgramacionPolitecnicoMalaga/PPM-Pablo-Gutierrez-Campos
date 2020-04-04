package Algoritmos;

import java.security.NoSuchAlgorithmException;

public class Encriptador {
    private String clave;
    private Algoritmo algoritmo;

    public Encriptador(String clave, String algoritmo) {
        this.clave = clave;
        try {
            setAlgoritmo(algoritmo);
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
    }

    public void setAlgoritmo(String algoritmo) throws NoSuchAlgorithmException {
        if (algoritmo.equals("MD5"))
            this.algoritmo = new MD5();
        else
            this.algoritmo = new BCryptt();

    }

    public String generarHash() throws NoSuchAlgorithmException {
        return algoritmo.generarHash(clave);
    }

    public boolean verificarClave(String hash) throws NoSuchAlgorithmException {
        return algoritmo.verificarHash(clave, hash);
    }
}
