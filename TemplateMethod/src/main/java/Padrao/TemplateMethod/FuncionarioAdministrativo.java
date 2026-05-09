package Padrao.TemplateMethod;

public class FuncionarioAdministrativo extends Funcionario {

    @Override
    public float calcularBonus() {
        return getSalario() * 0.10f;
    }
}