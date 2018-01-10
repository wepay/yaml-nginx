/********************************************************** 
* Syntax: server { ... }
* Default: —
* Context: mail    
**********************************************************/
package com.wepay.nginx.modules.mail.core;

import static com.wepay.nginx.Constants.*;
import com.wepay.nginx.modules.mail.auth.http.*;
import com.wepay.nginx.modules.mail.core.*;
import com.wepay.nginx.modules.mail.imap.*;
import com.wepay.nginx.modules.mail.pop3.*;
import com.wepay.nginx.modules.mail.proxy.*;
import com.wepay.nginx.modules.mail.smtp.*;
import com.wepay.nginx.modules.mail.ssl.*;
import java.text.MessageFormat;
import java.util.*;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.wepay.nginx.BlockAbstractContext;
import com.wepay.nginx.Context;
import com.wepay.nginx.IDumps;
import com.wepay.nginx.helper.NginxHelper;

public class Server extends BlockAbstractContext {
	static final List<String> contexts;

	static {
		contexts = Arrays.asList(MAIL);
	}
	@JsonProperty("auth_http")
	private AuthHttp authHttp;

	@JsonProperty("auth_http_header")
	private AuthHttpHeader authHttpHeader;

	@JsonProperty("auth_http_pass_client_cert")
	private AuthHttpPassClientCert authHttpPassClientCert;

	@JsonProperty("auth_http_timeout")
	private AuthHttpTimeout authHttpTimeout;

	@JsonProperty("imap_auth")
	private ImapAuth imapAuth;

	@JsonProperty("imap_capabilities")
	private ImapCapabilities imapCapabilities;

	@JsonProperty("imap_client_buffer")
	private ImapClientBuffer imapClientBuffer;

	@JsonProperty("listen")
	private Listen listen;

	@JsonProperty("pop3_auth")
	private Pop3Auth pop3Auth;

	@JsonProperty("pop3_capabilities")
	private Pop3Capabilities pop3Capabilities;

	@JsonProperty("protocol")
	private Protocol protocol;

	@JsonProperty("proxy_buffer")
	private ProxyBuffer proxyBuffer;

	@JsonProperty("proxy_pass_error_message")
	private ProxyPassErrorMessage proxyPassErrorMessage;

	@JsonProperty("proxy_timeout")
	private ProxyTimeout proxyTimeout;

	@JsonProperty("resolver")
	private Resolver resolver;

	@JsonProperty("resolver_timeout")
	private ResolverTimeout resolverTimeout;

	@JsonProperty("server_name")
	private ServerName serverName;

	@JsonProperty("smtp_auth")
	private SmtpAuth smtpAuth;

	@JsonProperty("smtp_capabilities")
	private SmtpCapabilities smtpCapabilities;

	@JsonProperty("ssl")
	private Ssl ssl;

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

	@JsonProperty("ssl_password_file")
	private SslPasswordFile sslPasswordFile;

	@JsonProperty("ssl_prefer_server_ciphers")
	private SslPreferServerCiphers sslPreferServerCiphers;

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

	@JsonProperty("starttls")
	private Starttls starttls;

	@JsonProperty("timeout")
	private Timeout timeout;

	@JsonProperty("xclient")
	private Xclient xclient;

	public Server() {
		super(contexts, null, "server");
	}

	@Override
	public void populateMap() {
		Map<String, IDumps> map = getMap();
		// map.clear();
		map.put("auth_http", authHttp);
		map.put("auth_http_header", authHttpHeader);
		map.put("auth_http_pass_client_cert", authHttpPassClientCert);
		map.put("auth_http_timeout", authHttpTimeout);
		map.put("imap_auth", imapAuth);
		map.put("imap_capabilities", imapCapabilities);
		map.put("imap_client_buffer", imapClientBuffer);
		map.put("listen", listen);
		map.put("pop3_auth", pop3Auth);
		map.put("pop3_capabilities", pop3Capabilities);
		map.put("protocol", protocol);
		map.put("proxy_buffer", proxyBuffer);
		map.put("proxy_pass_error_message", proxyPassErrorMessage);
		map.put("proxy_timeout", proxyTimeout);
		map.put("resolver", resolver);
		map.put("resolver_timeout", resolverTimeout);
		map.put("server_name", serverName);
		map.put("smtp_auth", smtpAuth);
		map.put("smtp_capabilities", smtpCapabilities);
		map.put("ssl", ssl);
		map.put("ssl_certificate", sslCertificate);
		map.put("ssl_certificate_key", sslCertificateKey);
		map.put("ssl_ciphers", sslCiphers);
		map.put("ssl_client_certificate", sslClientCertificate);
		map.put("ssl_crl", sslCrl);
		map.put("ssl_dhparam", sslDhparam);
		map.put("ssl_ecdh_curve", sslEcdhCurve);
		map.put("ssl_password_file", sslPasswordFile);
		map.put("ssl_prefer_server_ciphers", sslPreferServerCiphers);
		map.put("ssl_protocols", sslProtocols);
		map.put("ssl_session_cache", sslSessionCache);
		map.put("ssl_session_ticket_key", sslSessionTicketKey);
		map.put("ssl_session_tickets", sslSessionTickets);
		map.put("ssl_session_timeout", sslSessionTimeout);
		map.put("ssl_trusted_certificate", sslTrustedCertificate);
		map.put("ssl_verify_client", sslVerifyClient);
		map.put("ssl_verify_depth", sslVerifyDepth);
		map.put("starttls", starttls);
		map.put("timeout", timeout);
		map.put("xclient", xclient);
	}
}
