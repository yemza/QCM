package com.qcm.qcmservice.mappers;

import com.qcm.qcmservice.dto.QcmDto;
import com.qcm.qcmservice.entities.Qcm;

public interface QcmMapper {

     QcmDto QcmToQcmDto(Qcm qcm) ;

     Qcm qcmDtoToQcm(QcmDto qcmDto);
}
