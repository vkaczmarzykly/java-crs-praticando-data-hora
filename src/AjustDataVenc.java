import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class AjustDataVenc {
    public static void main(String[] args) {
        LocalDate dataVencimento = LocalDate.of(2025, 3, 20);
        int qtdeMeses = 1;
        LocalDate dataAdiamentamento = dataVencimento.plusMonths(qtdeMeses);

        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        String novaDataVencimento = fmt.format(dataAdiamentamento);

        System.out.println("Nova data de vencimento: " + novaDataVencimento);

    }
}
