/********************************************************** 
* Syntax: upstream name { ... }
* Default: —
* Context: http    
**********************************************************/
package com.wepay.nginx.modules.http.upstream;

import static com.wepay.nginx.Constants.*;

import java.util.*;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.wepay.nginx.Dumps;
import com.wepay.nginx.NamedAbstractContext;

public class Upstream extends NamedAbstractContext {
	static final List<String> contexts;
	static {
		contexts = Arrays.asList(HTTP);
	}
	
	@JsonProperty("upstream_name")
	private UpstreamName upstreamName;
	
	@JsonProperty("hash")
	private Hash hash;

	@JsonProperty("ip_hash")
	private IpHash ipHash;

	@JsonProperty("keepalive")
	private Keepalive keepalive;

	@JsonProperty("least_conn")
	private LeastConn leastConn;

	@JsonProperty("least_time")
	private LeastTime leastTime;

	@JsonProperty("ntlm")
	private Ntlm ntlm;

	@JsonProperty("queue")
	private Queue queue;

	@JsonProperty("server")
	private Server server;

	@JsonProperty("state")
	private State state;

	@JsonProperty("sticky")
	private Sticky sticky;

	@JsonProperty("sticky_cookie_insert")
	private StickyCookieInsert stickyCookieInsert;

	@JsonProperty("zone")
	private Zone zone;

	public Upstream() {
		super(contexts, null, "upstream");
	}

	@Override
	public void populateMap() {

		Map<String, Dumps> map = getMap();
		// map.clear();
		map.put("hash", hash);
		map.put("ip_hash", ipHash);
		map.put("keepalive", keepalive);
		map.put("least_conn", leastConn);
		map.put("least_time", leastTime);
		map.put("ntlm", ntlm);
		map.put("queue", queue);
		map.put("server", server);
		map.put("state", state);
		map.put("sticky", sticky);
		map.put("sticky_cookie_insert", stickyCookieInsert);
		map.put("zone", zone);

	}

	@Override
	public String getBlockName() {
		// TODO Auto-generated method stub
		return upstreamName.getValue();
	}

}
