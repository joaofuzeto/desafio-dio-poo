import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Curso curso1 = new Curso();
        curso1.setTitulo("curso Java");
        curso1.setDescricao("descrição curso Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso JavaScript");
        curso2.setDescricao("descrição curso JavaScript");
        curso2.setCargaHoraria(4);

        /*System.out.println(curso1);
        System.out.println(curso2);*/

        Mentoria mentoria1 = new Mentoria();
        Mentoria mentoria2 = new Mentoria();

        mentoria1.setTitulo("Mentoria Java");
        mentoria1.setDescricao("Descrição mentoria Java");
        mentoria1.setData(LocalDate.now());

        /*System.out.println(mentoria1);*/

        Bootcamp bootcamp1 = new Bootcamp();
        bootcamp1.setNome("Bootcamp Java Developer");
        bootcamp1.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp1.getConteudos().add(curso1);
        bootcamp1.getConteudos().add(curso2);
        bootcamp1.getConteudos().add(mentoria1);

        Dev developer1 = new Dev();
        developer1.setNome("João");
        developer1.inscreverBootcamp(bootcamp1);
        System.out.println("Conteúdos inscritos João: " + developer1.getConteudosInscritos());
        developer1.progredir();
        System.out.println("---------");

        System.out.println("Conteúdos inscritos João: " + developer1.getConteudosInscritos());
        System.out.println("Conteúdos concluídos João: " + developer1.getConteudosConcluidos());
        System.out.println("---------");

        Dev developer2 = new Dev();
        developer2.setNome("Monique");
        developer2.inscreverBootcamp(bootcamp1);
        System.out.println("Conteúdos inscritos Monique: " + developer2.getConteudosInscritos());

        System.out.println("---------");
        System.out.println("Conteúdos concluídos Monique: " + developer2.getConteudosConcluidos());

    }
}
