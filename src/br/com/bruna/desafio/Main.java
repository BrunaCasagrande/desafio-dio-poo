package br.com.bruna.desafio;

import br.com.bruna.desafio.dominio.Bootcamp;
import br.com.bruna.desafio.dominio.Curso;
import br.com.bruna.desafio.dominio.Dev;
import br.com.bruna.desafio.dominio.Mentoria;
import br.com.bruna.desafio.util.Constantes;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Curso cursoJava =new Curso(26,
                    Constantes.TITULO_CURSO_JAVA,
                    Constantes.DESCRICAO_CURSO_JAVA);

        Curso cursoJs = new Curso(16,
                    Constantes.TITULO_CURSO_JS,
                    Constantes.DESCRICAO_CURSO_JS);


        Mentoria mentoria = new Mentoria(
                Constantes.TITULO_MENTORIA,
                Constantes.DESCRICAO_MENTORIA);


        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(cursoJava);
        bootcamp.getConteudos().add(cursoJs);
        bootcamp.getConteudos().add(mentoria);

        Dev devBruna = new Dev();
        devBruna.setNome("Bruna");
        devBruna.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Bruna: " + devBruna.getConteudosIncritos());

        devBruna.progredir();
        System.out.println("-");

        System.out.println("Conteúdos Inscritos Bruna: " + devBruna.getConteudosIncritos());
        System.out.println("Conteúdos Concluídos Bruna: " + devBruna.getConteudosConcluidos());
        System.out.println("XP: " + devBruna.calcularTotalXp());

        System.out.println("*-*-*-*-*-*-*-*-*");

        Dev devAgatha = new Dev();
        devAgatha.setNome("Agatha");
        devAgatha.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Agatha: " + devAgatha.getConteudosIncritos());

        devAgatha.progredir();
        devAgatha.progredir();
        System.out.println("-");

        System.out.println("Conteúdos Inscritos Agatha: " + devAgatha.getConteudosIncritos());
        System.out.println("Conteúdos Concluídos Agatha: " + devAgatha.getConteudosConcluidos());
        System.out.println("XP: " + devAgatha.calcularTotalXp());

    }
}
