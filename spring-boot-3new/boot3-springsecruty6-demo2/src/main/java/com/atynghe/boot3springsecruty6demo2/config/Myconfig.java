package com.atynghe.boot3springsecruty6demo2.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@Configuration
@EnableWebSecurity
public class Myconfig {
    @Bean
    public UserDetailsService userDetailsService() {
        UserDetails adminUser = User.withUsername("xiaozhang").password("{noop}111111").roles("admin,", "user").build();
        UserDetails vipUser = User.withUsername("user").password("{noop}123456").roles("user").build();
        InMemoryUserDetailsManager userDetailsManager = new InMemoryUserDetailsManager();
        userDetailsManager.createUser(adminUser);
        userDetailsManager.createUser(vipUser);
        return userDetailsManager;

    }
    @Bean
    public PasswordEncoder passwordEncoder(){
        return new BCryptPasswordEncoder();
    }
}
