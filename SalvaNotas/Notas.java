
package SalvaNotas;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Notas {
    private String nota;
    private static String path = "/home/luank/desktop/poo_java/Contar_letras/SalvaNotas/notasSalvas";


    public Notas(String nota) throws IOException{
        this.nota=nota;
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))) {
            bw.write(this.nota);
            bw.write('$');
        }
    }
    public Notas(String nota, int a){
        this.nota=nota;
    }

    
    public void getNotas(){
        System.out.println(this.nota);
    }
}
