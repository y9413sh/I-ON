package springbook.user.dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class NConnectionMakerImpl implements ConnectionMaker {

	@Override
	public Connection makeConnection() throws Exception {
		Class.forName("oracle.jdbc.OracleDriver");
		Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@kosa3.iptime.org:50111:orcl", "hr", "hr");

		return conn;
	}

}
