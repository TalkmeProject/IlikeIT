package com.wgdetective.projectstartdemo.dto;

import com.wgdetective.projectstartdemo.dbo.PositionDbo;
import com.wgdetective.projectstartdemo.enumerated.Position;
import com.wgdetective.projectstartdemo.enumerated.Sex;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;

@Data
@NoArgsConstructor
public class UserDto {
    private long id;
    private String firstName;
    private String lastName;
    private int age;
    private Set<PositionDto> position;
}

