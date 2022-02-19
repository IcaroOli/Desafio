package Desafios.d1;

import org.junit.jupiter.api.Test;

import static Desafios.d2.ValidadorSenha.*;
import static org.junit.jupiter.api.Assertions.*;

public class ValidarSenhaTest {
    @Test
    public void testSucesso_validaSenhaCorreta() {
        var senha = "1cy6@1";
        assertTrue(validarSenha(senha));
    }
    @Test
    public void testFail_validaSenhaIncorreta() {
        var senha = "1cy";
        assertFalse(validarSenha(senha));
    }
    @Test
    public void testNull_validaSenhaNull() {
        assertFalse(validarSenha(null));
    }

}