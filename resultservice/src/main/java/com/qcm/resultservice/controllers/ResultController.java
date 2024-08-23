package com.qcm.resultservice.controllers;


import com.qcm.resultservice.dto.ResultDto;
import com.qcm.resultservice.service.ResultService;
import jakarta.websocket.server.PathParam;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/result")
@AllArgsConstructor
public class ResultController {

    private ResultService resultService;

    @GetMapping("/all/{user-id}")
    public List<ResultDto> getAllQcm(@PathVariable("user-id") Long userId) {
        return resultService.getAllQcm(userId);
    }

    @GetMapping("/{qcm-id}")
    public ResultDto getAllQcm(@PathVariable("qcm-id") Long qcmId, @RequestParam("userId") Long userId) {
        return resultService.getQcmByIdAndUserId(qcmId, userId);
    }
}
