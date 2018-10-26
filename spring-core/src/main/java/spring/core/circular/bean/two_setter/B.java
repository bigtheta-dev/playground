package spring.core.circular.bean.two_setter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
class B {
    private A a;

    @Autowired
    public void setA(A a) {
        this.a = a;
    }
}
