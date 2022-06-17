public class Jogador implements Pessoa {

    private String nome;
    private Time time;

    public Jogador(String nome, Time time) {
        this.nome = nome;
        this.time = time;
    }

    public String getNome() {
        return nome;
    }

    public String getNomeTime() {
        return this.time.getNome();
    }

    public String aceitar(Visitor visitor) {
        return visitor.exibirJogador(this);
    }
}
