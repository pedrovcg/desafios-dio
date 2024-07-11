import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("aprenda java");
        curso1.setCargaHoraria(8);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria java");
        mentoria.setDescricao("auxilio em java");
        mentoria.setData(LocalDate.now());

        /*System.out.println(curso1);
        System.out.println(mentoria);*/

        Bootcamp bootcamp = new Bootcamp ();
        bootcamp.setNome("Bootcamp Java Dev");
        bootcamp.setDescricao("Seja um dev java");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(mentoria);

        Dev devPedro = new Dev();
        devPedro.setNome("Pedro");
        devPedro.increverBootcamp(bootcamp);
        System.out.println("Conteudos inscritos:" + devPedro.getConteudosIncritos());

        devPedro.progredir();

        System.out.println("Conteudos inscritos:" + devPedro.getConteudosIncritos());
        System.out.println("Conteudos concluídos:" + devPedro.getConteudoConcluidos());

        System.out.println("XP:" + devPedro.calcularTotalXp());

        System.out.println("---------------------------");

        Dev devRoger = new Dev();
        devRoger.setNome("Roger");
        devRoger.increverBootcamp(bootcamp);
        System.out.println("Conteudos inscritos:" + devRoger.getConteudosIncritos());
        System.out.println("Conteudos concluídos:" + devRoger.getConteudoConcluidos());

        System.out.println("XP:" + devRoger.calcularTotalXp());
        
    }

}
