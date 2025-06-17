package javacore.Gassociacao.Seminario;

public class GerenciadorSeminario {
    public static void main(String[] args) {

        Local local = new Local("Rua das Laranjeiras");
        Aluno aluno = new Aluno("Luffy", 17);
        Professor professor = new Professor("Barba Branca", "Pirata");
        Aluno[] alunosParaSeminario = {aluno};
        Seminario seminario = new Seminario("Onde achar one piece?", alunosParaSeminario, local);

        Seminario[] seminariosDisponiveis = {seminario};

        professor.setSeminarios(seminariosDisponiveis);


         professor.imprime();
    }
}
