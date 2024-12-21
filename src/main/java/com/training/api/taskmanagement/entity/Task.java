package com.training.api.taskmanagement.entity;

import java.time.LocalDate;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "tasks", uniqueConstraints = @UniqueConstraint(columnNames = {"user_id", "task"}) )
public class Task {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@ManyToOne(cascade = {CascadeType.DETACH,CascadeType.MERGE,CascadeType.PERSIST,CascadeType.REFRESH})
    @JoinColumn(name = "user_id", nullable = false)
	private MyUser user;
	
	@Column(nullable = false)
	private String task;
	
	@CreationTimestamp
	private LocalDate createdAt;
    
    @UpdateTimestamp
	private LocalDate updatedAt;
    
    private LocalDate dueDate;
    
    @ManyToOne
    @JoinColumn(name = "status_id", nullable = false)
    private TaskStatus status;
    
    
}
