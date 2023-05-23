package kr.co.plani.csi.survey.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.time.LocalDate;

@Entity
@NoArgsConstructor
@Getter @Setter
public class Survey {
    @Id @GeneratedValue
    private Long id;

    // 기본정보
    private String name;            // 설문지명
    private String description;     // 설문지 설명

    // 기간 입력 승인요청 전 마지막에 입력
    private LocalDate startDt;
    private LocalDate endDt;
}
