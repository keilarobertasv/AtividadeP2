public class Escolha {
    private String texto;
    private String proximo;

    public Escolha(String texto, String proximo) {
        this.texto = texto;
        this.proximo = proximo;
    }

    public String getTexto() {
        return texto;
    }

    public String getProximo() {
        return proximo;
    }
}