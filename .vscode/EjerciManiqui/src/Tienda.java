
package es.cursojava.poo.ejercicios.maniqui;

public class Tienda {
    public static void main(String[] args) {
        Tienda tienda = new Tienda("Loro Piana");

        // Crear botones
        Boton boton1 = new Boton("rojo", "S", "redondo");
        Boton boton2 = new Boton("verde", "M", "cuadrado");

        // Crear camisas con botones
        Camisa camisa = new Camisa("Blanca", 29.90, "M", new Boton[]{boton1, boton2});

        // Crear pantalón
        Pantalon pantalon = new Pantalon("Negro", 39.90, "M", 100);

        // Crear maniquíes
        Maniqui maniqui1 = new Maniqui(1, pantalon, camisa);
        Maniqui maniqui2 = new Maniqui(2, new Vestido("Rojo", 45.00, "M"));

        // Mostrar escaparate
        Maniqui[] maniquies = {maniqui1, maniqui2};
        tienda.mostrarEscaparate(maniquies);
    }

    private void mostrarEscaparate(Maniqui[] maniquies) {
        for (Maniqui maniqui : maniquies) {
            System.out.println("Maniqui ID: " + maniqui.getId());
            
            // Mostrar pantalón
            if (maniqui.getPantalon() != null) {
                Pantalon pantalon = maniqui.getPantalon();
                System.out.println("\tPantalón: " + pantalon.getColor() + ", " + pantalon.getTalla() + ", " + pantalon.getPrecio());
            }
            
            // Mostrar camisa
            if (maniqui.getCamisa() != null) {
                Camisa camisa = maniqui.getCamisa();
                System.out.println("\tCamisa: " + camisa.getColor() + ", " + camisa.getTalla() + ", " + camisa.getPrecio());
                for (Boton boton : camisa.getBotones()) {
                    System.out.println("\t\tBotón: " + boton.getColor() + ", " + boton.getTamanio() + ", " + boton.getForma());
                }
            }
            
            // Mostrar vestido
            if (maniqui.getVestido() != null) {
                Vestido vestido = maniqui.getVestido();
                System.out.println("\tVestido: " + vestido.getColor() + ", " + vestido.getTalla() + ", " + vestido.getPrecio());
            }
        }
    }

    @Override
    public String toString() {
        return "Tienda []";
    }



    
}