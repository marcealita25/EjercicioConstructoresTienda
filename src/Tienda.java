
import java.util.Arrays;

import javafx.css.SimpleStyleableObjectProperty;

public class Tienda {

     private String nombre;

     public Tienda(String nombre) {
          this.nombre = nombre;
     }

     public static void main( String[] args) {

          Tienda tienda = new Tienda("Loro piana");
          Maniqui []maniquies = tienda.abrirTienda();

     }


     private Maniqui []  abrirTienda (){
          
          Vestido vestido = new Vestido("rojo",45 , "M");
          
          Maniqui maniqui1 = new Maniqui( 1, vestido);
          

           Boton boton = new Boton("rojo","S","redondo");
           Pantalon pantalon = new Pantalon("negro", 40, 40, boton);
           
           Camisa camisa = new Camisa("Blanca", 25, "M", boton);

           

          
          Boton  boton1 = new Boton("verde", "pequeño","redondo");
          Boton  boton2  = new Boton("verde","pequeño","redondo");
          Boton  boton3 = new Boton("verde","pequeño","redondo");
          Boton[] botones ={boton1,boton2,boton3};

          Camisa camisa1 =new Camisa("blanco",29.90, botones);

          Maniqui maniqui2 =new Maniqui(2, pantalon, camisa1);

          Maniqui maniqui3 =new Maniqui(3);

          Boton b = maniqui2.getCamisa().getBotones();

          System.out.println(b.getColor());
          System.out.println(b.getForma());
          System.out.println(b.getTamanio());

          Maniqui [] maniquies = {maniqui1, maniqui2, maniqui3};
          return maniquies;

     }

     private void mostrartiendaEscaparate(Maniqui[] maniquies) {
          for (Maniqui maniqui : maniquies) {
               System.out.println("Informacion del maniqui" + maniqui.getId());
               // Datos pantalon
               Pantalon pantalon = maniqui.getPantalon();

               if (pantalon != null) {

                    System.out.println("Pantalon");
                    System.out.println("\t color" + camisa.getColor());
                    System.out.println("\t talla" + camisa.getPrecio());
                    System.out.println("\t talla" + camisa.getTalla());

               }

          }
     }

     @Override
     public String toString() {
          return "Tienda [nombre=" + nombre + "]";
     }

    
     

}


