package ai.smartcity.repository;

import ai.smartcity.model.IncidentReport;
import org.springframework.data.mongodb.repository.MongoRepository;
import java.util.List;

public interface IncidentReportRepository extends MongoRepository<IncidentReport, String> {
    List<IncidentReport> findByUserEmailOrderByCreatedAtDesc(String email);
    List<IncidentReport> findAllByOrderByCreatedAtDesc();
}
