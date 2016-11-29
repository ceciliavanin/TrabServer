package br.univel.banco;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import br.univel.dto.Cliente;

/**
 * Nesta classe temos as implementações referentes do CLIENTE ao banco -
 * INSERT/SELECT
 * 
 * @author Cecilia Vanin
 *
 */

public class CliDAO {
	public Collection<Cliente> pesquisar(final String query) {
		final String sql = "select * from cliente where idcli = ? or nome like ? or data de nascimento = ? or cpf like ? or rg like?";
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
			final Collection<Cliente> cli = convert(result);
			return Collections.unmodifiableCollection(cli);
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

	public Collection<Cliente> convert(final ResultSet result) throws SQLException {
		// conversao

		final Collection<Cliente> cli = new ArrayList<>();
		while (result.next()) {
			final int idcli = result.getInt("idcli");
			final String nome = result.getString("cnome");
			final Date datanasc = result.getDate("cdatanasc");
			final String cpf = result.getString("ccpf");
			final String rg = result.getString("crg");
			final Cliente cliente = new Cliente(idcli, nome, rg, cpf, datanasc);
			cliente.setIdcli(idcli);
			cliente.setCnome(nome);
			cliente.setCdata(datanasc);
			cliente.setCcpf(cpf);
			cliente.setCrg(rg);
			cli.add(cliente);
		}
		return cli;
	}

	public Collection<Cliente> update(final String query) {
		Cliente cli = new Cliente();

		final String sql = "update cliente set idcli = ? or nome like ? or data de nascimento = ? or cpf like ? or rg like? where idcli = "
				+ cli.getIdcli();
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
			final Collection<Cliente> cliente = convert(result);
			return Collections.unmodifiableCollection(cliente);
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

	public Collection<Cliente> insert(final String query) {
		final String sql = "insert into cliente (idcli, nome, datanasc, cpf, rg) values (?,?,?,?,?)";
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
			final Collection<Cliente> cli = convert(result);
			return Collections.unmodifiableCollection(cli);
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

	public Collection<Cliente> delete(final String query) {
		final String sql = "delete from cliente where idcli = ?";
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
			final Collection<Cliente> cli = convert(result);
			return Collections.unmodifiableCollection(cli);
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
