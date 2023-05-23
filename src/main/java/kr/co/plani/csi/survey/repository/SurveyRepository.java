package kr.co.plani.csi.survey.repository;

import kr.co.plani.csi.survey.domain.Survey;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface SurveyRepository extends JpaRepository<Survey, Long> {
    @Override
    Optional<Survey> findById(Long aLong);
}
