/********************************************************** 
* Syntax: events { ... }
* Default: —
* Context: main    
**********************************************************/
package com.wepay.nginx.modules.core;

import static com.wepay.nginx.Constants.*;

import java.util.*;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.wepay.nginx.BlockAbstractContext;
import com.wepay.nginx.Context;
import com.wepay.nginx.Dumps;

public class Events extends BlockAbstractContext {
	static final List<String> contexts;

	static {
		contexts = Arrays.asList(MAIN);
	}
	@JsonProperty("accept_mutex")
	private AcceptMutex acceptMutex;

	@JsonProperty("accept_mutex_delay")
	private AcceptMutexDelay acceptMutexDelay;

	@JsonProperty("debug_connection")
	private DebugConnection debugConnection;

	@JsonProperty("multi_accept")
	private MultiAccept multiAccept;

	@JsonProperty("use")
	private Use use;

	@JsonProperty("worker_aio_requests")
	private WorkerAioRequests workerAioRequests;

	@JsonProperty("worker_connections")
	private WorkerConnections workerConnections;

	public Events() {
		super(contexts, null, "events");
	}

	@Override
	public void populateMap() {
		Map<String, Dumps> map = getMap();
		// map.clear();
		map.put("accept_mutex", acceptMutex);
		map.put("accept_mutex_delay", acceptMutexDelay);
		map.put("debug_connection", debugConnection);
		map.put("multi_accept", multiAccept);
		map.put("use", use);
		map.put("worker_aio_requests", workerAioRequests);
		map.put("worker_connections", workerConnections);

	}
}
