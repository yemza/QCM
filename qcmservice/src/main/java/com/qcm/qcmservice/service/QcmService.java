package com.qcm.qcmservice.service;

import com.qcm.qcmservice.dto.QcmDto;
import com.qcm.qcmservice.entities.Qcm;

import java.util.List;

public interface QcmService {
     List<QcmDto> getAllQcm();
     QcmDto getQcmById(Long qcmId);
     QcmDto createQcm(QcmDto qcmDto);
     QcmDto updateQcm(QcmDto qcmDto);
     void deleteQCM(Long qcmId);
}
