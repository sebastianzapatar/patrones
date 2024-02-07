package loquesea;

import java.util.Objects;

public class Estudiante implements IDataStream {
    int suma=0;
    int proccess=0;
    public Estudiante(Estudiante i, int NProccesed){

    }
    @Override
    public int next(){
        int value=this.next();
        proccess++;
        suma+=value;
        return value;
    }
    public double averageProccesed(){
        return suma/proccess;
    }
     int id;
    private String nombre;
    private int edad;

    public Estudiante(int id, String nombre, int edad) {
        this.id = id;
        this.nombre = nombre;
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Estudiante{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", edad=" + edad +
                '}';
    }

    @Override
    public boolean equals(Object o){
        if(o==this) return true;
        if(o==null || getClass()!=o.getClass()) return false;
        Estudiante p=(Estudiante) o;
        System.out.println(id);
        return this.id==p.id;
    }
    @Override
    public int hashCode(){
        return Objects.hash(id);
    }
}
