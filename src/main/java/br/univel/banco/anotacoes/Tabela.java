package br.univel.banco.anotacoes;

/**
 * Annotation referente a TABELA a ser gravada no banco, e as propriedades para a criação.
 */

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
	@Target(ElementType.TYPE)
	public @interface Tabela {

		String value() default "";

	}
	

