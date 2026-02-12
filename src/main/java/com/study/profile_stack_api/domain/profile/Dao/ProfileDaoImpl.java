package com.study.profile_stack_api.domain.profile.Dao;

import com.study.profile_stack_api.domain.profile.entity.Profile;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Primary;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
@Primary
@RequiredArgsConstructor
public class ProfileDaoImpl implements ProfileDao {

    private final JdbcTemplate jdbcTemplate;

    // ============== CREATE =================

    @Override
    public Profile save() {
        return null;
    }
}
