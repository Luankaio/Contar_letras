import java.util.ArrayList;

public class Bomba {
    ArrayList<String> dados = new ArrayList<>();

    public void criarRecibo(String recibo){
        this.dados.add(recibo);
    }
    
    public void getRecibos(){
        for(String i : this.dados){
            System.out.println(i.replace("*", " "));
        }
    }

}
