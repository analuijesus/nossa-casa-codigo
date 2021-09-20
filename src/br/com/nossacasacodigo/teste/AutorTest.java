package br.com.nossacasacodigo.teste;

import br.com.nossacasacodigo.dao.AutorDao;
import br.com.nossacasacodigo.modelo.Autor;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AutorTest {

    @Test
    public void verificaSeEmailsSaoIguais(){
        Autor a1 = new Autor("Ana", "ana@alura.com", "teste");
        Autor a2 = new Autor("Luiza", "ana@alura.com", "novo teste");
        AutorDao dao = new AutorDao();
        dao.adiciona(a1);
        dao.adiciona(a2);

        Assertions.assertThrows(IllegalArgumentException.class, () -> dao.getListaAutores());

//        try{
//            System.out.println(dao.getListaAutores());
//            Assertions.fail("Problema com a implementação!");
//        }catch (Exception e){
//            Assertions.assertEquals("Autor já cadastrado!", e.getMessage());
//        }
    }
}
