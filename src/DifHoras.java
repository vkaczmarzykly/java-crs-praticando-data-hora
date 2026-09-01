import java.time.Duration;
import java.time.LocalTime;

public class DifHoras {
    public static void main(String[] args) {
        LocalTime horaInicio = LocalTime.of(14, 30, 0);
        LocalTime horaFim = LocalTime.of(16, 45, 0);

        Duration diferenca = Duration.between(horaInicio, horaFim);

        System.out.println("Diferença de tempo: " + diferenca.toHours() + " horas e " + diferenca.toMinutesPart() + " minutos ");
    }
}
