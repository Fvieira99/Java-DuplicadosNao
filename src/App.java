import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
       List<String> primeiroArr = new ArrayList<>(Arrays.asList("Banana", "Maça", "Morango", "Manga"));

       List<String> segundoArr = new ArrayList<>(Arrays.asList("Melancia", "Uva", "Morango", "Manga"));

        System.out.println("Lista de itens em comum:");

       for(String fruta : primeiroArr){

            if(segundoArr.contains(fruta)){
               System.out.println(fruta);
            }
       }



    
    }
}
