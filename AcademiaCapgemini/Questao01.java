
package AcademiaCapgemini;

import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;

/**
 *
 * @author jefferson
 */
/*Escreva um algoritmo que mostre na tela uma escada de tamanho n utilizando o caractere * e espacos.
A base e altura da escada devem ser iguais ao valor de n.
A ultima linha nao deve conter nenhum espaco.
*/
public class Questao01 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        List<String> degraus = new ArrayList<>();
        
        System.out.println("Digite a quantidade de Degraus: ");
        int quantDegraus = ler.nextInt();
        ler.close();
        
        for (int i = 0; i < quantDegraus; i++) {
            /*adiciona os itens" " e "*" à lista "degraus" de acordo com as quantidades 
            percorridas pelo for*/
            degraus.add(" ".repeat(quantDegraus - i) + "*".repeat(i + 1));
        }
        //percorre a lista e imprime seus itens
        for(String degrau: degraus){
            System.out.println(degrau);
        }
        
    }
}