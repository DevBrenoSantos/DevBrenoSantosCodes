package GestãoEscolar;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
public class Student {
    private int id;
    private String name, curso;
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String name, curso;
        int id;
        List<Student> dinamicList = new ArrayList<Student>();
        do {
            System.out.println("Insira o nome do aluno(X para encerrar): ");
            name = teclado.nextLine();
                if (name.equalsIgnoreCase("x")) {
                    System.out.println("Fim do programa");
                    break;
                }
            System.out.println("Insira o ID: ");
            id = teclado.nextInt();
            System.out.println("Insira o curso: ");
            curso = teclado.nextLine();
            dinamicList.add(new Student(id, name, curso));
            teclado.nextLine();
            
        teclado.close();
        } while (true);
        for (Student P: dinamicList) {
            System.out.println("-----------------");
            P.printStudent();
            System.out.println("-----------------");
        }
    }
    public Student (int id, String name, String curso) {
        this.id = id;
        this.name = name;
        this.curso = curso;
    }
    public void printStudent () {
        System.out.println("Nome: "+name);
        System.out.println("ID: "+id);
        System.out.println("Curso: "+curso);
    }
}
