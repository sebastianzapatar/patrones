package loquesea;


import java.math.BigInteger;
import java.util.Objects;

public class VideoJuego {
    private Integer id;
    private String nombre;
    private String desarrolladora;
    private BigInteger ventas;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDesarrolladora() {
        return desarrolladora;
    }

    public void setDesarrolladora(String desarrolladora) {
        this.desarrolladora = desarrolladora;
    }

    public BigInteger getVentas() {
        return ventas;
    }

    public void setVentas(BigInteger ventas) {
        this.ventas = ventas;
    }

    public VideoJuego(Integer id, String nombre, String desarrolladora, BigInteger ventas) {
        this.id = id;
        this.nombre = nombre;
        this.desarrolladora = desarrolladora;
        this.ventas = ventas;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass())
            return false;
        VideoJuego that = (VideoJuego) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "VideoJuego{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", desarrolladora='" + desarrolladora + '\'' +
                ", ventas=" + ventas +
                '}';
    }
}
