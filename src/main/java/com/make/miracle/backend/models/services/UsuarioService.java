//package com.make.miracle.backend.models.services;
//
//
//import com.make.miracle.backend.models.domain.Usuario;
//import com.make.miracle.backend.models.repository.IUsuarioDao;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.core.GrantedAuthority;
//import org.springframework.security.core.authority.SimpleGrantedAuthority;
//import org.springframework.security.core.userdetails.User;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.core.userdetails.UsernameNotFoundException;
//import org.springframework.stereotype.Service;
//import org.springframework.transaction.annotation.Transactional;
//
//import java.util.List;
//import java.util.stream.Collectors;
//
////EN ESTA CLASE IMPLEMENTAREMOS LA INTERFAZ USURIO
//// Y UN CLASE DE SPRING SECURITY LLAMADA UserDetailsService
//
//@Service
//public class UsuarioService implements UserDetailsService, IUsuarioService {
//
////  importante el Looger debe ser de la libreria Slf4j y pondremos en getlogger  la clase raiz
//
//    private Logger logger = LoggerFactory.getLogger(UsuarioService.class);
//
//    //    injectamos
//    @Autowired
//    private IUsuarioDao usuarioDao;
//
//
//    //aqui solamente pondremos el metodo del Dao
//    //que es buscar por usuario
//    @Override
//    @Transactional(readOnly = true)
//    public Usuario findByUsername(String username) {
//        return usuarioDao.findByUsername(username);
//    }
//
//
//    @Override
//    @Transactional(readOnly = true)
//    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
//
//        //importaremos la clase Usuario
//
//        Usuario user = usuarioDao.findByUsername(username);
//
//        if (user == null) {
//            logger.error("No Existe Usuario'" + username + "'en el sistema");
//            throw new UsernameNotFoundException("no existe Usuario '" + username + "' en el Sistema");
//        }
//
//        List<GrantedAuthority> authorities = user.getRoles()
//                .stream()
//                .map(role -> new SimpleGrantedAuthority(role.getNombre()))
//                .peek(authority -> logger.info("Role" + authority.getAuthority()))
//                .collect(Collectors.toList());
//
////regresaremos el authorities  obteniendo el username, password y el estado.
//        return new User(user.getUsername(), user.getPassword(), user.getEnable(),
//                true, true, true, authorities);
//    }
//}
