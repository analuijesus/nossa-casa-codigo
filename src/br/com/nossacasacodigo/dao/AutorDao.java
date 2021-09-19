package br.com.nossacasacodigo.dao;

import br.com.nossacasacodigo.modelo.Autor;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class AutorDao {

    private List<Autor> autores = new ArrayList<>();

    public void adiciona(Autor autor){
        autores.add(autor);
        //System.out.println("Autor " + autor + " adicionado com sucesso!");
    }

    public List<Autor> getListaAutores(){
        return Collections.unmodifiableList(autores);
    }
}
