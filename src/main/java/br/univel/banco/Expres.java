package br.univel.banco;

/**
 * As variáveis chamadas de IS_NUMERIC e IS_DATE são expressões regulares,
 * que tem como função a validação dos campos inseridos, caso seja numérico ou data.
 * @author Cecilia Vanin
 *
 */

public class Expres {
	public static final String IS_NUMERIC = "-?\\d+(\\.\\d+)?";
	
	public static final String IS_DATE = "^(0[1-9]|[12][0-9]|3[01])/(0[1-9]|1[012])/[12][0-9]{3}$";
		   
}
