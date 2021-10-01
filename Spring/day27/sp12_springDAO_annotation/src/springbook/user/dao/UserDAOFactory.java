package springbook.user.dao;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration // xml 설정 파일 역할
public class UserDAOFactory {
	
	@Bean
	public UserDAO userDao() {
		UserDAO dao = new UserDAO(connectionMaker());
		//UserDAO dao = new UserDAO();
		return dao;
	}

	@Bean
	public ConnectionMaker connectionMaker() {
		ConnectionMaker connectionMaker = new NConnectionMakerImpl();
		
		return connectionMaker;
	}
}




