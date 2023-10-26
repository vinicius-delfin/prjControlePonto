import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import static java.lang.Thread.sleep;

public class GerenciarControlePonto {
    public static void main(String[] args) throws InterruptedException {
        Scanner sc = new Scanner(System.in);
        List<Funcionario> funcionarios = new ArrayList<>();
        ControlePonto cp = new ControlePonto();
        do {
            System.out.println("1 - Operador");
            System.out.println("2 - Gerente");
            System.out.println("3 - Secretaria");
            System.out.println("4 - Relatório de entradas e saídas");
            System.out.println("9 - Sair");
            System.out.print("Escolha: ");
            int opcao = Integer.parseInt(sc.nextLine());
            switch (opcao) {
                case 1 -> {
                    Operador operador = new Operador();
                    operador.setFuncao("Operador");
                    formulario(operador);
                    System.out.print("Insira o valor hora: ");
                    operador.setValorHora(Double.parseDouble(sc.nextLine()));
                    funcionarios.add(operador);
                    break;
                }
                case 2 -> {
                    Gerente gerente = new Gerente();
                    gerente.setFuncao("Gerente");
                    formulario(gerente);
                    System.out.print("Insira o login: ");
                    gerente.setLogin(sc.nextLine());
                    System.out.print("Insira a senha: ");
                    gerente.setSenha(sc.nextLine());
                    funcionarios.add(gerente);
                }
                case 3 -> {
                    Secretaria secretaria = new Secretaria();
                    secretaria.setFuncao("Secretaria");
                    formulario(secretaria);
                    System.out.print("Insira o telefone: ");
                    secretaria.setTelefone(sc.nextLine());
                    System.out.print("Insira o ramal: ");
                    secretaria.setRamal(sc.nextLine());
                    funcionarios.add(secretaria);
                }
                case 4 -> {
                    for (Funcionario funcionario : funcionarios) {
                        System.out.println(cp.registraEntrada(funcionario));
                        sleep(2000);
                        System.out.println(cp.registraSaida());
                    }
                }
                case 9 -> {
                    System.out.println("Saindo...");
                    sleep(1000);
                    return;
                }
                default -> {
                    System.out.println("Opção inválida! Tente novamente");
                    break;
                }
            }
        } while (true);

    }

    public static void formulario(Funcionario funcionario) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Insira o id do funcionário:");
        funcionario.setIdFunc(Integer.parseInt(sc.nextLine()));
        System.out.print("Insira o nome: ");
        funcionario.setNome(sc.nextLine());
        System.out.print("Insira o email: ");
        funcionario.setEmail(sc.nextLine());
        System.out.print("Insira o documento: ");
        funcionario.setDocumento(sc.nextLine());
        funcionario.setData();
        funcionario.setHora();
    }
}
