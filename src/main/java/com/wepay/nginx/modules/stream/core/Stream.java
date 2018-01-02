/********************************************************** 
* Syntax: stream { ... }
* Default: —
* Context: main    
**********************************************************/
package com.wepay.nginx.modules.stream.core;

import static com.wepay.nginx.Constants.*;

import java.text.MessageFormat;
import java.util.Arrays;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.wepay.nginx.BlockAbstractContext;
import com.wepay.nginx.Context;
import com.wepay.nginx.Dumps;
import com.wepay.nginx.helper.NginxHelper;
import com.wepay.nginx.modules.http.map.Map;
import com.wepay.nginx.modules.stream.access.*;
import com.wepay.nginx.modules.stream.geo.*;
import com.wepay.nginx.modules.stream.geoip.*;
import com.wepay.nginx.modules.stream.js.*;
import com.wepay.nginx.modules.stream.keyval.*;
import com.wepay.nginx.modules.stream.limit.conn.*;
import com.wepay.nginx.modules.stream.log.*;
import com.wepay.nginx.modules.stream.map.*;
import com.wepay.nginx.modules.stream.proxy.*;
import com.wepay.nginx.modules.stream.realip.*;
import com.wepay.nginx.modules.stream.ssl.*;
import com.wepay.nginx.modules.stream.ssl.preread.*;
import com.wepay.nginx.modules.stream.upstream.*;
import com.wepay.nginx.modules.stream.upstream.hc.*;

public class Stream extends BlockAbstractContext {

	static final List<String> contexts;
	static {
		contexts = Arrays.asList(MAIN);
	}

	public Stream() {
		super(contexts, null, "stream");
		// TODO Auto-generated constructor stub
	}

	@JsonProperty("access_log")
	private AccessLog accessLog;

	@JsonProperty("allow")
	private Allow allow;

	@JsonProperty("deny")
	private Deny deny;

	@JsonProperty("geo")
	private Geo geo;

	@JsonProperty("geoip_city")
	private GeoipCity geoipCity;

	@JsonProperty("geoip_country")
	private GeoipCountry geoipCountry;

	@JsonProperty("geoip_org")
	private GeoipOrg geoipOrg;

	@JsonProperty("health_check_timeout")
	private HealthCheckTimeout healthCheckTimeout;

	@JsonProperty("js_access")
	private JsAccess jsAccess;

	@JsonProperty("js_filter")
	private JsFilter jsFilter;

	@JsonProperty("js_include")
	private JsInclude jsInclude;

	@JsonProperty("js_preread")
	private JsPreread jsPreread;

	@JsonProperty("js_set")
	private JsSet jsSet;

	@JsonProperty("keyval")
	private Keyval keyval;

	@JsonProperty("keyval_zone")
	private KeyvalZone keyvalZone;

	@JsonProperty("limit_conn")
	private LimitConn limitConn;

	@JsonProperty("limit_conn_log_level")
	private LimitConnLogLevel limitConnLogLevel;

	@JsonProperty("limit_conn_zone")
	private LimitConnZone limitConnZone;

	@JsonProperty("log_format")
	private LogFormat logFormat;

	@JsonProperty("map")
	private Map mapO;

	@JsonProperty("map_hash_bucket_size")
	private MapHashBucketSize mapHashBucketSize;

	@JsonProperty("map_hash_max_size")
	private MapHashMaxSize mapHashMaxSize;

	@JsonProperty("match")
	private Match match;

	@JsonProperty("open_log_file_cache")
	private OpenLogFileCache openLogFileCache;

	@JsonProperty("preread_buffer_size")
	private PrereadBufferSize prereadBufferSize;

	@JsonProperty("preread_timeout")
	private PrereadTimeout prereadTimeout;

	@JsonProperty("proxy_bind")
	private ProxyBind proxyBind;

	@JsonProperty("proxy_buffer_size")
	private ProxyBufferSize proxyBufferSize;

	@JsonProperty("proxy_connect_timeout")
	private ProxyConnectTimeout proxyConnectTimeout;

	@JsonProperty("proxy_download_rate")
	private ProxyDownloadRate proxyDownloadRate;

	@JsonProperty("proxy_next_upstream")
	private ProxyNextUpstream proxyNextUpstream;

	@JsonProperty("proxy_next_upstream_timeout")
	private ProxyNextUpstreamTimeout proxyNextUpstreamTimeout;

	@JsonProperty("proxy_next_upstream_tries")
	private ProxyNextUpstreamTries proxyNextUpstreamTries;

	@JsonProperty("proxy_protocol")
	private ProxyProtocol proxyProtocol;

	@JsonProperty("proxy_protocol_timeout")
	private ProxyProtocolTimeout proxyProtocolTimeout;

	@JsonProperty("proxy_responses")
	private ProxyResponses proxyResponses;

	@JsonProperty("proxy_ssl")
	private ProxySsl proxySsl;

	@JsonProperty("proxy_ssl_certificate")
	private ProxySslCertificate proxySslCertificate;

	@JsonProperty("proxy_ssl_certificate_key")
	private ProxySslCertificateKey proxySslCertificateKey;

	@JsonProperty("proxy_ssl_ciphers")
	private ProxySslCiphers proxySslCiphers;

	@JsonProperty("proxy_ssl_crl")
	private ProxySslCrl proxySslCrl;

	@JsonProperty("proxy_ssl_name")
	private ProxySslName proxySslName;

	@JsonProperty("proxy_ssl_password_file")
	private ProxySslPasswordFile proxySslPasswordFile;

	@JsonProperty("proxy_ssl_protocols")
	private ProxySslProtocols proxySslProtocols;

	@JsonProperty("proxy_ssl_server_name")
	private ProxySslServerName proxySslServerName;

	@JsonProperty("proxy_ssl_session_reuse")
	private ProxySslSessionReuse proxySslSessionReuse;

	@JsonProperty("proxy_ssl_trusted_certificate")
	private ProxySslTrustedCertificate proxySslTrustedCertificate;

	@JsonProperty("proxy_ssl_verify")
	private ProxySslVerify proxySslVerify;

	@JsonProperty("proxy_ssl_verify_depth")
	private ProxySslVerifyDepth proxySslVerifyDepth;

	@JsonProperty("proxy_timeout")
	private ProxyTimeout proxyTimeout;

	@JsonProperty("proxy_upload_rate")
	private ProxyUploadRate proxyUploadRate;

	@JsonProperty("resolver")
	private Resolver resolver;

	@JsonProperty("resolver_timeout")
	private ResolverTimeout resolverTimeout;

	@JsonProperty("server")
	private Server server;

	@JsonProperty("set_real_ip_from")
	private SetRealIpFrom setRealIpFrom;

	@JsonProperty("ssl_certificate")
	private SslCertificate sslCertificate;

	@JsonProperty("ssl_certificate_key")
	private SslCertificateKey sslCertificateKey;

	@JsonProperty("ssl_ciphers")
	private SslCiphers sslCiphers;

	@JsonProperty("ssl_client_certificate")
	private SslClientCertificate sslClientCertificate;

	@JsonProperty("ssl_crl")
	private SslCrl sslCrl;

	@JsonProperty("ssl_dhparam")
	private SslDhparam sslDhparam;

	@JsonProperty("ssl_ecdh_curve")
	private SslEcdhCurve sslEcdhCurve;

	@JsonProperty("ssl_handshake_timeout")
	private SslHandshakeTimeout sslHandshakeTimeout;

	@JsonProperty("ssl_password_file")
	private SslPasswordFile sslPasswordFile;

	@JsonProperty("ssl_prefer_server_ciphers")
	private SslPreferServerCiphers sslPreferServerCiphers;

	@JsonProperty("ssl_preread")
	private SslPreread sslPreread;

	@JsonProperty("ssl_protocols")
	private SslProtocols sslProtocols;

	@JsonProperty("ssl_session_cache")
	private SslSessionCache sslSessionCache;

	@JsonProperty("ssl_session_ticket_key")
	private SslSessionTicketKey sslSessionTicketKey;

	@JsonProperty("ssl_session_tickets")
	private SslSessionTickets sslSessionTickets;

	@JsonProperty("ssl_session_timeout")
	private SslSessionTimeout sslSessionTimeout;

	@JsonProperty("ssl_trusted_certificate")
	private SslTrustedCertificate sslTrustedCertificate;

	@JsonProperty("ssl_verify_client")
	private SslVerifyClient sslVerifyClient;

	@JsonProperty("ssl_verify_depth")
	private SslVerifyDepth sslVerifyDepth;

	@JsonProperty("tcp_nodelay")
	private TcpNodelay tcpNodelay;

	@JsonProperty("upstream")
	private Upstream upstream;

	@JsonProperty("variables_hash_bucket_size")
	private VariablesHashBucketSize variablesHashBucketSize;

	@JsonProperty("variables_hash_max_size")
	private VariablesHashMaxSize variablesHashMaxSize;

	@Override
	public void populateMap() {
		java.util.Map<String, Dumps> map = getMap();
		// map.clear();
		map.put("access_log", accessLog);
		map.put("allow", allow);
		map.put("deny", deny);
		map.put("geo", geo);
		map.put("geoip_city", geoipCity);
		map.put("geoip_country", geoipCountry);
		map.put("geoip_org", geoipOrg);
		map.put("health_check_timeout", healthCheckTimeout);
		map.put("js_access", jsAccess);
		map.put("js_filter", jsFilter);
		map.put("js_include", jsInclude);
		map.put("js_preread", jsPreread);
		map.put("js_set", jsSet);
		map.put("keyval", keyval);
		map.put("keyval_zone", keyvalZone);
		map.put("limit_conn", limitConn);
		map.put("limit_conn_log_level", limitConnLogLevel);
		map.put("limit_conn_zone", limitConnZone);
		map.put("log_format", logFormat);
		map.put("map", mapO);
		map.put("map_hash_bucket_size", mapHashBucketSize);
		map.put("map_hash_max_size", mapHashMaxSize);
		map.put("match", match);
		map.put("open_log_file_cache", openLogFileCache);
		map.put("preread_buffer_size", prereadBufferSize);
		map.put("preread_timeout", prereadTimeout);
		map.put("proxy_bind", proxyBind);
		map.put("proxy_buffer_size", proxyBufferSize);
		map.put("proxy_connect_timeout", proxyConnectTimeout);
		map.put("proxy_download_rate", proxyDownloadRate);
		map.put("proxy_next_upstream", proxyNextUpstream);
		map.put("proxy_next_upstream_timeout", proxyNextUpstreamTimeout);
		map.put("proxy_next_upstream_tries", proxyNextUpstreamTries);
		map.put("proxy_protocol", proxyProtocol);
		map.put("proxy_protocol_timeout", proxyProtocolTimeout);
		map.put("proxy_responses", proxyResponses);
		map.put("proxy_ssl", proxySsl);
		map.put("proxy_ssl_certificate", proxySslCertificate);
		map.put("proxy_ssl_certificate_key", proxySslCertificateKey);
		map.put("proxy_ssl_ciphers", proxySslCiphers);
		map.put("proxy_ssl_crl", proxySslCrl);
		map.put("proxy_ssl_name", proxySslName);
		map.put("proxy_ssl_password_file", proxySslPasswordFile);
		map.put("proxy_ssl_protocols", proxySslProtocols);
		map.put("proxy_ssl_server_name", proxySslServerName);
		map.put("proxy_ssl_session_reuse", proxySslSessionReuse);
		map.put("proxy_ssl_trusted_certificate", proxySslTrustedCertificate);
		map.put("proxy_ssl_verify", proxySslVerify);
		map.put("proxy_ssl_verify_depth", proxySslVerifyDepth);
		map.put("proxy_timeout", proxyTimeout);
		map.put("proxy_upload_rate", proxyUploadRate);
		map.put("resolver", resolver);
		map.put("resolver_timeout", resolverTimeout);
		map.put("server", server);
		map.put("set_real_ip_from", setRealIpFrom);
		map.put("ssl_certificate", sslCertificate);
		map.put("ssl_certificate_key", sslCertificateKey);
		map.put("ssl_ciphers", sslCiphers);
		map.put("ssl_client_certificate", sslClientCertificate);
		map.put("ssl_crl", sslCrl);
		map.put("ssl_dhparam", sslDhparam);
		map.put("ssl_ecdh_curve", sslEcdhCurve);
		map.put("ssl_handshake_timeout", sslHandshakeTimeout);
		map.put("ssl_password_file", sslPasswordFile);
		map.put("ssl_prefer_server_ciphers", sslPreferServerCiphers);
		map.put("ssl_preread", sslPreread);
		map.put("ssl_protocols", sslProtocols);
		map.put("ssl_session_cache", sslSessionCache);
		map.put("ssl_session_ticket_key", sslSessionTicketKey);
		map.put("ssl_session_tickets", sslSessionTickets);
		map.put("ssl_session_timeout", sslSessionTimeout);
		map.put("ssl_trusted_certificate", sslTrustedCertificate);
		map.put("ssl_verify_client", sslVerifyClient);
		map.put("ssl_verify_depth", sslVerifyDepth);
		map.put("tcp_nodelay", tcpNodelay);
		map.put("upstream", upstream);
		map.put("variables_hash_bucket_size", variablesHashBucketSize);
		map.put("variables_hash_max_size", variablesHashMaxSize);

	}
}
