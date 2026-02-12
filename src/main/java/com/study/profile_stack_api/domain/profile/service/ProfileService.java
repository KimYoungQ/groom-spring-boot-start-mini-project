package com.study.profile_stack_api.domain.profile.service;

import com.study.profile_stack_api.domain.profile.Dao.ProfileDao;
import com.study.profile_stack_api.domain.profile.dto.request.ProfileCreateRequest;
import com.study.profile_stack_api.domain.profile.dto.response.ProfileResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ProfileService {

    private final ProfileDao profileDao;

    // ================ CREATE ====================

    /**
     * 프로필 생성
     */
    public ProfileResponse save(ProfileCreateRequest request) {

        return ProfileResponse.from(profileDao.save());
    }
}
