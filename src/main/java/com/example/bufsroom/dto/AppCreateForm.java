package com.example.bufsroom.dto;

import com.example.bufsroom.user.AppForm;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.sql.Date;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class AppCreateForm {

	private Date startDate;
	private String startTime;
	private String endTime;
	private String school;
	private String classroom;
	private String purpose;

	public AppForm toEntity(){
		return AppForm.builder()
				.startDate(startDate)
				.startTime(startTime)
				.endTime(endTime)
				.school(school)
				.classroom(classroom)
				.purpose(purpose)
				.build();
	}

}