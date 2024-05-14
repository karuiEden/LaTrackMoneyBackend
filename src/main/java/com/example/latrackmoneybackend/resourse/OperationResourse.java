package com.example.latrackmoneybackend.resourse;

import com.example.latrackmoneybackend.operationapi.Operation;
import com.example.latrackmoneybackend.service.OperationService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/money")
@RequiredArgsConstructor
public class OperationResourse {
    private final OperationService operationService;

    @PostMapping
    public ResponseEntity<Operation> createOperation(@RequestBody Operation operation) {

        return ResponseEntity.created(URI.create("/money/" + operation.getId())).body(operationService.createOperation(operation));
    }

    @GetMapping
    public ResponseEntity<List<Operation>> getAllOperations() {
        return ResponseEntity.ok(operationService.getAllOperations());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Operation> getOperation(@PathVariable String id) {
        return ResponseEntity.ok(operationService.getOperation(id));
    }

    @DeleteMapping("/{id}")
    public void deleteOperation(@PathVariable String id) {
         operationService.deleteOperation(id);
    }

    @DeleteMapping
    public void deleteAllOperations() {operationService.deleteAllOperations();}
}
