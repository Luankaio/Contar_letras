package ProjetoUrna;

import java.util.Scanner;

public class Urna {
    Candidato candidato1 = new Candidato();
    Candidato candidato2 = new Candidato();
    Candidato candidato3 = new Candidato();
    {criarCandidato();}
    private void criarCandidato(){
        candidato1.setCandidato("Marina Silva", 10, "Presidente");
        candidato2.setCandidato("Cabo Daciolo", 20, "Presidente");
        candidato3.setCandidato("Padre Kel", 30, "Presidente");
    }

    public void getCandidato1(){
        candidato1.getCandidato();
    }
    public void getResultados(){
        candidato1.getVotos();
        candidato2.getVotos();
        candidato3.getVotos();
    }
    public void getCandidato2(){
        candidato2.getCandidato();
    }
    public void getCandidato3(){
        candidato3.getCandidato();
    }
    public void getCandidatos(){
        getCandidato1(); getCandidato2(); getCandidato3();
    }
    
    public void votar1(){
        candidato1.setVotos();
    }
    public void votar2(){
        candidato2.setVotos();
    }
    public void votar3(){
        candidato3.setVotos();
    }

    public void votar(){
        Scanner sc = new Scanner(System.in);
        int numero = -1;
        while(numero!=0){
            System.out.println("Escolha uma opção:");
            System.out.println("(1) = Votar\n(2) = Mostrar candidatos\n");
            numero = sc.nextInt();
            if(numero==2){
                getCandidatos();
                continue;
            }
            System.out.println("Digite o número do candidato:");
            numero = sc.nextInt();
            switch(numero){
                case 10: votar1(); break;
                case 20: votar2(); break;
                case 30: votar3(); break;
                default: System.out.println("Candidato inexistente, tente novamente!"); continue;
            }
            System.out.println("\n***************");
            System.out.println("Voto computado!");
            System.out.println("***************\n");
            System.out.println("Escolha uma opção:");
            System.out.println("(0) = Encerrar votações\n(1) = Novo voto");
            numero = sc.nextInt();
        }
        sc.close();
    }



}
