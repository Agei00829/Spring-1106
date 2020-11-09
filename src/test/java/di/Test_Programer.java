
package di;

import com.mycompany.springbase1102.di.byname.MicrosoftProgramer;
import com.mycompany.springbase1102.di.byname.OracleProgramer;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Test_Programer {
    @Test
    public void t1() {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("beans-config-2.xml");
        OracleProgramer op = ctx.getBean("oracleProgamer" , OracleProgramer.class);
        System.out.println(op);
        MicrosoftProgramer mp = ctx.getBean("microsoftProgamer" , MicrosoftProgramer.class);
        System.out.println(mp);
        ctx.close();
    }
}
