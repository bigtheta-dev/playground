package spring.core.circular.bean.constructor_and_setter_fail;

import org.springframework.stereotype.Component;

@Component
class A {
    private B b;

    public A(B b) {
        this.b = b;
    }
}
