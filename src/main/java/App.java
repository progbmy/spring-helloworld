import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean =
                (HelloWorld) applicationContext.getBean("helloworld");

       HelloWorld bean1 = (HelloWorld) applicationContext.getBean("helloworld");
       boolean resultBean = bean == bean1;
       System.out.println(resultBean);

       Cat bean2 = (Cat) applicationContext.getBean("cat");
       Cat bean3 = (Cat) applicationContext.getBean("cat");
       boolean resultBean1= bean2 == bean3;
       System.out.println(resultBean1);

        //System.out.println(bean.getMessage());
    }
}