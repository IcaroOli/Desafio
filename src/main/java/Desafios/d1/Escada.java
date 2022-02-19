package Desafios.d1;

import java.util.ArrayList;
import java.util.List;
/** Classe que imprime um degrau de caractere "*" e espaço na tela
 * @author Icaro Moreira
 */
public class Escada {

    /**
     * Metodo responsavel por imprimir e criar a escada com os caractere "*" e espa&ccedil;o utilizando um  loop para definir o tamanho
     * e adicionado os espaços e os * dependendo do tamnaho da escada e utilizando um outro laço para formatar como aparece na tela
     */

    public static List<String> criarEscada(int num) {

        int n = 6;
        List<String> degraus = new ArrayList<>();

        // Loop para criar a cadeia de degrais
        for (int i = 0; i < n; i++) {
            degraus.add(" ".repeat(n - i - 1) + "*".repeat(i + 1));
        }

        return degraus;
    }
    public static void imprimeEscada(List<String> degraus){
        for (String deg : degraus) {
            System.out.println(deg);
        }

    }
    public static void mostarEscada(int num){
        List<String> escada = criarEscada(num);
        imprimeEscada(escada);
    }
}