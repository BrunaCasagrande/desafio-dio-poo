package br.com.bruna.desafio;

import br.com.bruna.desafio.dominio.Bootcamp;
import br.com.bruna.desafio.dominio.Curso;
import br.com.bruna.desafio.dominio.Dev;
import br.com.bruna.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("curso Java");
        curso1.setDescricao("descrição curso java");
        curso1.setCargaHoraria(26);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso js");
        curso2.setDescricao("descrição curso js");
        curso2.setCargaHoraria(16);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao("descrição mentoria de java");
        mentoria.setData(LocalDate.now());

      /*  System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
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
