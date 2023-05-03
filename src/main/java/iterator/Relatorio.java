package iterator;

public class Relatorio {

    public static Integer contarAgenciasAtivasBanco(Banco banco) {
        int quantidade = 0;
        for (Agencia agencia : banco) {
            if (agencia.isAtiva()) {
                quantidade++;
            }
        }
        return quantidade;
    }
}
