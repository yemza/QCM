package com.qcm.resultservice.entities;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "result")
public class Result {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "qcm_id", nullable = false)
    private Long  qcmId;

    @Column(name = "user_id", nullable = false)
    private Long  userId;

    @Column(name = "score", nullable = false)
    private byte score;

    @Column(name = "completed_at", nullable = false)
    private Date completed_at;
}
