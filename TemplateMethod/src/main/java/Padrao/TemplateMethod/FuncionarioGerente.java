package Padrao.TemplateMethod;

public class FuncionarioGerente extends Funcionario {

    @Override
    public float calcularBonus() {
        return getSalario() * 0.20f;
    }

    @Override
    public String getTipo() {
        return "FuncionarioGerente";
    }
}