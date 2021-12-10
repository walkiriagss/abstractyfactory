package abstractyfactory;

public class Sepultamento {
    private Registro registro;

    public Sepultamento(FabricaAbstrata fabrica) {
        this.registro = fabrica.createRegistro();

    }

    public String emitirRegistro() {
        return this.registro.emitir();
    }
}
