package app;
import java.util.ArrayList;
import java.util.List;
import app.Funcionario;

public class Program {

    public static void main(String[] args) {

        List<Funcionario> funcionarios = new ArrayList<>();

        Funcionario func1 = new Funcionario("Antônio", "Gerente", "123.456.789-85", 12000, false, 15);
        funcionarios.add(func1);

        Funcionario func2 = new Funcionario("Michele", "Operador", "123.456.789-85", 3000, true, 3);
        funcionarios.add(func2);

        Funcionario func3 = new Funcionario("Daniel", "Supervisor", "123.456.789-85", 4500, false, 8);
        funcionarios.add(func3);

        Funcionario func4 = new Funcionario("Camila", "Estágiário", "123.456.789-85", 1000, false, 1);
        funcionarios.add(func4);

        Funcionario func5 = new Funcionario("Leopoldo", "Operador", "123.456.789-85", 3000, true, 12);
        funcionarios.add(func5);

        Funcionario func6 = new Funcionario("Maria", "Coordenador", "123.456.789-85", 6000, true, 8);
        funcionarios.add(func6);

        Funcionario func7 = new Funcionario("André", "Diretor", "123.456.789-85", 16000, false, 20);
        funcionarios.add(func7);

        Funcionario func8 = new Funcionario("Ana", "Surpervisor", "123.456.789-85", 4500, true, 6);
        funcionarios.add(func8);

        for(Funcionario func : funcionarios) {
            System.out.println("Informações do Funcionário:");
            System.out.println("Nome: " + func.getNome());
            System.out.println("Cargo: " + func.getCargo());
            System.out.println("CPF: " + func.getCpf());
            System.out.println("Salário Base: " + func.getSalarioBase());
            System.out.println("Anos na Empresa: " + func.getAnosNaEmpresa());
            System.out.println("Adicional Noturno: " + func.isAdicionalNoturno());
            System.out.println("Salário Final: " + func.calcularSalarioFinal());
            System.out.println(" ");
        }
    }
}
