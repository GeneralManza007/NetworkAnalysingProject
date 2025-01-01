package com.github.GeneralManza007.NetworkAnalyser.controller;

import org.springframework.web.bind.annotation.*;
import com.github.GeneralManza007.NetworkAnalyser.model.PacketLog;
import com.github.GeneralManza007.NetworkAnalyser.repositories.PacketLogRepository;

import java.util.Optional;

@RestController
@RequestMapping("/api/packets")
public class PacketLogController {
	
	private final PacketLogRepository repository;
	
	public PacketLogController(PacketLogRepository repository) {
		this.repository = repository;
	}
	
	@GetMapping
	public Iterable<PacketLog>getAllPackets(){
		return repository.findAll();
	}
	
	@GetMapping("/{id}")
	public Optional<PacketLog>getPacketById(@PathVariable Long id){
		return repository.findById(id);
	}
	
	@PostMapping
	public PacketLog createPacket(@RequestBody PacketLog packetLog) {
		return repository.save(packetLog);
	}
	
	@PutMapping
	public PacketLog updatePacket(@PathVariable Long id, @RequestBody PacketLog packetLog) {
		
		if(repository.existsById(id)) {
			packetLog.setId(id);
			return repository.save(packetLog);
		}
		throw new RuntimeException("Packet not found with id + " + id );
	}
	
	@DeleteMapping("/{id}")
	public void deletePacket(@PathVariable Long id){
		repository.deleteById(id);
	}
}
