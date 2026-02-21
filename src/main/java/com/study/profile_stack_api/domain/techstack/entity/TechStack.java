package com.study.profile_stack_api.domain.techstack.entity;

import com.study.profile_stack_api.domain.techstack.dto.request.TechStackRequest;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.Optional;

@NoArgsConstructor
@Getter
@Setter
public class TechStack {

    private long id;
    private long profileId;             // not null
    private String name;                // not null
    private TechCategory techCategory;  // not null
    private Proficiency proficiency;      // not null
    private Integer yearsOfExp;         // not null
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    public TechStack(TechStackRequest request) {
        Optional.ofNullable(request.getProfileId())
                .ifPresentOrElse(
                        this::setProfileId,
                        () -> new IllegalArgumentException("프로필 ID값은 필수입니다."));
        Optional.ofNullable(request.getName())
                .ifPresentOrElse(name -> {
                            if (name.length() > 50 || name.trim().isEmpty()) {
                                throw new IllegalArgumentException("기술명은 50자 이내여야합니다.");
                            }
                            this.setName(name);
                        }, () -> new IllegalArgumentException("기술명은 필수입니다.")
                );
        Optional.ofNullable(request.getCategory())
                .map(String::toUpperCase)
                .map(TechCategory::valueOf)
                .ifPresentOrElse(
                        this::setTechCategory,
                        () -> new IllegalArgumentException("카테고리는 필수입니다.")
                );
        Optional.ofNullable(request.getProficiency())
                .map(String::toUpperCase)
                .map(Proficiency::valueOf)
                .ifPresentOrElse(
                        this::setProficiency,
                        () -> new IllegalArgumentException("숙련도는 필수입니다.")
                );
        Optional.ofNullable(request.getYearsOfExp())
                .ifPresentOrElse(yearsOfExp -> {
                            if (yearsOfExp < 0) {
                                throw new IllegalArgumentException("경험 연수는 0이상이여야 합니다.");
                            }
                            this.setYearsOfExp(yearsOfExp);
                        }, () -> this.setYearsOfExp(0)
                );

        this.setCreatedAt(LocalDateTime.now());
        this.setUpdatedAt(LocalDateTime.now());
    }

    public TechStack update(TechStackRequest request) {
        Optional.ofNullable(request.getName())
                .ifPresent(name  -> {
                    if (name.length() > 50 || name.trim().isEmpty()) {
                        throw new IllegalArgumentException("기술명은 50자 이내여야합니다.");
                    }
                    this.setName(name);
                });
        Optional.ofNullable(request.getCategory())
                .map(String::toUpperCase)
                .map(TechCategory::valueOf)
                .ifPresent(this::setTechCategory);
        Optional.ofNullable(request.getProficiency())
                .map(String::toUpperCase)
                .map(Proficiency::valueOf)
                .ifPresent(this::setProficiency);
        Optional.ofNullable(request.getYearsOfExp())
                .ifPresent(yearsOfExp -> {
                    if (yearsOfExp < 0) {
                        throw new IllegalArgumentException("경험 연수는 0이상이여야 합니다.");
                    }
                    this.setYearsOfExp(yearsOfExp);
                });

        return this;
    }
}
