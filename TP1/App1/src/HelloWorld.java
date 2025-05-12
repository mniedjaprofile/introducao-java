import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class HelloWorld {
    public static void main(String[] args) {


        LocalDate dataAtual = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String dataHoje = dataAtual.format(formatter);

        System.out.println("============================================!");
        System.out.println("============== Hello, World! ===============");
        System.out.println("============================================!");
        System.out.println("Olá meu nome é Mayara!");
        System.out.println("Estou fazendo meu TP1 de JAVA hoje: " +dataHoje);
    }
}
