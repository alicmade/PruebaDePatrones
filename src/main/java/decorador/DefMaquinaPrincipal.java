package decorador;

public class FileInterfazPrincipal implements InterfazPrincipal{
    private InterfazPrincipal interfazPrincipal;

    public FileInterfazPrincipal(InterfazPrincipal interfazPrincipal){
        this.interfazPrincipal = interfazPrincipal;
    }

    @Override
    public void input(String input) {
        interfazPrincipal.input(input);
    }

    @Override
    public String output() {
        return interfazPrincipal.output();
    }

    @Override
    public void ejecutarMaquinaPrincipal() {
        interfazPrincipal.ejecutarMaquinaPrincipal();
    }
}
