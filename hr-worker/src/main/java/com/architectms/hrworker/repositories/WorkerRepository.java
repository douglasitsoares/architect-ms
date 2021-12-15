package com.architectms.hrworker.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.architectms.hrworker.entities.Worker;

public interface WorkerRepository extends JpaRepository<Worker, Long>{

}
