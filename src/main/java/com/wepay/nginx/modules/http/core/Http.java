/********************************************************** 
* Syntax: http { ... }
* Default: —
* Context: main    
**********************************************************/
package com.wepay.nginx.modules.http.core;

import static com.wepay.nginx.Constants.*;

import java.util.*;
import com.wepay.nginx.modules.core.*;
import com.wepay.nginx.modules.http.access.*;
import com.wepay.nginx.modules.http.addition.*;
import com.wepay.nginx.modules.http.auth.basic.*;
import com.wepay.nginx.modules.http.auth.jwt.*;
import com.wepay.nginx.modules.http.auth.request.*;
import com.wepay.nginx.modules.http.autoindex.*;
import com.wepay.nginx.modules.http.browser.*;
import com.wepay.nginx.modules.http.dav.*;
import com.wepay.nginx.modules.http.f4f.*;
import com.wepay.nginx.modules.http.fastcgi.*;
import com.wepay.nginx.modules.http.geo.*;
import com.wepay.nginx.modules.http.geoip.*;
import com.wepay.nginx.modules.http.gunzip.*;
import com.wepay.nginx.modules.http.gzip.*;
import com.wepay.nginx.modules.http.gzip.stat.*;
import com.wepay.nginx.modules.http.headers.*;
import com.wepay.nginx.modules.http.hls.*;
import com.wepay.nginx.modules.http.image.filter.*;
import com.wepay.nginx.modules.http.index.*;
import com.wepay.nginx.modules.http.js.*;
import com.wepay.nginx.modules.http.keyval.*;
import com.wepay.nginx.modules.http.limit.conn.*;
import com.wepay.nginx.modules.http.limit.req.*;
import com.wepay.nginx.modules.http.log.*;
import com.wepay.nginx.modules.http.map.*;
import com.wepay.nginx.modules.http.map.Map;
import com.wepay.nginx.modules.http.mirror.*;
import com.wepay.nginx.modules.http.mp4.*;
import com.wepay.nginx.modules.http.perl.*;
import com.wepay.nginx.modules.http.proxy.*;
import com.wepay.nginx.modules.http.realip.*;
import com.wepay.nginx.modules.http.rewrite.*;
import com.wepay.nginx.modules.http.scgi.*;
import com.wepay.nginx.modules.http.secure.link.*;
import com.wepay.nginx.modules.http.session.log.*;
import com.wepay.nginx.modules.http.slice.*;
import com.wepay.nginx.modules.http.spdy.*;
import com.wepay.nginx.modules.http.split.clients.*;
import com.wepay.nginx.modules.http.ssi.*;
import com.wepay.nginx.modules.http.ssl.*;
import com.wepay.nginx.modules.http.status.*;
import com.wepay.nginx.modules.http.sub.*;
import com.wepay.nginx.modules.http.upstream.*;
import com.wepay.nginx.modules.http.upstream.hc.*;
import com.wepay.nginx.modules.http.userid.*;
import com.wepay.nginx.modules.http.uwsgi.*;
import com.wepay.nginx.modules.http.v2.*;
import com.wepay.nginx.modules.http.xslt.*;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.wepay.nginx.BlockAbstractContext;
import com.wepay.nginx.IDumps;

public class Http extends BlockAbstractContext {
	static final List<String> contexts;

	static {
		contexts = Arrays.asList(MAIN);
	}
	@JsonProperty("absolute_redirect")
	private AbsoluteRedirect absoluteRedirect;

	@JsonProperty("access_log")
	private AccessLog accessLog;

	@JsonProperty("add_after_body")
	private AddAfterBody addAfterBody;

	@JsonProperty("add_before_body")
	private AddBeforeBody addBeforeBody;

	@JsonProperty("add_header")
	private AddHeader addHeader;

	@JsonProperty("add_trailer")
	private AddTrailer addTrailer;

	@JsonProperty("addition_types")
	private AdditionTypes additionTypes;

	@JsonProperty("aio")
	private Aio aio;

	@JsonProperty("aio_write")
	private AioWrite aioWrite;

	@JsonProperty("allow")
	private Allow allow;

	@JsonProperty("allows")
	private Allows allows;

	@JsonProperty("ancient_browser")
	private AncientBrowser ancientBrowser;

	@JsonProperty("ancient_browser_value")
	private AncientBrowserValue ancientBrowserValue;

	@JsonProperty("auth_basic")
	private AuthBasic authBasic;

	@JsonProperty("auth_basic_user_file")
	private AuthBasicUserFile authBasicUserFile;

	@JsonProperty("auth_jwt")
	private AuthJwt authJwt;

	@JsonProperty("auth_jwt_claim_set")
	private AuthJwtClaimSet authJwtClaimSet;

	@JsonProperty("auth_jwt_header_set")
	private AuthJwtHeaderSet authJwtHeaderSet;

	@JsonProperty("auth_jwt_key_file")
	private AuthJwtKeyFile authJwtKeyFile;

	@JsonProperty("auth_request")
	private AuthRequest authRequest;

	@JsonProperty("auth_request_set")
	private AuthRequestSet authRequestSet;

	@JsonProperty("autoindex")
	private Autoindex autoindex;

	@JsonProperty("autoindex_exact_size")
	private AutoindexExactSize autoindexExactSize;

	@JsonProperty("autoindex_format")
	private AutoindexFormat autoindexFormat;

	@JsonProperty("autoindex_localtime")
	private AutoindexLocaltime autoindexLocaltime;

	@JsonProperty("chunked_transfer_encoding")
	private ChunkedTransferEncoding chunkedTransferEncoding;

	@JsonProperty("client_body_buffer_size")
	private ClientBodyBufferSize clientBodyBufferSize;

	@JsonProperty("client_body_in_file_only")
	private ClientBodyInFileOnly clientBodyInFileOnly;

	@JsonProperty("client_body_in_single_buffer")
	private ClientBodyInSingleBuffer clientBodyInSingleBuffer;

	@JsonProperty("client_body_temp_path")
	private ClientBodyTempPath clientBodyTempPath;

	@JsonProperty("client_body_timeout")
	private ClientBodyTimeout clientBodyTimeout;

	@JsonProperty("client_header_buffer_size")
	private ClientHeaderBufferSize clientHeaderBufferSize;

	@JsonProperty("client_header_timeout")
	private ClientHeaderTimeout clientHeaderTimeout;

	@JsonProperty("client_max_body_size")
	private ClientMaxBodySize clientMaxBodySize;

	@JsonProperty("connection_pool_size")
	private ConnectionPoolSize connectionPoolSize;

	@JsonProperty("create_full_put_path")
	private CreateFullPutPath createFullPutPath;

	@JsonProperty("dav_access")
	private DavAccess davAccess;

	@JsonProperty("dav_methods")
	private DavMethods davMethods;

	@JsonProperty("default_type")
	private DefaultType defaultType;

	@JsonProperty("deny")
	private Deny deny;
	@JsonProperty("denys")
	private Denys denys;
	@JsonProperty("directio")
	private Directio directio;

	@JsonProperty("directio_alignment")
	private DirectioAlignment directioAlignment;

	@JsonProperty("disable_symlinks")
	private DisableSymlinks disableSymlinks;

	@JsonProperty("error_log")
	private ErrorLog errorLog;

	@JsonProperty("error_page")
	private ErrorPage errorPage;

	@JsonProperty("etag")
	private Etag etag;

	@JsonProperty("expires")
	private Expires expires;

	@JsonProperty("f4f_buffer_size")
	private F4fBufferSize f4fBufferSize;

	@JsonProperty("fastcgi_bind")
	private FastcgiBind fastcgiBind;

	@JsonProperty("fastcgi_buffer_size")
	private FastcgiBufferSize fastcgiBufferSize;

	@JsonProperty("fastcgi_buffering")
	private FastcgiBuffering fastcgiBuffering;

	@JsonProperty("fastcgi_buffers")
	private FastcgiBuffers fastcgiBuffers;

	@JsonProperty("fastcgi_busy_buffers_size")
	private FastcgiBusyBuffersSize fastcgiBusyBuffersSize;

	@JsonProperty("fastcgi_cache")
	private FastcgiCache fastcgiCache;

	@JsonProperty("fastcgi_cache_background_update")
	private FastcgiCacheBackgroundUpdate fastcgiCacheBackgroundUpdate;

	@JsonProperty("fastcgi_cache_bypass")
	private FastcgiCacheBypass fastcgiCacheBypass;

	@JsonProperty("fastcgi_cache_key")
	private FastcgiCacheKey fastcgiCacheKey;

	@JsonProperty("fastcgi_cache_lock")
	private FastcgiCacheLock fastcgiCacheLock;

	@JsonProperty("fastcgi_cache_lock_age")
	private FastcgiCacheLockAge fastcgiCacheLockAge;

	@JsonProperty("fastcgi_cache_lock_timeout")
	private FastcgiCacheLockTimeout fastcgiCacheLockTimeout;

	@JsonProperty("fastcgi_cache_max_range_offset")
	private FastcgiCacheMaxRangeOffset fastcgiCacheMaxRangeOffset;

	@JsonProperty("fastcgi_cache_methods")
	private FastcgiCacheMethods fastcgiCacheMethods;

	@JsonProperty("fastcgi_cache_min_uses")
	private FastcgiCacheMinUses fastcgiCacheMinUses;

	@JsonProperty("fastcgi_cache_path")
	private FastcgiCachePath fastcgiCachePath;

	@JsonProperty("fastcgi_cache_purge")
	private FastcgiCachePurge fastcgiCachePurge;

	@JsonProperty("fastcgi_cache_revalidate")
	private FastcgiCacheRevalidate fastcgiCacheRevalidate;

	@JsonProperty("fastcgi_cache_use_stale")
	private FastcgiCacheUseStale fastcgiCacheUseStale;

	@JsonProperty("fastcgi_cache_valid")
	private FastcgiCacheValid fastcgiCacheValid;

	@JsonProperty("fastcgi_catch_stderr")
	private FastcgiCatchStderr fastcgiCatchStderr;

	@JsonProperty("fastcgi_connect_timeout")
	private FastcgiConnectTimeout fastcgiConnectTimeout;

	@JsonProperty("fastcgi_force_ranges")
	private FastcgiForceRanges fastcgiForceRanges;

	@JsonProperty("fastcgi_hide_header")
	private FastcgiHideHeader fastcgiHideHeader;

	@JsonProperty("fastcgi_ignore_client_abort")
	private FastcgiIgnoreClientAbort fastcgiIgnoreClientAbort;

	@JsonProperty("fastcgi_ignore_headers")
	private FastcgiIgnoreHeaders fastcgiIgnoreHeaders;

	@JsonProperty("fastcgi_index")
	private FastcgiIndex fastcgiIndex;

	@JsonProperty("fastcgi_intercept_errors")
	private FastcgiInterceptErrors fastcgiInterceptErrors;

	@JsonProperty("fastcgi_keep_conn")
	private FastcgiKeepConn fastcgiKeepConn;

	@JsonProperty("fastcgi_limit_rate")
	private FastcgiLimitRate fastcgiLimitRate;

	@JsonProperty("fastcgi_max_temp_file_size")
	private FastcgiMaxTempFileSize fastcgiMaxTempFileSize;

	@JsonProperty("fastcgi_next_upstream")
	private FastcgiNextUpstream fastcgiNextUpstream;

	@JsonProperty("fastcgi_next_upstream_timeout")
	private FastcgiNextUpstreamTimeout fastcgiNextUpstreamTimeout;

	@JsonProperty("fastcgi_next_upstream_tries")
	private FastcgiNextUpstreamTries fastcgiNextUpstreamTries;

	@JsonProperty("fastcgi_no_cache")
	private FastcgiNoCache fastcgiNoCache;

	@JsonProperty("fastcgi_param")
	private FastcgiParam fastcgiParam;

	@JsonProperty("fastcgi_pass_header")
	private FastcgiPassHeader fastcgiPassHeader;

	@JsonProperty("fastcgi_pass_request_body")
	private FastcgiPassRequestBody fastcgiPassRequestBody;

	@JsonProperty("fastcgi_pass_request_headers")
	private FastcgiPassRequestHeaders fastcgiPassRequestHeaders;

	@JsonProperty("fastcgi_read_timeout")
	private FastcgiReadTimeout fastcgiReadTimeout;

	@JsonProperty("fastcgi_request_buffering")
	private FastcgiRequestBuffering fastcgiRequestBuffering;

	@JsonProperty("fastcgi_send_lowat")
	private FastcgiSendLowat fastcgiSendLowat;

	@JsonProperty("fastcgi_send_timeout")
	private FastcgiSendTimeout fastcgiSendTimeout;

	@JsonProperty("fastcgi_store")
	private FastcgiStore fastcgiStore;

	@JsonProperty("fastcgi_store_access")
	private FastcgiStoreAccess fastcgiStoreAccess;

	@JsonProperty("fastcgi_temp_file_write_size")
	private FastcgiTempFileWriteSize fastcgiTempFileWriteSize;

	@JsonProperty("fastcgi_temp_path")
	private FastcgiTempPath fastcgiTempPath;

	@JsonProperty("geo")
	private Geo geo;

	@JsonProperty("geoip_city")
	private GeoipCity geoipCity;

	@JsonProperty("geoip_country")
	private GeoipCountry geoipCountry;

	@JsonProperty("geoip_org")
	private GeoipOrg geoipOrg;

	@JsonProperty("geoip_proxy")
	private GeoipProxy geoipProxy;

	@JsonProperty("geoip_proxy_recursive")
	private GeoipProxyRecursive geoipProxyRecursive;

	@JsonProperty("gunzip")
	private Gunzip gunzip;

	@JsonProperty("gunzip_buffers")
	private GunzipBuffers gunzipBuffers;

	@JsonProperty("gzip")
	private Gzip gzip;

	@JsonProperty("gzip_buffers")
	private GzipBuffers gzipBuffers;

	@JsonProperty("gzip_comp_level")
	private GzipCompLevel gzipCompLevel;

	@JsonProperty("gzip_disable")
	private GzipDisable gzipDisable;

	@JsonProperty("gzip_http_version")
	private GzipHttpVersion gzipHttpVersion;

	@JsonProperty("gzip_min_length")
	private GzipMinLength gzipMinLength;

	@JsonProperty("gzip_proxied")
	private GzipProxied gzipProxied;

	@JsonProperty("gzip_static")
	private GzipStatic gzipStatic;

	@JsonProperty("gzip_types")
	private GzipTypes gzipTypes;

	@JsonProperty("gzip_vary")
	private GzipVary gzipVary;

	@JsonProperty("hls_buffers")
	private HlsBuffers hlsBuffers;

	@JsonProperty("hls_forward_args")
	private HlsForwardArgs hlsForwardArgs;

	@JsonProperty("hls_fragment")
	private HlsFragment hlsFragment;

	@JsonProperty("hls_mp4_buffer_size")
	private HlsMp4BufferSize hlsMp4BufferSize;

	@JsonProperty("hls_mp4_max_buffer_size")
	private HlsMp4MaxBufferSize hlsMp4MaxBufferSize;

	@JsonProperty("http2_body_preread_size")
	private Http2BodyPrereadSize http2BodyPrereadSize;

	@JsonProperty("http2_chunk_size")
	private Http2ChunkSize http2ChunkSize;

	@JsonProperty("http2_idle_timeout")
	private Http2IdleTimeout http2IdleTimeout;

	@JsonProperty("http2_max_concurrent_streams")
	private Http2MaxConcurrentStreams http2MaxConcurrentStreams;

	@JsonProperty("http2_max_field_size")
	private Http2MaxFieldSize http2MaxFieldSize;

	@JsonProperty("http2_max_header_size")
	private Http2MaxHeaderSize http2MaxHeaderSize;

	@JsonProperty("http2_max_requests")
	private Http2MaxRequests http2MaxRequests;

	@JsonProperty("http2_recv_buffer_size")
	private Http2RecvBufferSize http2RecvBufferSize;

	@JsonProperty("http2_recv_timeout")
	private Http2RecvTimeout http2RecvTimeout;

	@JsonProperty("if_modified_since")
	private IfModifiedSince ifModifiedSince;

	@JsonProperty("ignore_invalid_headers")
	private IgnoreInvalidHeaders ignoreInvalidHeaders;

	@JsonProperty("image_filter_buffer")
	private ImageFilterBuffer imageFilterBuffer;

	@JsonProperty("image_filter_interlace")
	private ImageFilterInterlace imageFilterInterlace;

	@JsonProperty("image_filter_jpeg_quality")
	private ImageFilterJpegQuality imageFilterJpegQuality;

	@JsonProperty("image_filter_sharpen")
	private ImageFilterSharpen imageFilterSharpen;

	@JsonProperty("image_filter_transparency")
	private ImageFilterTransparency imageFilterTransparency;

	@JsonProperty("image_filter_webp_quality")
	private ImageFilterWebpQuality imageFilterWebpQuality;

	@JsonProperty("index")
	private Index index;

	@JsonProperty("js_include")
	private JsInclude jsInclude;

	@JsonProperty("js_set")
	private JsSet jsSet;

	@JsonProperty("keepalive_disable")
	private KeepaliveDisable keepaliveDisable;

	@JsonProperty("keepalive_requests")
	private KeepaliveRequests keepaliveRequests;

	@JsonProperty("keepalive_timeout")
	private KeepaliveTimeout keepaliveTimeout;

	@JsonProperty("keyval")
	private Keyval keyval;

	@JsonProperty("keyval_zone")
	private KeyvalZone keyvalZone;

	@JsonProperty("large_client_header_buffers")
	private LargeClientHeaderBuffers largeClientHeaderBuffers;

	@JsonProperty("limit_conn")
	private LimitConn limitConn;

	@JsonProperty("limit_conn_log_level")
	private LimitConnLogLevel limitConnLogLevel;

	@JsonProperty("limit_conn_status")
	private LimitConnStatus limitConnStatus;

	@JsonProperty("limit_conn_zone")
	private LimitConnZone limitConnZone;

	@JsonProperty("limit_rate")
	private LimitRate limitRate;

	@JsonProperty("limit_rate_after")
	private LimitRateAfter limitRateAfter;

	@JsonProperty("limit_req")
	private LimitReq limitReq;

	@JsonProperty("limit_req_log_level")
	private LimitReqLogLevel limitReqLogLevel;

	@JsonProperty("limit_req_status")
	private LimitReqStatus limitReqStatus;

	@JsonProperty("limit_req_zone")
	private LimitReqZone limitReqZone;

	@JsonProperty("limit_zone")
	private LimitZone limitZone;

	@JsonProperty("lingering_close")
	private LingeringClose lingeringClose;

	@JsonProperty("lingering_time")
	private LingeringTime lingeringTime;

	@JsonProperty("lingering_timeout")
	private LingeringTimeout lingeringTimeout;

	@JsonProperty("log_format")
	private LogFormat logFormat;

	@JsonProperty("log_not_found")
	private LogNotFound logNotFound;

	@JsonProperty("log_subrequest")
	private LogSubrequest logSubrequest;

	@JsonProperty("map")
	private Map mapHttp;

	@JsonProperty("map_hash_bucket_size")
	private MapHashBucketSize mapHashBucketSize;

	@JsonProperty("map_hash_max_size")
	private MapHashMaxSize mapHashMaxSize;

	@JsonProperty("match")
	private Match match;

	@JsonProperty("max_ranges")
	private MaxRanges maxRanges;

	@JsonProperty("merge_slashes")
	private MergeSlashes mergeSlashes;

	@JsonProperty("min_delete_depth")
	private MinDeleteDepth minDeleteDepth;

	@JsonProperty("mirror")
	private Mirror mirror;

	@JsonProperty("mirror_request_body")
	private MirrorRequestBody mirrorRequestBody;

	@JsonProperty("modern_browser")
	private ModernBrowser modernBrowser;

	@JsonProperty("modern_browser_value")
	private ModernBrowserValue modernBrowserValue;

	@JsonProperty("mp4_buffer_size")
	private Mp4BufferSize mp4BufferSize;

	@JsonProperty("mp4_limit_rate")
	private Mp4LimitRate mp4LimitRate;

	@JsonProperty("mp4_limit_rate_after")
	private Mp4LimitRateAfter mp4LimitRateAfter;

	@JsonProperty("mp4_max_buffer_size")
	private Mp4MaxBufferSize mp4MaxBufferSize;

	@JsonProperty("msie_padding")
	private MsiePadding msiePadding;

	@JsonProperty("msie_refresh")
	private MsieRefresh msieRefresh;

	@JsonProperty("open_file_cache")
	private OpenFileCache openFileCache;

	@JsonProperty("open_file_cache_errors")
	private OpenFileCacheErrors openFileCacheErrors;

	@JsonProperty("open_file_cache_min_uses")
	private OpenFileCacheMinUses openFileCacheMinUses;

	@JsonProperty("open_file_cache_valid")
	private OpenFileCacheValid openFileCacheValid;

	@JsonProperty("open_log_file_cache")
	private OpenLogFileCache openLogFileCache;

	@JsonProperty("output_buffers")
	private OutputBuffers outputBuffers;

	@JsonProperty("perl_modules")
	private PerlModules perlModules;

	@JsonProperty("perl_require")
	private PerlRequire perlRequire;

	@JsonProperty("perl_set")
	private PerlSet perlSet;

	@JsonProperty("port_in_redirect")
	private PortInRedirect portInRedirect;

	@JsonProperty("postpone_output")
	private PostponeOutput postponeOutput;

	@JsonProperty("proxy_bind")
	private ProxyBind proxyBind;

	@JsonProperty("proxy_buffer_size")
	private ProxyBufferSize proxyBufferSize;

	@JsonProperty("proxy_buffering")
	private ProxyBuffering proxyBuffering;

	@JsonProperty("proxy_buffers")
	private ProxyBuffers proxyBuffers;

	@JsonProperty("proxy_busy_buffers_size")
	private ProxyBusyBuffersSize proxyBusyBuffersSize;

	@JsonProperty("proxy_cache")
	private ProxyCache proxyCache;

	@JsonProperty("proxy_cache_background_update")
	private ProxyCacheBackgroundUpdate proxyCacheBackgroundUpdate;

	@JsonProperty("proxy_cache_bypass")
	private ProxyCacheBypass proxyCacheBypass;

	@JsonProperty("proxy_cache_convert_head")
	private ProxyCacheConvertHead proxyCacheConvertHead;

	@JsonProperty("proxy_cache_key")
	private ProxyCacheKey proxyCacheKey;

	@JsonProperty("proxy_cache_lock")
	private ProxyCacheLock proxyCacheLock;

	@JsonProperty("proxy_cache_lock_age")
	private ProxyCacheLockAge proxyCacheLockAge;

	@JsonProperty("proxy_cache_lock_timeout")
	private ProxyCacheLockTimeout proxyCacheLockTimeout;

	@JsonProperty("proxy_cache_max_range_offset")
	private ProxyCacheMaxRangeOffset proxyCacheMaxRangeOffset;

	@JsonProperty("proxy_cache_methods")
	private ProxyCacheMethods proxyCacheMethods;

	@JsonProperty("proxy_cache_min_uses")
	private ProxyCacheMinUses proxyCacheMinUses;

	@JsonProperty("proxy_cache_path")
	private ProxyCachePath proxyCachePath;

	@JsonProperty("proxy_cache_purge")
	private ProxyCachePurge proxyCachePurge;

	@JsonProperty("proxy_cache_revalidate")
	private ProxyCacheRevalidate proxyCacheRevalidate;

	@JsonProperty("proxy_cache_use_stale")
	private ProxyCacheUseStale proxyCacheUseStale;

	@JsonProperty("proxy_cache_valid")
	private ProxyCacheValid proxyCacheValid;

	@JsonProperty("proxy_connect_timeout")
	private ProxyConnectTimeout proxyConnectTimeout;

	@JsonProperty("proxy_cookie_domain")
	private ProxyCookieDomain proxyCookieDomain;

	@JsonProperty("proxy_cookie_path")
	private ProxyCookiePath proxyCookiePath;

	@JsonProperty("proxy_force_ranges")
	private ProxyForceRanges proxyForceRanges;

	@JsonProperty("proxy_headers_hash_bucket_size")
	private ProxyHeadersHashBucketSize proxyHeadersHashBucketSize;

	@JsonProperty("proxy_headers_hash_max_size")
	private ProxyHeadersHashMaxSize proxyHeadersHashMaxSize;

	@JsonProperty("proxy_hide_header")
	private ProxyHideHeader proxyHideHeader;

	@JsonProperty("proxy_http_version")
	private ProxyHttpVersion proxyHttpVersion;

	@JsonProperty("proxy_ignore_client_abort")
	private ProxyIgnoreClientAbort proxyIgnoreClientAbort;

	@JsonProperty("proxy_ignore_headers")
	private ProxyIgnoreHeaders proxyIgnoreHeaders;

	@JsonProperty("proxy_intercept_errors")
	private ProxyInterceptErrors proxyInterceptErrors;

	@JsonProperty("proxy_limit_rate")
	private ProxyLimitRate proxyLimitRate;

	@JsonProperty("proxy_max_temp_file_size")
	private ProxyMaxTempFileSize proxyMaxTempFileSize;

	@JsonProperty("proxy_method")
	private ProxyMethod proxyMethod;

	@JsonProperty("proxy_next_upstream")
	private ProxyNextUpstream proxyNextUpstream;

	@JsonProperty("proxy_next_upstream_timeout")
	private ProxyNextUpstreamTimeout proxyNextUpstreamTimeout;

	@JsonProperty("proxy_next_upstream_tries")
	private ProxyNextUpstreamTries proxyNextUpstreamTries;

	@JsonProperty("proxy_no_cache")
	private ProxyNoCache proxyNoCache;

	@JsonProperty("proxy_pass_header")
	private ProxyPassHeader proxyPassHeader;

	@JsonProperty("proxy_pass_request_body")
	private ProxyPassRequestBody proxyPassRequestBody;

	@JsonProperty("proxy_pass_request_headers")
	private ProxyPassRequestHeaders proxyPassRequestHeaders;

	@JsonProperty("proxy_read_timeout")
	private ProxyReadTimeout proxyReadTimeout;

	@JsonProperty("proxy_redirect")
	private ProxyRedirect proxyRedirect;

	@JsonProperty("proxy_request_buffering")
	private ProxyRequestBuffering proxyRequestBuffering;

	@JsonProperty("proxy_send_lowat")
	private ProxySendLowat proxySendLowat;

	@JsonProperty("proxy_send_timeout")
	private ProxySendTimeout proxySendTimeout;

	@JsonProperty("proxy_set_body")
	private ProxySetBody proxySetBody;

	@JsonProperty("proxy_set_header")
	private ProxySetHeader proxySetHeader;

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

	@JsonProperty("proxy_store")
	private ProxyStore proxyStore;

	@JsonProperty("proxy_store_access")
	private ProxyStoreAccess proxyStoreAccess;

	@JsonProperty("proxy_temp_file_write_size")
	private ProxyTempFileWriteSize proxyTempFileWriteSize;

	@JsonProperty("proxy_temp_path")
	private ProxyTempPath proxyTempPath;

	@JsonProperty("read_ahead")
	private ReadAhead readAhead;

	@JsonProperty("real_ip_header")
	private RealIpHeader realIpHeader;

	@JsonProperty("real_ip_recursive")
	private RealIpRecursive realIpRecursive;

	@JsonProperty("recursive_error_pages")
	private RecursiveErrorPages recursiveErrorPages;

	@JsonProperty("request_pool_size")
	private RequestPoolSize requestPoolSize;

	@JsonProperty("reset_timedout_connection")
	private ResetTimedoutConnection resetTimedoutConnection;

	@JsonProperty("resolver")
	private Resolver resolver;

	@JsonProperty("resolver_timeout")
	private ResolverTimeout resolverTimeout;

	@JsonProperty("rewrite_log")
	private RewriteLog rewriteLog;

	@JsonProperty("root")
	private Root root;

	@JsonProperty("satisfy")
	private Satisfy satisfy;

	@JsonProperty("scgi_bind")
	private ScgiBind scgiBind;

	@JsonProperty("scgi_buffer_size")
	private ScgiBufferSize scgiBufferSize;

	@JsonProperty("scgi_buffering")
	private ScgiBuffering scgiBuffering;

	@JsonProperty("scgi_buffers")
	private ScgiBuffers scgiBuffers;

	@JsonProperty("scgi_busy_buffers_size")
	private ScgiBusyBuffersSize scgiBusyBuffersSize;

	@JsonProperty("scgi_cache")
	private ScgiCache scgiCache;

	@JsonProperty("scgi_cache_background_update")
	private ScgiCacheBackgroundUpdate scgiCacheBackgroundUpdate;

	@JsonProperty("scgi_cache_bypass")
	private ScgiCacheBypass scgiCacheBypass;

	@JsonProperty("scgi_cache_key")
	private ScgiCacheKey scgiCacheKey;

	@JsonProperty("scgi_cache_lock")
	private ScgiCacheLock scgiCacheLock;

	@JsonProperty("scgi_cache_lock_age")
	private ScgiCacheLockAge scgiCacheLockAge;

	@JsonProperty("scgi_cache_lock_timeout")
	private ScgiCacheLockTimeout scgiCacheLockTimeout;

	@JsonProperty("scgi_cache_max_range_offset")
	private ScgiCacheMaxRangeOffset scgiCacheMaxRangeOffset;

	@JsonProperty("scgi_cache_methods")
	private ScgiCacheMethods scgiCacheMethods;

	@JsonProperty("scgi_cache_min_uses")
	private ScgiCacheMinUses scgiCacheMinUses;

	@JsonProperty("scgi_cache_path")
	private ScgiCachePath scgiCachePath;

	@JsonProperty("scgi_cache_purge")
	private ScgiCachePurge scgiCachePurge;

	@JsonProperty("scgi_cache_revalidate")
	private ScgiCacheRevalidate scgiCacheRevalidate;

	@JsonProperty("scgi_cache_use_stale")
	private ScgiCacheUseStale scgiCacheUseStale;

	@JsonProperty("scgi_cache_valid")
	private ScgiCacheValid scgiCacheValid;

	@JsonProperty("scgi_connect_timeout")
	private ScgiConnectTimeout scgiConnectTimeout;

	@JsonProperty("scgi_force_ranges")
	private ScgiForceRanges scgiForceRanges;

	@JsonProperty("scgi_hide_header")
	private ScgiHideHeader scgiHideHeader;

	@JsonProperty("scgi_ignore_client_abort")
	private ScgiIgnoreClientAbort scgiIgnoreClientAbort;

	@JsonProperty("scgi_ignore_headers")
	private ScgiIgnoreHeaders scgiIgnoreHeaders;

	@JsonProperty("scgi_intercept_errors")
	private ScgiInterceptErrors scgiInterceptErrors;

	@JsonProperty("scgi_limit_rate")
	private ScgiLimitRate scgiLimitRate;

	@JsonProperty("scgi_max_temp_file_size")
	private ScgiMaxTempFileSize scgiMaxTempFileSize;

	@JsonProperty("scgi_next_upstream")
	private ScgiNextUpstream scgiNextUpstream;

	@JsonProperty("scgi_next_upstream_timeout")
	private ScgiNextUpstreamTimeout scgiNextUpstreamTimeout;

	@JsonProperty("scgi_next_upstream_tries")
	private ScgiNextUpstreamTries scgiNextUpstreamTries;

	@JsonProperty("scgi_no_cache")
	private ScgiNoCache scgiNoCache;

	@JsonProperty("scgi_param")
	private ScgiParam scgiParam;

	@JsonProperty("scgi_pass_header")
	private ScgiPassHeader scgiPassHeader;

	@JsonProperty("scgi_pass_request_body")
	private ScgiPassRequestBody scgiPassRequestBody;

	@JsonProperty("scgi_pass_request_headers")
	private ScgiPassRequestHeaders scgiPassRequestHeaders;

	@JsonProperty("scgi_read_timeout")
	private ScgiReadTimeout scgiReadTimeout;

	@JsonProperty("scgi_request_buffering")
	private ScgiRequestBuffering scgiRequestBuffering;

	@JsonProperty("scgi_send_timeout")
	private ScgiSendTimeout scgiSendTimeout;

	@JsonProperty("scgi_store")
	private ScgiStore scgiStore;

	@JsonProperty("scgi_store_access")
	private ScgiStoreAccess scgiStoreAccess;

	@JsonProperty("scgi_temp_file_write_size")
	private ScgiTempFileWriteSize scgiTempFileWriteSize;

	@JsonProperty("scgi_temp_path")
	private ScgiTempPath scgiTempPath;

	@JsonProperty("secure_link")
	private SecureLink secureLink;

	@JsonProperty("secure_link_md5")
	private SecureLinkMd5 secureLinkMd5;

	@JsonProperty("send_lowat")
	private SendLowat sendLowat;

	@JsonProperty("send_timeout")
	private SendTimeout sendTimeout;

	@JsonProperty("sendfile")
	private Sendfile sendfile;

	@JsonProperty("sendfile_max_chunk")
	private SendfileMaxChunk sendfileMaxChunk;

	@JsonProperty("server")
	private Server server;

	@JsonProperty("servers")
	private Servers servers;

	@JsonProperty("server_name_in_redirect")
	private ServerNameInRedirect serverNameInRedirect;

	@JsonProperty("server_names_hash_bucket_size")
	private ServerNamesHashBucketSize serverNamesHashBucketSize;

	@JsonProperty("server_names_hash_max_size")
	private ServerNamesHashMaxSize serverNamesHashMaxSize;

	@JsonProperty("server_tokens")
	private ServerTokens serverTokens;

	@JsonProperty("session_log")
	private SessionLog sessionLog;

	@JsonProperty("session_log_format")
	private SessionLogFormat sessionLogFormat;

	@JsonProperty("session_log_zone")
	private SessionLogZone sessionLogZone;

	@JsonProperty("set_real_ip_from")
	private SetRealIpFrom setRealIpFrom;

	@JsonProperty("set_real_ip_froms")
	private SetRealIpFroms setRealIpFroms;

	@JsonProperty("slice")
	private Slice slice;

	@JsonProperty("spdy_chunk_size")
	private SpdyChunkSize spdyChunkSize;

	@JsonProperty("spdy_headers_comp")
	private SpdyHeadersComp spdyHeadersComp;

	@JsonProperty("split_clients")
	private SplitClients splitClients;

	@JsonProperty("ssi")
	private Ssi ssi;

	@JsonProperty("ssi_last_modified")
	private SsiLastModified ssiLastModified;

	@JsonProperty("ssi_min_file_chunk")
	private SsiMinFileChunk ssiMinFileChunk;

	@JsonProperty("ssi_silent_errors")
	private SsiSilentErrors ssiSilentErrors;

	@JsonProperty("ssi_types")
	private SsiTypes ssiTypes;

	@JsonProperty("ssi_value_length")
	private SsiValueLength ssiValueLength;

	@JsonProperty("ssl")
	private Ssl ssl;

	@JsonProperty("ssl_buffer_size")
	private SslBufferSize sslBufferSize;

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

	@JsonProperty("ssl_stapling")
	private SslStapling sslStapling;

	@JsonProperty("ssl_stapling_file")
	private SslStaplingFile sslStaplingFile;

	@JsonProperty("ssl_stapling_responder")
	private SslStaplingResponder sslStaplingResponder;

	@JsonProperty("ssl_stapling_verify")
	private SslStaplingVerify sslStaplingVerify;

	@JsonProperty("ssl_trusted_certificate")
	private SslTrustedCertificate sslTrustedCertificate;

	@JsonProperty("ssl_verify_client")
	private SslVerifyClient sslVerifyClient;

	@JsonProperty("ssl_verify_depth")
	private SslVerifyDepth sslVerifyDepth;

	@JsonProperty("status_format")
	private StatusFormat statusFormat;

	@JsonProperty("sub_filter")
	private SubFilter subFilter;

	@JsonProperty("sub_filter_last_modified")
	private SubFilterLastModified subFilterLastModified;

	@JsonProperty("sub_filter_once")
	private SubFilterOnce subFilterOnce;

	@JsonProperty("sub_filter_types")
	private SubFilterTypes subFilterTypes;

	@JsonProperty("tcp_nodelay")
	private TcpNodelay tcpNodelay;

	@JsonProperty("tcp_nopush")
	private TcpNopush tcpNopush;

	@JsonProperty("types")
	private Types types;

	@JsonProperty("types_hash_bucket_size")
	private TypesHashBucketSize typesHashBucketSize;

	@JsonProperty("types_hash_max_size")
	private TypesHashMaxSize typesHashMaxSize;

	@JsonProperty("underscores_in_headers")
	private UnderscoresInHeaders underscoresInHeaders;

	@JsonProperty("uninitialized_variable_warn")
	private UninitializedVariableWarn uninitializedVariableWarn;

	@JsonProperty("upstream")
	private Upstream upstream;

	@JsonProperty("userid")
	private Userid userid;

	@JsonProperty("userid_domain")
	private UseridDomain useridDomain;

	@JsonProperty("userid_expires")
	private UseridExpires useridExpires;

	@JsonProperty("userid_mark")
	private UseridMark useridMark;

	@JsonProperty("userid_name")
	private UseridName useridName;

	@JsonProperty("userid_p3p")
	private UseridP3p useridP3p;

	@JsonProperty("userid_path")
	private UseridPath useridPath;

	@JsonProperty("userid_service")
	private UseridService useridService;

	@JsonProperty("uwsgi_bind")
	private UwsgiBind uwsgiBind;

	@JsonProperty("uwsgi_buffer_size")
	private UwsgiBufferSize uwsgiBufferSize;

	@JsonProperty("uwsgi_buffering")
	private UwsgiBuffering uwsgiBuffering;

	@JsonProperty("uwsgi_buffers")
	private UwsgiBuffers uwsgiBuffers;

	@JsonProperty("uwsgi_busy_buffers_size")
	private UwsgiBusyBuffersSize uwsgiBusyBuffersSize;

	@JsonProperty("uwsgi_cache")
	private UwsgiCache uwsgiCache;

	@JsonProperty("uwsgi_cache_background_update")
	private UwsgiCacheBackgroundUpdate uwsgiCacheBackgroundUpdate;

	@JsonProperty("uwsgi_cache_bypass")
	private UwsgiCacheBypass uwsgiCacheBypass;

	@JsonProperty("uwsgi_cache_key")
	private UwsgiCacheKey uwsgiCacheKey;

	@JsonProperty("uwsgi_cache_lock")
	private UwsgiCacheLock uwsgiCacheLock;

	@JsonProperty("uwsgi_cache_lock_age")
	private UwsgiCacheLockAge uwsgiCacheLockAge;

	@JsonProperty("uwsgi_cache_lock_timeout")
	private UwsgiCacheLockTimeout uwsgiCacheLockTimeout;

	@JsonProperty("uwsgi_cache_max_range_offset")
	private UwsgiCacheMaxRangeOffset uwsgiCacheMaxRangeOffset;

	@JsonProperty("uwsgi_cache_methods")
	private UwsgiCacheMethods uwsgiCacheMethods;

	@JsonProperty("uwsgi_cache_min_uses")
	private UwsgiCacheMinUses uwsgiCacheMinUses;

	@JsonProperty("uwsgi_cache_path")
	private UwsgiCachePath uwsgiCachePath;

	@JsonProperty("uwsgi_cache_purge")
	private UwsgiCachePurge uwsgiCachePurge;

	@JsonProperty("uwsgi_cache_revalidate")
	private UwsgiCacheRevalidate uwsgiCacheRevalidate;

	@JsonProperty("uwsgi_cache_use_stale")
	private UwsgiCacheUseStale uwsgiCacheUseStale;

	@JsonProperty("uwsgi_cache_valid")
	private UwsgiCacheValid uwsgiCacheValid;

	@JsonProperty("uwsgi_connect_timeout")
	private UwsgiConnectTimeout uwsgiConnectTimeout;

	@JsonProperty("uwsgi_force_ranges")
	private UwsgiForceRanges uwsgiForceRanges;

	@JsonProperty("uwsgi_hide_header")
	private UwsgiHideHeader uwsgiHideHeader;

	@JsonProperty("uwsgi_ignore_client_abort")
	private UwsgiIgnoreClientAbort uwsgiIgnoreClientAbort;

	@JsonProperty("uwsgi_ignore_headers")
	private UwsgiIgnoreHeaders uwsgiIgnoreHeaders;

	@JsonProperty("uwsgi_intercept_errors")
	private UwsgiInterceptErrors uwsgiInterceptErrors;

	@JsonProperty("uwsgi_limit_rate")
	private UwsgiLimitRate uwsgiLimitRate;

	@JsonProperty("uwsgi_max_temp_file_size")
	private UwsgiMaxTempFileSize uwsgiMaxTempFileSize;

	@JsonProperty("uwsgi_modifier1")
	private UwsgiModifier1 uwsgiModifier1;

	@JsonProperty("uwsgi_modifier2")
	private UwsgiModifier2 uwsgiModifier2;

	@JsonProperty("uwsgi_next_upstream")
	private UwsgiNextUpstream uwsgiNextUpstream;

	@JsonProperty("uwsgi_next_upstream_timeout")
	private UwsgiNextUpstreamTimeout uwsgiNextUpstreamTimeout;

	@JsonProperty("uwsgi_next_upstream_tries")
	private UwsgiNextUpstreamTries uwsgiNextUpstreamTries;

	@JsonProperty("uwsgi_no_cache")
	private UwsgiNoCache uwsgiNoCache;

	@JsonProperty("uwsgi_param")
	private UwsgiParam uwsgiParam;

	@JsonProperty("uwsgi_pass_header")
	private UwsgiPassHeader uwsgiPassHeader;

	@JsonProperty("uwsgi_pass_request_body")
	private UwsgiPassRequestBody uwsgiPassRequestBody;

	@JsonProperty("uwsgi_pass_request_headers")
	private UwsgiPassRequestHeaders uwsgiPassRequestHeaders;

	@JsonProperty("uwsgi_read_timeout")
	private UwsgiReadTimeout uwsgiReadTimeout;

	@JsonProperty("uwsgi_request_buffering")
	private UwsgiRequestBuffering uwsgiRequestBuffering;

	@JsonProperty("uwsgi_send_timeout")
	private UwsgiSendTimeout uwsgiSendTimeout;

	@JsonProperty("uwsgi_ssl_certificate")
	private UwsgiSslCertificate uwsgiSslCertificate;

	@JsonProperty("uwsgi_ssl_certificate_key")
	private UwsgiSslCertificateKey uwsgiSslCertificateKey;

	@JsonProperty("uwsgi_ssl_ciphers")
	private UwsgiSslCiphers uwsgiSslCiphers;

	@JsonProperty("uwsgi_ssl_crl")
	private UwsgiSslCrl uwsgiSslCrl;

	@JsonProperty("uwsgi_ssl_name")
	private UwsgiSslName uwsgiSslName;

	@JsonProperty("uwsgi_ssl_password_file")
	private UwsgiSslPasswordFile uwsgiSslPasswordFile;

	@JsonProperty("uwsgi_ssl_protocols")
	private UwsgiSslProtocols uwsgiSslProtocols;

	@JsonProperty("uwsgi_ssl_server_name")
	private UwsgiSslServerName uwsgiSslServerName;

	@JsonProperty("uwsgi_ssl_session_reuse")
	private UwsgiSslSessionReuse uwsgiSslSessionReuse;

	@JsonProperty("uwsgi_ssl_trusted_certificate")
	private UwsgiSslTrustedCertificate uwsgiSslTrustedCertificate;

	@JsonProperty("uwsgi_ssl_verify")
	private UwsgiSslVerify uwsgiSslVerify;

	@JsonProperty("uwsgi_ssl_verify_depth")
	private UwsgiSslVerifyDepth uwsgiSslVerifyDepth;

	@JsonProperty("uwsgi_store")
	private UwsgiStore uwsgiStore;

	@JsonProperty("uwsgi_store_access")
	private UwsgiStoreAccess uwsgiStoreAccess;

	@JsonProperty("uwsgi_temp_file_write_size")
	private UwsgiTempFileWriteSize uwsgiTempFileWriteSize;

	@JsonProperty("uwsgi_temp_path")
	private UwsgiTempPath uwsgiTempPath;

	@JsonProperty("variables_hash_bucket_size")
	private VariablesHashBucketSize variablesHashBucketSize;

	@JsonProperty("variables_hash_max_size")
	private VariablesHashMaxSize variablesHashMaxSize;

	@JsonProperty("xml_entities")
	private XmlEntities xmlEntities;

	@JsonProperty("xslt_last_modified")
	private XsltLastModified xsltLastModified;

	@JsonProperty("xslt_param")
	private XsltParam xsltParam;

	@JsonProperty("xslt_string_param")
	private XsltStringParam xsltStringParam;

	@JsonProperty("xslt_types")
	private XsltTypes xsltTypes;

	public Http() {
		super(contexts, null, "http");
	}

	@Override
	public void populateMap() {
		java.util.Map<String, IDumps> mapLocal = super.getMap();
		// mapLocal.clear();
		mapLocal.put("absolute_redirect", absoluteRedirect);
		mapLocal.put("access_log", accessLog);
		mapLocal.put("add_after_body", addAfterBody);
		mapLocal.put("add_before_body", addBeforeBody);
		mapLocal.put("add_header", addHeader);
		mapLocal.put("add_trailer", addTrailer);
		mapLocal.put("addition_types", additionTypes);
		mapLocal.put("aio", aio);
		mapLocal.put("aio_write", aioWrite);
		mapLocal.put("allow", allow);
		mapLocal.put("allows", allows);
		mapLocal.put("ancient_browser", ancientBrowser);
		mapLocal.put("ancient_browser_value", ancientBrowserValue);
		mapLocal.put("auth_basic", authBasic);
		mapLocal.put("auth_basic_user_file", authBasicUserFile);
		mapLocal.put("auth_jwt", authJwt);
		mapLocal.put("auth_jwt_claim_set", authJwtClaimSet);
		mapLocal.put("auth_jwt_header_set", authJwtHeaderSet);
		mapLocal.put("auth_jwt_key_file", authJwtKeyFile);
		mapLocal.put("auth_request", authRequest);
		mapLocal.put("auth_request_set", authRequestSet);
		mapLocal.put("autoindex", autoindex);
		mapLocal.put("autoindex_exact_size", autoindexExactSize);
		mapLocal.put("autoindex_format", autoindexFormat);
		mapLocal.put("autoindex_localtime", autoindexLocaltime);
		mapLocal.put("chunked_transfer_encoding", chunkedTransferEncoding);
		mapLocal.put("client_body_buffer_size", clientBodyBufferSize);
		mapLocal.put("client_body_in_file_only", clientBodyInFileOnly);
		mapLocal.put("client_body_in_single_buffer", clientBodyInSingleBuffer);
		mapLocal.put("client_body_temp_path", clientBodyTempPath);
		mapLocal.put("client_body_timeout", clientBodyTimeout);
		mapLocal.put("client_header_buffer_size", clientHeaderBufferSize);
		mapLocal.put("client_header_timeout", clientHeaderTimeout);
		mapLocal.put("client_max_body_size", clientMaxBodySize);
		mapLocal.put("connection_pool_size", connectionPoolSize);
		mapLocal.put("create_full_put_path", createFullPutPath);
		mapLocal.put("dav_access", davAccess);
		mapLocal.put("dav_methods", davMethods);
		mapLocal.put("default_type", defaultType);
		mapLocal.put("deny", deny);
		mapLocal.put("denys", deny);
		mapLocal.put("directio", directio);
		mapLocal.put("directio_alignment", directioAlignment);
		mapLocal.put("disable_symlinks", disableSymlinks);
		mapLocal.put("error_log", errorLog);
		mapLocal.put("error_page", errorPage);
		mapLocal.put("etag", etag);
		mapLocal.put("expires", expires);
		mapLocal.put("f4f_buffer_size", f4fBufferSize);
		mapLocal.put("fastcgi_bind", fastcgiBind);
		mapLocal.put("fastcgi_buffer_size", fastcgiBufferSize);
		mapLocal.put("fastcgi_buffering", fastcgiBuffering);
		mapLocal.put("fastcgi_buffers", fastcgiBuffers);
		mapLocal.put("fastcgi_busy_buffers_size", fastcgiBusyBuffersSize);
		mapLocal.put("fastcgi_cache", fastcgiCache);
		mapLocal.put("fastcgi_cache_background_update", fastcgiCacheBackgroundUpdate);
		mapLocal.put("fastcgi_cache_bypass", fastcgiCacheBypass);
		mapLocal.put("fastcgi_cache_key", fastcgiCacheKey);
		mapLocal.put("fastcgi_cache_lock", fastcgiCacheLock);
		mapLocal.put("fastcgi_cache_lock_age", fastcgiCacheLockAge);
		mapLocal.put("fastcgi_cache_lock_timeout", fastcgiCacheLockTimeout);
		mapLocal.put("fastcgi_cache_max_range_offset", fastcgiCacheMaxRangeOffset);
		mapLocal.put("fastcgi_cache_methods", fastcgiCacheMethods);
		mapLocal.put("fastcgi_cache_min_uses", fastcgiCacheMinUses);
		mapLocal.put("fastcgi_cache_path", fastcgiCachePath);
		mapLocal.put("fastcgi_cache_purge", fastcgiCachePurge);
		mapLocal.put("fastcgi_cache_revalidate", fastcgiCacheRevalidate);
		mapLocal.put("fastcgi_cache_use_stale", fastcgiCacheUseStale);
		mapLocal.put("fastcgi_cache_valid", fastcgiCacheValid);
		mapLocal.put("fastcgi_catch_stderr", fastcgiCatchStderr);
		mapLocal.put("fastcgi_connect_timeout", fastcgiConnectTimeout);
		mapLocal.put("fastcgi_force_ranges", fastcgiForceRanges);
		mapLocal.put("fastcgi_hide_header", fastcgiHideHeader);
		mapLocal.put("fastcgi_ignore_client_abort", fastcgiIgnoreClientAbort);
		mapLocal.put("fastcgi_ignore_headers", fastcgiIgnoreHeaders);
		mapLocal.put("fastcgi_index", fastcgiIndex);
		mapLocal.put("fastcgi_intercept_errors", fastcgiInterceptErrors);
		mapLocal.put("fastcgi_keep_conn", fastcgiKeepConn);
		mapLocal.put("fastcgi_limit_rate", fastcgiLimitRate);
		mapLocal.put("fastcgi_max_temp_file_size", fastcgiMaxTempFileSize);
		mapLocal.put("fastcgi_next_upstream", fastcgiNextUpstream);
		mapLocal.put("fastcgi_next_upstream_timeout", fastcgiNextUpstreamTimeout);
		mapLocal.put("fastcgi_next_upstream_tries", fastcgiNextUpstreamTries);
		mapLocal.put("fastcgi_no_cache", fastcgiNoCache);
		mapLocal.put("fastcgi_param", fastcgiParam);
		mapLocal.put("fastcgi_pass_header", fastcgiPassHeader);
		mapLocal.put("fastcgi_pass_request_body", fastcgiPassRequestBody);
		mapLocal.put("fastcgi_pass_request_headers", fastcgiPassRequestHeaders);
		mapLocal.put("fastcgi_read_timeout", fastcgiReadTimeout);
		mapLocal.put("fastcgi_request_buffering", fastcgiRequestBuffering);
		mapLocal.put("fastcgi_send_lowat", fastcgiSendLowat);
		mapLocal.put("fastcgi_send_timeout", fastcgiSendTimeout);
		mapLocal.put("fastcgi_store", fastcgiStore);
		mapLocal.put("fastcgi_store_access", fastcgiStoreAccess);
		mapLocal.put("fastcgi_temp_file_write_size", fastcgiTempFileWriteSize);
		mapLocal.put("fastcgi_temp_path", fastcgiTempPath);
		mapLocal.put("geo", geo);
		mapLocal.put("geoip_city", geoipCity);
		mapLocal.put("geoip_country", geoipCountry);
		mapLocal.put("geoip_org", geoipOrg);
		mapLocal.put("geoip_proxy", geoipProxy);
		mapLocal.put("geoip_proxy_recursive", geoipProxyRecursive);
		mapLocal.put("gunzip", gunzip);
		mapLocal.put("gunzip_buffers", gunzipBuffers);
		mapLocal.put("gzip", gzip);
		mapLocal.put("gzip_buffers", gzipBuffers);
		mapLocal.put("gzip_comp_level", gzipCompLevel);
		mapLocal.put("gzip_disable", gzipDisable);
		mapLocal.put("gzip_http_version", gzipHttpVersion);
		mapLocal.put("gzip_min_length", gzipMinLength);
		mapLocal.put("gzip_proxied", gzipProxied);
		mapLocal.put("gzip_static", gzipStatic);
		mapLocal.put("gzip_types", gzipTypes);
		mapLocal.put("gzip_vary", gzipVary);
		mapLocal.put("hls_buffers", hlsBuffers);
		mapLocal.put("hls_forward_args", hlsForwardArgs);
		mapLocal.put("hls_fragment", hlsFragment);
		mapLocal.put("hls_mp4_buffer_size", hlsMp4BufferSize);
		mapLocal.put("hls_mp4_max_buffer_size", hlsMp4MaxBufferSize);
		mapLocal.put("http2_body_preread_size", http2BodyPrereadSize);
		mapLocal.put("http2_chunk_size", http2ChunkSize);
		mapLocal.put("http2_idle_timeout", http2IdleTimeout);
		mapLocal.put("http2_max_concurrent_streams", http2MaxConcurrentStreams);
		mapLocal.put("http2_max_field_size", http2MaxFieldSize);
		mapLocal.put("http2_max_header_size", http2MaxHeaderSize);
		mapLocal.put("http2_max_requests", http2MaxRequests);
		mapLocal.put("http2_recv_buffer_size", http2RecvBufferSize);
		mapLocal.put("http2_recv_timeout", http2RecvTimeout);
		mapLocal.put("if_modified_since", ifModifiedSince);
		mapLocal.put("ignore_invalid_headers", ignoreInvalidHeaders);
		mapLocal.put("image_filter_buffer", imageFilterBuffer);
		mapLocal.put("image_filter_interlace", imageFilterInterlace);
		mapLocal.put("image_filter_jpeg_quality", imageFilterJpegQuality);
		mapLocal.put("image_filter_sharpen", imageFilterSharpen);
		mapLocal.put("image_filter_transparency", imageFilterTransparency);
		mapLocal.put("image_filter_webp_quality", imageFilterWebpQuality);
		mapLocal.put("index", index);
		mapLocal.put("js_include", jsInclude);
		mapLocal.put("js_set", jsSet);
		mapLocal.put("keepalive_disable", keepaliveDisable);
		mapLocal.put("keepalive_requests", keepaliveRequests);
		mapLocal.put("keepalive_timeout", keepaliveTimeout);
		mapLocal.put("keyval", keyval);
		mapLocal.put("keyval_zone", keyvalZone);
		mapLocal.put("large_client_header_buffers", largeClientHeaderBuffers);
		mapLocal.put("limit_conn", limitConn);
		mapLocal.put("limit_conn_log_level", limitConnLogLevel);
		mapLocal.put("limit_conn_status", limitConnStatus);
		mapLocal.put("limit_conn_zone", limitConnZone);
		mapLocal.put("limit_rate", limitRate);
		mapLocal.put("limit_rate_after", limitRateAfter);
		mapLocal.put("limit_req", limitReq);
		mapLocal.put("limit_req_log_level", limitReqLogLevel);
		mapLocal.put("limit_req_status", limitReqStatus);
		mapLocal.put("limit_req_zone", limitReqZone);
		mapLocal.put("limit_zone", limitZone);
		mapLocal.put("lingering_close", lingeringClose);
		mapLocal.put("lingering_time", lingeringTime);
		mapLocal.put("lingering_timeout", lingeringTimeout);
		mapLocal.put("log_format", logFormat);
		mapLocal.put("log_not_found", logNotFound);
		mapLocal.put("log_subrequest", logSubrequest);
		mapLocal.put("mapHttp", mapHttp);
		mapLocal.put("map_hash_bucket_size", mapHashBucketSize);
		mapLocal.put("map_hash_max_size", mapHashMaxSize);
		mapLocal.put("match", match);
		mapLocal.put("max_ranges", maxRanges);
		mapLocal.put("merge_slashes", mergeSlashes);
		mapLocal.put("min_delete_depth", minDeleteDepth);
		mapLocal.put("mirror", mirror);
		mapLocal.put("mirror_request_body", mirrorRequestBody);
		mapLocal.put("modern_browser", modernBrowser);
		mapLocal.put("modern_browser_value", modernBrowserValue);
		mapLocal.put("mp4_buffer_size", mp4BufferSize);
		mapLocal.put("mp4_limit_rate", mp4LimitRate);
		mapLocal.put("mp4_limit_rate_after", mp4LimitRateAfter);
		mapLocal.put("mp4_max_buffer_size", mp4MaxBufferSize);
		mapLocal.put("msie_padding", msiePadding);
		mapLocal.put("msie_refresh", msieRefresh);
		mapLocal.put("open_file_cache", openFileCache);
		mapLocal.put("open_file_cache_errors", openFileCacheErrors);
		mapLocal.put("open_file_cache_min_uses", openFileCacheMinUses);
		mapLocal.put("open_file_cache_valid", openFileCacheValid);
		mapLocal.put("open_log_file_cache", openLogFileCache);
		mapLocal.put("output_buffers", outputBuffers);
		mapLocal.put("perl_modules", perlModules);
		mapLocal.put("perl_require", perlRequire);
		mapLocal.put("perl_set", perlSet);
		mapLocal.put("port_in_redirect", portInRedirect);
		mapLocal.put("postpone_output", postponeOutput);
		mapLocal.put("proxy_bind", proxyBind);
		mapLocal.put("proxy_buffer_size", proxyBufferSize);
		mapLocal.put("proxy_buffering", proxyBuffering);
		mapLocal.put("proxy_buffers", proxyBuffers);
		mapLocal.put("proxy_busy_buffers_size", proxyBusyBuffersSize);
		mapLocal.put("proxy_cache", proxyCache);
		mapLocal.put("proxy_cache_background_update", proxyCacheBackgroundUpdate);
		mapLocal.put("proxy_cache_bypass", proxyCacheBypass);
		mapLocal.put("proxy_cache_convert_head", proxyCacheConvertHead);
		mapLocal.put("proxy_cache_key", proxyCacheKey);
		mapLocal.put("proxy_cache_lock", proxyCacheLock);
		mapLocal.put("proxy_cache_lock_age", proxyCacheLockAge);
		mapLocal.put("proxy_cache_lock_timeout", proxyCacheLockTimeout);
		mapLocal.put("proxy_cache_max_range_offset", proxyCacheMaxRangeOffset);
		mapLocal.put("proxy_cache_methods", proxyCacheMethods);
		mapLocal.put("proxy_cache_min_uses", proxyCacheMinUses);
		mapLocal.put("proxy_cache_path", proxyCachePath);
		mapLocal.put("proxy_cache_purge", proxyCachePurge);
		mapLocal.put("proxy_cache_revalidate", proxyCacheRevalidate);
		mapLocal.put("proxy_cache_use_stale", proxyCacheUseStale);
		mapLocal.put("proxy_cache_valid", proxyCacheValid);
		mapLocal.put("proxy_connect_timeout", proxyConnectTimeout);
		mapLocal.put("proxy_cookie_domain", proxyCookieDomain);
		mapLocal.put("proxy_cookie_path", proxyCookiePath);
		mapLocal.put("proxy_force_ranges", proxyForceRanges);
		mapLocal.put("proxy_headers_hash_bucket_size", proxyHeadersHashBucketSize);
		mapLocal.put("proxy_headers_hash_max_size", proxyHeadersHashMaxSize);
		mapLocal.put("proxy_hide_header", proxyHideHeader);
		mapLocal.put("proxy_http_version", proxyHttpVersion);
		mapLocal.put("proxy_ignore_client_abort", proxyIgnoreClientAbort);
		mapLocal.put("proxy_ignore_headers", proxyIgnoreHeaders);
		mapLocal.put("proxy_intercept_errors", proxyInterceptErrors);
		mapLocal.put("proxy_limit_rate", proxyLimitRate);
		mapLocal.put("proxy_max_temp_file_size", proxyMaxTempFileSize);
		mapLocal.put("proxy_method", proxyMethod);
		mapLocal.put("proxy_next_upstream", proxyNextUpstream);
		mapLocal.put("proxy_next_upstream_timeout", proxyNextUpstreamTimeout);
		mapLocal.put("proxy_next_upstream_tries", proxyNextUpstreamTries);
		mapLocal.put("proxy_no_cache", proxyNoCache);
		mapLocal.put("proxy_pass_header", proxyPassHeader);
		mapLocal.put("proxy_pass_request_body", proxyPassRequestBody);
		mapLocal.put("proxy_pass_request_headers", proxyPassRequestHeaders);
		mapLocal.put("proxy_read_timeout", proxyReadTimeout);
		mapLocal.put("proxy_redirect", proxyRedirect);
		mapLocal.put("proxy_request_buffering", proxyRequestBuffering);
		mapLocal.put("proxy_send_lowat", proxySendLowat);
		mapLocal.put("proxy_send_timeout", proxySendTimeout);
		mapLocal.put("proxy_set_body", proxySetBody);
		mapLocal.put("proxy_set_header", proxySetHeader);
		mapLocal.put("proxy_ssl_certificate", proxySslCertificate);
		mapLocal.put("proxy_ssl_certificate_key", proxySslCertificateKey);
		mapLocal.put("proxy_ssl_ciphers", proxySslCiphers);
		mapLocal.put("proxy_ssl_crl", proxySslCrl);
		mapLocal.put("proxy_ssl_name", proxySslName);
		mapLocal.put("proxy_ssl_password_file", proxySslPasswordFile);
		mapLocal.put("proxy_ssl_protocols", proxySslProtocols);
		mapLocal.put("proxy_ssl_server_name", proxySslServerName);
		mapLocal.put("proxy_ssl_session_reuse", proxySslSessionReuse);
		mapLocal.put("proxy_ssl_trusted_certificate", proxySslTrustedCertificate);
		mapLocal.put("proxy_ssl_verify", proxySslVerify);
		mapLocal.put("proxy_ssl_verify_depth", proxySslVerifyDepth);
		mapLocal.put("proxy_store", proxyStore);
		mapLocal.put("proxy_store_access", proxyStoreAccess);
		mapLocal.put("proxy_temp_file_write_size", proxyTempFileWriteSize);
		mapLocal.put("proxy_temp_path", proxyTempPath);
		mapLocal.put("read_ahead", readAhead);
		mapLocal.put("real_ip_header", realIpHeader);
		mapLocal.put("real_ip_recursive", realIpRecursive);
		mapLocal.put("recursive_error_pages", recursiveErrorPages);
		mapLocal.put("request_pool_size", requestPoolSize);
		mapLocal.put("reset_timedout_connection", resetTimedoutConnection);
		mapLocal.put("resolver", resolver);
		mapLocal.put("resolver_timeout", resolverTimeout);
		mapLocal.put("rewrite_log", rewriteLog);
		mapLocal.put("root", root);
		mapLocal.put("satisfy", satisfy);
		mapLocal.put("scgi_bind", scgiBind);
		mapLocal.put("scgi_buffer_size", scgiBufferSize);
		mapLocal.put("scgi_buffering", scgiBuffering);
		mapLocal.put("scgi_buffers", scgiBuffers);
		mapLocal.put("scgi_busy_buffers_size", scgiBusyBuffersSize);
		mapLocal.put("scgi_cache", scgiCache);
		mapLocal.put("scgi_cache_background_update", scgiCacheBackgroundUpdate);
		mapLocal.put("scgi_cache_bypass", scgiCacheBypass);
		mapLocal.put("scgi_cache_key", scgiCacheKey);
		mapLocal.put("scgi_cache_lock", scgiCacheLock);
		mapLocal.put("scgi_cache_lock_age", scgiCacheLockAge);
		mapLocal.put("scgi_cache_lock_timeout", scgiCacheLockTimeout);
		mapLocal.put("scgi_cache_max_range_offset", scgiCacheMaxRangeOffset);
		mapLocal.put("scgi_cache_methods", scgiCacheMethods);
		mapLocal.put("scgi_cache_min_uses", scgiCacheMinUses);
		mapLocal.put("scgi_cache_path", scgiCachePath);
		mapLocal.put("scgi_cache_purge", scgiCachePurge);
		mapLocal.put("scgi_cache_revalidate", scgiCacheRevalidate);
		mapLocal.put("scgi_cache_use_stale", scgiCacheUseStale);
		mapLocal.put("scgi_cache_valid", scgiCacheValid);
		mapLocal.put("scgi_connect_timeout", scgiConnectTimeout);
		mapLocal.put("scgi_force_ranges", scgiForceRanges);
		mapLocal.put("scgi_hide_header", scgiHideHeader);
		mapLocal.put("scgi_ignore_client_abort", scgiIgnoreClientAbort);
		mapLocal.put("scgi_ignore_headers", scgiIgnoreHeaders);
		mapLocal.put("scgi_intercept_errors", scgiInterceptErrors);
		mapLocal.put("scgi_limit_rate", scgiLimitRate);
		mapLocal.put("scgi_max_temp_file_size", scgiMaxTempFileSize);
		mapLocal.put("scgi_next_upstream", scgiNextUpstream);
		mapLocal.put("scgi_next_upstream_timeout", scgiNextUpstreamTimeout);
		mapLocal.put("scgi_next_upstream_tries", scgiNextUpstreamTries);
		mapLocal.put("scgi_no_cache", scgiNoCache);
		mapLocal.put("scgi_param", scgiParam);
		mapLocal.put("scgi_pass_header", scgiPassHeader);
		mapLocal.put("scgi_pass_request_body", scgiPassRequestBody);
		mapLocal.put("scgi_pass_request_headers", scgiPassRequestHeaders);
		mapLocal.put("scgi_read_timeout", scgiReadTimeout);
		mapLocal.put("scgi_request_buffering", scgiRequestBuffering);
		mapLocal.put("scgi_send_timeout", scgiSendTimeout);
		mapLocal.put("scgi_store", scgiStore);
		mapLocal.put("scgi_store_access", scgiStoreAccess);
		mapLocal.put("scgi_temp_file_write_size", scgiTempFileWriteSize);
		mapLocal.put("scgi_temp_path", scgiTempPath);
		mapLocal.put("secure_link", secureLink);
		mapLocal.put("secure_link_md5", secureLinkMd5);
		mapLocal.put("send_lowat", sendLowat);
		mapLocal.put("send_timeout", sendTimeout);
		mapLocal.put("sendfile", sendfile);
		mapLocal.put("sendfile_max_chunk", sendfileMaxChunk);
		mapLocal.put("server", server);
		mapLocal.put("server_name_in_redirect", serverNameInRedirect);
		mapLocal.put("server_names_hash_bucket_size", serverNamesHashBucketSize);
		mapLocal.put("server_names_hash_max_size", serverNamesHashMaxSize);
		mapLocal.put("server_tokens", serverTokens);
		mapLocal.put("session_log", sessionLog);
		mapLocal.put("session_log_format", sessionLogFormat);
		mapLocal.put("session_log_zone", sessionLogZone);
		mapLocal.put("set_real_ip_from", setRealIpFrom);
		mapLocal.put("set_real_ip_froms", setRealIpFroms);
		mapLocal.put("slice", slice);
		mapLocal.put("spdy_chunk_size", spdyChunkSize);
		mapLocal.put("spdy_headers_comp", spdyHeadersComp);
		mapLocal.put("split_clients", splitClients);
		mapLocal.put("ssi", ssi);
		mapLocal.put("ssi_last_modified", ssiLastModified);
		mapLocal.put("ssi_min_file_chunk", ssiMinFileChunk);
		mapLocal.put("ssi_silent_errors", ssiSilentErrors);
		mapLocal.put("ssi_types", ssiTypes);
		mapLocal.put("ssi_value_length", ssiValueLength);
		mapLocal.put("ssl", ssl);
		mapLocal.put("ssl_buffer_size", sslBufferSize);
		mapLocal.put("ssl_certificate", sslCertificate);
		mapLocal.put("ssl_certificate_key", sslCertificateKey);
		mapLocal.put("ssl_ciphers", sslCiphers);
		mapLocal.put("ssl_client_certificate", sslClientCertificate);
		mapLocal.put("ssl_crl", sslCrl);
		mapLocal.put("ssl_dhparam", sslDhparam);
		mapLocal.put("ssl_ecdh_curve", sslEcdhCurve);
		mapLocal.put("ssl_password_file", sslPasswordFile);
		mapLocal.put("ssl_prefer_server_ciphers", sslPreferServerCiphers);
		mapLocal.put("ssl_protocols", sslProtocols);
		mapLocal.put("ssl_session_cache", sslSessionCache);
		mapLocal.put("ssl_session_ticket_key", sslSessionTicketKey);
		mapLocal.put("ssl_session_tickets", sslSessionTickets);
		mapLocal.put("ssl_session_timeout", sslSessionTimeout);
		mapLocal.put("ssl_stapling", sslStapling);
		mapLocal.put("ssl_stapling_file", sslStaplingFile);
		mapLocal.put("ssl_stapling_responder", sslStaplingResponder);
		mapLocal.put("ssl_stapling_verify", sslStaplingVerify);
		mapLocal.put("ssl_trusted_certificate", sslTrustedCertificate);
		mapLocal.put("ssl_verify_client", sslVerifyClient);
		mapLocal.put("ssl_verify_depth", sslVerifyDepth);
		mapLocal.put("status_format", statusFormat);
		mapLocal.put("sub_filter", subFilter);
		mapLocal.put("sub_filter_last_modified", subFilterLastModified);
		mapLocal.put("sub_filter_once", subFilterOnce);
		mapLocal.put("sub_filter_types", subFilterTypes);
		mapLocal.put("tcp_nodelay", tcpNodelay);
		mapLocal.put("tcp_nopush", tcpNopush);
		mapLocal.put("types", types);
		mapLocal.put("types_hash_bucket_size", typesHashBucketSize);
		mapLocal.put("types_hash_max_size", typesHashMaxSize);
		mapLocal.put("underscores_in_headers", underscoresInHeaders);
		mapLocal.put("uninitialized_variable_warn", uninitializedVariableWarn);
		mapLocal.put("upstream", upstream);
		mapLocal.put("userid", userid);
		mapLocal.put("userid_domain", useridDomain);
		mapLocal.put("userid_expires", useridExpires);
		mapLocal.put("userid_mark", useridMark);
		mapLocal.put("userid_name", useridName);
		mapLocal.put("userid_p3p", useridP3p);
		mapLocal.put("userid_path", useridPath);
		mapLocal.put("userid_service", useridService);
		mapLocal.put("uwsgi_bind", uwsgiBind);
		mapLocal.put("uwsgi_buffer_size", uwsgiBufferSize);
		mapLocal.put("uwsgi_buffering", uwsgiBuffering);
		mapLocal.put("uwsgi_buffers", uwsgiBuffers);
		mapLocal.put("uwsgi_busy_buffers_size", uwsgiBusyBuffersSize);
		mapLocal.put("uwsgi_cache", uwsgiCache);
		mapLocal.put("uwsgi_cache_background_update", uwsgiCacheBackgroundUpdate);
		mapLocal.put("uwsgi_cache_bypass", uwsgiCacheBypass);
		mapLocal.put("uwsgi_cache_key", uwsgiCacheKey);
		mapLocal.put("uwsgi_cache_lock", uwsgiCacheLock);
		mapLocal.put("uwsgi_cache_lock_age", uwsgiCacheLockAge);
		mapLocal.put("uwsgi_cache_lock_timeout", uwsgiCacheLockTimeout);
		mapLocal.put("uwsgi_cache_max_range_offset", uwsgiCacheMaxRangeOffset);
		mapLocal.put("uwsgi_cache_methods", uwsgiCacheMethods);
		mapLocal.put("uwsgi_cache_min_uses", uwsgiCacheMinUses);
		mapLocal.put("uwsgi_cache_path", uwsgiCachePath);
		mapLocal.put("uwsgi_cache_purge", uwsgiCachePurge);
		mapLocal.put("uwsgi_cache_revalidate", uwsgiCacheRevalidate);
		mapLocal.put("uwsgi_cache_use_stale", uwsgiCacheUseStale);
		mapLocal.put("uwsgi_cache_valid", uwsgiCacheValid);
		mapLocal.put("uwsgi_connect_timeout", uwsgiConnectTimeout);
		mapLocal.put("uwsgi_force_ranges", uwsgiForceRanges);
		mapLocal.put("uwsgi_hide_header", uwsgiHideHeader);
		mapLocal.put("uwsgi_ignore_client_abort", uwsgiIgnoreClientAbort);
		mapLocal.put("uwsgi_ignore_headers", uwsgiIgnoreHeaders);
		mapLocal.put("uwsgi_intercept_errors", uwsgiInterceptErrors);
		mapLocal.put("uwsgi_limit_rate", uwsgiLimitRate);
		mapLocal.put("uwsgi_max_temp_file_size", uwsgiMaxTempFileSize);
		mapLocal.put("uwsgi_modifier1", uwsgiModifier1);
		mapLocal.put("uwsgi_modifier2", uwsgiModifier2);
		mapLocal.put("uwsgi_next_upstream", uwsgiNextUpstream);
		mapLocal.put("uwsgi_next_upstream_timeout", uwsgiNextUpstreamTimeout);
		mapLocal.put("uwsgi_next_upstream_tries", uwsgiNextUpstreamTries);
		mapLocal.put("uwsgi_no_cache", uwsgiNoCache);
		mapLocal.put("uwsgi_param", uwsgiParam);
		mapLocal.put("uwsgi_pass_header", uwsgiPassHeader);
		mapLocal.put("uwsgi_pass_request_body", uwsgiPassRequestBody);
		mapLocal.put("uwsgi_pass_request_headers", uwsgiPassRequestHeaders);
		mapLocal.put("uwsgi_read_timeout", uwsgiReadTimeout);
		mapLocal.put("uwsgi_request_buffering", uwsgiRequestBuffering);
		mapLocal.put("uwsgi_send_timeout", uwsgiSendTimeout);
		mapLocal.put("uwsgi_ssl_certificate", uwsgiSslCertificate);
		mapLocal.put("uwsgi_ssl_certificate_key", uwsgiSslCertificateKey);
		mapLocal.put("uwsgi_ssl_ciphers", uwsgiSslCiphers);
		mapLocal.put("uwsgi_ssl_crl", uwsgiSslCrl);
		mapLocal.put("uwsgi_ssl_name", uwsgiSslName);
		mapLocal.put("uwsgi_ssl_password_file", uwsgiSslPasswordFile);
		mapLocal.put("uwsgi_ssl_protocols", uwsgiSslProtocols);
		mapLocal.put("uwsgi_ssl_server_name", uwsgiSslServerName);
		mapLocal.put("uwsgi_ssl_session_reuse", uwsgiSslSessionReuse);
		mapLocal.put("uwsgi_ssl_trusted_certificate", uwsgiSslTrustedCertificate);
		mapLocal.put("uwsgi_ssl_verify", uwsgiSslVerify);
		mapLocal.put("uwsgi_ssl_verify_depth", uwsgiSslVerifyDepth);
		mapLocal.put("uwsgi_store", uwsgiStore);
		mapLocal.put("uwsgi_store_access", uwsgiStoreAccess);
		mapLocal.put("uwsgi_temp_file_write_size", uwsgiTempFileWriteSize);
		mapLocal.put("uwsgi_temp_path", uwsgiTempPath);
		mapLocal.put("variables_hash_bucket_size", variablesHashBucketSize);
		mapLocal.put("variables_hash_max_size", variablesHashMaxSize);
		mapLocal.put("xml_entities", xmlEntities);
		mapLocal.put("xslt_last_modified", xsltLastModified);
		mapLocal.put("xslt_param", xsltParam);
		mapLocal.put("xslt_string_param", xsltStringParam);
		mapLocal.put("xslt_types", xsltTypes);
		mapLocal.put("servers", servers);

	}

}
