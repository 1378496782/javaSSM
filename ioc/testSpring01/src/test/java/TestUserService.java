import cn.edu.xaut.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestUserService {

    @Test
    public void test() {
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
        UserService userService = (UserService) context.getBean("UserService");
        userService.addUser();
    }
}
