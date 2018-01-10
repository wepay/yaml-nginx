/********************************************************** 
* Syntax: upstream name { ... }
* Default: —
* Context: stream    
**********************************************************/
package com.wepay.nginx.modules.stream.upstream;

import static com.wepay.nginx.Constants.*;

import java.util.*;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.wepay.nginx.IDumps;
import com.wepay.nginx.NamedAbstractContext;
import com.wepay.nginx.modules.http.upstream.UpstreamName;

public class Upstream extends NamedAbstractContext {
	static final List<String> contexts;
	static {
		contexts = Arrays.asList(STREAM);
	}

	@JsonProperty("UpstreamName")
	private UpstreamName upstreamName;

	@JsonProperty("hash")
	private Hash hash;

	@JsonProperty("least_conn")
	private LeastConn leastConn;

	@JsonProperty("least_time")
	private LeastTime leastTime;

	@JsonProperty("server")
	private Server server;

	@JsonProperty("servers")
	private Servers servers;

	@JsonProperty("state")
	private State state;

	@JsonProperty("zone")
	private Zone zone;

	public Upstream() {
		super(contexts, null, "upstream");
	}

	@Override
	public void populateMap() {
		Map<String, IDumps> map = getMap();
		map.put("hash", hash);
		map.put("least_conn", leastConn);
		map.put("least_time", leastTime);
		map.put("server", server);
		map.put("servers", servers);
		map.put("state", state);
		map.put("zone", zone);
	}

	@Override
	public String getBlockName() {
		return upstreamName.getValue();
	}
}
