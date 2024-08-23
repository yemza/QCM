package com.qcm.resultservice.mappers;

import com.qcm.resultservice.dto.ResultDto;
import com.qcm.resultservice.entities.Result;

public interface ResultMapper {
     ResultDto resultToResultDto(Result result);
     Result resultDtoToResult(ResultDto resultDto);
}
