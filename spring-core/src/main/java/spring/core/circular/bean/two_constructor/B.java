package spring.core.circular.bean.two_constructor;

import org.springframework.stereotype.Component;

@Component
class B {
    private A a;

    public B(A a) {
        this.a = a;
    }
}
