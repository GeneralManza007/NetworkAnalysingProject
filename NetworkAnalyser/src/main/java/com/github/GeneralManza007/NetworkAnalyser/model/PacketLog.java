package com.github.GeneralManza007.NetworkAnalyser.model;

import jakarta.persistence.*;

@Entity
public class PacketLog {
	
	@Id
	@GeneratedValue
	private Long id;

	@Column(name = "source_ip", nullable = false)
	private String sourceIp;
	
	@Column(name = "destination_ip", nullable = false)
	private String destinationIp;
	
	@Column(name = "protocol", nullable = false)
	private String protocol;
	
	@Column(name = "packet_size", nullable = false)
	private Integer packetSize;
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getSourceIp() {
		return sourceIp;
	}

	public void setSourceIp(String sourceIp) {
		this.sourceIp = sourceIp;
	}

	public String getDestinationIp() {
		return destinationIp;
	}

	public void setDestinationIp(String destinationIp) {
		this.destinationIp = destinationIp;
	}

	public String getProtocol() {
		return protocol;
	}

	public void setProtocol(String protocol) {
		this.protocol = protocol;
	}

	public Integer getPacketSize() {
		return packetSize;
	}

	public void setPacketSize(Integer packetSize) {
		this.packetSize = packetSize;
	}
}
