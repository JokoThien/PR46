package btday2;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main (String [] args){
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("xmlbasedconfiguration/beans.xml");
        Student student =applicationContext.getBean("Student", Student.class);
        student.drawCircle();

    }
}
