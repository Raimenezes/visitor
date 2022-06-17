public class Tecnico implements Pessoa {

    private String nome;
    private String formacao;

    public Tecnico(String nome, String formacao) {
        this.nome = nome;
        this.formacao = formacao;
    }

    public String getNome() {
        return nome;
    }

    public String getFormacao() {
        return formacao;
    }

    public String aceitar(Visitor visitor) {
        return visitor.exibirTecnico(this);
    }
}
