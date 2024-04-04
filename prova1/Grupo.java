import java.util.ArrayList;

public class Grupo {
    private ArrayList<Participante> participantesGrupo = new ArrayList<>();

    public void addParticipantes(Participante participante){
        this.participantesGrupo.add(participante);
    }

}



//Classe é um conjunto de atributos e de métodos que serve como modelo para a criação de um objeto, que é formado de acordo com o modelo criado na classe, esse recebe os atributos e os métodos dessa, tornando-se a materialização do modelo criado de acordo com as preferências passadas pelos usuários.
//Encapsulamento é uma forma de proteger os atributos e metodos de uma classe, o que impede outras classe de acessa-los sem a devida autorização, assim, impedindo a manipulação e o acesso indevido de variaveis. Apenas a própria classe pode ter acesso à esses atributos, o que torna necessária a utilização de métodos que realizem a modificação e a visualização desses atributos.