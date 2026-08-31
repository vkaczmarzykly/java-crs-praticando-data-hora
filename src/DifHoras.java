import java.time.Duration;
import java.time.LocalTime;
import java.time.Period;

public class DifHoras {
    public static void main(String[] args) {
        LocalTime horaInicio = LocalTime.parse("14:30:00");
        LocalTime horaFim = LocalTime.parse("16:45:00");

        Duration diferenca = Duration.between(horaInicio, horaFim);

        System.out.println("Diferença de tempo: " + diferenca.toHours() + " horas e " + diferenca.toMinutesPart() + " minutos ");
    }
}
