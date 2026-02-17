package com.study.profile_stack_api.domain.techstack.dao;

import com.study.profile_stack_api.domain.techstack.entity.TechStack;
import com.study.profile_stack_api.global.common.Page;

import java.util.Optional;

public interface TechStackDao {

    //========== CREATE ==============
    TechStack save(TechStack stack);

    //========== READ ==============
    Page<TechStack> getAllTechStacks(long profileId, int page, int size);

    Optional<TechStack> getTechStack(long id);

    //========== UPDATE ==============
    TechStack updateTechStack(long profileId, long id, TechStack techStack);
}
