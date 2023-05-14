package com.example.venta.feing;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import com.example.venta.dto.producto;

@FeignClient(name = "catalogo-service", path = "/producto")
public interface productofeing {
    @GetMapping("/{id}")
    public ResponseEntity<producto> listById(@PathVariable(required = true) Integer id);
}
