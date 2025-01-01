package com.github.GeneralManza007.NetworkAnalyser.repositories;

import org.springframework.data.repository.CrudRepository;

import com.github.GeneralManza007.NetworkAnalyser.model.PacketLog;


public interface PacketLogRepository extends CrudRepository<PacketLog, Long> {

}
