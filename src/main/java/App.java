import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld firstBean = (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(firstBean.getMessage());

        HelloWorld secondBean = (HelloWorld) applicationContext.getBean("helloworld");
        Cat catFirstBean = (Cat) applicationContext.getBean("cat");
        Cat catSecondBean = (Cat) applicationContext.getBean("cat");

        System.out.println(firstBean == secondBean);
        System.out.println(catFirstBean == catSecondBean);

    }
}