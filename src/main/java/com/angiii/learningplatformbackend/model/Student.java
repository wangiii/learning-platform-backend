package com.angiii.learningplatformbackend.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "t_student")
@Builder
@Data
@ToString(callSuper = true)
@NoArgsConstructor
@AllArgsConstructor
public class Student extends BaseEntity implements Serializable {

    private String name; // 学生名称
    private String sno; // 学号
    private String password; // 密码
}
