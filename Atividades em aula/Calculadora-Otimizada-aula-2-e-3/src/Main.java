import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double op1 = escolherOperacao("Entre com op1 ");
        double op2 = escolherOperacao("Entre com op2 ");
        int menu = menu();
        calcular(menu, op1, op2);
    }

    public static int menu() {
        System.out.println("===== Menu calculadora =====");
        System.out.println("[1] Somar");
        System.out.println("[2] Subtrair");
        System.out.println("[3] Multiplicar");
        System.out.println("[4] Dividir");
        int operacao = entrarOperacao();
        return operacao;
    }

    public static void somar(double op1, double op2){
       double result = op1 + op2;
       System.out.println("SOMA: " +result);
    }

    public static void subtrair(double op1, double op2) {
        double result = op1 - op2;
        System.out.println("SUBTRAÇÃO: " + result);
    }

    public static void multiplicar(double op1, double op2){
        double result = op1 * op2;
        System.out.println("MULTIPLICAÇÂO: " +result);
    }

    public static void dividir(double op1, double op2){
        double result = op1 / op2;
        System.out.println("DIVISÃO: " +result);
    }

    public static void calcular(int operacao, double op1, double op2){

        switch(operacao){
            case 1: somar(op1, op2);break;
            case 2: subtrair(op1, op2);break;
            case 3: multiplicar(op1, op2);break;
            case 4 : dividir(op1, op2);break;
            default:
                System.out.println("Erro ao escolher a operação!!");
        }
    }

    public static double escolherOperacao(String msg){
        Scanner entrada = new Scanner(System.in); //nao passar scanner como parametro global

        System.out.print(msg);
        double op = entrada.nextDouble();
        return op;
    }

    public static int entrarOperacao(){
        Scanner entrada = new Scanner(System.in);

        System.out.print("Entre com a operação : ");
        int operacao = entrada.nextInt();
        return operacao;
    }
}