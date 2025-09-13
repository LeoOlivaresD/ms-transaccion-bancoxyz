package com.duoc.ms_transaccion_bancoxyz.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.duoc.ms_transaccion_bancoxyz.dtos.DtoTransaccion;
import com.duoc.ms_transaccion_bancoxyz.service.TransaccionService;

@RestController
@RequestMapping("banco/api")
public class TransaccionRestController {
    @Autowired
    private TransaccionService transaccionService;

    public TransaccionRestController(TransaccionService transaccionService) {
        this.transaccionService = transaccionService;
    }

    @GetMapping("/transacciones")
    public ResponseEntity<List<DtoTransaccion>> getAllTransactions() {
        return ResponseEntity.ok(transaccionService.findAllTransactions());
    }
}
