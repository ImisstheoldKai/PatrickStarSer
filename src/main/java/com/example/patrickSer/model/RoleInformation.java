package com.example.patrickSer.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "roleInformation")
public class RoleInformation {
    @Id
    private String id;
    private String roleName;
    private String roleDescription;
    private String roleAvatarUrl;
    private String roleIconUrl;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getClassicLines() {
        return classicLines;
    }

    public void setClassicLines(String classicLines) {
        this.classicLines = classicLines;
    }

    private String classicLines;

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public String getRoleDescription() {
        return roleDescription;
    }

    public void setRoleDescription(String roleDescription) {
        this.roleDescription = roleDescription;
    }

    public String getRoleIconUrl() {
        return roleIconUrl;
    }

    public void setRoleIconUrl(String roleIconUrl) {
        this.roleIconUrl = roleIconUrl;
    }

    public String getRoleAvatarUrl() {
        return roleAvatarUrl;
    }

    public void setRoleAvatarUrl(String roleAvatarUrl) {
        this.roleAvatarUrl = roleAvatarUrl;
    }
}
