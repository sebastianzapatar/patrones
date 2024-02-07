package SOLID;

public class Triangulo implements IFigura{
    private float base;
    private float altura;
    private float lado1;
    private float lado2;

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

    public Triangulo(float base, float altura, float lado1, float lado2) {
        this.base = base;
        this.altura = altura;
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

    public float getLado1() {
        return lado1;
    }

    public void setLado1(float lado1) {
        this.lado1 = lado1;
    }

    public float getLado2() {
        return lado2;
    }

    public void setLado2(float lado2) {
        this.lado2 = lado2;
    }

    @Override
    public float area() {
        return base*altura/2;
    }

    @Override
    public float perimetro() {
        return base+lado1+lado2;
    }
    @Override
    public String information(){
        return base+" "+" "+altura+" "+"triangle (●'◡'●)";
    }
}
