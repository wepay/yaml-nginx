/********************************************************** 
* Syntax: geo [$address] $variable { ... }
* Default: —
* Context: http    
**********************************************************/
package com.wepay.nginx.modules.http.geo;

import static com.wepay.nginx.Constants.*;

import java.util.*;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.wepay.nginx.Dumps;
import com.wepay.nginx.NamedAbstractContext;
import com.wepay.nginx.modules.core.Include;
import com.wepay.nginx.modules.http.flv.Address;
import com.wepay.nginx.modules.http.flv.Deletes;

public class Geo extends NamedAbstractContext {
	static final List<String> contexts;
	static {
		contexts = Arrays.asList(HTTP);
	}

	public Geo() {
		super(contexts, null, "geo");
	}

	@JsonProperty("default")
	private Default defaultObj;

	@JsonProperty("address")
	private Address address;

	@JsonProperty("include")
	private Include include;

	@JsonProperty("includes")
	private Include includes;

	@JsonProperty("delete")
	private Delete delete;

	@JsonProperty("deletes")
	private Deletes deletes;

	@JsonProperty("proxy")
	private Proxy proxy;

	@JsonProperty("proxys")
	private Proxys proxys;

	@JsonProperty("ranges")
	private Ranges ranges;

	@JsonProperty("proxy-recursive")
	private ProxyRecursive proxyRecursive;

	@JsonProperty("ip")
	private Ip ip;

	@JsonProperty("ips")
	private Ips ips;

	public Default getDefaultObj() {
		return defaultObj;
	}

	public void setDefaultObj(Default defaultObj) {
		this.defaultObj = defaultObj;
	}

	@Override
	public String getBlockName() {
		return address.getValue();
	}

	@Override
	public void populateMap() {
		java.util.Map<String, Dumps> map = super.getMap();
		map.put("default", defaultObj);
		map.put("include", include);
		map.put("includes", includes);
		map.put("delete", delete);
		map.put("deletes", deletes);
		map.put("proxy", proxy);
		map.put("proxys", proxys);
		map.put("ranges", ranges);
		map.put("ip", ip);
		map.put("ips", ips);
		map.put("proxy-recursive", proxyRecursive);

	}

}
