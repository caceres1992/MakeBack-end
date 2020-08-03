//package com.make.miracle.backend.auth;
//
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.authentication.AuthenticationManager;
//import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
//import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//import org.springframework.security.config.http.SessionCreationPolicy;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//
//@EnableGlobalMethodSecurity(securedEnabled = true)
//@Configuration
//public class SpringSecurityConfig  extends WebSecurityConfigurerAdapter {
//
//    @Autowired
////    clase netamente de springsecurity
//    private UserDetailsService usuarioService;
//
////    aqui es  decir a spring security que autenticador de clave quiere usar
////    en mi caso el es encriptado base64
//@Bean
//    public BCryptPasswordEncoder passwordEncoder(){
//    return new BCryptPasswordEncoder();
//}
//
//
////importaremos metodo del WebSecurityConfigurerAdapter
//// metodo HttpSecurity  , authenticacionManagerBuilder ,authenticacionManager
//
//
//    @Override
//    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
//        auth.userDetailsService(usuarioService).passwordEncoder(passwordEncoder());
//    }
//
//    //    opcional ponerle su nombre por defecto
//    @Bean("authenticationManager")
//    @Override
//    protected AuthenticationManager authenticationManager() throws Exception {
//        return super.authenticationManager();
//    }
//
////configuaremosla seguridad global del sistema  http
//    @Override
//    protected void configure(HttpSecurity http) throws Exception {
//      http.authorizeRequests()
//              .anyRequest()
//              .authenticated()
//              .and()
//              .csrf()
//              .disable()
//              .sessionManagement()
//              .sessionCreationPolicy(SessionCreationPolicy.STATELESS);
//    }
//}
//
