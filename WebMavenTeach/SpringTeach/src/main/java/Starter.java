import org.example.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Starter {
    public static void main(String[] args) {
        // 得到Spring的上下文环境  ApplicationContext接口代表Spring IoC容器，并负责实例化，配置和组装Bean
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");

        //得到需要被实例化的对象 getBean(id):id 代表spring.xml配置文件中bean标签的id属性值
        UserService userService = (UserService) applicationContext.getBean("userService");

        //调用方法
        userService.test();
    }
}
