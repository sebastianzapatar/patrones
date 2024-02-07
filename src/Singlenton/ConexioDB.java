package Singlenton;

public class ConexioDB {
    private static ConexioDB conexioDB;
    private ConexioDB(){

    }
    public static ConexioDB obtenerConexion(){
        if(conexioDB==null){
            conexioDB=new ConexioDB();
        }
        return conexioDB;
    }
    public static void DesconectarDB(){
        conexioDB=null;
    }
    boolean k=true;

}
