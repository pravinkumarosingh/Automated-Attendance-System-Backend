package com.panto.attendance.repository;

import com.panto.attendance.model.Personnel;
import com.panto.attendance.model.PersonnelImage;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonnelImageRepository extends JpaRepository<PersonnelImage, Long> {
}
