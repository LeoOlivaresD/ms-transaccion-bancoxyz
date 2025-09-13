package com.duoc.ms_transaccion_bancoxyz.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.duoc.ms_transaccion_bancoxyz.dtos.DtoTransaccion;
import com.duoc.ms_transaccion_bancoxyz.repository.TransaccionRepository;

@Service
public class TransaccionService {

    @Autowired
    private TransaccionRepository transaccionRepository;

    public TransaccionService(TransaccionRepository transaccionRepository) {
        this.transaccionRepository = transaccionRepository;
    }

    public List<DtoTransaccion> findAllTransactions() {
        return transaccionRepository.findAll().stream()
                .map(transaccion -> new DtoTransaccion(
                        transaccion.getId(),
                        transaccion.getFechaTransaccion(),
                        transaccion.getMonto(),
                        transaccion.getTipo()))
                .toList();
    }
}