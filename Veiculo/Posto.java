public class Posto {
    float volumeMaximo=500;
    float tanquePrincipal=volumeMaximo;
    Bomba[] bombas= new Bomba[3];
    {bombas[0] = new Bomba();
     bombas[1] = new Bomba();
     bombas[2] = new Bomba();
    }

    public void abastecer(Carro carro, int nBomba, float qtdCombustivel){
        setTanque(qtdCombustivel);
        carro.encherTanque(qtdCombustivel);
        registroBomba(carro, nBomba, qtdCombustivel);
    }

    //adicionar data
    public void registroBomba(Carro carro, int nBomba, float qtdCombustivel){
        String recibo = carro.infoRecibo() + '*' + qtdCombustivel;
        bombas[nBomba].criarRecibo(recibo);
    }

    public void setTanque(float qntGas){
        verificarTanque(this.tanquePrincipal - qntGas);

        this.tanquePrincipal = this.tanquePrincipal - qntGas;
    }

    public void verificarTanque(float gasAtual){
        if(gasAtual <=0){
            this.tanquePrincipal=this.volumeMaximo;
        }
    }

    public void getReciboBomba(int nBomba){
        bombas[nBomba].getRecibos();
    }
}
