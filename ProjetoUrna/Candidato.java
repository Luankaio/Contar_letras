package ProjetoUrna;

public class Candidato{
    private String nome;
    private int numero;
    private String cargo;
    private int votos;
    public void setCandidato(String nome, int numero, String cargo){
        this.nome=nome;
        this.numero=numero;
        this.cargo=cargo;
    }
    
    public void getCandidato(){
        System.out.println("Nome:"+this.nome);
        System.out.println("Número:"+this.numero);
        System.out.println("Cargo:"+this.cargo);
        System.out.println("***************");
    }
    public void setVotos(){
        this.votos++;
    }
    public void getVotos(){
        System.out.println(this.nome + ":" + this.votos + " votos");
    }

}