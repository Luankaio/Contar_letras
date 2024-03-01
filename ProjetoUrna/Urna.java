package ProjetoUrna;
public class Urna {
    Candidato candidato1,candidato2,candidato3;
    

    public void criarCandidato(){
        candidato1.setCandidato("Marina Silva", 10, "Presidente");
        candidato2.setCandidato("Cabo Daciolo", 20, "Presidente");
        candidato3.setCandidato("Padre Kel", 30, "Presidente");
    }

    public void getCandidato1(){
        candidato1.getCandidato();
    }



}
