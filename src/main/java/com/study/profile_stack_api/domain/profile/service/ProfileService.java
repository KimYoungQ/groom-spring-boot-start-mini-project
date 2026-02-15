package com.study.profile_stack_api.domain.profile.service;

import com.study.profile_stack_api.domain.profile.Dao.ProfileDao;
import com.study.profile_stack_api.domain.profile.dto.request.ProfileRequest;
import com.study.profile_stack_api.domain.profile.dto.response.ProfileResponse;
import com.study.profile_stack_api.domain.profile.entity.Profile;
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
    public ProfileResponse save(ProfileRequest request) {

        return ProfileResponse.from(profileDao.save(new Profile(request)));
    }

}
