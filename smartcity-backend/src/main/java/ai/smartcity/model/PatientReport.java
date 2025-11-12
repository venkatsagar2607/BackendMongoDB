package ai.smartcity.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import java.time.Instant;

@Document(collection = "patient_reports")
public class PatientReport {

    @Id
    private String id;

    private String name;
    private Integer age;
    private Integer aqi;
    private String disease;
    private String userEmail;
    private Instant createdAt;

    // Getters & Setters
    public String getId() { return id; }
    public void setId(String id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public Integer getAge() { return age; }
    public void setAge(Integer age) { this.age = age; }

    public Integer getAqi() { return aqi; }
    public void setAqi(Integer aqi) { this.aqi = aqi; }

    public String getDisease() { return disease; }
    public void setDisease(String disease) { this.disease = disease; }

    public String getUserEmail() { return userEmail; }
    public void setUserEmail(String userEmail) { this.userEmail = userEmail; }

    public Instant getCreatedAt() { return createdAt; }
    public void setCreatedAt(Instant createdAt) { this.createdAt = createdAt; }
}
