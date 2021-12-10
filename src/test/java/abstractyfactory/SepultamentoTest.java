package abstractyfactory;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SepultamentoTest {


    @Test
    void deveEmitirRegistroJaziduo() {
        FabricaAbstrata fabrica = new FabricaJaziduo();
        Sepultamento sepultamento = new Sepultamento(fabrica);
        assertEquals("Registro de sepultura em Jaziduo", sepultamento.emitirRegistro());
    }

    @Test
    void deveEmitirRegistroCovaRasa() {
        FabricaAbstrata fabrica = new FabricaCovaRasa();
        Sepultamento sepultamento = new Sepultamento(fabrica);
        assertEquals("Registro de sepultura em Cova Rasa", sepultamento.emitirRegistro());
    }

}