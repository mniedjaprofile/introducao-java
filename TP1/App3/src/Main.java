import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        dadosEntrada();
    }

    public static void dadosEntrada(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o seu nome: ");
        String nome = sc.nextLine();

        Scanner scs = new Scanner(System.in);
        System.out.println("Digite a sua idade: ");
        int idade = scs.nextInt();

        System.out.println("Nome: " +nome +", Idade: " + idade);
    }
}