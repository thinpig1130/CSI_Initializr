package kr.co.plani.csi.survey.controller.response;

import kr.co.plani.csi.survey.service.SurveyInitialData;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class ChangeInfoResponse {
    private Long id;
    private SurveyInitialData info = new SurveyInitialData();
}