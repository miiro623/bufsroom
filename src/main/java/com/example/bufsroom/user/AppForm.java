package com.example.bufsroom.user;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

import java.sql.Date;


@Getter
@Setter
@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class AppForm {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Date startDate;
    private String startTime;
    private String endTime;
    private String school;
    private String classroom;
    private String purpose;

    @Builder
    public AppForm(Date startDate, String startTime, String endTime, String school, String classroom, String purpose) {
        this.startDate = startDate;
        this.startTime = startTime;
        this.endTime = endTime;
        this.school = school;
        this.classroom = classroom;
        this.purpose = purpose;
    }

}
