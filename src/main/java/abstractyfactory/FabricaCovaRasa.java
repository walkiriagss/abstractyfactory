package abstractyfactory;

public class FabricaCovaRasa implements  FabricaAbstrata{
    @Override
    public Registro createRegistro() {

        return new RegistroCovaRasa();
    }

}
