package observer;

public class FinalizacionEventos extends Event  {
    public FinalizacionEventos(String input, String output) {
        super(input, output);
    }

    @Override
    public String toString() {
        return "FinalizacionEventos{" +
                "input='" + getInput() + '\'' +
                ", output='" + getOutput() + '\'' +
                '}';
    }




}
