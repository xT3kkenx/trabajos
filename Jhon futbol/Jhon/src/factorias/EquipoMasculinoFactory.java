package factorias;

import partes.DefensorHombre;
import partes.DefensorMujer;
import partes.ArqueroHombre;
import partes.Arquero;
import partes.Atacante;
import partes.AtacanteHombre;
import partes.Defensor;

public class EquipoMasculinoFactory extends EquipoFactory {
    public Arquero creaArquero(){
        return new ArqueroHombre();
    }
    public Defensor creaDefensor(){
        return new DefensorHombre();
    }
    public Atacante crearAtacante(){
        return new AtacanteHombre();

}
}