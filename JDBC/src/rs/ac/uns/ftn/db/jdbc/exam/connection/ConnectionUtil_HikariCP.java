package rs.ac.uns.ftn.db.jdbc.exam.connection;

import java.sql.Connection;
import java.sql.SQLException;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

public class ConnectionUtil_HikariCP {
	private static HikariConfig hikariConfig = new HikariConfig();
	private static HikariDataSource hikariDS;
	static {
		hikariConfig.setJdbcUrl(ConnectionParams.LOCAL_CONNECTION_STRING);
		hikariConfig.setUsername(ConnectionParams.USERNAME);
		hikariConfig.setPassword(ConnectionParams.PASSWORD);
		hikariConfig.setMaximumPoolSize(5);
		hikariConfig.addDataSourceProperty("cashePrepStms", "true");
		hikariConfig.addDataSourceProperty("PrepStmtCasheSize", "250");
		hikariDS = new HikariDataSource(hikariConfig);
	}
	
	
	private ConnectionUtil_HikariCP() {

	}
	
	public static Connection getConnection () throws SQLException {
		return hikariDS.getConnection();
	}

	public static void closeDataSource() {
		 hikariDS.close();
	}

	@SuppressWarnings("deprecation")
	@Override
	protected void finalize() throws Throwable {
		hikariDS.close();
		super.finalize();
	}


	

}
