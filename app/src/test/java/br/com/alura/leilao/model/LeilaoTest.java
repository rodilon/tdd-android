package br.com.alura.leilao.model;

import org.junit.Test;

import static org.junit.Assert.*;

public class LeilaoTest {

    @Test
    public void getDescricao() {
        //criar cenário
        Leilao console = new Leilao("Console");

        //executar ação esperada
        String descricaoDevolvida = console.getDescricao();

        //executar o teste
        assertEquals("Console", descricaoDevolvida);
    }

    @Test
    public void getMaiorLance(){
        Leilao console = new Leilao("Console");
        console.propoe(new Lance(new Usuario("Alex"), 200.0));

        double maiorLanceDevolvido = console.getMaiorLance();

        assertEquals(200.0, maiorLanceDevolvido, 0.0001);
    }
}