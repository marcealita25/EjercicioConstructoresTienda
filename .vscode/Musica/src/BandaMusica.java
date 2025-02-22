import java.util.Arrays;
import java.util.List;

public class BandaMusica{
   
    private String nombre;

}
public BandaMusica(String nombre){
    this.nombre= nombre;
}

public static void main(String[] args) {
    BandaMusica banda = new BandaMusica();
    banda.empezarConcierto();
}

 
    
    public void empezarConcierto() {
        // Crear los instrumentos de la banda
        Instrumento[] instrumentos = crearInstrumentos();

    private Instrumento[] crearInstrumnetos(){

        Instrumento guitarra = new Guitarra("Guitarra Acústica", 6);
        Instrumento guitarraElectrica = new GuitarraElectrica("Guitarra Eléctrica", 6, 100);
        Instrumento piano = new Piano("Piano de Cola", 7, "De Cola");
        Instrumento tambor = new Tambor("Tambor de Batería", "Madera");


    }
        

        // Crear lista de instrumentos
        Instrumento[] instrumentos ={guitarra, guitarraElectrica, piano, tambor}

        return instrumentos;

    

    private void afinarInstrumentos(Instrumento []instrumentos) {
        for (Instrumento instrumento : instrumentos) {
            instrumento.afinar();
        }
    }

    private void tocarInstrumentos(Instrumento []instrumentos) {
        boolean bandaSuenaMal = false;
        
        for (Instrumento instrumento : instrumentos) {
            if (instrumento .getClass().getName("Tambor")) {
                Tambor tambor = (Tambor)instrumento;
                tambor.aporrear();
                } else {
                    instrumento.tocar();
                
            }
        }

        if (bandaSuenaMal) {
            System.out.println("¡La banda suena mal! Algunos instrumentos no están afinados.");
        } else {
            System.out.println("¡La banda suena increíble!");
        }
    }

    
    @Override
    public String toString() {
        return "BandaMusica [nombre=" + nombre + ", instrumentos=" + Arrays.toString(instrumentos) + "]";
    }



    
}
