package com.training.demo.phase1.services.impementation;

import java.util.List;

import com.training.demo.phase1.model.Roles;
import com.training.demo.phase1.repositories.impementation.LoginRepository;
import com.training.demo.phase1.services.specification.ILoginService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
public class LoginService implements ILoginService {

  @Autowired
  LoginRepository loginRepository;

  @Override
  @Transactional(value = "transactionManager", readOnly = false, rollbackFor = Exception.class, propagation = Propagation.REQUIRED, isolation = Isolation.READ_COMMITTED)
  public  List<Roles> verifyLogin(Roles i) throws Exception {
 
        return loginRepository.verifyLogin(i);

  }

  @Override
  public void verifyLogin1(Integer i) {

  }

}
