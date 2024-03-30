import com.atynghe.boot3springsecruty6demo2.config.Myconfig;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.test.context.ContextConfiguration;

@SpringBootTest()
@ContextConfiguration(classes = Myconfig .class)
public class Mytest {

    @Autowired
    public PasswordEncoder passwordEncoder;

    @Test
    public void test1(){
        String pass="123456";
        String result = passwordEncoder.encode(pass);
        System.out.println("result====>"+result);

        boolean matches = passwordEncoder.matches(pass, result);
        System.out.println(matches);
    }
}
