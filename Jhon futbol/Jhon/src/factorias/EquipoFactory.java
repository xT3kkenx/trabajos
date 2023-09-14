package factorias;

import partes.Arquero;
import partes.Atacante;
import partes.Defensor;

public abstract class EquipoFactory {

    public abstract Arquero crearArquero();
    public abstract Atacante crearAtacante();
    public abstract Defensor crearDefensor();
}