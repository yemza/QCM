package com.qcm.qcmservice.repositories;

import com.qcm.qcmservice.entities.Qcm;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QcmRepository extends JpaRepository<Qcm, Long> {
}
