import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PessoaVisitorTest {

    @Test
    public void deveExibirJogador() {
        Jogador jogador = new Jogador("Arthur", new Time("Clube de regatas Travessos"));

        PessoaVisitor visitor = new PessoaVisitor();
        assertEquals("Jogador{ nome ='Arthur', time=Clube de regatas Travessos}", visitor.exibir(jogador));
    }

    @Test
    public void deveExibirTecnico() {
        Tecnico tecnico = new Tecnico("PEP", "Escola para tecnicos de Harvard");

        PessoaVisitor visitor = new PessoaVisitor();
        assertEquals("Tecnico{ nome ='PEP', formacao=Escola para tecnicos de Harvard}", visitor.exibir(tecnico));
    }

    @Test
    public void deveExibirFuncionario() {
        Funcionario funcionario = new Funcionario(1, "Pedro", 3200.0f);

        PessoaVisitor visitor = new PessoaVisitor();
        assertEquals("Funcionario{codigo=1, nome='Pedro', salario=3200.0}", visitor.exibir(funcionario));
    }
}
