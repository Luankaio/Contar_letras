import java.util.ArrayList;
import java.util.List;
public class Testes {
    public static void main(String[] args){
        List<String> list = new ArrayList<String>();
        list.add("luan");
        list.add("lais");
        list.add("auan");
        list.removeIf(x -> x.charAt(0) != 'l');
        for(String i : list){
            System.out.println(i);
        }

    }
}
