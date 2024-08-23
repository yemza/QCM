package com.qcm.qcmservice.controllers;


import com.qcm.qcmservice.dto.QcmDto;
import com.qcm.qcmservice.service.QcmService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/qcm")
@AllArgsConstructor
public class QcmController {

    private QcmService qcmService;

    @GetMapping("/all")
    public List<QcmDto> getAllQcm() {
        return qcmService.getAllQcm();
    }

    @GetMapping("/{qcmId}")
    public QcmDto getQcmById(@PathVariable("qcmId") Long qcmId) {
        return qcmService.getQcmById(qcmId);
    }

    @PostMapping("/create")
    public QcmDto createQcm(@RequestBody QcmDto qcmDto) {
        return qcmService.createQcm(qcmDto);
    }

    @PutMapping("/update")
    public QcmDto updateQcm(@RequestBody QcmDto qcmDto) {
        return  qcmService.updateQcm(qcmDto);
    }

    @GetMapping("/delete/{qcmId}")
    public void deleteQCM(@PathVariable("qcmId") Long qcmId) {
        qcmService.deleteQCM(qcmId);
    }
}
