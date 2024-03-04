package app;

public class Funcionario {
    private String nome;
    private String cargo;
    private String cpf;
    private double salarioBase;
    private boolean adicionalNoturno;
    private int anosNaEmpresa;
    //A cada ano completo de serviço o funcionário recebe um aumento de 1,5% acumulativo
    //O método abaixo é baseado nessa regra de negócio.
    public double calcularAdicionalTempoServico(){
        return salarioBase * (anosNaEmpresa * 0.015 + 1);
    }
    //O salário final é calculado baseado no salário base, adicional por tempo de serviço e
    //e adicional noturno (caso faça jus).
    //O método abaixo é baseado nessa regra de negócio.
    public double calcularSalarioFinal(){
        return adicionalNoturno ? calcularAdicionalTempoServico() * 1.25 : calcularAdicionalTempoServico();
    }

    public Funcionario(String nome, String cargo, String cpf, double salarioBase, boolean adicionalNoturno, int anosNaEmpresa){
        this.nome = nome;
        this.cargo = cargo;
        this.cpf = cpf;
        this.salarioBase = salarioBase;
        this.adicionalNoturno = adicionalNoturno;
        this.anosNaEmpresa = anosNaEmpresa;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public boolean isAdicionalNoturno() {
        return adicionalNoturno;
    }

    public void setAdicionalNoturno(boolean adicionalNoturno) {
        this.adicionalNoturno = adicionalNoturno;
    }

    public int getAnosNaEmpresa(){
        return anosNaEmpresa;
    }

    public void setAnosNaEmpresa(int anosNaEmpresa){
        this.anosNaEmpresa = anosNaEmpresa;
    }



}