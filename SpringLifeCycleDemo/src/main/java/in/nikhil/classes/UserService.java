package in.nikhil.classes;

import org.springframework.beans.factory.BeanNameAware;
import org.springframework.stereotype.Component;

//BeanNameAware is Aware Interface
@Component("userBean")
public class UserService implements BeanNameAware {

    public UserService() {

        System.out.println("UserService constructor called");
    }

//   setBeanName is a callback method
//   i.e. You don't call this method.
//   Spring itself calls it.
    @Override
    public void setBeanName(String name) {
        System.out.println("Bean name is "+name);
    }
}
