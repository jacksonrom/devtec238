// Em um pacote chamado "controller"
public class Negocio {
    public String mediaAluno(double nota1, double nota2, double nota3, double nota4) {
        double media = (nota1 + nota2 + nota3 + nota4) / 4;
        if (media >= 7.0) {
            return "Aprovado";
        } else {
            return "Reprovado";
        }
    }
}

// Na classe principal
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite as 4 notas:");
        double nota1 = scanner.nextDouble();
        double nota2 = scanner.nextDouble();
        double nota3 = scanner.nextDouble();
        double nota4 = scanner.nextDouble();
        
        Negocio negocio = new Negocio();
        String resultado = negocio.mediaAluno(nota1, nota2, nota3, nota4);
        
        System.out.println("Resultado: " + resultado);
    }
}
