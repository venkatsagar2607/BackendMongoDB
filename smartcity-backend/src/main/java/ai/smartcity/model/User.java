package ai.smartcity.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.bson.types.ObjectId;
import java.time.LocalDate;
import java.time.Instant;
import java.util.List;

@Document(collection = "users")
public class User {

    @Id
    private String id; // ✅ Changed from Long → String

    private String email;
    private String password;
    private String name;
    private String role = "USER";
    private Instant createdAt = Instant.now();

    private String phone;
    private LocalDate dob;
    private String address1;
    private String address2;
    private String city;
    private String state;
    private String country;
    private String pincode;

    private List<String> roles;

    // --- Getters and Setters ---
    public String getId() { return id; }
    public void setId(String id) { this.id = id; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getPassword() { return password; }
    public void setPassword(String password) { this.password = password; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getRole() { return role; }
    public void setRole(String role) { this.role = role; }

    public Instant getCreatedAt() { return createdAt; }
    public void setCreatedAt(Instant createdAt) { this.createdAt = createdAt; }

    public String getPhone() { return phone; }
    public void setPhone(String phone) { this.phone = phone; }

    public LocalDate getDob() { return dob; }
    public void setDob(LocalDate dob) { this.dob = dob; }

    public String getAddress1() { return address1; }
    public void setAddress1(String address1) { this.address1 = address1; }

    public String getAddress2() { return address2; }
    public void setAddress2(String address2) { this.address2 = address2; }

    public String getCity() { return city; }
    public void setCity(String city) { this.city = city; }

    public String getState() { return state; }
    public void setState(String state) { this.state = state; }

    public String getCountry() { return country; }
    public void setCountry(String country) { this.country = country; }

    public String getPincode() { return pincode; }
    public void setPincode(String pincode) { this.pincode = pincode; }

    public List<String> getRoles() { return roles; }
    public void setRoles(List<String> roles) { this.roles = roles; }
}
