//package com.tyust.friend.sys.config;
//
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.context.annotation.Configuration;
////import org.springframework.security.config.annotation.web.builders.HttpSecurity;
////import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
////import org.springframework.security.core.authority.AuthorityUtils;
////import org.springframework.security.core.userdetails.User;
////import org.springframework.security.core.userdetails.UserDetails;
////import org.springframework.security.core.userdetails.UserDetailsService;
////import org.springframework.security.core.userdetails.UsernameNotFoundException;
//
//@Configuration
//public class SecurityConfig extends WebSecurityConfigurerAdapter implements UserDetailsService {
//
//
//    Logger logger = LoggerFactory.getLogger(getClass());
//
//    @Override
//    protected void configure(HttpSecurity http) throws Exception {
//        http.formLogin()
//                .loginPage("/index.html")
//                .loginProcessingUrl("")
//        .and()
//        .authorizeRequests()
//                .antMatchers("/index.html").permitAll()
//        .anyRequest()
//        .authenticated()
//        .and().csrf().disable();
//    }
//
//    @Override
//    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
//        User user = new User(s,"123456", AuthorityUtils.commaSeparatedStringToAuthorityList("admin"));
//        return user;
//    }
//}
