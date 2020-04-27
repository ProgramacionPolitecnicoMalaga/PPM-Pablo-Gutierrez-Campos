package Modelo;

import java.sql.Date;
import java.time.LocalDate;

public class Mensaje {
    public int id;
    public String titulo;
    public String cuerpo;
    public String emisor;
    public String receptor;
    public LocalDate fecha;
    public int id_usuario;

    public Mensaje( String titulo, String cuerpo, String emisor, String receptor, LocalDate fecha, int id_usuario) {
        this.titulo = titulo;
        this.cuerpo = cuerpo;
        this.emisor = emisor;
        this.receptor = receptor;
        this.fecha = fecha;
        this.id_usuario = id_usuario;
    }

    public Mensaje() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getCuerpo() {
        return cuerpo;
    }

    public void setCuerpo(String cuerpo) {
        this.cuerpo = cuerpo;
    }

    public String getEmisor() {
        return emisor;
    }

    public void setEmisor(String emisor) {
        this.emisor = emisor;
    }

    public String getReceptor() {
        return receptor;
    }

    public void setReceptor(String receptor) {
        this.receptor = receptor;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public int getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(int id_usuario) {
        this.id_usuario = id_usuario;
    }

    @Override
    public String toString() {
        return "Mensaje{" +
                "id=" + id +
                ", titulo='" + titulo + '\'' +
                ", cuerpo='" + cuerpo + '\'' +
                ", emisor='" + emisor + '\'' +
                ", receptor='" + receptor + '\'' +
                ", fecha=" + fecha +
                ", id_usuario=" + id_usuario +
                '}';
    }
}
