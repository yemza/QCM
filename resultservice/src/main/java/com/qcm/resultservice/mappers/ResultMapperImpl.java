package com.qcm.resultservice.mappers;

import com.qcm.resultservice.dto.ResultDto;
import com.qcm.resultservice.entities.Result;
import org.springframework.stereotype.Service;

@Service
public class ResultMapperImpl implements ResultMapper {

    public ResultDto resultToResultDto(Result result){
        return new ResultDto(
                result.getId(),
                result.getScore(),
                result.getCompleted_at());
    };

    public Result resultDtoToResult(ResultDto resultDto){
        return new Result(
                resultDto.getId(),
                resultDto.getQcm().getId(),
                resultDto.getUser().getId(),
                resultDto.getScore(),
                resultDto.getCompleted_at());
    };
}
