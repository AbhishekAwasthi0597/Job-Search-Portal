package com.geekster.test043.dao;

import com.geekster.test043.model.Job;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JobRepository extends CrudRepository<Job,Long> {
    @Modifying
    @Query(value = "update JOB set JOB_TYPE=:jobTypeString where ID=:id",nativeQuery = true)
    void updateJobType(Long id, String jobTypeString);
}
