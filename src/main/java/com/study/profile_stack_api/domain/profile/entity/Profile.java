package com.study.profile_stack_api.domain.profile.entity;

import java.time.LocalDateTime;

public class Profile {

    private long id;
    private String name;
    private String email;
    private String bio;
    private Position position;
    private int careerYears;
    private String githubUrl;
    private String blogUrl;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    public Profile() {}

    public Profile(long id, String name, String email, String bio, Position position, int careerYears, String githubUrl, String blogUrl, LocalDateTime createdAt, LocalDateTime updatedAt) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.bio = bio;
        this.position = position;
        this.careerYears = careerYears;
        this.githubUrl = githubUrl;
        this.blogUrl = blogUrl;
        this.createdAt = LocalDateTime.now();
        this.updatedAt = LocalDateTime.now();
    }

    // Getter

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getBio() {
        return bio;
    }

    public Position getPosition() {
        return position;
    }

    public int getCareerYears() {
        return careerYears;
    }

    public String getGithubUrl() {
        return githubUrl;
    }

    public String getBlogUrl() {
        return blogUrl;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }

    // Setter

    public void setId(long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public void setCareerYears(int careerYears) {
        this.careerYears = careerYears;
    }

    public void setGithubUrl(String githubUrl) {
        this.githubUrl = githubUrl;
    }

    public void setBlogUrl(String blogUrl) {
        this.blogUrl = blogUrl;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public void setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }
}
