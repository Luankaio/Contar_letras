
package SalvaNotas;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Notas {
    private String nota;
    private static String path = "/home/luank/desktop/poo_java/Contar_letras/SalvaNotas/notasSalvas";


    public Notas(String nota){
        this.nota=nota;
        try(BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))){
            bw.write(this.nota);
            bw.write('$');
        }catch(IOException e){
            e.printStackTrace();
        }
    }

    
    public void getNotas(){
        System.out.println(this.nota);
    }
}
