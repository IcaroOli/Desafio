package Desafios.d2;

/**
 * Classe para informar se a String senha possui a capacidade minima de caracteres para uma senha segura
 *
 * @author Icaro Moreira
 */
public class ValidadorSenha {

    /**
     * Metodo responsavel de verificar se a senha possui as exigencias minimas para uma senha segura utilizando um laça para permitir
     * o fim da apicação somente se a senha possuir o minimo de 6 characters e caso a senha não possua os characters necessários informa a falta de characters
     */

    public static boolean validarSenha(String senha) {
        int i = 6;
        if (senha == null)
            return false;
        if (senha.length() >= i) {
            System.out.println("Senha Forte");
            return true;
        }
        int falta = i - senha.length();
        System.out.println("Senha fraca");
        System.out.println("A senha deve conter mais: " + falta + " characters para se segura");
        System.out.println("Senha deve conter 6 characters");
        return false;
    }
}
