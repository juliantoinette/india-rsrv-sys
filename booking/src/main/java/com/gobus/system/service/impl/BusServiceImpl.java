package com.gobus.system.service.impl;

import com.gobus.system.model.Bus;
import com.gobus.system.repository.BusRepository;
import com.gobus.system.service.BusService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author julia antoinette
 */
@Service
public class BusServiceImpl implements BusService {

    @Autowired
    private BusRepository busRepository;

    @Override
    public List<Bus> findAll() {
        return busRepository.findAll();
    }

    @Override
    public Bus saveOrUpdateBus(Bus bus) {
        return busRepository.save(bus);
    }
}
