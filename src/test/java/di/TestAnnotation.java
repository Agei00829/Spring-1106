
package di;


import com.mycompany.springbase1102.di.annotation.UserController;
import com.mycompany.springbase1102.di.annotation.Users;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:beans-config-3.xml"})
public class TestAnnotation {
    @Autowired
    private Users users;
    
    @Autowired
    private UserController userController;
    @Test
    public void t1() {
        System.out.println(users);
        
        //查詢所有users
        Users users = userController.getAll();
        System.out.println(users);
        // 檢查  John and Bob 是否在 Users 列表中
        Boolean check = userController.existByName("Tom");
        System.out.println(check);
        
    }
    
    
   
    
}
