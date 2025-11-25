/**
 * <p><strong>Projeto Calculadora</strong></p>
 *
 * <p>Esta classe fornece operações matemáticas básicas como soma, subtração,
 * multiplicação e divisão, além de um método principal que seleciona a operação
 * desejada com base em um operador informado pelo usuário.</p>
 *
 * <p>Esta versão é utilizada para demonstrar:</p>
 * <ul>
 *   <li>Técnicas de revisão estática (caixa branca)</li>
 *   <li>Técnicas de revisão (caixa preta)</li>
 *   <li>Aplicação de refatoração com Javadoc</li>
 *   <li>Documentação com Javadoc</li>
 * </ul>
 *
 * <p>Após a refatoração, os métodos desta classe são <strong>métodos puros</strong>,
 * sem efeitos colaterais, permitindo maior legibilidade e facilitando testes unitários.</p>
 *
 * @author Caio José Soares da Luz
 * @version 1.0
 */
package calculadora;
public class Calculadora {

    /**
     * Soma dois números inteiros.
     *
     * @param a primeiro operando
     * @param b segundo operando
     * @return o resultado da soma de {@code a} e {@code b}
     */
    public int somar(int a, int b) {
        return a + b;
    }

    /**
     * Nesta função temos a subtração de dois números inteiros.
     *
     * @param a minuendo
     * @param b subtraendo
     * @return o resultado da subtração de {@code a} e {@code b}
     */
    public int subtrair(int a, int b) {
        return a - b;
    }

    /**
     * Nesta função temos a multiplicação de dois números inteiros.
     *
     * @param a multiplicando
     * @param b multiplicador
     * @return o resultado da multiplicação de {@code a} e {@code b}
     */
    public int multiplicar(int a, int b) {
        return a * b;
    }

	/**
	 * Nesta função temos a divisão de dois números inteiros.
     *
     * @param a dividendo 
     * @param b divisor
     * @return o resultado da divisão de {@code a} por  {@code b}
     * @throws IllegalArgumentException caso b seja igual a zero
	 */
	public int dividir(int a, int b) {
	    if (b == 0) {
	        throw new IllegalArgumentException("Divisão por zero não é permitida.");
	    }
	    return a / b;
	}
	
	/**
	 * <p>Executa a operação matemática solicitada com base no operador informado.</p>
	 * <p>Operadores aceitos:</p>
	 * <ul>
	 * <li>+ : Soma</li>
	 * <li>- : Subtração</li>
	 * <li>* : Multiplicação</li>
	 * <li>/ : Divisão</li>
	 * </ul>
	 * <p>Qualquer operador inválido resulta em exceção.</p>
	 *
	 * @param a O primeiro operando
	 * @param b O segundo operando
	 * @param operador Símbolo da operação desejada
	 * @return O resultado da operação correspondente ao operador informado
	 * @throws IllegalArgumentException se o operador não for um símbolo válido
	 */
	public int calcular(int a, int b, String operador) {
	    return switch (operador) {
	        case "+" -> somar(a, b);
	        case "-" -> subtrair(a, b);
	        case "*" -> multiplicar(a, b);
	        case "/" -> dividir(a, b);
	        default -> throw new IllegalArgumentException("Operador inválido: " + operador);
	    };
	}
}