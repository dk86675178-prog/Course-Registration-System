package TodoCRUDApiDB.CrudAPI;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Studentclass {

    @Id
    private Long rno;
    private String name;
    private String email;

    private String course;
    private String batchTime;
    private String duration;

    public Long getRno() { return rno; }
    public void setRno(Long rno) { this.rno = rno; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getCourse() { return course; }
    public void setCourse(String course) { this.course = course; }

    public String getBatchTime() { return batchTime; }
    public void setBatchTime(String batchTime) { this.batchTime = batchTime; }

    public String getDuration() { return duration; }
    public void setDuration(String duration) { this.duration = duration; }
}
