//package com.make.miracle.backend.auth;
//
//import org.springframework.boot.web.servlet.FilterRegistrationBean;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.core.Ordered;
//import org.springframework.http.HttpMethod;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;
//import org.springframework.security.oauth2.config.annotation.web.configuration.ResourceServerConfigurerAdapter;
//import org.springframework.web.cors.CorsConfiguration;
//import org.springframework.web.cors.CorsConfigurationSource;
//import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
//import org.springframework.web.filter.CorsFilter;
//
//import java.util.Arrays;
//
//
//@Configuration
//@EnableResourceServer
//public class ResourceServerConfig extends ResourceServerConfigurerAdapter {
//
////importaremos metodo  http security
//
//    @Override
//    public void configure(HttpSecurity http) throws Exception {
//        http.authorizeRequests()
//                .antMatchers(HttpMethod.GET,"/app/estudiantes").permitAll()
//                .anyRequest().authenticated()
//                .and().cors().configurationSource(corsConfigurationSource());
//    }
//
//
//    @Bean
//    CorsConfigurationSource corsConfigurationSource(){
//        CorsConfiguration corsConfiguration = new CorsConfiguration();
//        corsConfiguration.setAllowedOrigins(Arrays.asList("http://localhost:4200"));
//        corsConfiguration.setAllowedMethods(Arrays.asList("GET","POST","PUT","DELETE","OPTIONS"));
//        corsConfiguration.setAllowCredentials(true);
//        corsConfiguration.setAllowedHeaders(Arrays.asList("Content-Type","Authorization"));
//
//     //   aqui registramos la configuracion de cors
//        UrlBasedCorsConfigurationSource source =new UrlBasedCorsConfigurationSource();
//        source.registerCorsConfiguration("/**",corsConfiguration);
//
//        return source;
//    }
//
//
//@Bean
//public FilterRegistrationBean<CorsFilter> corsfilter(){
//    FilterRegistrationBean<CorsFilter>bean = new FilterRegistrationBean<CorsFilter>(new CorsFilter(corsConfigurationSource()));
//    bean.setOrder(Ordered.HIGHEST_PRECEDENCE);
//    return  bean;
//    }
//}
