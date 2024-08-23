package com.qcm.questionservice.feign;

import com.qcm.questionservice.dto.QcmDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(value = "qcmFeign" , url = "${qcm.feign.url}" , path = "/api/v1/qcm")
public interface QcmFeign {

    @GetMapping("/{qcmId}")
    QcmDto getQcmById(@PathVariable("qcmId") Long qcmId);
}
