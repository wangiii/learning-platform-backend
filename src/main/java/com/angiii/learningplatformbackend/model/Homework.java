package com.angiii.learningplatformbackend.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "t_homework")
@Builder
@Data
@ToString(callSuper = true)
@NoArgsConstructor
@AllArgsConstructor
public class Homework extends BaseEntity implements Serializable {

    private String title; // 作业标题
    @ManyToOne(cascade = {CascadeType.MERGE, CascadeType.REFRESH}, optional = false)
    @JoinColumn(name = "teacher_id")
    @JsonBackReference
    private Teacher teacher; // 所属教师

    @ManyToOne(cascade = {CascadeType.MERGE, CascadeType.REFRESH}, optional = false)
    @JoinColumn(name = "course_id")
    @JsonBackReference
    private Course course; // 所属课程
}
