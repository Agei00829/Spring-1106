package di;

import com.mycompany.springbase1102.di.Student;
import org.junit.Test;


public class TestStudent {
    @Test
    public void test() {
        Student s1 = new Student();
        s1.setName("aaa");
        s1.setAge(18);
        System.out.println(s1);
    }
    
}
