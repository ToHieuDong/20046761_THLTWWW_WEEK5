package com.example.week5.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
@Entity
@Table(name = "skill")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Skill {
    @Id
    @Column(name = "skill_id", columnDefinition = "bigint(20)")
    private UUID skillId;
    @Column(name = "description", length = 50)
    private String description;
    @Column(name = "skillName", length = 50)
    private String skillName;
    @Column(name = "type", columnDefinition = "tinyint")
    private short type;


}
