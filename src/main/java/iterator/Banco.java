package iterator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Banco implements Iterable<Agencia>{

    private List<Agencia> agencias = new ArrayList<Agencia>();

    public Banco(Agencia... agencias) {
        this.agencias = Arrays.asList(agencias);
    }

    @Override
    public Iterator<Agencia> iterator() {
        return agencias.iterator();
    }

}

