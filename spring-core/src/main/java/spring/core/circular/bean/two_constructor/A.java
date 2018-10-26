package spring.core.circular.bean.two_constructor;

import org.springframework.stereotype.Component;

@Component
class A {
    private B b;

    public A(B b) {
        this.b = b;
    }
}
