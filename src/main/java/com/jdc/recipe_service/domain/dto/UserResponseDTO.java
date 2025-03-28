package com.jdc.recipe_service.domain.dto;

import lombok.Data;
import java.time.LocalDateTime;

@Data
public class UserResponseDTO {
    private Long id;
    private String nickname;
    private String profileImage;
    private String introduction;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    //추후 삭제
    private String provider;

}
