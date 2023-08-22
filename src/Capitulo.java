import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Capitulo {
    private String nomeDoCapitulo;
    private String texto;
    private ArrayList<Escolha> escolhas;
    private Personagem nomePersonagem;
    private Scanner scanner;
    private int energia;

    public Capitulo(String nomeDoCapitulo, String texto, Personagem nomePersonagem,int energia, Scanner scanner) {
        this.nomeDoCapitulo = nomeDoCapitulo;
        this.texto = texto;
        this.escolhas = new ArrayList<>();
        this.nomePersonagem = nomePersonagem;
        this.scanner = scanner;
        this.energia = energia;
    }

    public void executar(HashMap<String, Capitulo> capitulos) {
        mostrar();
        if(escolhas.isEmpty()){
            return;
        }
        String proximoCapitulo = escolher();
        capitulos.get(proximoCapitulo).executar(capitulos);

    }

    public void mostrar() {
        System.out.println(nomeDoCapitulo);
        System.out.println(texto);
        System.out.println("-------------------");
        
        if (this.nomePersonagem.taVivo()) {  
            nomePersonagem.cansar(this.energia);
        } else {
            this.nomePersonagem.morrer();
        }
        
        System.out.println("-------------------");
    }

    public void addEscolha(Escolha escolha) {
        escolhas.add(escolha);
    }

    public String escolher() {
        int resposta = 0;
        boolean escolhaValida = false;
        
         
            for (int i = 0; i < escolhas.size(); i++) {
                Escolha escolha = escolhas.get(i);
                if (escolha != null) {
                    System.out.println(escolha.getTexto());
                }
            }
    
            System.out.print("Digite sua escolha: ");
            String input = scanner.nextLine();
    
            for (int i = 0; i < escolhas.size(); i++) {
                Escolha escolha = escolhas.get(i);
                if (escolha != null && escolha.getTexto().equalsIgnoreCase(input)) {
                    resposta = i + 1;
                    escolhaValida = true;
                    break;
                }
            }
    
            if (!escolhaValida) {
                System.out.println("Escolha inválida. Digite uma opção válida.");
            }
            while (!escolhaValida);
         
    
        return escolhas.get(resposta - 1).getProximo();

    }
    
}
