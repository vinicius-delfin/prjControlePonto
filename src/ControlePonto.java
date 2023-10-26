import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class ControlePonto {
    public String registraEntrada(Funcionario funcionario) {
        return "Entrada de " + funcionario.getFuncao()+ " " + funcionario.getNome() + "\n" +
                "Data entrada: " + new SimpleDateFormat("EEEE").format(java.sql.Date.valueOf(LocalDate.now())) + ", "
                + LocalDate.now().format(DateTimeFormatter.ofPattern("dd/MM/yyyy")) + "\n"
                + "Horário entrada: " + LocalTime.now().format(DateTimeFormatter.ofPattern("HH:mm:ss")) + "\n";
    }

    public String registraSaida() {
        return "Data saída: " + new SimpleDateFormat("EEEE").format(java.sql.Date.valueOf(LocalDate.now())) + ", "
                + LocalDate.now().format(DateTimeFormatter.ofPattern("dd/MM/yyyy")) + "\n"
                + "Horário saída: " + LocalTime.now().format(DateTimeFormatter.ofPattern("HH:mm:ss")) + "\n"
                + "-------------------------------------------- \n";
    }
}
