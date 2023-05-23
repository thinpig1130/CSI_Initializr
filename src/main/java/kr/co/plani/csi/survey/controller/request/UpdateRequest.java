package kr.co.plani.csi.survey.controller.request;

import kr.co.plani.csi.survey.service.SurveyInitialData;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@NoArgsConstructor
@Getter
@Setter
public class UpdateRequest {
    private Long id;
    private SurveyInitialData info = new SurveyInitialData();
}