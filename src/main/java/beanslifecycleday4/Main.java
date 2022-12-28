package beanslifecycleday4;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String [] args){
        ClassPathXmlApplicationContext applicationContext =new ClassPathXmlApplicationContext("beanslifecycle/beans.xml");
//        BeansLifeCycleAnnotation beansLifeCycleAnnotation = applicationContext.getBean("");
        applicationContext.close();

    }
}
