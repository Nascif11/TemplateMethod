package Padrao.TemplateMethod;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class FuncionarioTest {

    @Test
    void deveRetornarInfoFuncionarioAdministrativo() {

        FuncionarioAdministrativo funcionario = new FuncionarioAdministrativo();

        funcionario.setCodigo(1);
        funcionario.setNome("Lucas");
        funcionario.setSalario(3000.0f);

        assertEquals(
                "Funcionario{codigo=1, nome='Lucas', bonus=300.0}",
                funcionario.getInfo()
        );
    }

    @Test
    void deveRetornarInfoFuncionarioGerente() {

        FuncionarioGerente funcionario = new FuncionarioGerente();

        funcionario.setCodigo(2);
        funcionario.setNome("Carlos");
        funcionario.setSalario(8000.0f);

        assertEquals(
                "FuncionarioGerente{codigo=2, nome='Carlos', bonus=1600.0}",
                funcionario.getInfo()
        );
    }
}
