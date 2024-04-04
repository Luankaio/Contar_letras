public class Participante {
    private Corrida corrida;
    private char tamanhoCamisa;
    private int percurso;
    private Kit kit;
    private int numeroParticipante;
    private Grupo grupo = new Grupo();
    
    public Participante(){
        
    }

    public void cadastrarCorrida(String nome, String email, String senha){
        this.corrida = new Corrida(nome, email, senha);
    }

    public void setNumeroParticipante(int n){
        this.numeroParticipante=n;

    }

    public void setKit(char tamanhoCamisa, String complementos){
        this.kit = new Kit(tamanhoCamisa, complementos);
    }

    public void setTamanhoCamisa(char tamanhoCamisa){
        this.tamanhoCamisa=tamanhoCamisa;
    }

    public void setPercurso(int percurso){
        this.percurso = percurso;
    }
}
