package com.angiii.learningplatformbackend.model;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "t_major")
@Builder
@Data
@ToString(callSuper = true, exclude = "courses")
@NoArgsConstructor
@AllArgsConstructor
public class Major extends BaseEntity implements Serializable {

    private String name; // 专业名称
    @ManyToOne(cascade = {CascadeType.MERGE, CascadeType.REFRESH}, optional = false)
    @JoinColumn(name = "faculty_id")
    private Faculty faculty; // 所属院系

    @ManyToMany
    @JoinTable(name = "t_major_course", joinColumns = @JoinColumn(name = "major_id"), inverseJoinColumns = @JoinColumn(name = "course_id"))
    private List<Course> courses; // 课程列表
}
