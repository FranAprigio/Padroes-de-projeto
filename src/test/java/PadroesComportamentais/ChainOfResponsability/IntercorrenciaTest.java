package PadroesComportamentais.ChainOfResponsability;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class IntercorrenciaTest {

    FuncionarioEnfermeiro enfermeiro;
    FuncionarioMedicoClinico medicoClinico;
    FuncionarioCirurgiao cirurgiao;

    @BeforeEach
    void setUp() {
        cirurgiao = new FuncionarioCirurgiao(null);
        medicoClinico = new FuncionarioMedicoClinico(cirurgiao);
        enfermeiro = new FuncionarioEnfermeiro(medicoClinico);
    }

    @Test
    void deveRetornarEnfermeiroColetaSangue() {
        assertEquals("Enfermeiro", enfermeiro.tratarIntercorrencia(new Intercorrencia(TipoIntercorrenciaColetaSangue.getTipoIntercorrenciaColetaSangue())));
    }

    @Test
    void deveRetornarMedicoFezAnaminese() {
        assertEquals("Médico clinico", enfermeiro.tratarIntercorrencia(new Intercorrencia(TipoIntercorrenciaAnaminese.getTipoIntercorrenciaAnaminese())));
    }

    @Test
    void deveRetornarCirurgiãoFezCirurgia() {
        assertEquals("Cirurgião", enfermeiro.tratarIntercorrencia(new Intercorrencia(TipoIntercorrenciaCirurgia.getTipoIntercorrenciaCirurgia())));
    }

    @Test
    void deveRetornarSemTratamento() {
        assertEquals("Sem tratamento", enfermeiro.tratarIntercorrencia(new Intercorrencia(TipoIntercorrenciaCancerEstagio4.getTipoIntercorrenciaCancerEstagio4())));
    }

    @Test
    void deveRetornarFuncionarioSuperior() {
        Funcionario funcionarioSuperior = new FuncionarioMedicoClinico(null); // Pode ser qualquer funcionário superior
        Funcionario funcionario = new FuncionarioCirurgiao(funcionarioSuperior);
        Funcionario superiorRetornado = funcionario.getFuncionarioSuperior();
        assertEquals(funcionarioSuperior, superiorRetornado);
    }

    @Test
    void deveSetarTipoDeIntercorrencia() {

        TipoDeIntercorrencia tipoEsperado = TipoIntercorrenciaCirurgia.getTipoIntercorrenciaCirurgia(); // Usando o método estático para obter a instância
        Intercorrencia intercorrencia = new Intercorrencia(null);

        intercorrencia.setTipoDeIntercorrencia(tipoEsperado);
        TipoDeIntercorrencia tipoObtido = intercorrencia.getTipoDeIntercorrencia();

        assertEquals(tipoEsperado, tipoObtido);
    }
}
