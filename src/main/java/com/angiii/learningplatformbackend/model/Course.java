package com.angiii.learningplatformbackend.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "t_course")
@Builder
@Data
@ToString(callSuper = true, exclude = {"teachers", "majors", "homeworks"})
@NoArgsConstructor
@AllArgsConstructor
public class Course extends BaseEntity implements Serializable {

    @Column
    private String name; // 课程名称
    @JsonIgnoreProperties(value = { "courses" })
    @ManyToMany
    @JoinTable(name = "t_course_teacher", joinColumns = @JoinColumn(name = "course_id"), inverseJoinColumns = @JoinColumn(name = "teacher_id"))
    private List<Teacher> teachers;

    @JsonIgnoreProperties(value = { "courses" })
    @ManyToMany
    @JoinTable(name = "t_major_course", joinColumns = @JoinColumn(name = "course_id"), inverseJoinColumns = @JoinColumn(name = "major_id"))
    private List<Major> majors;

    @OneToMany(mappedBy = "course", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JsonManagedReference
    private List<Homework> homeworks; // 作业列表
}
