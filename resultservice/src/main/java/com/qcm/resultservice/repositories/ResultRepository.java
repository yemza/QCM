package com.qcm.resultservice.repositories;

import com.qcm.resultservice.dto.ResultDto;
import com.qcm.resultservice.entities.Result;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ResultRepository extends JpaRepository<Result, Long> {

    @Query("select r from Result r where r.userId = :userId")
    List<Result> findAllByUserId(Long userId);

    @Query("select r from Result r where r.userId = :userId And r.qcmId = :qcmId")
    Result getQcmByIdAndUserId(Long qcmId, Long userId);
}
