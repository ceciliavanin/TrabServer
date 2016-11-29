package br.univel.banco.anotacoes;

/**
 * Annotation referente a COLUNA a ser gravada no banco, e as propriedades para a cria��o.
 */

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface Coluna {
	
	String nome() default "";
	
	int tamanho() default 10;
	
	boolean pk() default false;

	
}