public class Personagem {
    private String nome;
    private String sexo;
    private int energia;
    private boolean vivo = true;

    public Personagem(String nome, String sexo, int energia) {
        this.nome = nome;
        this.sexo = sexo;
        this.energia = energia;
    }
    
    public boolean taVivo() {
        return vivo;
    }

    public String getNome() {
        return nome;
    }

    public String getSexo() {
        return sexo;
    }

    public int getEnergia() {
        return energia;
    }

    public boolean vivo() {
        return vivo;
    }

    public int cansar() {
        energia = (this.energia - 15);
        System.out.println(this.nome + " se cansou e perdeu 15 pontos de energia");
        System.out.println("\nSua energia agora é de " + this.energia + ".\n");
        if (this.energia <= 0) {
            System.out.println(this.nome + " se cansou de mais e morreu");
            this.vivo = false;
        }
        return energia;
    }

    public void morrer() {
        this.vivo = false;
        this.energia = 0;
        System.out.println("\n" + this.nome + " morreu. Sua energia agora é " + this.energia);
    }
}
