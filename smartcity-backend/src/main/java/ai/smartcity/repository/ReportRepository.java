package ai.smartcity.repository;

import ai.smartcity.model.Report;
import org.springframework.data.mongodb.repository.MongoRepository;
import java.util.List;

public interface ReportRepository extends MongoRepository<Report, String> {
    List<Report> findByUserEmailOrderByCreatedAtDesc(String email);
}
