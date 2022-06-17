public class PessoaVisitor implements Visitor{

    public String exibir(Pessoa pessoa) {
        return pessoa.aceitar(this);
    }

    @Override
    public String exibirJogador(Jogador jogador) {
        return "Jogador{" +
               " nome ='" + jogador.getNome() + '\'' +
               ", time=" + jogador.getNomeTime() +
               '}';
    }

    @Override
    public String exibirTecnico(Tecnico tecnico) {
        return "Tecnico{" +
                " nome ='" + tecnico.getNome() + '\'' +
                ", formacao=" + tecnico.getFormacao() +
                '}';
    }

    @Override
    public String exibirFuncionario(Funcionario funcionario) {
        return "Funcionario{" +
                "codigo=" + funcionario.getCodigo() +
                ", nome='" + funcionario.getNome() + '\'' +
                ", salario=" + funcionario.getSalario() +
                '}';
    }


}
