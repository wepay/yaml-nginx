package com.wepay.nginx;

import static org.junit.Assert.*;

import org.junit.Test;

import com.wepay.nginx.Constants;
import com.wepay.nginx.Dumps;
import com.wepay.nginx.helper.NginxHelper;

public class TestMain {

	@Test
	public void testDumps() {
		String filename = Constants.TEST_RESOURCE_PATH + "/main.yml";
		String expected = "events {\n    multi_accept              true;\n    use                       epoll;\n    worker_connections        4096;\n}\n#Auto generated file\nhttp {\n    ---A----\n    server {\n        ---B----\n        location /home/dist {\n            open_file_cache_errors    on;\n        }\n        ---B----\n        location /home/dist/latest {\n            open_file_cache_errors    off;\n        }\n        open_file_cache_errors    skjdhjkfh;\n        server_name               Roopa;\n        ---C----\n        server_name_in_redirect   off;\n        ---C----\n    }\n    ---A----\n}\nuser                      {{ www_user }} {{ www_group }};\nworker_processes          6;\nworker_rlimit_nofile      50000;\n";
		try {
			String res = NginxFormatter.formatFile(filename, "main");
			assertEquals(res, expected);
		} catch (Throwable e) {
			e.printStackTrace();
			fail();
		}
	}

	@Test
	public void testNginxDumps() {
		String filename = Constants.TEST_RESOURCE_PATH + "/main_nginx.yml";
		String expected = "events {\n    #Accept as many connections as possible, after nginx gets notification about a new connection. May flood worker_connections, if that option is set too low.\n    multi_accept              true;\n    #essential for linux, optmized to serve many clients with each thread\n    use                       epoll;\n    worker_connections        4096;\n}\nhttp {\n    include                   mime.types;\n    include                   /etc/nginx/conf.d/*.conf;\n    client_body_timeout       15;\n    client_header_timeout     15;\n    client_max_body_size      {{ client_max_body_size_and_unit }};\n    default_type              application/octet-stream;\n    gzip                      true;\n    gzip_buffers              16 8k;\n    gzip_comp_level           4;\n    gzip_disable              “MSIE [1-6].(?!.*SV1)”;\n    gzip_min_length           256;\n    gzip_proxied              any;\n    gzip_types                text/plain text/css application/x-javascript text/xml application/xml text/javascript application/rss+xml;\n    gzip_vary                 true;\n    keepalive_requests        20;\n    keepalive_timeout         15;\n    {%- if is_rate_limited|default(False) and not rpc_server|default(False) and not maas_server|default(False)%}\n    limit_req_zone            $binary_remote_addr zone=one:10m rate={{ limit_req_per_sec }}r/s;\n    {% endif %}\n    log_format                main  \"'$remote_addr - $remote_user [$time_local] $ssl_protocol/$ssl_cipher\";\n    #Caches information about open FDs, freqently accessed files.\n    open_file_cache           max=10000 inactive=10s;\n    open_file_cache_errors    true;\n    open_file_cache_min_uses  2;\n    open_file_cache_valid     30s;\n    proxy_set_header          Proxy \"\";\n    #We sometimes have trusted proxies set the X-Forwarded-For header with the\n    real_ip_header            X-Forwarded-For;\n    reset_timedout_connection true;\n    send_timeout              30;\n    sendfile                  true;\n    server_tokens             false;\n    #real request IP.\n    {% for ip in xff_trusted_ips %}\n    set_real_ip_from          {{ ip }};\n    {% endfor %}\n    tcp_nodelay               true;\n    tcp_nopush                true;\n    #FOR FB HACK ONLY\n    upstream secure {\n        server                    127.0.0.1:443 max_fails=1 fail_timeout=2s weight=1;\n    }\n}\nuser                      {{ www_user }} {{ www_group }};\nworker_processes          6;\nworker_rlimit_nofile      50000;\n";
		try {
			String res = NginxFormatter.formatFile(filename, "main");
			assertEquals(res, expected);
		} catch (Throwable e) {
			e.printStackTrace();
			fail();
		}
	}

	@Test
	public void testSimpleDumps() {
		String filename = Constants.TEST_RESOURCE_PATH + "/main_simple.yml";
		String expected = "events {\n    {% if do this %}\n    use                       epoll;\n    {% else do this %}\n}\n";
		try {
			String res = NginxFormatter.formatFile(filename, "main");
			assertEquals(res, expected);
		} catch (Throwable e) {
			e.printStackTrace();
			fail();
		}
	}

}
