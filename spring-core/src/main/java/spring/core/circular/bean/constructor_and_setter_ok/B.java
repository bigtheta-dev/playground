package spring.core.circular.bean.constructor_and_setter_ok;

import org.springframework.stereotype.Component;

@Component
class B {
    private A a;

    public B(A a) {
        this.a = a;
    }
}
