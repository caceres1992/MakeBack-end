//package com.make.miracle.backend.auth;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Qualifier;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.authentication.AuthenticationManager;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//import org.springframework.security.oauth2.config.annotation.configurers.ClientDetailsServiceConfigurer;
//import org.springframework.security.oauth2.config.annotation.web.configuration.AuthorizationServerConfigurerAdapter;
//import org.springframework.security.oauth2.config.annotation.web.configuration.EnableAuthorizationServer;
//import org.springframework.security.oauth2.config.annotation.web.configurers.AuthorizationServerEndpointsConfigurer;
//import org.springframework.security.oauth2.config.annotation.web.configurers.AuthorizationServerSecurityConfigurer;
//import org.springframework.security.oauth2.provider.token.TokenEnhancerChain;
//import org.springframework.security.oauth2.provider.token.store.JwtAccessTokenConverter;
//import org.springframework.security.oauth2.provider.token.store.JwtTokenStore;
//
//import java.util.Arrays;
//
//
//@Configuration
//@EnableAuthorizationServer
//public class AuthorizationServerConfig extends AuthorizationServerConfigurerAdapter {
//
////injectamos con la anotacion @Athowired
//    @Autowired
//    private BCryptPasswordEncoder passwordEncoder;
//    @Autowired
////    hacemos un bean ya que eso se llamara en otra en clase con ese nombre
//    @Qualifier("authenticationManager")
//    private AuthenticationManager authenticationManager;
//
//    @Autowired
//    private InformacionAdicional infoadicional;
//
////    aqui daremos click derecho y importaremos los
////    metodos de la extencion que hicismos dentro de la clase
//
//
//    @Override
//    public void configure(AuthorizationServerSecurityConfigurer security) throws Exception {
//        security.tokenKeyAccess("permitAll()")
//                .checkTokenAccess("isAuthenticated()");
//        super.configure(security);
//    }
//
//    @Override
//    public void configure(AuthorizationServerEndpointsConfigurer endpoints) throws Exception {
//
//        TokenEnhancerChain tokenEnhancerChain = new TokenEnhancerChain();
////        enviando la informacion adicional
//        tokenEnhancerChain.setTokenEnhancers(Arrays.asList(infoadicional,accessTokenConverter()));
//        endpoints.authenticationManager(authenticationManager).
//                tokenStore(tokenStore())
//                .accessTokenConverter(accessTokenConverter())
//                .tokenEnhancer(tokenEnhancerChain);
//
//    }
//    @Bean
//    public JwtTokenStore tokenStore(){
//        return  new JwtTokenStore(accessTokenConverter());
//    }
//    @Bean
//    public JwtAccessTokenConverter accessTokenConverter() {
//        JwtAccessTokenConverter jwtAccessTokenConverter= new JwtAccessTokenConverter();
//        jwtAccessTokenConverter.setSigningKey(JwtConfig.LLAVE_PRIVADA);
//        jwtAccessTokenConverter.setVerifierKey(JwtConfig.LLAVE_PUBLICA);
//        return jwtAccessTokenConverter;
//    }
//
//    @Override
//    public void configure(ClientDetailsServiceConfigurer clients) throws Exception {
//
//        clients.inMemory().withClient("makeamiracle")
//                .secret(passwordEncoder.encode("12345"))
//                .scopes("read","write")
//                .authorizedGrantTypes("password","refresh_token")
//                .accessTokenValiditySeconds(3600)
//                .refreshTokenValiditySeconds(3600);
//    }
//
//}
