package com.angiii.learningplatformbackend.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "t_teacher")
@Builder
@Data
@ToString(callSuper = true, exclude = {"courses", "homeworks"})
@NoArgsConstructor
@AllArgsConstructor
public class Teacher extends BaseEntity implements Serializable {

    private String name; // 教师名称
    private String tno; // 教师号
    private String password; // 密码
    @JsonIgnoreProperties(value = { "teachers" })
    @ManyToMany
    @JoinTable(name = "t_course_teacher", joinColumns = @JoinColumn(name = "teacher_id"), inverseJoinColumns = @JoinColumn(name = "course_id"))
    private List<Course> courses;

    @OneToMany(mappedBy = "teacher", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JsonManagedReference
    private List<Homework> homeworks; // 作业列表

}
