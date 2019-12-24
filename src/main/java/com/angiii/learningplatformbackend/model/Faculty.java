package com.angiii.learningplatformbackend.model;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "t_faculty")
@Builder
@Data
@ToString(callSuper = true,exclude = "majors")
@NoArgsConstructor
@AllArgsConstructor
public class Faculty extends BaseEntity implements Serializable {

    private String name; // 院系名称
    @OneToMany(mappedBy = "faculty", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Major> majors; // 专业列表
}
