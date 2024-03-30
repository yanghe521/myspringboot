package com.atynghe.boot3demo02.config;

import com.atynghe.boot3demo02.bean.Sheep;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@EnableConfigurationProperties(Sheep.class) //导入第三方写好的组件进行属性绑定
//SpringBoot默认只扫描自己主程序所在的包。如果导入第三方包，即使组件上标注了 @Component、@ConfigurationProperties 注解，也没用。因为组件都扫描不进来
@SpringBootConfiguration //这是一个配置类，替代以前的配置文件。配置类本身也是容器中的组件
//@Configuration
public class Appconfig3 {
}
