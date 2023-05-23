package kr.co.plani.csi.survey.controller;

import kr.co.plani.csi.survey.controller.request.UpdateRequest;
import kr.co.plani.csi.survey.controller.response.ChangeInfoResponse;
import kr.co.plani.csi.survey.domain.Survey;
import kr.co.plani.csi.survey.service.SurveyInitialData;
import kr.co.plani.csi.survey.service.SurveyService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
@RestController
@RequestMapping("/api/survey")
@RequiredArgsConstructor
public class SurveyController {

    private final SurveyService service;

    @GetMapping("/{id}")
    public Survey create(@PathVariable("id") Long id){
        return service.get(id);
    }

    @PostMapping
    public ChangeInfoResponse create(@RequestBody SurveyInitialData request){

        long id = service.create(request);

        ChangeInfoResponse response = new ChangeInfoResponse();
        response.setId(id);
        response.setInfo(request);

        return response;
    }

    @PatchMapping
    public ChangeInfoResponse update(@RequestBody UpdateRequest request){

        service.update(request.getId(), request.getInfo());

        ChangeInfoResponse response = new ChangeInfoResponse();
        response.setId(request.getId());
        response.setInfo(request.getInfo());

        return response;
    }


}
