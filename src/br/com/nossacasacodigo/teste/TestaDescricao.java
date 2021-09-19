package br.com.nossacasacodigo.teste;

import br.com.nossacasacodigo.dao.AutorDao;
import br.com.nossacasacodigo.modelo.Autor;

public class TestaDescricao {
    public static void main(String[] args) {

        //Autor a1 = new Autor("Ana", "ana@alura.com", "");
        Autor a2 = new Autor("Ana", "luiza@alura.com", "lorem ipsum dolor sit amet consectetur adipiscing elit sagittis velit torquent class ornare" +
                " lobortis litora a duis lectus congue porttitor cubilia turpis inceptos lacinia ex suspendisse maximus tortor enim consequat feugiat pharetra penatibus " +
                "curae tristique ligula eleifend at auctor tempus lorem ipsum dolor sit amet consectetur adipiscing elit sagittis velit torquent ornare lobortis litora a litora a duis");

        AutorDao dao = new AutorDao();
        //dao.adiciona(a1);
        dao.adiciona(a2);

        System.out.println(dao.getListaAutores());
    }
}
