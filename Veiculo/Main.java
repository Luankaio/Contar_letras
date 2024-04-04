public class Main {
    public static void main(String[] args) {
        Carro carro = new Carro("GFE3433", "Marquim",10f,20);
        Posto posto = new Posto();
        carro.acelerar();
        carro.acelerar();
        carro.acelerar();
        carro.acelerar();
        carro.acelerar();
        carro.acelerar();
        posto.abastecer(carro, 0, 40);
        posto.getReciboBomba(0);
        carro.getCombustivel();
    }
}


