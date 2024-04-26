package PadroesCriacao.Builder;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class FuncionarioTest {

    @Test
    void deveRetornarFuncionarioValido() {

        FuncionarioBuilder funcionarioBuilder = new FuncionarioBuilder();
        Funcionario funcionario = funcionarioBuilder
                .setCodigoFuncionario(1)
                .setNomeCompleto("Matheus Roberto")
                .setCPF("805.839.350-95")
                .setSalario(5000.50F)
                .setEmail("robertinho@gmail.com")
                .build();
        assertNotNull(funcionario);
    }

    @Test
    void deveRetornarExcecaoParaFuncionarioSemCodigo() {
        try {
            FuncionarioBuilder funcionarioBuilder = new FuncionarioBuilder();
            Funcionario funcionario = funcionarioBuilder
                    .setNomeCompleto("Matheus Roberto")
                    .setCPF("805.839.350-95")
                    .setSalario(5000.50F)
                    .setEmail("robertinho@gmail.com")
                    .build();
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Codigo inválido", e.getMessage());
        }
    }

    @Test
    void deveRetornarExcecaoParaFuncionarioSemNome() {
        try {
            FuncionarioBuilder funcionarioBuilder = new FuncionarioBuilder();
            Funcionario funcionario = funcionarioBuilder
                    .setCodigoFuncionario(1)
                    .setCPF("805.839.350-95")
                    .setSalario(5000.50F)
                    .setEmail("robertinho@gmail.com")
                    .build();
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Nome inválido", e.getMessage());
        }
    }

    @Test
    void deveRetornarExcecaoParaFuncionarioSemCPF() {
        try {
            FuncionarioBuilder funcionarioBuilder = new FuncionarioBuilder();
            Funcionario funcionario = funcionarioBuilder
                    .setCodigoFuncionario(1)
                    .setNomeCompleto("Matheus Roberto")
                    .setSalario(5000.50F)
                    .setEmail("robertinho@gmail.com")
                    .build();
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("CPF inválido", e.getMessage());
        }
    }

    @Test
    void deveRetornarExcecaoParaFuncionarioSemSalario() {
        try {
            FuncionarioBuilder funcionarioBuilder = new FuncionarioBuilder();
            Funcionario funcionario = funcionarioBuilder
                    .setCodigoFuncionario(1)
                    .setCPF("805.839.350-95")
                    .setNomeCompleto("Matheus Roberto")
                    .setEmail("robertinho@gmail.com")
                    .build();
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Salario inválido", e.getMessage());
        }
    }

    @Test
    void deveRetornarExcecaoParaFuncionarioSemEmail() {
        try {
            FuncionarioBuilder funcionarioBuilder = new FuncionarioBuilder();
            Funcionario funcionario = funcionarioBuilder
                    .setCodigoFuncionario(1)
                    .setCPF("805.839.350-95")
                    .setNomeCompleto("Matheus Roberto")
                    .setSalario(5000.50F)
                    .build();
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Email inválido", e.getMessage());
        }
    }
}
