import java.util.ArrayList;

public class Evento_esportivo {
    private int limiteParticipantes;
    private String dataLimite;
    private int i=0;
    private int[] percusos = {5, 10, 15, 20};
    private ArrayList<Participante> participantes = new ArrayList<>();

    public void addParticipante(Participante participante, int percuso, char tamanhoCamisa, String complementos){
        
        this.participantes.add(participante);
        participante.setPercurso(percuso);
        participante.setKit(tamanhoCamisa, complementos);
        participante.setNumeroParticipante(this.i);
        i++;
    }

    public void getParticipantes(){
        
    }

}
