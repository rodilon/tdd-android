package br.com.alura.leilao.model;

import org.junit.Test;

import static org.junit.Assert.*;

public class LeilaoTest {

    @Test
    public void deve_DevolverDescricao_QuandoRecebeDescricao() {
        //criar cenário
        Leilao console = new Leilao("Console");

        //executar ação esperada
        String descricaoDevolvida = console.getDescricao();

        //executar o teste
        assertEquals("Console", descricaoDevolvida);
    }

    @Test
    public void deve_DevolverMaiorLance_QuandoApenasUmLance() {
        Leilao console = new Leilao("Console");
        console.propoe(new Lance(new Usuario("Alex"), 200.0));

        double maiorLanceDevolvido = console.getMaiorLance();

        assertEquals(200.0, maiorLanceDevolvido, 0.0001);
    }

    @Test
    public void deve_DevolverMaiorLance_QuandoRecebeMaisDeUmLance_EmOrdemCrescente() {
        Leilao computador = new Leilao("Computador");
        computador.propoe(new Lance(new Usuario("Alex"), 200.0));
        computador.propoe(new Lance(new Usuario("Fran"), 300.0));

        double maiorLanceDevolvidoDoComputador = computador.getMaiorLance();

        assertEquals(300.0, maiorLanceDevolvidoDoComputador, 0.0001);
    }

    @Test
    public void deve_DevolverMaiorLance_QuandoRecebeMaisDeUmLance_EmOrdemDecrescente() {
        Leilao casa = new Leilao("Casa");
        casa.propoe(new Lance(new Usuario("Alex"), 11000.0));
        casa.propoe(new Lance(new Usuario("Fran"), 9000.0));

        double maiorLanceDevolvidoDaCasa = casa.getMaiorLance();

        assertEquals(11000.0, maiorLanceDevolvidoDaCasa, 0.0001);
    }
}