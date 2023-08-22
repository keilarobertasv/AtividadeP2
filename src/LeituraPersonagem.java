import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Scanner;

public class LeituraPersonagem {
    public HashMap<String, Personagem> lerpersonagem(String caminhoDoArquivo) {

        HashMap<String, Personagem> personagens = new HashMap<String, Personagem>();
        File arquivoPersonagens = new File(caminhoDoArquivo);

        try {

            Scanner escaneador = new Scanner(arquivoPersonagens, "UTF-8");

            String nome = "";
            String linha = "";
            int energia = 0;
            String sexo = "";

            while (escaneador.hasNextLine()) {
                linha = escaneador.nextLine();
                if (!linha.equals("PERSONAGEM")) {
                    continue;
                }
                nome = escaneador.nextLine();
                energia = Integer.parseInt(escaneador.nextLine());
                sexo = escaneador.nextLine();

                personagens.put(nome, new Personagem(nome, sexo, energia));
            }

            escaneador.close();

        } catch (FileNotFoundException exception) {
            exception.printStackTrace();
        }

        return personagens;
    }

    public HashMap<String, Capitulo> lerCapitulo(String caminhoDoArquivoCapitulo, HashMap<String, Personagem> personagens,
            Scanner escaneadorConsole) {
        HashMap<String, Capitulo> capitulos = new HashMap<String, Capitulo>();
        File arquivoCapitulo = new File(caminhoDoArquivoCapitulo);

        try {

            Scanner escaneadorCapitulo = new Scanner(arquivoCapitulo, "UTF-8");

            String nomeDoCapitulo = "";
            String texto = "";
            String nomePersonagem = "";
            int energia = 0;
            String linha = "";

            while (escaneadorCapitulo.hasNextLine()) {
                linha = escaneadorCapitulo.nextLine();
                if (!linha.equals("CAPITULO") && !linha.equals("ESCOLHA")) {
                    continue;
                }
                if (linha.equals("CAPITULO")) {
                    nomeDoCapitulo = escaneadorCapitulo.nextLine();
                    texto = escaneadorCapitulo.nextLine();
                    nomePersonagem = escaneadorCapitulo.nextLine();
                    energia = Integer.parseInt(escaneadorCapitulo.nextLine());
                    capitulos.put(nomeDoCapitulo,
                    new Capitulo(nomeDoCapitulo, texto, personagens.get(nomePersonagem), energia, escaneadorConsole));
                } else if (linha.equals("ESCOLHA")) {
                   String capOrigem = escaneadorCapitulo.nextLine();
                   String texto1 = escaneadorCapitulo.nextLine();
                   String capDestino1 = escaneadorCapitulo.nextLine();
                   String texto2 = escaneadorCapitulo.nextLine();
                   String capDestino2 = escaneadorCapitulo.nextLine();
                   Escolha escolha1 = new Escolha(texto1, capDestino1);
                   Escolha escolha2 = new Escolha(texto2, capDestino2);

                    capitulos.get(capOrigem).addEscolha(escolha1);
                    capitulos.get(capOrigem).addEscolha(escolha2);
                }
                
            }

            escaneadorCapitulo.close();

        } catch (FileNotFoundException exception) {
            exception.printStackTrace();
        }

        return capitulos;
    

      
    }
   
}
