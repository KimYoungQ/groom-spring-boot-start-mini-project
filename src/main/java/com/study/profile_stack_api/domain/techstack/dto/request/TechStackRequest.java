package com.study.profile_stack_api.domain.techstack.dto.request;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
public class TechStackRequest {

    private long profileId;
    private String name;
    private String category;
    private String categoryIcon;
    private String proficiency;
    private String proficiencyIcon;
    private Integer yearsOfExp;
    private LocalDateTime createdAt;
    private LocalDateTime deletedAt;

    public boolean hasNoUpdates() {
        return name == null
                && category == null
                && proficiency == null
                && yearsOfExp == null;
    }
}
