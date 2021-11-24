package com.mintiz.domain;

import lombok.Builder;
import lombok.Getter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.Column;
import javax.persistence.EntityListeners;
import javax.persistence.MappedSuperclass;
import java.time.LocalDateTime;

@Getter
@EntityListeners(AuditingEntityListener.class)
@MappedSuperclass
public class BasicClass {

    @CreationTimestamp
    @Column(name = "created_at", nullable = false, updatable = false)
    @Builder.Default
    private LocalDateTime createdAt = LocalDateTime.now();


    @UpdateTimestamp
    @Column(name = "updated_at", nullable = false)
    @Builder.Default
    private LocalDateTime updatedTime = LocalDateTime.now();

    /*
    @CreatedDate
    @Column
    private LocalDateTime createdDate;


    @LastModifiedDate
    @Column
    private LocalDateTime lastModifiedDate;

     */

}
