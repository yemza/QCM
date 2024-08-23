package com.qcm.resultservice.service;

import com.qcm.resultservice.dto.ResultDto;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

public interface ResultService {

    List<ResultDto> getAllQcm(Long userId);

    ResultDto getQcmByIdAndUserId(Long qcmId, Long userId);

}
