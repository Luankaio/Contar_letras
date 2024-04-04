
public class Corrida{
    private String nome;
    private String email;
    private String senha;
    private Grupo grupo=new Grupo();

    public Corrida(String nome, String email, String senha){
        this.nome=nome;
        this.email=email;
        this.senha=senha;
    }

    public void criarGrupo(Participante participante){
        //fazer loop para add participantes
        grupo.addParticipantes(null);
    }
}