import java.util.ArrayList;
import java.util.List;

public class Garaje {
    private int capacidadCamiones;
    private int capacidadCoches;
    private int capacidadMotos;
    private List<Camion> camiones;
    private List<Coche> coches;
    private List<Motocicleta> motos;

    public Garaje(int capacidadCamiones, int capacidadCoches, int capacidadMotos) {
        this.capacidadCamiones = capacidadCamiones;
        this.capacidadCoches = capacidadCoches;
        this.capacidadMotos = capacidadMotos;
        this.camiones = new ArrayList<>();
        this.coches = new ArrayList<>();
        this.motos = new ArrayList<>();
    }

    public boolean aparcarCamion(Camion camion) {
        if (camiones.size() < capacidadCamiones) {
            camiones.add(camion);
            return true;
        } else {
            System.out.println("No hay espacio para más camiones.");
            return false;
        }
    }

    public boolean aparcarCoche(Coche coche) {
        if (coches.size() < capacidadCoches) {
            coches.add(coche);
            return true;
        } else {
            System.out.println("No hay espacio para más coches.");
            return false;
        }
    }

    public boolean aparcarMoto(Motocicleta moto) {
        if (moto.isTieneSidecar()) {
            System.out.println("Las motos con sidecar no se pueden aparcar en el garaje.");
            return false;
        } else if (motos.size() < capacidadMotos) {
            motos.add(moto);
            return true;
        } else {
            System.out.println("No hay espacio para más motos.");
            return false;
        }
    }

    public void mostrarGaraje() {
        System.out.println("Camiones en el garaje:");
        for (Camion camion : camiones) {
            camion.mostrarInformacion();
        }
        System.out.println("Coches en el garaje:");
        for (Coche coche : coches) {
            coche.mostrarInformacion();
        }
        System.out.println("Motos en el garaje:");
        for (Motocicleta moto : motos) {
            moto.mostrarInformacion();
        }
    }
}
