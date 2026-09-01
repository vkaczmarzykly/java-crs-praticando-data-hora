import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class CalcDataEntrega {
    public static void main(String[] args) {
        LocalDate dataInicioProjeto = LocalDate.of(2025, 3, 15);
        int prazo = 15;
        LocalDate dataEntrega = dataInicioProjeto.plusDays(prazo);

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        String dataEntregaFormatada = dtf.format(dataEntrega);

        System.out.println("Data de entrega: " + dataEntregaFormatada);
    }
}
