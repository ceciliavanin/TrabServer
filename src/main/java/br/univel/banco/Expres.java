package br.univel.banco;

/**
 * As vari�veis chamadas de IS_NUMERIC e IS_DATE s�o express�es regulares,
 * que tem como fun��o a valida��o dos campos inseridos, caso seja num�rico ou data.
 * @author Cecilia Vanin
 *
 */

public class Expres {
	public static final String IS_NUMERIC = "-?\\d+(\\.\\d+)?";
	
	public static final String IS_DATE = "^(0[1-9]|[12][0-9]|3[01])/(0[1-9]|1[012])/[12][0-9]{3}$";
		   
}
