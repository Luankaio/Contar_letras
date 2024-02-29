public class Teste2{
	
    public void selec(String text){
            while(text.length()!=0){
                int temp, quant;
                char letra = text.charAt(0);
                temp = text.length();
                System.out.print(letra+"=");
                text = text.replace(String.valueOf(letra), "");
                quant = temp-text.length();
                System.out.println(quant);
            }
    }


}
