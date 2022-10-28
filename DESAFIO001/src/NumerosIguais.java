// IMPORTANTE: Para ler os dados de entrada do usuário, utilize a classe Scanner, 
// instanciando seu leitor da seguinte forma: "Scanner leitor = new Scanner(System.in);". 
// Por outro lado, para imprimir suas saídas, utilize System.out.print ou System.out.println.

import java.util.Scanner;

public class NumerosIguais {

    public static void main(String[] args) {

        try (Scanner scan = new Scanner(System.in)) {
            int num1 = scan.nextInt();
             int num2 = scan.nextInt();

                if(num1==num2){
                    System.out.println("Sao iguais!");
                }else{
                    System.out.println("Nao sao iguais!");
                }
        }

    }
}