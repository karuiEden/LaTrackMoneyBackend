package com.example.latrackmoneybackend.service;

import com.example.latrackmoneybackend.operationapi.Operation;
import com.example.latrackmoneybackend.repo.OperationRepo;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
@Transactional(rollbackOn = Exception.class)
@RequiredArgsConstructor
public class OperationService {
    private final OperationRepo operationRepo;

    public Operation createOperation(Operation operation) {
        return operationRepo.save(operation);
    }

    public Operation getOperation(String operationId) {
        return operationRepo.findById(operationId).orElse(null);
    }

    public List<Operation> getAllOperations() {
        return operationRepo.findAll();
    }

    public void deleteOperation(String operationId) {
        operationRepo.deleteById(operationId);
    }

    public void deleteAllOperations() {
        operationRepo.deleteAll();
    }
}
