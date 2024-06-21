package com.talex.adminlte.services;

import com.talex.adminlte.entities.SiteUser;

public interface SiteUserService {
    SiteUser findByEmail(String email);
    void saveUser(SiteUser user, String role);
}
