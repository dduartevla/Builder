import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BancadaBuilderTest {

    @Test
    void deveRetornarExcecaoBancadaSemNomeDaCultura(){
        try{
            BancadaBuilder bancadaBuilder = new BancadaBuilder();
            Bancada bancada = bancadaBuilder
                    .setMaxUnidadesPlantio(250)
                    .setCapacidadeReservatorio(500)
                    .build();
            fail();
        } catch (IllegalArgumentException e){
            assertEquals("Nome da Cultura inválido!", e.getMessage());
        }
    }

    @Test
    void deveRetornarBancadaValida(){
        BancadaBuilder bancadaBuilder = new BancadaBuilder();
        Bancada bancada = bancadaBuilder
                .setNomeCultura("Alface Crespa")
                .setMaxUnidadesPlantio(250)
                .setCapacidadeReservatorio(500)
                .build();
        assertNotNull(bancada);
    }
}