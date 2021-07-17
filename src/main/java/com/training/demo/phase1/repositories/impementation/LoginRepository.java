package com.training.demo.phase1.repositories.impementation;

import java.util.ArrayList;
import java.util.List;

import com.training.demo.phase1.model.Roles;
import com.training.demo.phase1.repositories.specification.ILoginRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Service;

@Service
public class LoginRepository implements ILoginRepository {

    @Autowired
    private Environment env;

    @Autowired
    @Qualifier("jdbcTemplate_db")
    JdbcTemplate jdbcTemplate;

    @Override
    public  List<Roles> verifyLogin(Roles r) throws Exception {
        try {
            String s = env.getProperty("secure_app_database.url");
            String s1 = env.getProperty("server.port");
            // Integer result = i / 0;

            String query = "update roles set role_name=?  where id=? ;";

            RowMapper<Roles> rowMapper = new BeanPropertyRowMapper<>(Roles.class);

            List<Roles> roles = new ArrayList<Roles>();

            int rowcount =jdbcTemplate.update(query,r.getRole_name(),r.getId());
         
            jdbcTemplate.update(
                "INSERT INTO roles ( role_name,role_key) VALUES (?, ?)",
                "Orange", "or"
            );

            return roles;
        } catch (Exception e) {
            throw new Exception(e);
            // return 0;
        }

    }

    @Override
    public void verifyLogin1(Integer i) {

    }

}
