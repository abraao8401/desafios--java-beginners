// IMPORTANTE: Para ler os dados de entrada do usuário, utilize a classe Scanner, 
// instanciando seu leitor da seguinte forma: "Scanner leitor = new Scanner(System.in);". 
// Por outro lado, para imprimir suas saídas, utilize System.out.print ou System.out.println. 

import java.util.Scanner;

public class BuscaSequencial {

    public static void main(String[] args) {

        try (Scanner leitor = new Scanner(System.in)) {
          int[] elementos = {64, 137, -16, 43, 67, 81, -90, 212, 10, 75}; 
          int x = leitor.nextInt();
          int i;
          int posicao= -1;
    
          
          for(i=0; i<elementos.length; i++){
              if(elementos[i]==x){
                posicao = i;
              }
          }
          if(posicao== -1){
            System.out.println("Numero "+ x + " nao encontrado!");
          }else{
            System.out.println("Achei "+ x + " na posicao " + posicao);
          }
        }       
      

    }
}