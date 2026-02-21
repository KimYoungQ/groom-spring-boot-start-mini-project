package com.study.profile_stack_api.domain.profile.dto.response;

import com.study.profile_stack_api.domain.profile.entity.Profile;
import lombok.Getter;

import java.time.LocalDateTime;

@Getter
public class ProfileResponse {

    private long id;
    private String name;
    private String email;
    private String bio;
    private String position;
    private String icon;
    private int careerYears;
    private String githubUrl;
    private String blogUrl;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    public static ProfileResponse from(Profile profile) {

        ProfileResponse response = new ProfileResponse();
        response.id = profile.getId();
        response.name = profile.getName();
        response.email = profile.getEmail();
        response.bio = profile.getBio();
        response.position = profile.getPosition().getDescription();
        response.icon = profile.getPosition().getIcon();
        response.careerYears = profile.getCareerYears();
        response.githubUrl = profile.getGithubUrl();
        response.blogUrl = profile.getBlogUrl();
        response.createdAt = profile.getCreatedAt();
        response.updatedAt = profile.getUpdatedAt();

        return response;
    }
}
