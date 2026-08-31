import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class DataHoraAtual {
    public static void main(String[] args) {
        String tarefa = "Enviar relatório semanal";

        LocalDate data = LocalDate.now();
        LocalTime hora = LocalTime.now();

        System.out.println("Tarefa: " + tarefa);
        System.out.println("Data de criação: " + data);
        System.out.println("Hora de criação: " + hora);
    }
}
