import Modelo.Instrumento;
import Vista.Ventana;
import controlador.controladorInstrumento;
import org.example.persistencia.InstruDao;

import java.sql.SQLException;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
    Ventana ven= new Ventana("Instrumentos");
    controladorInstrumento controller =new controladorInstrumento(ven);

    }
}

