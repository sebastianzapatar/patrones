package SOLID;

public class Rectangulo implements IFigura{
    private float base;

    private float altura;

    public float getBase() {
        return base;
    }

    public void setBase(float base) {
        this.base = base;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public Rectangulo(float base, float altura) {
        this.base = base;
        this.altura = altura;
    }
    @Override
    public float area(){
        return base*altura;
    }
    @Override
    public float perimetro(){
        return base*2+altura*2;
    }
    @Override
    public String information(){
        return base+" "+" "+altura+" "+"not a square ಠ_ಠ";
    }
}
