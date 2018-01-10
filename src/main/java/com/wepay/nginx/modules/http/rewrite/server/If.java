package com.wepay.nginx.modules.http.rewrite.server;

import static com.wepay.nginx.Constants.SERVER;

import java.util.Arrays;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.wepay.nginx.IDumps;
import com.wepay.nginx.NamedAbstractContext;
import com.wepay.nginx.modules.core.ErrorLog;
import com.wepay.nginx.modules.http.access.Allow;
import com.wepay.nginx.modules.http.access.Deny;
import com.wepay.nginx.modules.http.addition.AddAfterBody;
import com.wepay.nginx.modules.http.addition.AddBeforeBody;
import com.wepay.nginx.modules.http.addition.AdditionTypes;
import com.wepay.nginx.modules.http.auth.basic.AuthBasic;
import com.wepay.nginx.modules.http.auth.basic.AuthBasicUserFile;
import com.wepay.nginx.modules.http.auth.jwt.AuthJwt;
import com.wepay.nginx.modules.http.auth.jwt.AuthJwtKeyFile;
import com.wepay.nginx.modules.http.auth.request.AuthRequest;
import com.wepay.nginx.modules.http.auth.request.AuthRequestSet;
import com.wepay.nginx.modules.http.autoindex.Autoindex;
import com.wepay.nginx.modules.http.autoindex.AutoindexExactSize;
import com.wepay.nginx.modules.http.autoindex.AutoindexFormat;
import com.wepay.nginx.modules.http.autoindex.AutoindexLocaltime;
import com.wepay.nginx.modules.http.browser.AncientBrowser;
import com.wepay.nginx.modules.http.browser.AncientBrowserValue;
import com.wepay.nginx.modules.http.browser.ModernBrowser;
import com.wepay.nginx.modules.http.browser.ModernBrowserValue;
import com.wepay.nginx.modules.http.core.AbsoluteRedirect;
import com.wepay.nginx.modules.http.core.Aio;
import com.wepay.nginx.modules.http.core.AioWrite;
import com.wepay.nginx.modules.http.core.ChunkedTransferEncoding;
import com.wepay.nginx.modules.http.core.ClientBodyBufferSize;
import com.wepay.nginx.modules.http.core.ClientBodyInFileOnly;
import com.wepay.nginx.modules.http.core.ClientBodyInSingleBuffer;
import com.wepay.nginx.modules.http.core.ClientBodyTempPath;
import com.wepay.nginx.modules.http.core.ClientBodyTimeout;
import com.wepay.nginx.modules.http.core.ClientHeaderBufferSize;
import com.wepay.nginx.modules.http.core.ClientHeaderTimeout;
import com.wepay.nginx.modules.http.core.ClientMaxBodySize;
import com.wepay.nginx.modules.http.core.ConnectionPoolSize;
import com.wepay.nginx.modules.http.core.DefaultType;
import com.wepay.nginx.modules.http.core.Directio;
import com.wepay.nginx.modules.http.core.DirectioAlignment;
import com.wepay.nginx.modules.http.core.DisableSymlinks;
import com.wepay.nginx.modules.http.core.ErrorPage;
import com.wepay.nginx.modules.http.core.Etag;
import com.wepay.nginx.modules.http.core.IfModifiedSince;
import com.wepay.nginx.modules.http.core.IgnoreInvalidHeaders;
import com.wepay.nginx.modules.http.core.KeepaliveDisable;
import com.wepay.nginx.modules.http.core.KeepaliveRequests;
import com.wepay.nginx.modules.http.core.KeepaliveTimeout;
import com.wepay.nginx.modules.http.core.LargeClientHeaderBuffers;
import com.wepay.nginx.modules.http.core.LimitRate;
import com.wepay.nginx.modules.http.core.LimitRateAfter;
import com.wepay.nginx.modules.http.core.LingeringClose;
import com.wepay.nginx.modules.http.core.LingeringTime;
import com.wepay.nginx.modules.http.core.LingeringTimeout;
import com.wepay.nginx.modules.http.core.Listen;
import com.wepay.nginx.modules.http.core.Location;
import com.wepay.nginx.modules.http.core.Locations;
import com.wepay.nginx.modules.http.core.LogNotFound;
import com.wepay.nginx.modules.http.core.LogSubrequest;
import com.wepay.nginx.modules.http.core.MaxRanges;
import com.wepay.nginx.modules.http.core.MergeSlashes;
import com.wepay.nginx.modules.http.core.MsiePadding;
import com.wepay.nginx.modules.http.core.MsieRefresh;
import com.wepay.nginx.modules.http.core.OpenFileCache;
import com.wepay.nginx.modules.http.core.OpenFileCacheErrors;
import com.wepay.nginx.modules.http.core.OpenFileCacheMinUses;
import com.wepay.nginx.modules.http.core.OpenFileCacheValid;
import com.wepay.nginx.modules.http.core.OutputBuffers;
import com.wepay.nginx.modules.http.core.PortInRedirect;
import com.wepay.nginx.modules.http.core.PostponeOutput;
import com.wepay.nginx.modules.http.core.ReadAhead;
import com.wepay.nginx.modules.http.core.RecursiveErrorPages;
import com.wepay.nginx.modules.http.core.RequestPoolSize;
import com.wepay.nginx.modules.http.core.ResetTimedoutConnection;
import com.wepay.nginx.modules.http.core.Resolver;
import com.wepay.nginx.modules.http.core.ResolverTimeout;
import com.wepay.nginx.modules.http.core.Root;
import com.wepay.nginx.modules.http.core.Satisfy;
import com.wepay.nginx.modules.http.core.SendLowat;
import com.wepay.nginx.modules.http.core.SendTimeout;
import com.wepay.nginx.modules.http.core.Sendfile;
import com.wepay.nginx.modules.http.core.SendfileMaxChunk;
import com.wepay.nginx.modules.http.core.ServerName;
import com.wepay.nginx.modules.http.core.ServerNameInRedirect;
import com.wepay.nginx.modules.http.core.ServerTokens;
import com.wepay.nginx.modules.http.core.TcpNodelay;
import com.wepay.nginx.modules.http.core.TcpNopush;
import com.wepay.nginx.modules.http.core.TryFiles;
import com.wepay.nginx.modules.http.core.Types;
import com.wepay.nginx.modules.http.core.TypesHashBucketSize;
import com.wepay.nginx.modules.http.core.TypesHashMaxSize;
import com.wepay.nginx.modules.http.core.UnderscoresInHeaders;
import com.wepay.nginx.modules.http.dav.CreateFullPutPath;
import com.wepay.nginx.modules.http.dav.DavAccess;
import com.wepay.nginx.modules.http.dav.DavMethods;
import com.wepay.nginx.modules.http.dav.MinDeleteDepth;
import com.wepay.nginx.modules.http.f4f.F4fBufferSize;
import com.wepay.nginx.modules.http.fastcgi.FastcgiBind;
import com.wepay.nginx.modules.http.fastcgi.FastcgiBufferSize;
import com.wepay.nginx.modules.http.fastcgi.FastcgiBuffering;
import com.wepay.nginx.modules.http.fastcgi.FastcgiBuffers;
import com.wepay.nginx.modules.http.fastcgi.FastcgiBusyBuffersSize;
import com.wepay.nginx.modules.http.fastcgi.FastcgiCache;
import com.wepay.nginx.modules.http.fastcgi.FastcgiCacheBackgroundUpdate;
import com.wepay.nginx.modules.http.fastcgi.FastcgiCacheBypass;
import com.wepay.nginx.modules.http.fastcgi.FastcgiCacheKey;
import com.wepay.nginx.modules.http.fastcgi.FastcgiCacheLock;
import com.wepay.nginx.modules.http.fastcgi.FastcgiCacheLockAge;
import com.wepay.nginx.modules.http.fastcgi.FastcgiCacheLockTimeout;
import com.wepay.nginx.modules.http.fastcgi.FastcgiCacheMaxRangeOffset;
import com.wepay.nginx.modules.http.fastcgi.FastcgiCacheMethods;
import com.wepay.nginx.modules.http.fastcgi.FastcgiCacheMinUses;
import com.wepay.nginx.modules.http.fastcgi.FastcgiCachePurge;
import com.wepay.nginx.modules.http.fastcgi.FastcgiCacheRevalidate;
import com.wepay.nginx.modules.http.fastcgi.FastcgiCacheUseStale;
import com.wepay.nginx.modules.http.fastcgi.FastcgiCacheValid;
import com.wepay.nginx.modules.http.fastcgi.FastcgiCatchStderr;
import com.wepay.nginx.modules.http.fastcgi.FastcgiConnectTimeout;
import com.wepay.nginx.modules.http.fastcgi.FastcgiForceRanges;
import com.wepay.nginx.modules.http.fastcgi.FastcgiHideHeader;
import com.wepay.nginx.modules.http.fastcgi.FastcgiIgnoreClientAbort;
import com.wepay.nginx.modules.http.fastcgi.FastcgiIgnoreHeaders;
import com.wepay.nginx.modules.http.fastcgi.FastcgiIndex;
import com.wepay.nginx.modules.http.fastcgi.FastcgiInterceptErrors;
import com.wepay.nginx.modules.http.fastcgi.FastcgiKeepConn;
import com.wepay.nginx.modules.http.fastcgi.FastcgiLimitRate;
import com.wepay.nginx.modules.http.fastcgi.FastcgiMaxTempFileSize;
import com.wepay.nginx.modules.http.fastcgi.FastcgiNextUpstream;
import com.wepay.nginx.modules.http.fastcgi.FastcgiNextUpstreamTimeout;
import com.wepay.nginx.modules.http.fastcgi.FastcgiNextUpstreamTries;
import com.wepay.nginx.modules.http.fastcgi.FastcgiNoCache;
import com.wepay.nginx.modules.http.fastcgi.FastcgiParam;
import com.wepay.nginx.modules.http.fastcgi.FastcgiPassHeader;
import com.wepay.nginx.modules.http.fastcgi.FastcgiPassRequestBody;
import com.wepay.nginx.modules.http.fastcgi.FastcgiPassRequestHeaders;
import com.wepay.nginx.modules.http.fastcgi.FastcgiReadTimeout;
import com.wepay.nginx.modules.http.fastcgi.FastcgiRequestBuffering;
import com.wepay.nginx.modules.http.fastcgi.FastcgiSendLowat;
import com.wepay.nginx.modules.http.fastcgi.FastcgiSendTimeout;
import com.wepay.nginx.modules.http.fastcgi.FastcgiStore;
import com.wepay.nginx.modules.http.fastcgi.FastcgiStoreAccess;
import com.wepay.nginx.modules.http.fastcgi.FastcgiTempFileWriteSize;
import com.wepay.nginx.modules.http.fastcgi.FastcgiTempPath;
import com.wepay.nginx.modules.http.gunzip.Gunzip;
import com.wepay.nginx.modules.http.gunzip.GunzipBuffers;
import com.wepay.nginx.modules.http.gzip.Gzip;
import com.wepay.nginx.modules.http.gzip.GzipBuffers;
import com.wepay.nginx.modules.http.gzip.GzipCompLevel;
import com.wepay.nginx.modules.http.gzip.GzipDisable;
import com.wepay.nginx.modules.http.gzip.GzipHttpVersion;
import com.wepay.nginx.modules.http.gzip.GzipMinLength;
import com.wepay.nginx.modules.http.gzip.GzipProxied;
import com.wepay.nginx.modules.http.gzip.GzipTypes;
import com.wepay.nginx.modules.http.gzip.GzipVary;
import com.wepay.nginx.modules.http.gzip.stat.GzipStatic;
import com.wepay.nginx.modules.http.headers.AddHeader;
import com.wepay.nginx.modules.http.headers.AddTrailer;
import com.wepay.nginx.modules.http.headers.Expires;
import com.wepay.nginx.modules.http.hls.HlsBuffers;
import com.wepay.nginx.modules.http.hls.HlsForwardArgs;
import com.wepay.nginx.modules.http.hls.HlsFragment;
import com.wepay.nginx.modules.http.hls.HlsMp4BufferSize;
import com.wepay.nginx.modules.http.hls.HlsMp4MaxBufferSize;
import com.wepay.nginx.modules.http.image.filter.ImageFilterBuffer;
import com.wepay.nginx.modules.http.image.filter.ImageFilterInterlace;
import com.wepay.nginx.modules.http.image.filter.ImageFilterJpegQuality;
import com.wepay.nginx.modules.http.image.filter.ImageFilterSharpen;
import com.wepay.nginx.modules.http.image.filter.ImageFilterTransparency;
import com.wepay.nginx.modules.http.image.filter.ImageFilterWebpQuality;
import com.wepay.nginx.modules.http.index.Index;
import com.wepay.nginx.modules.http.limit.conn.LimitConn;
import com.wepay.nginx.modules.http.limit.conn.LimitConnLogLevel;
import com.wepay.nginx.modules.http.limit.conn.LimitConnStatus;
import com.wepay.nginx.modules.http.limit.req.LimitReq;
import com.wepay.nginx.modules.http.limit.req.LimitReqLogLevel;
import com.wepay.nginx.modules.http.limit.req.LimitReqStatus;
import com.wepay.nginx.modules.http.log.AccessLog;
import com.wepay.nginx.modules.http.log.OpenLogFileCache;
import com.wepay.nginx.modules.http.mirror.Mirror;
import com.wepay.nginx.modules.http.mirror.MirrorRequestBody;
import com.wepay.nginx.modules.http.mp4.Mp4BufferSize;
import com.wepay.nginx.modules.http.mp4.Mp4LimitRate;
import com.wepay.nginx.modules.http.mp4.Mp4LimitRateAfter;
import com.wepay.nginx.modules.http.mp4.Mp4MaxBufferSize;
import com.wepay.nginx.modules.http.proxy.ProxyBind;
import com.wepay.nginx.modules.http.proxy.ProxyBufferSize;
import com.wepay.nginx.modules.http.proxy.ProxyBuffering;
import com.wepay.nginx.modules.http.proxy.ProxyBuffers;
import com.wepay.nginx.modules.http.proxy.ProxyBusyBuffersSize;
import com.wepay.nginx.modules.http.proxy.ProxyCache;
import com.wepay.nginx.modules.http.proxy.ProxyCacheBackgroundUpdate;
import com.wepay.nginx.modules.http.proxy.ProxyCacheBypass;
import com.wepay.nginx.modules.http.proxy.ProxyCacheConvertHead;
import com.wepay.nginx.modules.http.proxy.ProxyCacheKey;
import com.wepay.nginx.modules.http.proxy.ProxyCacheLock;
import com.wepay.nginx.modules.http.proxy.ProxyCacheLockAge;
import com.wepay.nginx.modules.http.proxy.ProxyCacheLockTimeout;
import com.wepay.nginx.modules.http.proxy.ProxyCacheMaxRangeOffset;
import com.wepay.nginx.modules.http.proxy.ProxyCacheMethods;
import com.wepay.nginx.modules.http.proxy.ProxyCacheMinUses;
import com.wepay.nginx.modules.http.proxy.ProxyCachePurge;
import com.wepay.nginx.modules.http.proxy.ProxyCacheRevalidate;
import com.wepay.nginx.modules.http.proxy.ProxyCacheUseStale;
import com.wepay.nginx.modules.http.proxy.ProxyCacheValid;
import com.wepay.nginx.modules.http.proxy.ProxyConnectTimeout;
import com.wepay.nginx.modules.http.proxy.ProxyCookieDomain;
import com.wepay.nginx.modules.http.proxy.ProxyCookiePath;
import com.wepay.nginx.modules.http.proxy.ProxyForceRanges;
import com.wepay.nginx.modules.http.proxy.ProxyHeadersHashBucketSize;
import com.wepay.nginx.modules.http.proxy.ProxyHeadersHashMaxSize;
import com.wepay.nginx.modules.http.proxy.ProxyHideHeader;
import com.wepay.nginx.modules.http.proxy.ProxyHttpVersion;
import com.wepay.nginx.modules.http.proxy.ProxyIgnoreClientAbort;
import com.wepay.nginx.modules.http.proxy.ProxyIgnoreHeaders;
import com.wepay.nginx.modules.http.proxy.ProxyInterceptErrors;
import com.wepay.nginx.modules.http.proxy.ProxyLimitRate;
import com.wepay.nginx.modules.http.proxy.ProxyMaxTempFileSize;
import com.wepay.nginx.modules.http.proxy.ProxyMethod;
import com.wepay.nginx.modules.http.proxy.ProxyNextUpstream;
import com.wepay.nginx.modules.http.proxy.ProxyNextUpstreamTimeout;
import com.wepay.nginx.modules.http.proxy.ProxyNextUpstreamTries;
import com.wepay.nginx.modules.http.proxy.ProxyNoCache;
import com.wepay.nginx.modules.http.proxy.ProxyPassHeader;
import com.wepay.nginx.modules.http.proxy.ProxyPassRequestBody;
import com.wepay.nginx.modules.http.proxy.ProxyPassRequestHeaders;
import com.wepay.nginx.modules.http.proxy.ProxyReadTimeout;
import com.wepay.nginx.modules.http.proxy.ProxyRedirect;
import com.wepay.nginx.modules.http.proxy.ProxyRequestBuffering;
import com.wepay.nginx.modules.http.proxy.ProxySendLowat;
import com.wepay.nginx.modules.http.proxy.ProxySendTimeout;
import com.wepay.nginx.modules.http.proxy.ProxySetBody;
import com.wepay.nginx.modules.http.proxy.ProxySetHeader;
import com.wepay.nginx.modules.http.proxy.ProxySslCertificate;
import com.wepay.nginx.modules.http.proxy.ProxySslCertificateKey;
import com.wepay.nginx.modules.http.proxy.ProxySslCiphers;
import com.wepay.nginx.modules.http.proxy.ProxySslCrl;
import com.wepay.nginx.modules.http.proxy.ProxySslName;
import com.wepay.nginx.modules.http.proxy.ProxySslPasswordFile;
import com.wepay.nginx.modules.http.proxy.ProxySslProtocols;
import com.wepay.nginx.modules.http.proxy.ProxySslServerName;
import com.wepay.nginx.modules.http.proxy.ProxySslSessionReuse;
import com.wepay.nginx.modules.http.proxy.ProxySslTrustedCertificate;
import com.wepay.nginx.modules.http.proxy.ProxySslVerify;
import com.wepay.nginx.modules.http.proxy.ProxySslVerifyDepth;
import com.wepay.nginx.modules.http.proxy.ProxyStore;
import com.wepay.nginx.modules.http.proxy.ProxyStoreAccess;
import com.wepay.nginx.modules.http.proxy.ProxyTempFileWriteSize;
import com.wepay.nginx.modules.http.proxy.ProxyTempPath;
import com.wepay.nginx.modules.http.realip.RealIpHeader;
import com.wepay.nginx.modules.http.realip.RealIpRecursive;
import com.wepay.nginx.modules.http.realip.SetRealIpFrom;
import com.wepay.nginx.modules.http.referer.RefererHashBucketSize;
import com.wepay.nginx.modules.http.referer.RefererHashMaxSize;
import com.wepay.nginx.modules.http.referer.ValidReferers;
import com.wepay.nginx.modules.http.rewrite.Break;
import com.wepay.nginx.modules.http.rewrite.Condition;
import com.wepay.nginx.modules.http.rewrite.Return;
import com.wepay.nginx.modules.http.rewrite.Rewrite;
import com.wepay.nginx.modules.http.rewrite.RewriteLog;
import com.wepay.nginx.modules.http.rewrite.Rewrites;
import com.wepay.nginx.modules.http.rewrite.SetClass;
import com.wepay.nginx.modules.http.rewrite.UninitializedVariableWarn;
import com.wepay.nginx.modules.http.scgi.ScgiBind;
import com.wepay.nginx.modules.http.scgi.ScgiBufferSize;
import com.wepay.nginx.modules.http.scgi.ScgiBuffering;
import com.wepay.nginx.modules.http.scgi.ScgiBuffers;
import com.wepay.nginx.modules.http.scgi.ScgiBusyBuffersSize;
import com.wepay.nginx.modules.http.scgi.ScgiCache;
import com.wepay.nginx.modules.http.scgi.ScgiCacheBackgroundUpdate;
import com.wepay.nginx.modules.http.scgi.ScgiCacheBypass;
import com.wepay.nginx.modules.http.scgi.ScgiCacheKey;
import com.wepay.nginx.modules.http.scgi.ScgiCacheLock;
import com.wepay.nginx.modules.http.scgi.ScgiCacheLockAge;
import com.wepay.nginx.modules.http.scgi.ScgiCacheLockTimeout;
import com.wepay.nginx.modules.http.scgi.ScgiCacheMaxRangeOffset;
import com.wepay.nginx.modules.http.scgi.ScgiCacheMethods;
import com.wepay.nginx.modules.http.scgi.ScgiCacheMinUses;
import com.wepay.nginx.modules.http.scgi.ScgiCachePurge;
import com.wepay.nginx.modules.http.scgi.ScgiCacheRevalidate;
import com.wepay.nginx.modules.http.scgi.ScgiCacheUseStale;
import com.wepay.nginx.modules.http.scgi.ScgiCacheValid;
import com.wepay.nginx.modules.http.scgi.ScgiConnectTimeout;
import com.wepay.nginx.modules.http.scgi.ScgiForceRanges;
import com.wepay.nginx.modules.http.scgi.ScgiHideHeader;
import com.wepay.nginx.modules.http.scgi.ScgiIgnoreClientAbort;
import com.wepay.nginx.modules.http.scgi.ScgiIgnoreHeaders;
import com.wepay.nginx.modules.http.scgi.ScgiInterceptErrors;
import com.wepay.nginx.modules.http.scgi.ScgiLimitRate;
import com.wepay.nginx.modules.http.scgi.ScgiMaxTempFileSize;
import com.wepay.nginx.modules.http.scgi.ScgiNextUpstream;
import com.wepay.nginx.modules.http.scgi.ScgiNextUpstreamTimeout;
import com.wepay.nginx.modules.http.scgi.ScgiNextUpstreamTries;
import com.wepay.nginx.modules.http.scgi.ScgiNoCache;
import com.wepay.nginx.modules.http.scgi.ScgiParam;
import com.wepay.nginx.modules.http.scgi.ScgiPassHeader;
import com.wepay.nginx.modules.http.scgi.ScgiPassRequestBody;
import com.wepay.nginx.modules.http.scgi.ScgiPassRequestHeaders;
import com.wepay.nginx.modules.http.scgi.ScgiReadTimeout;
import com.wepay.nginx.modules.http.scgi.ScgiRequestBuffering;
import com.wepay.nginx.modules.http.scgi.ScgiSendTimeout;
import com.wepay.nginx.modules.http.scgi.ScgiStore;
import com.wepay.nginx.modules.http.scgi.ScgiStoreAccess;
import com.wepay.nginx.modules.http.scgi.ScgiTempFileWriteSize;
import com.wepay.nginx.modules.http.scgi.ScgiTempPath;
import com.wepay.nginx.modules.http.secure.link.SecureLink;
import com.wepay.nginx.modules.http.secure.link.SecureLinkMd5;
import com.wepay.nginx.modules.http.session.log.SessionLog;
import com.wepay.nginx.modules.http.slice.Slice;
import com.wepay.nginx.modules.http.spdy.SpdyChunkSize;
import com.wepay.nginx.modules.http.spdy.SpdyHeadersComp;
import com.wepay.nginx.modules.http.ssi.Ssi;
import com.wepay.nginx.modules.http.ssi.SsiLastModified;
import com.wepay.nginx.modules.http.ssi.SsiMinFileChunk;
import com.wepay.nginx.modules.http.ssi.SsiSilentErrors;
import com.wepay.nginx.modules.http.ssi.SsiTypes;
import com.wepay.nginx.modules.http.ssi.SsiValueLength;
import com.wepay.nginx.modules.http.ssl.Ssl;
import com.wepay.nginx.modules.http.ssl.SslBufferSize;
import com.wepay.nginx.modules.http.ssl.SslCertificate;
import com.wepay.nginx.modules.http.ssl.SslCertificateKey;
import com.wepay.nginx.modules.http.ssl.SslCiphers;
import com.wepay.nginx.modules.http.ssl.SslClientCertificate;
import com.wepay.nginx.modules.http.ssl.SslCrl;
import com.wepay.nginx.modules.http.ssl.SslDhparam;
import com.wepay.nginx.modules.http.ssl.SslEcdhCurve;
import com.wepay.nginx.modules.http.ssl.SslPasswordFile;
import com.wepay.nginx.modules.http.ssl.SslPreferServerCiphers;
import com.wepay.nginx.modules.http.ssl.SslProtocols;
import com.wepay.nginx.modules.http.ssl.SslSessionCache;
import com.wepay.nginx.modules.http.ssl.SslSessionTicketKey;
import com.wepay.nginx.modules.http.ssl.SslSessionTickets;
import com.wepay.nginx.modules.http.ssl.SslSessionTimeout;
import com.wepay.nginx.modules.http.ssl.SslStapling;
import com.wepay.nginx.modules.http.ssl.SslStaplingFile;
import com.wepay.nginx.modules.http.ssl.SslStaplingResponder;
import com.wepay.nginx.modules.http.ssl.SslStaplingVerify;
import com.wepay.nginx.modules.http.ssl.SslTrustedCertificate;
import com.wepay.nginx.modules.http.ssl.SslVerifyClient;
import com.wepay.nginx.modules.http.ssl.SslVerifyDepth;
import com.wepay.nginx.modules.http.status.StatusFormat;
import com.wepay.nginx.modules.http.status.StatusZone;
import com.wepay.nginx.modules.http.stub.status.StubStatus;
import com.wepay.nginx.modules.http.sub.SubFilter;
import com.wepay.nginx.modules.http.sub.SubFilterLastModified;
import com.wepay.nginx.modules.http.sub.SubFilterOnce;
import com.wepay.nginx.modules.http.sub.SubFilterTypes;
import com.wepay.nginx.modules.http.userid.Userid;
import com.wepay.nginx.modules.http.userid.UseridDomain;
import com.wepay.nginx.modules.http.userid.UseridExpires;
import com.wepay.nginx.modules.http.userid.UseridMark;
import com.wepay.nginx.modules.http.userid.UseridName;
import com.wepay.nginx.modules.http.userid.UseridP3p;
import com.wepay.nginx.modules.http.userid.UseridPath;
import com.wepay.nginx.modules.http.userid.UseridService;
import com.wepay.nginx.modules.http.uwsgi.UwsgiBind;
import com.wepay.nginx.modules.http.uwsgi.UwsgiBufferSize;
import com.wepay.nginx.modules.http.uwsgi.UwsgiBuffering;
import com.wepay.nginx.modules.http.uwsgi.UwsgiBuffers;
import com.wepay.nginx.modules.http.uwsgi.UwsgiBusyBuffersSize;
import com.wepay.nginx.modules.http.uwsgi.UwsgiCache;
import com.wepay.nginx.modules.http.uwsgi.UwsgiCacheBackgroundUpdate;
import com.wepay.nginx.modules.http.uwsgi.UwsgiCacheBypass;
import com.wepay.nginx.modules.http.uwsgi.UwsgiCacheKey;
import com.wepay.nginx.modules.http.uwsgi.UwsgiCacheLock;
import com.wepay.nginx.modules.http.uwsgi.UwsgiCacheLockAge;
import com.wepay.nginx.modules.http.uwsgi.UwsgiCacheLockTimeout;
import com.wepay.nginx.modules.http.uwsgi.UwsgiCacheMaxRangeOffset;
import com.wepay.nginx.modules.http.uwsgi.UwsgiCacheMethods;
import com.wepay.nginx.modules.http.uwsgi.UwsgiCacheMinUses;
import com.wepay.nginx.modules.http.uwsgi.UwsgiCachePurge;
import com.wepay.nginx.modules.http.uwsgi.UwsgiCacheRevalidate;
import com.wepay.nginx.modules.http.uwsgi.UwsgiCacheUseStale;
import com.wepay.nginx.modules.http.uwsgi.UwsgiCacheValid;
import com.wepay.nginx.modules.http.uwsgi.UwsgiConnectTimeout;
import com.wepay.nginx.modules.http.uwsgi.UwsgiForceRanges;
import com.wepay.nginx.modules.http.uwsgi.UwsgiHideHeader;
import com.wepay.nginx.modules.http.uwsgi.UwsgiIgnoreClientAbort;
import com.wepay.nginx.modules.http.uwsgi.UwsgiIgnoreHeaders;
import com.wepay.nginx.modules.http.uwsgi.UwsgiInterceptErrors;
import com.wepay.nginx.modules.http.uwsgi.UwsgiLimitRate;
import com.wepay.nginx.modules.http.uwsgi.UwsgiMaxTempFileSize;
import com.wepay.nginx.modules.http.uwsgi.UwsgiModifier1;
import com.wepay.nginx.modules.http.uwsgi.UwsgiModifier2;
import com.wepay.nginx.modules.http.uwsgi.UwsgiNextUpstream;
import com.wepay.nginx.modules.http.uwsgi.UwsgiNextUpstreamTimeout;
import com.wepay.nginx.modules.http.uwsgi.UwsgiNextUpstreamTries;
import com.wepay.nginx.modules.http.uwsgi.UwsgiNoCache;
import com.wepay.nginx.modules.http.uwsgi.UwsgiParam;
import com.wepay.nginx.modules.http.uwsgi.UwsgiPassHeader;
import com.wepay.nginx.modules.http.uwsgi.UwsgiPassRequestBody;
import com.wepay.nginx.modules.http.uwsgi.UwsgiPassRequestHeaders;
import com.wepay.nginx.modules.http.uwsgi.UwsgiReadTimeout;
import com.wepay.nginx.modules.http.uwsgi.UwsgiRequestBuffering;
import com.wepay.nginx.modules.http.uwsgi.UwsgiSendTimeout;
import com.wepay.nginx.modules.http.uwsgi.UwsgiSslCertificate;
import com.wepay.nginx.modules.http.uwsgi.UwsgiSslCertificateKey;
import com.wepay.nginx.modules.http.uwsgi.UwsgiSslCiphers;
import com.wepay.nginx.modules.http.uwsgi.UwsgiSslCrl;
import com.wepay.nginx.modules.http.uwsgi.UwsgiSslName;
import com.wepay.nginx.modules.http.uwsgi.UwsgiSslPasswordFile;
import com.wepay.nginx.modules.http.uwsgi.UwsgiSslProtocols;
import com.wepay.nginx.modules.http.uwsgi.UwsgiSslServerName;
import com.wepay.nginx.modules.http.uwsgi.UwsgiSslSessionReuse;
import com.wepay.nginx.modules.http.uwsgi.UwsgiSslTrustedCertificate;
import com.wepay.nginx.modules.http.uwsgi.UwsgiSslVerify;
import com.wepay.nginx.modules.http.uwsgi.UwsgiSslVerifyDepth;
import com.wepay.nginx.modules.http.uwsgi.UwsgiStore;
import com.wepay.nginx.modules.http.uwsgi.UwsgiStoreAccess;
import com.wepay.nginx.modules.http.uwsgi.UwsgiTempFileWriteSize;
import com.wepay.nginx.modules.http.uwsgi.UwsgiTempPath;
import com.wepay.nginx.modules.http.v2.Http2BodyPrereadSize;
import com.wepay.nginx.modules.http.v2.Http2ChunkSize;
import com.wepay.nginx.modules.http.v2.Http2IdleTimeout;
import com.wepay.nginx.modules.http.v2.Http2MaxConcurrentStreams;
import com.wepay.nginx.modules.http.v2.Http2MaxFieldSize;
import com.wepay.nginx.modules.http.v2.Http2MaxHeaderSize;
import com.wepay.nginx.modules.http.v2.Http2MaxRequests;
import com.wepay.nginx.modules.http.v2.Http2RecvTimeout;
import com.wepay.nginx.modules.http.xslt.XmlEntities;
import com.wepay.nginx.modules.http.xslt.XsltLastModified;
import com.wepay.nginx.modules.http.xslt.XsltParam;
import com.wepay.nginx.modules.http.xslt.XsltStringParam;
import com.wepay.nginx.modules.http.xslt.XsltTypes;

public class If extends NamedAbstractContext {

	@JsonProperty("condition")
	private Condition condition;

	@JsonProperty("break")
	private Break breakO;

	@JsonProperty("return")
	private Return returnO;

	@JsonProperty("rewrite")
	private Rewrite rewrite;

	@JsonProperty("rewrites")
	private Rewrites rewrites;

	@JsonProperty("rewrite_log")
	private RewriteLog rewriteLog;

	@JsonProperty("set")
	private SetClass setO;

	@JsonProperty("uninitialized_variable_warn")
	private UninitializedVariableWarn uninitializedVariableWarn;

	// properties from server.

	@JsonProperty("absolute_redirect")
	private AbsoluteRedirect absoluteRedirect;

	@JsonProperty("access_log")
	private AccessLog accessLog;

	@JsonProperty("error_log")
	private ErrorLog errorLog;

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

	@JsonProperty("directio")
	private Directio directio;

	@JsonProperty("directio_alignment")
	private DirectioAlignment directioAlignment;

	@JsonProperty("disable_symlinks")
	private DisableSymlinks disableSymlinks;

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

	@JsonProperty("keepalive_disable")
	private KeepaliveDisable keepaliveDisable;

	@JsonProperty("keepalive_requests")
	private KeepaliveRequests keepaliveRequests;

	@JsonProperty("keepalive_timeout")
	private KeepaliveTimeout keepaliveTimeout;

	@JsonProperty("large_client_header_buffers")
	private LargeClientHeaderBuffers largeClientHeaderBuffers;

	@JsonProperty("limit_conn")
	private LimitConn limitConn;

	@JsonProperty("limit_conn_log_level")
	private LimitConnLogLevel limitConnLogLevel;

	@JsonProperty("limit_conn_status")
	private LimitConnStatus limitConnStatus;

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

	@JsonProperty("lingering_close")
	private LingeringClose lingeringClose;

	@JsonProperty("lingering_time")
	private LingeringTime lingeringTime;

	@JsonProperty("lingering_timeout")
	private LingeringTimeout lingeringTimeout;

	@JsonProperty("listen")
	private Listen listen;

	@JsonProperty("location")
	private Location location;

	@JsonProperty("locations")
	private Locations locations;

	@JsonProperty("log_not_found")
	private LogNotFound logNotFound;

	@JsonProperty("log_subrequest")
	private LogSubrequest logSubrequest;

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

	@JsonProperty("referer_hash_bucket_size")
	private RefererHashBucketSize refererHashBucketSize;

	@JsonProperty("referer_hash_max_size")
	private RefererHashMaxSize refererHashMaxSize;

	@JsonProperty("request_pool_size")
	private RequestPoolSize requestPoolSize;

	@JsonProperty("reset_timedout_connection")
	private ResetTimedoutConnection resetTimedoutConnection;

	@JsonProperty("resolver")
	private Resolver resolver;

	@JsonProperty("resolver_timeout")
	private ResolverTimeout resolverTimeout;

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

	@JsonProperty("server_name")
	private ServerName serverName;

	@JsonProperty("server_name_in_redirect")
	private ServerNameInRedirect serverNameInRedirect;

	@JsonProperty("server_tokens")
	private ServerTokens serverTokens;

	@JsonProperty("session_log")
	private SessionLog sessionLog;

	@JsonProperty("set_real_ip_from")
	private SetRealIpFrom setRealIpFrom;

	@JsonProperty("slice")
	private Slice slice;

	@JsonProperty("spdy_chunk_size")
	private SpdyChunkSize spdyChunkSize;

	@JsonProperty("spdy_headers_comp")
	private SpdyHeadersComp spdyHeadersComp;

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

	@JsonProperty("status_zone")
	private StatusZone statusZone;

	@JsonProperty("stub_status")
	private StubStatus stubStatus;

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

	@JsonProperty("try_files")
	private TryFiles tryFiles;

	@JsonProperty("types")
	private Types types;

	@JsonProperty("types_hash_bucket_size")
	private TypesHashBucketSize typesHashBucketSize;

	@JsonProperty("types_hash_max_size")
	private TypesHashMaxSize typesHashMaxSize;

	@JsonProperty("underscores_in_headers")
	private UnderscoresInHeaders underscoresInHeaders;

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

	@JsonProperty("valid_referers")
	private ValidReferers validReferers;

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

	@JsonProperty("ifs")
	private Ifs ifs;

	public If() {
		super(Arrays.asList(SERVER), null, "if");
	}

	public Condition getCondition() {
		return condition;
	}

	@Override
	public void populateMap() {
		Map<String, IDumps> map = getMap();
		map.put("rewrites", rewrites);
		map.put("break", breakO);
		map.put("return", returnO);
		map.put("rewrite", rewrite);
		map.put("rewrite_log", rewriteLog);
		map.put("set", setO);
		map.put("uninitialized_variable_warn", uninitializedVariableWarn);

		map.put("absolute_redirect", absoluteRedirect);
		map.put("access_log", accessLog);
		map.put("error_log", errorLog);
		map.put("add_after_body", addAfterBody);
		map.put("add_before_body", addBeforeBody);
		map.put("add_header", addHeader);
		map.put("add_trailer", addTrailer);
		map.put("addition_types", additionTypes);
		map.put("aio", aio);
		map.put("aio_write", aioWrite);
		map.put("allow", allow);
		map.put("ancient_browser", ancientBrowser);
		map.put("ancient_browser_value", ancientBrowserValue);
		map.put("auth_basic", authBasic);
		map.put("auth_basic_user_file", authBasicUserFile);
		map.put("auth_jwt", authJwt);
		map.put("auth_jwt_key_file", authJwtKeyFile);
		map.put("auth_request", authRequest);
		map.put("auth_request_set", authRequestSet);
		map.put("autoindex", autoindex);
		map.put("autoindex_exact_size", autoindexExactSize);
		map.put("autoindex_format", autoindexFormat);
		map.put("autoindex_localtime", autoindexLocaltime);
		map.put("break", breakO);
		map.put("chunked_transfer_encoding", chunkedTransferEncoding);
		map.put("client_body_buffer_size", clientBodyBufferSize);
		map.put("client_body_in_file_only", clientBodyInFileOnly);
		map.put("client_body_in_single_buffer", clientBodyInSingleBuffer);
		map.put("client_body_temp_path", clientBodyTempPath);
		map.put("client_body_timeout", clientBodyTimeout);
		map.put("client_header_buffer_size", clientHeaderBufferSize);
		map.put("client_header_timeout", clientHeaderTimeout);
		map.put("client_max_body_size", clientMaxBodySize);
		map.put("connection_pool_size", connectionPoolSize);
		map.put("create_full_put_path", createFullPutPath);
		map.put("dav_access", davAccess);
		map.put("dav_methods", davMethods);
		map.put("default_type", defaultType);
		map.put("deny", deny);
		map.put("directio", directio);
		map.put("directio_alignment", directioAlignment);
		map.put("disable_symlinks", disableSymlinks);
		map.put("error_page", errorPage);
		map.put("etag", etag);
		map.put("expires", expires);
		map.put("f4f_buffer_size", f4fBufferSize);
		map.put("fastcgi_bind", fastcgiBind);
		map.put("fastcgi_buffer_size", fastcgiBufferSize);
		map.put("fastcgi_buffering", fastcgiBuffering);
		map.put("fastcgi_buffers", fastcgiBuffers);
		map.put("fastcgi_busy_buffers_size", fastcgiBusyBuffersSize);
		map.put("fastcgi_cache", fastcgiCache);
		map.put("fastcgi_cache_background_update", fastcgiCacheBackgroundUpdate);
		map.put("fastcgi_cache_bypass", fastcgiCacheBypass);
		map.put("fastcgi_cache_key", fastcgiCacheKey);
		map.put("fastcgi_cache_lock", fastcgiCacheLock);
		map.put("fastcgi_cache_lock_age", fastcgiCacheLockAge);
		map.put("fastcgi_cache_lock_timeout", fastcgiCacheLockTimeout);
		map.put("fastcgi_cache_max_range_offset", fastcgiCacheMaxRangeOffset);
		map.put("fastcgi_cache_methods", fastcgiCacheMethods);
		map.put("fastcgi_cache_min_uses", fastcgiCacheMinUses);
		map.put("fastcgi_cache_purge", fastcgiCachePurge);
		map.put("fastcgi_cache_revalidate", fastcgiCacheRevalidate);
		map.put("fastcgi_cache_use_stale", fastcgiCacheUseStale);
		map.put("fastcgi_cache_valid", fastcgiCacheValid);
		map.put("fastcgi_catch_stderr", fastcgiCatchStderr);
		map.put("fastcgi_connect_timeout", fastcgiConnectTimeout);
		map.put("fastcgi_force_ranges", fastcgiForceRanges);
		map.put("fastcgi_hide_header", fastcgiHideHeader);
		map.put("fastcgi_ignore_client_abort", fastcgiIgnoreClientAbort);
		map.put("fastcgi_ignore_headers", fastcgiIgnoreHeaders);
		map.put("fastcgi_index", fastcgiIndex);
		map.put("fastcgi_intercept_errors", fastcgiInterceptErrors);
		map.put("fastcgi_keep_conn", fastcgiKeepConn);
		map.put("fastcgi_limit_rate", fastcgiLimitRate);
		map.put("fastcgi_max_temp_file_size", fastcgiMaxTempFileSize);
		map.put("fastcgi_next_upstream", fastcgiNextUpstream);
		map.put("fastcgi_next_upstream_timeout", fastcgiNextUpstreamTimeout);
		map.put("fastcgi_next_upstream_tries", fastcgiNextUpstreamTries);
		map.put("fastcgi_no_cache", fastcgiNoCache);
		map.put("fastcgi_param", fastcgiParam);
		map.put("fastcgi_pass_header", fastcgiPassHeader);
		map.put("fastcgi_pass_request_body", fastcgiPassRequestBody);
		map.put("fastcgi_pass_request_headers", fastcgiPassRequestHeaders);
		map.put("fastcgi_read_timeout", fastcgiReadTimeout);
		map.put("fastcgi_request_buffering", fastcgiRequestBuffering);
		map.put("fastcgi_send_lowat", fastcgiSendLowat);
		map.put("fastcgi_send_timeout", fastcgiSendTimeout);
		map.put("fastcgi_store", fastcgiStore);
		map.put("fastcgi_store_access", fastcgiStoreAccess);
		map.put("fastcgi_temp_file_write_size", fastcgiTempFileWriteSize);
		map.put("fastcgi_temp_path", fastcgiTempPath);
		map.put("gunzip", gunzip);
		map.put("gunzip_buffers", gunzipBuffers);
		map.put("gzip", gzip);
		map.put("gzip_buffers", gzipBuffers);
		map.put("gzip_comp_level", gzipCompLevel);
		map.put("gzip_disable", gzipDisable);
		map.put("gzip_http_version", gzipHttpVersion);
		map.put("gzip_min_length", gzipMinLength);
		map.put("gzip_proxied", gzipProxied);
		map.put("gzip_static", gzipStatic);
		map.put("gzip_types", gzipTypes);
		map.put("gzip_vary", gzipVary);
		map.put("hls_buffers", hlsBuffers);
		map.put("hls_forward_args", hlsForwardArgs);
		map.put("hls_fragment", hlsFragment);
		map.put("hls_mp4_buffer_size", hlsMp4BufferSize);
		map.put("hls_mp4_max_buffer_size", hlsMp4MaxBufferSize);
		map.put("http2_body_preread_size", http2BodyPrereadSize);
		map.put("http2_chunk_size", http2ChunkSize);
		map.put("http2_idle_timeout", http2IdleTimeout);
		map.put("http2_max_concurrent_streams", http2MaxConcurrentStreams);
		map.put("http2_max_field_size", http2MaxFieldSize);
		map.put("http2_max_header_size", http2MaxHeaderSize);
		map.put("http2_max_requests", http2MaxRequests);
		map.put("http2_recv_timeout", http2RecvTimeout);
		map.put("if_modified_since", ifModifiedSince);
		map.put("ignore_invalid_headers", ignoreInvalidHeaders);
		map.put("image_filter_buffer", imageFilterBuffer);
		map.put("image_filter_interlace", imageFilterInterlace);
		map.put("image_filter_jpeg_quality", imageFilterJpegQuality);
		map.put("image_filter_sharpen", imageFilterSharpen);
		map.put("image_filter_transparency", imageFilterTransparency);
		map.put("image_filter_webp_quality", imageFilterWebpQuality);
		map.put("index", index);
		map.put("keepalive_disable", keepaliveDisable);
		map.put("keepalive_requests", keepaliveRequests);
		map.put("keepalive_timeout", keepaliveTimeout);
		map.put("large_client_header_buffers", largeClientHeaderBuffers);
		map.put("limit_conn", limitConn);
		map.put("limit_conn_log_level", limitConnLogLevel);
		map.put("limit_conn_status", limitConnStatus);
		map.put("limit_rate", limitRate);
		map.put("limit_rate_after", limitRateAfter);
		map.put("limit_req", limitReq);
		map.put("limit_req_log_level", limitReqLogLevel);
		map.put("limit_req_status", limitReqStatus);
		map.put("lingering_close", lingeringClose);
		map.put("lingering_time", lingeringTime);
		map.put("lingering_timeout", lingeringTimeout);
		map.put("listen", listen);
		map.put("location", location);
		map.put("locations", locations);
		map.put("log_not_found", logNotFound);
		map.put("log_subrequest", logSubrequest);
		map.put("max_ranges", maxRanges);
		map.put("merge_slashes", mergeSlashes);
		map.put("min_delete_depth", minDeleteDepth);
		map.put("mirror", mirror);
		map.put("mirror_request_body", mirrorRequestBody);
		map.put("modern_browser", modernBrowser);
		map.put("modern_browser_value", modernBrowserValue);
		map.put("mp4_buffer_size", mp4BufferSize);
		map.put("mp4_limit_rate", mp4LimitRate);
		map.put("mp4_limit_rate_after", mp4LimitRateAfter);
		map.put("mp4_max_buffer_size", mp4MaxBufferSize);
		map.put("msie_padding", msiePadding);
		map.put("msie_refresh", msieRefresh);
		map.put("open_file_cache", openFileCache);
		map.put("open_file_cache_errors", openFileCacheErrors);
		map.put("open_file_cache_min_uses", openFileCacheMinUses);
		map.put("open_file_cache_valid", openFileCacheValid);
		map.put("open_log_file_cache", openLogFileCache);
		map.put("output_buffers", outputBuffers);
		map.put("port_in_redirect", portInRedirect);
		map.put("postpone_output", postponeOutput);
		map.put("proxy_bind", proxyBind);
		map.put("proxy_buffer_size", proxyBufferSize);
		map.put("proxy_buffering", proxyBuffering);
		map.put("proxy_buffers", proxyBuffers);
		map.put("proxy_busy_buffers_size", proxyBusyBuffersSize);
		map.put("proxy_cache", proxyCache);
		map.put("proxy_cache_background_update", proxyCacheBackgroundUpdate);
		map.put("proxy_cache_bypass", proxyCacheBypass);
		map.put("proxy_cache_convert_head", proxyCacheConvertHead);
		map.put("proxy_cache_key", proxyCacheKey);
		map.put("proxy_cache_lock", proxyCacheLock);
		map.put("proxy_cache_lock_age", proxyCacheLockAge);
		map.put("proxy_cache_lock_timeout", proxyCacheLockTimeout);
		map.put("proxy_cache_max_range_offset", proxyCacheMaxRangeOffset);
		map.put("proxy_cache_methods", proxyCacheMethods);
		map.put("proxy_cache_min_uses", proxyCacheMinUses);
		map.put("proxy_cache_purge", proxyCachePurge);
		map.put("proxy_cache_revalidate", proxyCacheRevalidate);
		map.put("proxy_cache_use_stale", proxyCacheUseStale);
		map.put("proxy_cache_valid", proxyCacheValid);
		map.put("proxy_connect_timeout", proxyConnectTimeout);
		map.put("proxy_cookie_domain", proxyCookieDomain);
		map.put("proxy_cookie_path", proxyCookiePath);
		map.put("proxy_force_ranges", proxyForceRanges);
		map.put("proxy_headers_hash_bucket_size", proxyHeadersHashBucketSize);
		map.put("proxy_headers_hash_max_size", proxyHeadersHashMaxSize);
		map.put("proxy_hide_header", proxyHideHeader);
		map.put("proxy_http_version", proxyHttpVersion);
		map.put("proxy_ignore_client_abort", proxyIgnoreClientAbort);
		map.put("proxy_ignore_headers", proxyIgnoreHeaders);
		map.put("proxy_intercept_errors", proxyInterceptErrors);
		map.put("proxy_limit_rate", proxyLimitRate);
		map.put("proxy_max_temp_file_size", proxyMaxTempFileSize);
		map.put("proxy_method", proxyMethod);
		map.put("proxy_next_upstream", proxyNextUpstream);
		map.put("proxy_next_upstream_timeout", proxyNextUpstreamTimeout);
		map.put("proxy_next_upstream_tries", proxyNextUpstreamTries);
		map.put("proxy_no_cache", proxyNoCache);
		map.put("proxy_pass_header", proxyPassHeader);
		map.put("proxy_pass_request_body", proxyPassRequestBody);
		map.put("proxy_pass_request_headers", proxyPassRequestHeaders);
		map.put("proxy_read_timeout", proxyReadTimeout);
		map.put("proxy_redirect", proxyRedirect);
		map.put("proxy_request_buffering", proxyRequestBuffering);
		map.put("proxy_send_lowat", proxySendLowat);
		map.put("proxy_send_timeout", proxySendTimeout);
		map.put("proxy_set_body", proxySetBody);
		map.put("proxy_set_header", proxySetHeader);
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
		map.put("proxy_store", proxyStore);
		map.put("proxy_store_access", proxyStoreAccess);
		map.put("proxy_temp_file_write_size", proxyTempFileWriteSize);
		map.put("proxy_temp_path", proxyTempPath);
		map.put("read_ahead", readAhead);
		map.put("real_ip_header", realIpHeader);
		map.put("real_ip_recursive", realIpRecursive);
		map.put("recursive_error_pages", recursiveErrorPages);
		map.put("referer_hash_bucket_size", refererHashBucketSize);
		map.put("referer_hash_max_size", refererHashMaxSize);
		map.put("request_pool_size", requestPoolSize);
		map.put("reset_timedout_connection", resetTimedoutConnection);
		map.put("resolver", resolver);
		map.put("resolver_timeout", resolverTimeout);
		map.put("return", returnO);
		map.put("rewrite", rewrite);
		map.put("rewrites", rewrites);
		map.put("rewrite_log", rewriteLog);
		map.put("root", root);
		map.put("satisfy", satisfy);
		map.put("scgi_bind", scgiBind);
		map.put("scgi_buffer_size", scgiBufferSize);
		map.put("scgi_buffering", scgiBuffering);
		map.put("scgi_buffers", scgiBuffers);
		map.put("scgi_busy_buffers_size", scgiBusyBuffersSize);
		map.put("scgi_cache", scgiCache);
		map.put("scgi_cache_background_update", scgiCacheBackgroundUpdate);
		map.put("scgi_cache_bypass", scgiCacheBypass);
		map.put("scgi_cache_key", scgiCacheKey);
		map.put("scgi_cache_lock", scgiCacheLock);
		map.put("scgi_cache_lock_age", scgiCacheLockAge);
		map.put("scgi_cache_lock_timeout", scgiCacheLockTimeout);
		map.put("scgi_cache_max_range_offset", scgiCacheMaxRangeOffset);
		map.put("scgi_cache_methods", scgiCacheMethods);
		map.put("scgi_cache_min_uses", scgiCacheMinUses);
		map.put("scgi_cache_purge", scgiCachePurge);
		map.put("scgi_cache_revalidate", scgiCacheRevalidate);
		map.put("scgi_cache_use_stale", scgiCacheUseStale);
		map.put("scgi_cache_valid", scgiCacheValid);
		map.put("scgi_connect_timeout", scgiConnectTimeout);
		map.put("scgi_force_ranges", scgiForceRanges);
		map.put("scgi_hide_header", scgiHideHeader);
		map.put("scgi_ignore_client_abort", scgiIgnoreClientAbort);
		map.put("scgi_ignore_headers", scgiIgnoreHeaders);
		map.put("scgi_intercept_errors", scgiInterceptErrors);
		map.put("scgi_limit_rate", scgiLimitRate);
		map.put("scgi_max_temp_file_size", scgiMaxTempFileSize);
		map.put("scgi_next_upstream", scgiNextUpstream);
		map.put("scgi_next_upstream_timeout", scgiNextUpstreamTimeout);
		map.put("scgi_next_upstream_tries", scgiNextUpstreamTries);
		map.put("scgi_no_cache", scgiNoCache);
		map.put("scgi_param", scgiParam);
		map.put("scgi_pass_header", scgiPassHeader);
		map.put("scgi_pass_request_body", scgiPassRequestBody);
		map.put("scgi_pass_request_headers", scgiPassRequestHeaders);
		map.put("scgi_read_timeout", scgiReadTimeout);
		map.put("scgi_request_buffering", scgiRequestBuffering);
		map.put("scgi_send_timeout", scgiSendTimeout);
		map.put("scgi_store", scgiStore);
		map.put("scgi_store_access", scgiStoreAccess);
		map.put("scgi_temp_file_write_size", scgiTempFileWriteSize);
		map.put("scgi_temp_path", scgiTempPath);
		map.put("secure_link", secureLink);
		map.put("secure_link_md5", secureLinkMd5);
		map.put("send_lowat", sendLowat);
		map.put("send_timeout", sendTimeout);
		map.put("sendfile", sendfile);
		map.put("sendfile_max_chunk", sendfileMaxChunk);
		map.put("server_name", serverName);
		map.put("server_name_in_redirect", serverNameInRedirect);
		map.put("server_tokens", serverTokens);
		map.put("session_log", sessionLog);
		map.put("set_real_ip_from", setRealIpFrom);
		map.put("slice", slice);
		map.put("spdy_chunk_size", spdyChunkSize);
		map.put("spdy_headers_comp", spdyHeadersComp);
		map.put("ssi", ssi);
		map.put("ssi_last_modified", ssiLastModified);
		map.put("ssi_min_file_chunk", ssiMinFileChunk);
		map.put("ssi_silent_errors", ssiSilentErrors);
		map.put("ssi_types", ssiTypes);
		map.put("ssi_value_length", ssiValueLength);
		map.put("ssl", ssl);
		map.put("ssl_buffer_size", sslBufferSize);
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
		map.put("ssl_stapling", sslStapling);
		map.put("ssl_stapling_file", sslStaplingFile);
		map.put("ssl_stapling_responder", sslStaplingResponder);
		map.put("ssl_stapling_verify", sslStaplingVerify);
		map.put("ssl_trusted_certificate", sslTrustedCertificate);
		map.put("ssl_verify_client", sslVerifyClient);
		map.put("ssl_verify_depth", sslVerifyDepth);
		map.put("status_format", statusFormat);
		map.put("status_zone", statusZone);
		map.put("stub_status", stubStatus);
		map.put("sub_filter", subFilter);
		map.put("sub_filter_last_modified", subFilterLastModified);
		map.put("sub_filter_once", subFilterOnce);
		map.put("sub_filter_types", subFilterTypes);
		map.put("tcp_nodelay", tcpNodelay);
		map.put("tcp_nopush", tcpNopush);
		map.put("try_files", tryFiles);
		map.put("types", types);
		map.put("types_hash_bucket_size", typesHashBucketSize);
		map.put("types_hash_max_size", typesHashMaxSize);
		map.put("underscores_in_headers", underscoresInHeaders);
		map.put("uninitialized_variable_warn", uninitializedVariableWarn);
		map.put("userid", userid);
		map.put("userid_domain", useridDomain);
		map.put("userid_expires", useridExpires);
		map.put("userid_mark", useridMark);
		map.put("userid_name", useridName);
		map.put("userid_p3p", useridP3p);
		map.put("userid_path", useridPath);
		map.put("userid_service", useridService);
		map.put("uwsgi_bind", uwsgiBind);
		map.put("uwsgi_buffer_size", uwsgiBufferSize);
		map.put("uwsgi_buffering", uwsgiBuffering);
		map.put("uwsgi_buffers", uwsgiBuffers);
		map.put("uwsgi_busy_buffers_size", uwsgiBusyBuffersSize);
		map.put("uwsgi_cache", uwsgiCache);
		map.put("uwsgi_cache_background_update", uwsgiCacheBackgroundUpdate);
		map.put("uwsgi_cache_bypass", uwsgiCacheBypass);
		map.put("uwsgi_cache_key", uwsgiCacheKey);
		map.put("uwsgi_cache_lock", uwsgiCacheLock);
		map.put("uwsgi_cache_lock_age", uwsgiCacheLockAge);
		map.put("uwsgi_cache_lock_timeout", uwsgiCacheLockTimeout);
		map.put("uwsgi_cache_max_range_offset", uwsgiCacheMaxRangeOffset);
		map.put("uwsgi_cache_methods", uwsgiCacheMethods);
		map.put("uwsgi_cache_min_uses", uwsgiCacheMinUses);
		map.put("uwsgi_cache_purge", uwsgiCachePurge);
		map.put("uwsgi_cache_revalidate", uwsgiCacheRevalidate);
		map.put("uwsgi_cache_use_stale", uwsgiCacheUseStale);
		map.put("uwsgi_cache_valid", uwsgiCacheValid);
		map.put("uwsgi_connect_timeout", uwsgiConnectTimeout);
		map.put("uwsgi_force_ranges", uwsgiForceRanges);
		map.put("uwsgi_hide_header", uwsgiHideHeader);
		map.put("uwsgi_ignore_client_abort", uwsgiIgnoreClientAbort);
		map.put("uwsgi_ignore_headers", uwsgiIgnoreHeaders);
		map.put("uwsgi_intercept_errors", uwsgiInterceptErrors);
		map.put("uwsgi_limit_rate", uwsgiLimitRate);
		map.put("uwsgi_max_temp_file_size", uwsgiMaxTempFileSize);
		map.put("uwsgi_modifier1", uwsgiModifier1);
		map.put("uwsgi_modifier2", uwsgiModifier2);
		map.put("uwsgi_next_upstream", uwsgiNextUpstream);
		map.put("uwsgi_next_upstream_timeout", uwsgiNextUpstreamTimeout);
		map.put("uwsgi_next_upstream_tries", uwsgiNextUpstreamTries);
		map.put("uwsgi_no_cache", uwsgiNoCache);
		map.put("uwsgi_param", uwsgiParam);
		map.put("uwsgi_pass_header", uwsgiPassHeader);
		map.put("uwsgi_pass_request_body", uwsgiPassRequestBody);
		map.put("uwsgi_pass_request_headers", uwsgiPassRequestHeaders);
		map.put("uwsgi_read_timeout", uwsgiReadTimeout);
		map.put("uwsgi_request_buffering", uwsgiRequestBuffering);
		map.put("uwsgi_send_timeout", uwsgiSendTimeout);
		map.put("uwsgi_ssl_certificate", uwsgiSslCertificate);
		map.put("uwsgi_ssl_certificate_key", uwsgiSslCertificateKey);
		map.put("uwsgi_ssl_ciphers", uwsgiSslCiphers);
		map.put("uwsgi_ssl_crl", uwsgiSslCrl);
		map.put("uwsgi_ssl_name", uwsgiSslName);
		map.put("uwsgi_ssl_password_file", uwsgiSslPasswordFile);
		map.put("uwsgi_ssl_protocols", uwsgiSslProtocols);
		map.put("uwsgi_ssl_server_name", uwsgiSslServerName);
		map.put("uwsgi_ssl_session_reuse", uwsgiSslSessionReuse);
		map.put("uwsgi_ssl_trusted_certificate", uwsgiSslTrustedCertificate);
		map.put("uwsgi_ssl_verify", uwsgiSslVerify);
		map.put("uwsgi_ssl_verify_depth", uwsgiSslVerifyDepth);
		map.put("uwsgi_store", uwsgiStore);
		map.put("uwsgi_store_access", uwsgiStoreAccess);
		map.put("uwsgi_temp_file_write_size", uwsgiTempFileWriteSize);
		map.put("uwsgi_temp_path", uwsgiTempPath);
		map.put("valid_referers", validReferers);
		map.put("xml_entities", xmlEntities);
		map.put("xslt_last_modified", xsltLastModified);
		map.put("xslt_param", xsltParam);
		map.put("xslt_string_param", xsltStringParam);
		map.put("xslt_types", xsltTypes);

	}

	public String getBlockName() {
		return "(" + getCondition().getValue() + ")";
	}

}
