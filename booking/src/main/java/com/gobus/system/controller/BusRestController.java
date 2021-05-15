package com.gobus.system.controller;

import com.gobus.system.dto.BusDTO;
import com.gobus.system.model.Bus;
import com.gobus.system.service.BusService;
import com.gobus.system.util.ObjectMapperUtils;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author julia antoinette
 */
@RestController
@RequestMapping("/bus")
public class BusRestController {

    @Autowired
    private BusService busService;

    @GetMapping(value = "/")
    public List<BusDTO> getAllBus() {
        return ObjectMapperUtils.mapAll(busService.findAll(), BusDTO.class);
    }

    @SuppressWarnings({ "unchecked", "rawtypes" })
	@PostMapping(value = "/save")
    public ResponseEntity<?> saveOrUpdateBus(@RequestBody BusDTO busDTO) {
    	busService.saveOrUpdateBus(ObjectMapperUtils.map(busDTO, Bus.class));
        return new ResponseEntity("Bus added successfully", HttpStatus.OK);
    }

}
