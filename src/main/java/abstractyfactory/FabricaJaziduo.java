package abstractyfactory;

public class FabricaJaziduo implements  FabricaAbstrata{
    @Override
    public Registro createRegistro() {

        return new RegistroJaziduo();
    }

}
