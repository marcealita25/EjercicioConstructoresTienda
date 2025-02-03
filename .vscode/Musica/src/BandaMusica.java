import java.util.List;

public class BandaMusica {
    
    public void empezarConcierto() {
        // Crear los instrumentos de la banda
        Instrumento guitarra = new Guitarra("Guitarra Acústica", 6);
        Instrumento guitarraElectrica = new GuitarraElectrica("Guitarra Eléctrica", 6, 100);
        Instrumento piano = new Piano("Piano de Cola", 7, "De Cola");
        Instrumento tambor = new Tambor("Tambor de Batería", "Madera");

        // Crear lista de instrumentos
        List<Instrumento> instrumentos = List.of(guitarra, guitarraElectrica, piano, tambor);

        // Afinar instrumentos
        afinarInstrumentos(instrumentos);

        // Tocar instrumentos
        tocarInstrumentos(instrumentos);
    }

    private void afinarInstrumentos(List<Instrumento> instrumentos) {
        for (Instrumento instrumento : instrumentos) {
            instrumento.afinar();
        }
    }

    private void tocarInstrumentos(List<Instrumento> instrumentos) {
        boolean bandaSuenaMal = false;
        
        for (Instrumento instrumento : instrumentos) {
            if (instrumento instanceof Tambor) {
                // El tambor se aporrea, no se toca
                ((Tambor) instrumento).aporrear();
            } else {
                // Si algún instrumento no está afinado, la banda suena mal
                if (!instrumento.isAfinado()) {
                    bandaSuenaMal = true;
                } else {
                    instrumento.tocar();
                }
            }
        }

        if (bandaSuenaMal) {
            System.out.println("¡La banda suena mal! Algunos instrumentos no están afinados.");
        } else {
            System.out.println("¡La banda suena increíble!");
        }
    }

    public static void main(String[] args) {
        BandaMusica banda = new BandaMusica();
        banda.empezarConcierto();
    }
}
