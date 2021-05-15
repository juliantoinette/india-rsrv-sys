package com.gobus.system.service;

import java.util.List;

import com.gobus.system.model.Bus;

/**
 * @author julia antoinette
 */
public interface BusService {

    List<Bus> findAll();

    Bus saveOrUpdateBus(Bus bus);


}
