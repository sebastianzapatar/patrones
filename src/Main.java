import SOLID.*;
import Singlenton.ConexioDB;
import builder.Usuario;
import loquesea.Estudiante;
import loquesea.VideoJuego;
import patrones.Pizzeria;
import patrones.Pizza;
import prototype.Enemigo;

import java.math.BigInteger;
import java.util.*;
import java.util.stream.Collectors;

public class Main {


    public static void main(String[] args) {
        /*ConexioDB conexion=ConexioDB.obtenerConexion();
        ConexioDB conexion2=ConexioDB.obtenerConexion();
        System.out.println(conexion2.hashCode());
        System.out.println(conexion.hashCode());
        Usuario user1=Usuario.make("1").setEmail("xx@xx.com")
                .setName("Loco volvio al vapo").build();
        Usuario user2=Usuario.make("2").setEmail("x1@xx.com")
                .setName("German Ayala").build();
        System.out.println(user2);
        System.out.println(user1);*/
        Enemigo julio=new Enemigo("julio.jpg",
                3,4,100);
        Enemigo e2=julio.Clone();
        Enemigo e3=julio.Clone();
        Enemigo e4=julio.Clone();
        System.out.println(e3+" "+julio+" "+e4);
    }

}