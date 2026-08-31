import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DataHoraFormatada {
    public static void main(String[] args) {
        LocalDate data = LocalDate.now();
        LocalTime hora = LocalTime.now();

        DateTimeFormatter formatterData = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        DateTimeFormatter formatterHora = DateTimeFormatter.ofPattern("HH:mm");

        System.out.println("Data formatada: " + data.format(formatterData));
        System.out.println("Hora formatada: " + hora.format(formatterHora));
    }
}
