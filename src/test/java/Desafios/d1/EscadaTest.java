package Desafios.d1;

import Desafios.d1.Escada;
import org.apache.commons.lang3.StringUtils;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class EscadaTest {
    @Test
 public void testSucesso_validarEscada(){
    int num = 6;
        List<String> degraus = Escada.criarEscada(num);
    int count = 1;

     for (String deg : degraus) {
         int countAsterisk = StringUtils.countMatches(deg,"*");
         int countBlank = StringUtils.countMatches(deg," ");
         int EcountAsterisk = count;
         int EcountBlank = num - count;
         assertEquals(EcountAsterisk,countAsterisk);
         assertEquals(EcountBlank,countBlank);
         count++;
     }
 }
}