package spring.core.circular.bean.two_setter;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

class ApplicationTest {
    @Test
    void test() {
        ApplicationContext context = new AnnotationConfigApplicationContext(Application.class);
        context.getBean(A.class);
    }
}