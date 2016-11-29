package br.univel.banco;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

import br.univel.banco.anotacoes.Coluna;
import br.univel.banco.anotacoes.Tabela;
import br.univel.dto.Profissional;
/**
 * Nesta classe temos as implementações referentes do PROFISSIONAL ao banco - INSERT/SELECT
 * @author Cecilia Vanin
 *
 */
public class ProfiDAO {public Collection<Profissional> pesquisar(final String query) {
	final String sql = "select * from profissional where idprofi = ? or nome like ? or data de nascimento = ? or cpf like ? or rg like?";
	Connection connection = null;
	PreparedStatement stmt = null;
	ResultSet result = null;
	try {
		stmt.setString(2, query);
		stmt.setString(4, query);
		stmt.setString(5, query);
		if (query.matches(Expres.IS_NUMERIC)) {
			final Long numericQuery = Long.valueOf(query);
			stmt.setLong(1, numericQuery);
		} else {
			stmt.setLong(1, 0L);
		}
		if (query.matches(Expres.IS_DATE)) {
			final Date dateQuery = Date.valueOf(query);
			stmt.setDate(3, dateQuery);
		} else {
			stmt.setDate(3, null);
		}

		result = stmt.executeQuery();
		final Collection<Profissional> profi = convert(result);
		return Collections.unmodifiableCollection(profi);
	} catch (final SQLException e) {
		throw new RuntimeException("Erro ao executar consulta na base de dados", e);
	} finally {

		try {

			if (result != null) {
				result.close();
			}
			if (stmt != null) {
				stmt.close();
			}
			if (connection != null) {
				connection.close();
			}
		} catch (final SQLException e) {
			throw new RuntimeException(e);
		}

	}

}

public Collection<Profissional> convert(final ResultSet result) throws SQLException {
	// conversao

	final Collection<Profissional> profi = new ArrayList<>();
	while (result.next()) {
		final int idprofi = result.getInt("idprofi");
		final String nome = result.getString("pnome");
		final Date datanasc = result.getDate("pdatanasc");
		final String cpf = result.getString("pcpf");
		final String rg = result.getString("prg");
		final Profissional profissional = new Profissional(idprofi, nome, datanasc, cpf, rg);
		profissional.setIdprofi(idprofi);
		profissional.setPnome(nome);
		profissional.setPdata(datanasc);
		profissional.setPcpf(cpf);
		profissional.setPrg(rg);
		profi.add(profissional);
	}
	return profi;
}

public Collection<Profissional> update(final String query) {
	Profissional profi = new Profissional();

	final String sql = "update profissional set idprofi = ? or nome like ? or data de nascimento = ? or cpf like ? or rg like? where idprofi = "
			+ profi.getIdprofi();
	Connection connection = null;
	PreparedStatement stmt = null;
	ResultSet result = null;
	try {
		stmt.setString(2, query);
		stmt.setString(4, query);
		stmt.setString(5, query);
		if (query.matches(Expres.IS_NUMERIC)) {
			final Long numericQuery = Long.valueOf(query);
			stmt.setLong(1, numericQuery);
		} else {
			stmt.setLong(1, 0L);
		}
		if (query.matches(Expres.IS_DATE)) {
			final Date dateQuery = Date.valueOf(query);
			stmt.setDate(3, dateQuery);
		} else {
			stmt.setDate(3, null);
		}

		result = stmt.executeQuery();
		final Collection<Profissional> profissional = convert(result);
		return Collections.unmodifiableCollection(profissional);
	} catch (final SQLException e) {
		throw new RuntimeException("Erro ao executar consulta na base de dados", e);
	} finally {

		try {

			if (result != null) {
				result.close();
			}
			if (stmt != null) {
				stmt.close();
			}
			if (connection != null) {
				connection.close();
			}
		} catch (final SQLException e) {
			throw new RuntimeException(e);
		}
	}
}

public Collection<Profissional> insert(final String query) {
	final String sql = "insert into profissional (idprofi, nome, datanasc, cpf, rg) values (?,?,?,?,?)";
	Connection connection = null;
	PreparedStatement stmt = null;
	ResultSet result = null;
	try {
		stmt.setString(2, query);
		stmt.setString(4, query);
		stmt.setString(5, query);
		if (query.matches(Expres.IS_NUMERIC)) {
			final Long numericQuery = Long.valueOf(query);
			stmt.setLong(1, numericQuery);
		} else {
			stmt.setLong(1, 0L);
		}
		if (query.matches(Expres.IS_DATE)) {
			final Date dateQuery = Date.valueOf(query);
			stmt.setDate(3, dateQuery);
		} else {
			stmt.setDate(3, null);
		}

		result = stmt.executeQuery();
		final Collection<Profissional> profi = convert(result);
		return Collections.unmodifiableCollection(profi);
	} catch (final SQLException e) {
		throw new RuntimeException("Erro ao executar consulta na base de dados", e);
	} finally {

		try {

			if (result != null) {
				result.close();
			}
			if (stmt != null) {
				stmt.close();
			}
			if (connection != null) {
				connection.close();
			}
		} catch (final SQLException e) {
			throw new RuntimeException(e);
		}
	}
}

public Collection<Profissional> delete(final String query) {
	final String sql = "delete from profissional where idprofi = ?";
	Connection connection = null;
	PreparedStatement stmt = null;
	ResultSet result = null;
	try {
		if (query.matches(Expres.IS_NUMERIC)) {
			final Long numericQuery = Long.valueOf(query);
			stmt.setLong(1, numericQuery);
		} else {
			stmt.setLong(1, 0L);
		}
		result = stmt.executeQuery();
		final Collection<Profissional> profi = convert(result);
		return Collections.unmodifiableCollection(profi);
	} catch (final SQLException e) {
		throw new RuntimeException("Erro ao executar consulta na base de dados", e);
	} finally {

		try {

			if (result != null) {
				result.close();
			}
			if (stmt != null) {
				stmt.close();
			}
			if (connection != null) {
				connection.close();
			}
		} catch (final SQLException e) {
			throw new RuntimeException(e);
		}

	}
}

}
