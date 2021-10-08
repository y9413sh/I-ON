package com.kosa.emp.model;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Entity
@Table(name = "boot_emp")
public class EmpDTO implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long empno;

    private String ename;
    private String sal;

}
