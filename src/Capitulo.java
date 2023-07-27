import java.util.ArrayList;
import java.util.Scanner;

public class Capitulo {
    private String nome;
    private String texto;
    private ArrayList<Escolha> escolhas;
    private Personagem personagem;
    private Scanner scanner;

    public Capitulo(String nome, String texto, Personagem personagem, Scanner scanner) {
        this.nome = nome;
        this.texto = texto;
        this.escolhas = new ArrayList<>();
        this.personagem = personagem;
        this.scanner = scanner;
    }
   public void executar() {
    mostrar();
    Capitulo proximoCapitulo = escolher();
    proximoCapitulo.executar();
}

    public void mostrar() {

        System.out.println(nome);
        System.out.println(texto);
        System.out.println("-------------------");
         if (this.personagem.vivo) {
            personagem.cansar();
        } else {
            this.personagem.morrer();
        }
        System.out.println("-------------------");
    }

    public void addEscolha(Escolha escolha) {
        escolhas.add(escolha);
    }

    public Capitulo escolher() {
        int resposta = 0;
        boolean escolhaValida = false;
    
        do {
            for (int i = 0; i < escolhas.size(); i++) {
                if (escolhas.get(i) == null){
                    System.out.println("FIM");
                }
            }

            for (int i = 0; i < escolhas.size(); i++) {
                System.out.println(escolhas.get(i).getTexto());
            }
    
            System.out.print("Digite sua escolha: ");
            String input = scanner.nextLine();
    
            for (int i = 0; i < escolhas.size(); i++) {
                if (escolhas.get(i).getTexto().equalsIgnoreCase(input)) {
                    resposta = i + 1;
                    escolhaValida = true;
                    break;
                }
            }
    
            if (!escolhaValida) {
                System.out.println("Escolha inválida. Digite uma opção válida.");
            }
        } while (!escolhaValida);
        return escolhas.get(resposta - 1).getProximo();
        
    }
    
        
}
    


