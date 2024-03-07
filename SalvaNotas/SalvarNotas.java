package SalvaNotas;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SalvarNotas {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        List<Notas> list = new ArrayList<>();
           
        for(String notes: LerTxt.prepareExistingNotes()){
            list.add(new Notas(notes));
        } 
        int temp=-1;
        while(temp!=0){
            System.out.println("\nEscolha uma opção:");
            System.out.println("1) Adicionar nota\n2) Ver uma nota\n3) Ver todas as notas\n4) Remover nota\n0) Encerrar\n");
            temp = sc.nextInt();
            sc.nextLine();
            switch (temp) {
                case 1:
                    list.add(new Notas(sc.nextLine()));
                    break;
                case 2:

                    break;
                case 3:
                    for(Notas notas: list){

                        System.out.print("Nota"+ list.indexOf(notas) +": ");
                        notas.getNotas();
                    }
                    break;
                case 4:
                    System.out.print("Escolha a posição da nota:");
                    list.remove(sc.nextInt());
                default:
                    break;
                }
            }
        
        // list.removeIf(x -> x.list(" "));
    
        sc.close();
    }

}
