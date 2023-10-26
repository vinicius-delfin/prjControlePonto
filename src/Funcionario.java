import java.time.LocalDate;
import java.time.LocalTime;
public class Funcionario {
    private int idFunc;
    private String nome;
    private String email;
    private String documento;
    private LocalTime hora;
    private LocalDate data;
    private String funcao;

    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }

    public LocalTime getHora() {
        return hora;
    }

    public void setHora() {
        this.hora = LocalTime.now();

    }

    public LocalDate getData() {
        return data;
    }

    public void setData() {
        this.data = LocalDate.now();
    }
    public int getIdFunc() {
        return idFunc;
    }

    public void setIdFunc(int idFunc) {
        this.idFunc = idFunc;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

//    public Funcionario(int id, String nome, String email, String documento) {
//        this.idFunc = id;
//        this.nome = nome;
//        this.email = email;
//        this.documento = documento;
//    }
}