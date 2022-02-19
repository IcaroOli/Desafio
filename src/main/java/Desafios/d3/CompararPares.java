package Desafios.d3;

import java.util.ArrayList;
import java.util.Scanner;

/**Classe responsavel por verificar quantos número de pares de substrings que são anagrama
 * @author Icaro Moreira
 *
 */

public class CompararPares {
    /**Metodo que  converte uma string para um array
     *
     * @param texto anagrama
     * @return um char do texto
     */
    private static char[] converter(String texto) {
        var charc = new char[texto.length()];
        for (int i = 0; i < texto.length(); i++) {
            charc[i] = texto.charAt(i);
        }
        ordemASC(charc);
        return charc;
    }

    private static void ordemASC(char[] tar) {
        for (int i = 0; i < tar.length-1; i++){
            for (int j = 0; j < tar.length-i-1; j++) {
                if ((int) tar[j] > (int) tar[j+1]) {
                    char temp = tar[j];
                    tar[j] = tar[j+1];
                    tar[j+1] = temp;
                }
            }
        }

    }
    /**Metodo responsavel o checar se as substring s&atilde;o anagrmas.Compara-se as substring possui o mesmo tamanho,
     * caso tiverem o mesmo tamanho compara se possui os mesmo caracteres.
     *
     * @param substr1 substring
     * @param substr2 substring
     * @return true caso substr1 e substr2 forem igauis
     */
    public static boolean angrama(String substr1, String substr2) {
        boolean result = true;
        if (substr1.length() != substr2.length()) {
            result = false;
        } else {
            char[] substr1_arr = converter(substr1);
            char[] substr2_arr = converter(substr2);
            for (int i = 0; i < substr1_arr.length; i++) {
                if (substr1_arr[i] != substr2_arr[i]) {
                    result = false;
                    break;
                }
            }
        }
        return result;
    }

    /** Método que extrai todas as substrings possíveis de uma string por dois
     *loops e que conta todos os pares anagramáticos.
     *
     *
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite o anagrama:");
        var texto =input.next();
        int cont = 0;
        ArrayList<String> possivel = new ArrayList<>();
        for(int i = 0; i < texto.length(); i++) {
            for(int j = i+1; j < texto.length() + 1; j++) {
                possivel.add(texto.substring(i,j));
            }
        }
        for(int i = 0; i < possivel.size(); i++) {
            for (int j = i + 1; j < possivel.size(); j++) {
                if (angrama(possivel.get(i), possivel.get(j))) {
                    cont++;
                }
            }
        }
        System.out.println("Esse é o numero de pares encontrado: " + cont);
    }
}