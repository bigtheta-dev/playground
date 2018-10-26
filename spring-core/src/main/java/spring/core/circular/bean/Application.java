package spring.core.circular.bean;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {
    public static void main(String[] args) {
        new AnnotationConfigApplicationContext(Application.class)
                .getBean(Application.class)
                .run();

    }

    private void run() {
        System.out.println("application running ...");
    }
}
