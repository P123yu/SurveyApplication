package com.cms.survey.model;


import jakarta.persistence.Column;
import jakarta.persistence.MappedSuperclass;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import lombok.Data;

@Data
@MappedSuperclass
public class BaseModel {

    @Column(name="created_by",updatable = false , length =30)
    protected Long createdBy;

    @Column(name="created_at",updatable = false, columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP", length =50)
    protected Timestamp createdAt;

    @Column(name="updated_by",updatable = false , length =30)
    protected Long updatedBy;

    @Column(name="updated_at",updatable = false, columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP" , length =50)
    protected Timestamp updatedAt;


}