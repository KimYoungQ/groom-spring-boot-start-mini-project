package com.study.profile_stack_api.domain.techstack.dto.response;

import com.study.profile_stack_api.domain.techstack.entity.TechStack;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Getter
@NoArgsConstructor
public class TechStackResponse {

    private long id;
    private long profileId;
    private String name;
    private String techCategory;
    private String techIcon;
    private String proficiency;
    private String proficiencyicon;
    private int yearsOfExp;
    private LocalDateTime createdAt;
    private LocalDateTime deletedAt;

    public static TechStackResponse from(TechStack techStack) {
        TechStackResponse response = new TechStackResponse();
        response.id = techStack.getId();
        response.profileId = techStack.getProfileId();
        response.name = techStack.getName();
        response.techCategory = techStack.getTechCategory().getDescription();
        response.techIcon = techStack.getTechCategory().getIcon();
        response.proficiency = techStack.getProficiency().getDescription();
        response.proficiencyicon = techStack.getProficiency().getIcon();
        response.yearsOfExp = techStack.getYearsOfExp();
        response.createdAt = techStack.getCreatedAt();
        response.deletedAt = techStack.getUpdatedAt();

        return response;
    }
}
