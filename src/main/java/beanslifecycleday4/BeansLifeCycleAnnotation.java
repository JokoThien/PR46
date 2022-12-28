package beanslifecycleday4;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class BeansLifeCycleAnnotation {

    @PostConstruct
    public void init() throws Exception{
        System.out.println("init method is called");
    }
    @PreDestroy
    public void destroy() throws RuntimeException {
        System.out.println(" destroy method is called");
    }
}
