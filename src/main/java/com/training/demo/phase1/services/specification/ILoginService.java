package com.training.demo.phase1.services.specification;

import java.util.List;

import com.training.demo.phase1.model.Roles;

public interface ILoginService {
    
    public  List<Roles> verifyLogin(Roles i) throws Exception;
    public void verifyLogin1(Integer i);
}
