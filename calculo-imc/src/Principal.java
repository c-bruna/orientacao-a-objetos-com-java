import org.coursera.imc.Paciente;

public class Principal {
    public static void main(String[] args) {
        Paciente paciente = new Paciente(14,1.60);
        Paciente paciente1 = new Paciente(60,1.70);
        Paciente paciente2 = new Paciente(200, 1.55);

        double imc = paciente.calcularIMC();
        double imc1 = paciente1.calcularIMC();
        double imc2 = paciente2.calcularIMC();

        System.out.println(paciente.diagnostico(imc)); // baixo peso muito grave
        System.out.println(paciente1.diagnostico(imc1)); // peso normal
        System.out.println(paciente2.diagnostico(imc2)); // obesidade grau III


    }
}
