package com.qcm.qcmservice.mappers;

import com.qcm.qcmservice.dto.QcmDto;
import com.qcm.qcmservice.entities.Qcm;
import org.springframework.stereotype.Service;

@Service
public class QcmMapperImpl implements QcmMapper {

    public QcmDto QcmToQcmDto(Qcm qcm) {
        return new QcmDto(qcm.getId(),
                          qcm.getTitle(),
                          qcm.getDescription(),
                          qcm.getCategoryId(),
                          qcm.getDifficultyLevel());
    }
    public Qcm qcmDtoToQcm(QcmDto qcmDto) {
        return new Qcm(qcmDto.getId(),
                       qcmDto.getTitle(),
                       qcmDto.getDescription(),
                       qcmDto.getCategoryId(),
                       qcmDto.getDifficultyLevel());
    }
}
