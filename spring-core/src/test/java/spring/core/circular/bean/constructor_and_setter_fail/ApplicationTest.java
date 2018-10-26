package spring.core.circular.bean.constructor_and_setter_fail;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.UnsatisfiedDependencyException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


class ApplicationTest {
    @Test
    void test() {
        Assertions.assertThrows(UnsatisfiedDependencyException.class, () -> {
            ApplicationContext context = new AnnotationConfigApplicationContext(Application.class);
            context.getBean(A.class);

        });
    }
}