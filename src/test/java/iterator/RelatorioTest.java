package iterator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RelatorioTest {

    @Test
    void deveContarAlunosAtivosCurso() {
        Banco banco = new Banco(
                new Agencia("0001-1", true),
                new Agencia("0002-2", false),
                new Agencia("0003-3", true),
                new Agencia("0004-4", true)
        );
        assertEquals(3, Relatorio.contarAgenciasAtivasBanco(banco));
    }
}