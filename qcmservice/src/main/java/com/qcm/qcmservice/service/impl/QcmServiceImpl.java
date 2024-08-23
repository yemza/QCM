package com.qcm.qcmservice.service.impl;

import com.qcm.qcmservice.dto.QcmDto;
import com.qcm.qcmservice.entities.Qcm;
import com.qcm.qcmservice.mappers.QcmMapper;
import com.qcm.qcmservice.repositories.QcmRepository;
import com.qcm.qcmservice.service.QcmService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class QcmServiceImpl implements QcmService {

    private QcmRepository qcmRepository;
    private QcmMapper qcmMapper;

    public List<QcmDto> getAllQcm() {
        return qcmRepository.findAll().stream()
                .map(qcmMapper::QcmToQcmDto)
                .collect(Collectors.toList());
    }

    public QcmDto getQcmById(Long qcmId) {
        Optional<Qcm> qcmDto = qcmRepository.findById(qcmId);
        return qcmMapper.QcmToQcmDto(qcmDto.get());
    }

    public QcmDto createQcm(QcmDto qcmDto) {
        Qcm newQcm = qcmRepository.save(qcmMapper.qcmDtoToQcm(qcmDto));
        return  qcmMapper.QcmToQcmDto(newQcm);
    }

    public QcmDto updateQcm(QcmDto qcmDto) {
        Qcm newQcm = qcmRepository.save(qcmMapper.qcmDtoToQcm(qcmDto));
        return  qcmMapper.QcmToQcmDto(newQcm);
    }

    public void deleteQCM(Long qcmId) {
        qcmRepository.deleteById(qcmId);
    }
}
