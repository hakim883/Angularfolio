// src/main/java/com/votrepackage/repository/ProjectRepository.java
package com.hakimdev.portfolio.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.hakimdev.portfolio.entity.Project;

public interface ProjectRepository extends JpaRepository<Project, Long> {}
