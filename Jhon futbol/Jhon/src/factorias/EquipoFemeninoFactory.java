package factorias;

import partes.Arquero;
import partes.ArqueroMujer;
import partes.Atacante;
import partes.AtacanteMujer;
import partes.Defensor;
import partes.DefensorMujer;

public class EquipoFemeninoFactory extends EquipoFactory{
    public Arquero creaArquero(){
        return new ArqueroMujer();
    }
    public Defensor creaDefensor(){
        return new DefensorMujer();
    }
    public Atacante crearAtacante(){
        return new AtacanteMujer();
    }
}