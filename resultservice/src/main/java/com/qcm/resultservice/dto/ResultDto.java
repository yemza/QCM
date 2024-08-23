package com.qcm.resultservice.dto;

import lombok.*;

import java.util.Date;

@NoArgsConstructor
@AllArgsConstructor
@RequiredArgsConstructor
@Data
public class ResultDto {

        @NonNull
        private Long id;

        private QcmDto  qcm;

        private UserDto  user;

        @NonNull
        private byte score;
        @NonNull
        private Date completed_at;

}
