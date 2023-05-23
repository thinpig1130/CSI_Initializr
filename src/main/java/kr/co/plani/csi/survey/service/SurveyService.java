package kr.co.plani.csi.survey.service;

import kr.co.plani.csi.survey.domain.Survey;
import kr.co.plani.csi.survey.repository.SurveyRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import javax.transaction.Transactional;

@Service
@Transactional
@RequiredArgsConstructor
public class SurveyService {
    private final SurveyRepository repository;

    public Survey get(Long id){
        return repository.findById(id).orElseThrow( EntityNotFoundException::new );
    }
    public Long create(SurveyInitialData data){
        Survey survey= new Survey();
        survey.setName(data.getName());
        survey.setDescription(data.getDescription());
        Survey save = repository.save(survey);
        return save.getId();
    }

    public void update(Long id, SurveyInitialData data){
        Survey survey = repository.findById(id).orElseThrow( EntityNotFoundException::new);
        survey.setName(data.getName());
        survey.setDescription(data.getDescription());
    }
}
