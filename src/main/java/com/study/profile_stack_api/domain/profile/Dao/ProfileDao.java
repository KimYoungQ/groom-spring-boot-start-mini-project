package com.study.profile_stack_api.domain.profile.Dao;

import com.study.profile_stack_api.domain.profile.entity.Profile;

public interface ProfileDao {

    // ============ CREATE ================
    Profile save(Profile profile);
}
