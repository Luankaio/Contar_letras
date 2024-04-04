public class Carro{
    private String placa;
    private String proprietario;
    private float potencia;
    private float tanqueMaximo;
    private float tanque;

    public Carro(String placa, String proprietario, float potencia, int tanque){
        this.placa=placa;
        this.proprietario=proprietario;
        this.potencia=potencia;
        this.tanqueMaximo=tanque;
        this.tanque=tanque;

    }

    public void encherTanque(float abastecimento){
        if(this.tanque+abastecimento>this.tanqueMaximo){
            System.out.println("Valor acima do permitido");
        }else{
            this.tanque=this.tanque+abastecimento;
        }
        
    }


    public void acelerar(){
        if(this.tanque-(this.potencia/10)>=0){
        this.tanque -= (this.potencia/10);
        }
    }

    public String infoRecibo (){
        return this.placa+'*'+this.proprietario;
    }

    public void getCombustivel(){
        System.out.println(this.tanque);
    }


}