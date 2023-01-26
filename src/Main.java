import br.com.dio.desafio.dominio.*;

import java.sql.SQLOutput;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();

        curso1.setTitulo("curso java");
        curso1.setDescricao("Descrição curso Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();

        curso2.setTitulo("curso java");
        curso2.setDescricao("Descrição curso Java");
        curso2.setCargaHoraria(8);

        Mentoria mentoria = new Mentoria();

        mentoria.setTitulo("Mentoria de Java");
        mentoria.setDescricao("Descrição mentoria Java");
        mentoria.setData(LocalDate.now());

       /* System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);*/

        BootCamp bootCamp = new BootCamp();
        bootCamp.setNome("Bootcamp Java Developer");
        bootCamp.setDescricao("Descrição Bottcamp Java Developer");
        bootCamp.getNome().add(curso1);
        bootCamp.getNome().add(curso2);
        bootCamp.getNome().add(mentoria);

        Dev devRosangela = new Dev();
        devRosangela.setNome("Rosangela");
        devRosangela.inscreverBootcamp(bootCamp);
        System.out.println("Conteudos Inscritos Rosangela" + devRosangela.getConteudosInscritos());
        devRosangela.progredir();
        devRosangela.progredir();
        System.out.println("-");
        System.out.println("Conteudos Concluidos Rosangela" + devRosangela.getConteudosConcluidos());
        System.out.println("XP: " + devRosangela.calcularTotalXp());


        System.out.println("-------");

        Dev devRebecca = new Dev();
        devRebecca.setNome("Rebecca");
        devRebecca.inscreverBootcamp(bootCamp);
        System.out.println("Conteudos Inscritos Rebecca" + devRebecca.getConteudosInscritos());
        devRebecca.progredir();
        devRebecca.progredir();
        devRebecca.progredir();
        System.out.println("--");
        System.out.println("Conteudos Concluidos Rebecca" + devRebecca.getConteudosConcluidos());
        System.out.println("XP: " + devRebecca.calcularTotalXp());
        System.out.println("-------");

    }


}