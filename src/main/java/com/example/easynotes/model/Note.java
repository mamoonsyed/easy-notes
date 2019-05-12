package com.example.easynotes.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;
import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.util.Date;

@Entity
@Table(name = "notes")
@EntityListeners(AuditingEntityListener.class)
@JsonIgnoreProperties(value = {"createdAt", "updatedAt"}, allowGetters = true)
public class Note implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    
    private Long id;
    public Long getId(){
    return this.id;
    }
    public void setId(Long value){
     this.id = value;
    }

    @NotBlank
    private String title;
    public String getTitle(){
    return this.title;
    }
    public void setTitle(String value){
     this.title = value;
    }

    @NotBlank
    private String content;
    public String getContent(){
    return this.content;
    }
    public void setContent(String value){
     this.content = value;
    }

    @Column(nullable = false, updatable = false)
    @Temporal(TemporalType.TIMESTAMP)
    
    @CreatedDate
    private Date createdAt;
    public Date getCreatedAt(){
    return this.createdAt;
    }
    public void setCreatedAt(Date value){
     this.createdAt = value;
    }

    @Column(nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    
    @LastModifiedDate
    private Date updatedAt;
    public Date getUpdatedAt(){
    return this.updatedAt;
    }
    public void setUpdatedAt(Long value){
     this.updatedAt = value;
    }

    // Getters and Setters ... (Omitted for brevity)
    // added getter and setters myself -transmatter
}