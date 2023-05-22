package decorador;

public class DefMaquinaPrincipal implements MaquinaPrincipal {
    private MaquinaPrincipal interfazPrincipal;

    public DefMaquinaPrincipal(MaquinaPrincipal interfazPrincipal){
        this.interfazPrincipal = interfazPrincipal;
    }

    @Override
    public String input(String input) {
        return interfazPrincipal.input(input);
    }

    @Override
    public String output(String output) {
        return interfazPrincipal.output(output);
    }

    @Override
    public String ejecutarMaquinaPrincipal() {
        return interfazPrincipal.ejecutarMaquinaPrincipal();
    }
}
