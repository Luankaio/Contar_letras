package SalvaNotas;

import java.io.BufferedReader;
import java.io.FileReader;


public class LerTxt {
        public static String path = "/home/luank/desktop/poo_java/Contar_letras/SalvaNotas/notasSalvas";

        public static String[] prepareExistingNotes(){
            BufferedReader br = null;
            String line;
            String[] separated;
            
            try {
                br = new BufferedReader(new FileReader(path));
                line = br.readLine();
                separated =  line.split("\\$");
                br.close();
                
            } catch (Exception e) {
                String oi = "i";
                separated = oi.split("i");
            }
            return separated;
        } 
}
