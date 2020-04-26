package Lectores;
import io.github.cdimascio.dotenv.Dotenv;

public class LeerENV {
    Dotenv env;

    public LeerENV() {
         env = Dotenv.configure().load();
    }

    public String getTipoViewer(){
        return env.get("viewer");
    }

}
