package atm.ku.th;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");


        AtmUI atmUI = new AtmUI(context.getBean(ATM.class));
        atmUI.run();

    }
}
