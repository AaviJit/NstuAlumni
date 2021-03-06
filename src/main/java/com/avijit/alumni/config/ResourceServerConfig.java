package com.avijit.alumni.config;


import com.avijit.alumni.common.util.Constants;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;
import org.springframework.security.oauth2.config.annotation.web.configuration.ResourceServerConfigurerAdapter;

@Configuration
@EnableResourceServer
public class ResourceServerConfig extends ResourceServerConfigurerAdapter {

    @Override
    public void configure(HttpSecurity http) throws Exception {
        http
                .authorizeRequests()
                .antMatchers("/", "/home","/user/*", "/all/**").permitAll()
                .antMatchers("/admin/**").hasAnyAuthority(Constants.Roles.ROLE_ADMIN_1, Constants.Roles.ROLE_ADMIN_2, Constants.Roles.ROLE_SUPER_ADMIN)
                .antMatchers("/super-admin/**").hasRole("SUPER_ADMIN")
                .antMatchers("/employee/**").authenticated();
       /* .authorizeRequests()
        .antMatchers("/", "/all/**").permitAll()
        .antMatchers("/admin/**").permitAll()
       .antMatchers("/super-admin/**").permitAll()
//        .antMatchers("/users/admin/**").hasRole("ADMIN")
        .antMatchers("/employee/**").permitAll();*/
    }
}