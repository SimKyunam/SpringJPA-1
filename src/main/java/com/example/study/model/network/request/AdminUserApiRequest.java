package com.example.study.model.network.request;

import com.example.study.model.enumclass.UserStatus;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class AdminUserApiRequest {

    private Long id;

    private String account;

    private String password;

    private UserStatus status;

    private String role;

    private LocalDateTime lastLoginAt;

    private int loginFailCount;

    private LocalDateTime passwordUpdatedAt;

    private LocalDateTime registeredAt;

    private LocalDateTime unregisteredAt;

    private LocalDateTime createdAt;

    private String createdBy;

    private LocalDateTime updatedAt;

    private String updatedBy;


}
