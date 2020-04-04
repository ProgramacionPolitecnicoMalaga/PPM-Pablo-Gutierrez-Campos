package Algoritmos;


import java.security.NoSuchAlgorithmException;

public interface Algoritmo {
        String generarHash(String password) throws NoSuchAlgorithmException;
        boolean verificarHash(String password, String passwordHash) throws NoSuchAlgorithmException;
    }

