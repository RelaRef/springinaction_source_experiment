package packageNameA;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args){
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext(
                        "packageNameA/default.xml");

//        InterA interA = context.getBean(InterA.class);
//        interA.identify();

        UseInterA useInterA = context.getBean(UseInterA.class);
        useInterA.identify();
    }
}
