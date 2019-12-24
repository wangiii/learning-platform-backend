package com.angiii.learningplatformbackend.model;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "t_course")
@Builder
@Data
@ToString(callSuper = true)
@NoArgsConstructor
@AllArgsConstructor
public class Course extends BaseEntity implements Serializable {

    @Column
    private String name; // 课程名称
    @ManyToMany
    @JoinTable(name = "t_course_teacher", joinColumns = @JoinColumn(name = "course_id"), inverseJoinColumns = @JoinColumn(name = "teacher_id"))
    private List<Teacher> teachers;

    @ManyToMany
    @JoinTable(name = "t_major_course", joinColumns = @JoinColumn(name = "course_id"), inverseJoinColumns = @JoinColumn(name = "major_id"))
    private List<Major> majors;

    @OneToMany(mappedBy = "course", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Homework> homeworks; // 作业列表
}
