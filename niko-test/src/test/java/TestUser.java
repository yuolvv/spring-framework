import org.springframework.context.support.ClassPathXmlApplicationContext;
import pub.iyu.pojo.User;

/**
 * @ClassName : TestUser
 * @Auther: Niko
 * @Date: 2020/7/13 10:47
 * @Description:
 */
public class TestUser {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("classpath:beans.xml");
		User user = classPathXmlApplicationContext.getBean(User.class);
		System.out.println(user.toString());
		System.out.println(user.getUsername());
		System.out.println(user.getAddress());
	}
}
