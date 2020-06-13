package com.make.miracle.backend.auth;

import com.make.miracle.backend.models.entity.Usuario;
import com.make.miracle.backend.models.services.IUsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.oauth2.common.DefaultOAuth2AccessToken;
import org.springframework.security.oauth2.common.OAuth2AccessToken;
import org.springframework.security.oauth2.provider.OAuth2Authentication;
import org.springframework.security.oauth2.provider.token.TokenEnhancer;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class InformacionAdicional implements TokenEnhancer {



    @Autowired
    private IUsuarioService usuarioService;

    @Override
    public OAuth2AccessToken enhance(OAuth2AccessToken accessToken, OAuth2Authentication authentication) {

Usuario user = usuarioService.findByUsername(authentication.getName());
        Map<String,Object> info = new HashMap<>();

        info.put("info_adiocional", "hola que tal :".concat(authentication.getName()));
        info.put("Nombre",user.getNombre());
        info.put("Apellido",user.getApellido());

//        pondremos esto para enviar la informacion adicional que queremos enviar
        ((DefaultOAuth2AccessToken) accessToken).setAdditionalInformation(info);

        return accessToken;
    }
}
