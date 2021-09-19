package br.com.nossacasacodigo.teste;

import br.com.nossacasacodigo.dao.AutorDao;
import br.com.nossacasacodigo.modelo.Autor;

public class TestaEmail {
    public static void main(String[] args) {

        Autor a1 = new Autor("Ana", "ana", "em breve dev");

        AutorDao dao = new AutorDao();
        dao.adiciona(a1);

        System.out.println(dao.getListaAutores());
    }
}
