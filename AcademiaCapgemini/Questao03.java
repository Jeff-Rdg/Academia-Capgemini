
package AcademiaCapgemini;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;



/**
 *
 * @author jefferson
 */
//Duas palavras podem ser consideradas anagramas de si mesmas se as letras de 
//uma palavra podem ser realocadas para formar a outra palavra. Dada uma string 
//qualquer, desenvolva um algoritmo que encontre o número de pares de substrings 
//que são anagramas.


public class Questao03 {

    
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Informe uma Palavra: ");
        String testeAnagrama = ler.nextLine();
        ler.close();
        
        //String testeAnagrama = "ifailuhkqq";
        //dividir a string em substrings
        List<String> subStrings = new ArrayList<>();
        
        for(int i = 1;i < testeAnagrama.length(); i++){
            for(int j = 0;j < testeAnagrama.length() - i + 1; j++){
                String palavra = testeAnagrama.substring(j, j + i);
                subStrings.add(palavra);
            }
        }
        
        //System.out.println(subStrings);
        
        //Substrings separadas, hora de ordenar
        List<String> listaOrdenada = new ArrayList<>();
        for(String palavrasOrdenadas : subStrings){
            //converter a string em array de char
            char[] stringParaChar = palavrasOrdenadas.toCharArray();
            
            //ordenar array
            Arrays.sort(stringParaChar);
            listaOrdenada.add(new String(stringParaChar));
            //System.out.println(listaOrdenada);
        }
        //System.out.println("Lista de palavras ordenadas: ");
        //System.out.println(listaOrdenada);

        
        //hora de comparar os itens dos arrays
        int quant = 0;
        //System.out.println("Anagramas da palavra: ");
        for(int i = 0; i < listaOrdenada.size();i++){
            for(int j = i + 1;j < listaOrdenada.size();j++){
                if(listaOrdenada.get(i).equals(listaOrdenada.get(j))){
                    //System.out.println("[" + listaOrdenada.get(i) +"," + listaOrdenada.get(j) + "]");
                    quant++;
                }
            }
        }
        System.out.println("Quantidade de anagramas: ");
        System.out.println(quant);
    }
    }


