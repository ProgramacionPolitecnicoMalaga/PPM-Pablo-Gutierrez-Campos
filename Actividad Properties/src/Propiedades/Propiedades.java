package Propiedades;

import java.io.*;
import java.util.Properties;

public class Propiedades {
    private Properties properties;

    public Propiedades() throws IOException {
        properties = new Properties();
        File archivo = new File("config.properties");

        if (archivo.exists()) {
            properties.load(new FileInputStream(archivo));
        }
    }

    public String getProperties(String nombre) {
        return properties.getProperty(nombre);
    }

    public void setProperties(String nombre, String valor) {
        properties.setProperty(nombre, valor);
    }

    public void guardarCambios() throws IOException {
        FileOutputStream output = new FileOutputStream("config.properties");
        properties.store(output, "Configuración");
    }
}
