package ProjetoUrna;

public class Candidato{
    private String nome;
    private int numero;
    private String cargo;
    public void setCandidato(String nome, int numero, String cargo){
        this.nome=nome;
        this.numero=numero;
        this.cargo=cargo;
    }
    public void getCandidato(){
        System.out.println(this.nome);
    }
}