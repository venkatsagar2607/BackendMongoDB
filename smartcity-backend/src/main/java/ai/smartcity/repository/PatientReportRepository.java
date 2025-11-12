package ai.smartcity.repository;

import ai.smartcity.model.PatientReport;
import org.springframework.data.mongodb.repository.MongoRepository;
import java.util.List;

public interface PatientReportRepository extends MongoRepository<PatientReport, String> {
    List<PatientReport> findByUserEmailOrderByCreatedAtDesc(String email);
    List<PatientReport> findAllByOrderByCreatedAtDesc();
}
