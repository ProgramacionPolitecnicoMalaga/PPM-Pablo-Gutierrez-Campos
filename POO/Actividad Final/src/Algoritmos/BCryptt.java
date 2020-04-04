package Algoritmos;

import java.security.NoSuchAlgorithmException;
import org.mindrot.jbcrypt.BCrypt;

public class BCryptt implements Algoritmo {
    @Override
    public String generarHash(String password) throws NoSuchAlgorithmException {
        return BCrypt.hashpw(password, BCrypt.gensalt(12));
    }

    @Override
    public boolean verificarHash(String password, String passwordHash) throws NoSuchAlgorithmException {
        return BCrypt.checkpw(password,passwordHash);
    }


}
