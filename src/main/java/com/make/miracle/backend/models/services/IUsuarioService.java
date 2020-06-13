package com.make.miracle.backend.models.services;

import com.make.miracle.backend.models.entity.Usuario;

public interface IUsuarioService {
        public Usuario findByUsername(String username);
}
