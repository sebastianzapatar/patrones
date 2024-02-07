package prototype;

public class Enemigo {
    private String imagen;
    private int posx;
    private int posy;
    private int vida;

    public Enemigo(String imagen, int posx,
                   int posy, int vida) {
        this.imagen = imagen;
        this.posx = posx;
        this.posy = posy;
        this.vida = vida;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public int getPosx() {
        return posx;
    }

    public void setPosx(int posx) {
        this.posx = posx;
    }

    public int getPosy() {
        return posy;
    }

    public void setPosy(int posy) {
        this.posy = posy;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }
    public Enemigo(Enemigo e){
        this.setImagen(e.getImagen());
        this.setVida(e.getVida()+2);
        this.setPosx(e.getPosx());
        this.setPosy(e.getPosy());
    }
    public Enemigo Clone(){
        return new Enemigo(this);
    }

    @Override
    public String toString() {
        return "Enemigo{" +
                "imagen='" + imagen + '\'' +
                ", posx=" + posx +
                ", posy=" + posy +
                ", vida=" + vida +
                '}';
    }
}
