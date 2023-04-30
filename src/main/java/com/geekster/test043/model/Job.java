package com.geekster.test043.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Table
@Entity

public class Job {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @NotBlank(message = "Title is required")

    private String title;
    @NotBlank(message = "Description is required")
    private String description;
    @NotBlank(message = "Location is required")
    private String location;
    @NotNull
    @DecimalMin(value = "0.0", message = "Salary must be greater than or equal to 0")
    private Double salary;
    @NotBlank
    @Pattern(regexp = "[A-Z][a-z]*")
    private String companyName;
    @NotBlank
    @Pattern(regexp = "[A-Z][a-z]*")
    private String employerName;
    @NotNull(message = "Job type is required")
    @Enumerated(EnumType.STRING)
    private JobType jobType;
}
