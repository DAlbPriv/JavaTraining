package com.privalia.model;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@EqualsAndHashCode(callSuper = false)
@Getter
@Setter
@NoArgsConstructor
@RequiredArgsConstructor
public class StudentWithLombok extends PrivaliaObject{

	@NonNull
	private Integer IdStudent;
	@NonNull
	private String Name;
	@NonNull 
	private String Surname;
	@NonNull
	private Integer Age;
	
	
	public static StudentWithLombok getStudent() {
		return new StudentWithLombok();
	}
	
		public String toString() {
			StringBuilder builder = new StringBuilder();
			builder.append(IdStudent);
			builder.append(",");
			builder.append(Name);
			builder.append(",");
			builder.append(Surname);
			builder.append(",");
			builder.append(Age);
			return builder.toString();
		}


	
}
