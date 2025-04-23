//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int op1 = 5, op2 = 10;
        double result;

        result = op1 + op2;
        System.out.println("Resultado da soma: " + result);

        //conversão implicita
        result = op1 - op2;
        System.out.println("Resultado da subtração: " + result);

        result = op1 * op2;
        System.out.println("Resultado da multiplicação: " + result);

        //conversão explicita
        result = (double) op1 / op2; //casting mudando o tipo de dado
        System.out.println("Resultado: " + result);

        result = op1 % op2;
        System.out.println("Resto da divisão: " + result);

        result = Math.pow(2,10);
        System.out.println("Resto da potenciação: " + result);

        boolean result1;
        result1 = op1 > op2;
        System.out.println("Maior : " + result1);

        result1 = op1 < op2;
        System.out.println("Menor : " + result1);

        result1 = op1 >= op2;
        System.out.println("Maior ou igual : " + result1);

        result1 = op1 <= op2;
        System.out.println("Menor ou igual : " + result1);

        result1 = op1 == op2;
        System.out.println("Igual a : " + result1);

        result1 = op1 != op2;
        System.out.println("Diferente de : " + result1);
    }
}