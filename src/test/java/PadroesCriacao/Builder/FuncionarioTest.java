package PadroesCriacao.Builder;

import org.junit.Test;

import static org.junit.Assert.*;

public class FuncionarioTest {

    @Test
    public void deveRetornarFuncionarioValido() {

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
    public void deveRetornarExcecaoParaFuncionarioSemCodigo() {
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
    public void deveRetornarExcecaoParaFuncionarioSemNome() {
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
    public void deveRetornarExcecaoParaFuncionarioSemCPF() {
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
    public void deveRetornarExcecaoParaFuncionarioSemSalario() {
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
    public void deveRetornarExcecaoParaFuncionarioSemEmail() {
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
