import java.util.HashMap;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        LeituraPersonagem leitor = new LeituraPersonagem();
        HashMap<String, Personagem> personagens = leitor.lerpersonagem("rsc/Personagem.txt");

        personagens.get("Jace");
        personagens.get("Clary");

        HashMap<String, Capitulo> capitulos = leitor.lerCapitulo("rsc/Capitulo.txt", personagens, scanner);
       
        Capitulo cap1 =capitulos.get("CAP1");

        Capitulo raiz = cap1;
        raiz.executar(capitulos);
          

         }}   
        
       
        
      
        
         

        

        
        

       


 