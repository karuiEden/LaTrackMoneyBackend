package com.example.latrackmoneybackend.repo;

import com.example.latrackmoneybackend.operationapi.Operation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface OperationRepo extends JpaRepository<Operation, String> {
}
