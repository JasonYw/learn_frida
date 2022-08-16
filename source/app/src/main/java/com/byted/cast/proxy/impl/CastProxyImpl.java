package com.byted.cast.proxy.impl;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.byted.cast.proxy.CastProxyType;
import com.byted.cast.proxy.Config;
import com.byted.cast.proxy.Event;
import com.byted.cast.proxy.ILogger;
import com.byted.cast.proxy.IMonitor;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.xiaomi.mipush.sdk.Constants;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import p002O.C0002O;
import p003X.G4Y;

/* loaded from: classes8.dex */
public class CastProxyImpl {
    public static ChangeQuickRedirect changeQuickRedirect;
    public String appId;
    public Context context;
    public boolean enableDebug;
    public HttpServer httpServer;
    public ILogger logger = new ILogger() { // from class: com.byted.cast.proxy.impl.CastProxyImpl.1
        static {
            Covode.recordClassIndex(9775);
        }

        @Override // com.byted.cast.proxy.ILogger
        public void onDebug(String str, String str2) {
        }

        @Override // com.byted.cast.proxy.ILogger
        public void onError(String str, String str2) {
        }

        @Override // com.byted.cast.proxy.ILogger
        public void onError(String str, String str2, Throwable th) {
        }

        @Override // com.byted.cast.proxy.ILogger
        public void onInfo(String str, String str2) {
        }

        @Override // com.byted.cast.proxy.ILogger
        public void onVerbose(String str, String str2) {
        }

        @Override // com.byted.cast.proxy.ILogger
        public void onWarn(String str, String str2) {
        }
    };
    public IMonitor monitor;
    public int port;
    public CastProxyType type;

    static {
        Covode.recordClassIndex(9774);
    }

    public String getVersion() {
        return "1.0.0";
    }

    private int getHttpServerPort() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 5);
        if (proxy.isSupported) {
            return ((Integer) proxy.result).intValue();
        }
        int checkDefaultPort = checkDefaultPort();
        if (-1 == checkDefaultPort) {
            return findAvaiablePort();
        }
        return checkDefaultPort;
    }

    private int getPortValue() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 9);
        if (proxy.isSupported) {
            return ((Integer) proxy.result).intValue();
        }
        return G4Y.LIZ(this.context, "ByteCastLMS", 0).getInt("port", 0);
    }

    public boolean stop() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 2);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        if (this.httpServer == null) {
            return true;
        }
        long currentTimeMillis = System.currentTimeMillis();
        boolean stop = this.httpServer.stop();
        long currentTimeMillis2 = System.currentTimeMillis();
        IMonitor iMonitor = this.monitor;
        if (iMonitor != null) {
            iMonitor.onEvent("ByteCast_CastProxy_STOP", new Event(this.context, this.appId, currentTimeMillis2 - currentTimeMillis, stop));
        }
        return stop;
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x005d, code lost:
        if (0 == 0) goto L48;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private int checkDefaultPort() {
        /*
            r5 = this;
            java.lang.String r3 = "socket close fail. "
            r4 = 0
            java.lang.Object[] r2 = new java.lang.Object[r4]
            com.bytedance.hotfix.base.ChangeQuickRedirect r1 = com.byted.cast.proxy.impl.CastProxyImpl.changeQuickRedirect
            r0 = 6
            com.bytedance.hotfix.PatchProxyResult r1 = com.bytedance.hotfix.PatchProxy.proxy(r2, r5, r1, r4, r0)
            boolean r0 = r1.isSupported
            if (r0 == 0) goto L19
            java.lang.Object r0 = r1.result
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            return r0
        L19:
            r4 = 0
            java.net.ServerSocket r1 = new java.net.ServerSocket     // Catch: java.io.IOException -> L3c java.lang.Throwable -> L5c
            int r0 = r5.getPortValue()     // Catch: java.io.IOException -> L3c java.lang.Throwable -> L5c
            r1.<init>(r0)     // Catch: java.io.IOException -> L3c java.lang.Throwable -> L5c
            int r2 = r1.getLocalPort()     // Catch: java.lang.Throwable -> L38 java.io.IOException -> L3b
            r1.close()     // Catch: java.io.IOException -> L2b
            goto L37
        L2b:
            r1 = move-exception
            r1.printStackTrace()
            com.byted.cast.proxy.IMonitor r0 = r5.monitor
            if (r0 == 0) goto L36
            r0.onException(r3, r1)
        L36:
            return r2
        L37:
            return r2
        L38:
            r2 = move-exception
            r4 = r1
            goto L5f
        L3b:
            r4 = r1
        L3c:
            boolean r0 = r5.enableDebug     // Catch: java.lang.Throwable -> L5c
            if (r0 == 0) goto L49
            com.byted.cast.proxy.ILogger r2 = r5.logger     // Catch: java.lang.Throwable -> L5c
            java.lang.String r1 = "CastProxy"
            java.lang.String r0 = "Couldn't assign port to your service."
            r2.onDebug(r1, r0)     // Catch: java.lang.Throwable -> L5c
        L49:
            if (r4 == 0) goto L5a
            r4.close()     // Catch: java.io.IOException -> L4f
            goto L5a
        L4f:
            r1 = move-exception
            r1.printStackTrace()
            com.byted.cast.proxy.IMonitor r0 = r5.monitor
            if (r0 == 0) goto L5a
            r0.onException(r3, r1)
        L5a:
            r0 = -1
            return r0
        L5c:
            r2 = move-exception
            if (r4 == 0) goto L6e
        L5f:
            r4.close()     // Catch: java.io.IOException -> L63
            throw r2
        L63:
            r1 = move-exception
            r1.printStackTrace()
            com.byted.cast.proxy.IMonitor r0 = r5.monitor
            if (r0 == 0) goto L6e
            r0.onException(r3, r1)
        L6e:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.byted.cast.proxy.impl.CastProxyImpl.checkDefaultPort():int");
    }

    /* JADX WARN: Code restructure failed: missing block: B:56:0x0067, code lost:
        if (r5 == null) goto L53;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private int findAvaiablePort() {
        /*
            r6 = this;
            java.lang.String r4 = "socket close fail. "
            r3 = 0
            java.lang.Object[] r2 = new java.lang.Object[r3]
            com.bytedance.hotfix.base.ChangeQuickRedirect r1 = com.byted.cast.proxy.impl.CastProxyImpl.changeQuickRedirect
            r0 = 7
            com.bytedance.hotfix.PatchProxyResult r1 = com.bytedance.hotfix.PatchProxy.proxy(r2, r6, r1, r3, r0)
            boolean r0 = r1.isSupported
            if (r0 == 0) goto L19
            java.lang.Object r0 = r1.result
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            return r0
        L19:
            r5 = 0
            java.net.ServerSocket r0 = new java.net.ServerSocket     // Catch: java.io.IOException -> L3a java.lang.Throwable -> L66
            r0.<init>(r3)     // Catch: java.io.IOException -> L3a java.lang.Throwable -> L66
            int r2 = r0.getLocalPort()     // Catch: java.lang.Throwable -> L34 java.io.IOException -> L37
            r0.close()     // Catch: java.io.IOException -> L27
            goto L33
        L27:
            r1 = move-exception
            r1.printStackTrace()
            com.byted.cast.proxy.IMonitor r0 = r6.monitor
            if (r0 == 0) goto L32
            r0.onException(r4, r1)
        L32:
            return r2
        L33:
            return r2
        L34:
            r2 = move-exception
            r5 = r0
            goto L69
        L37:
            r3 = move-exception
            r5 = r0
            goto L3b
        L3a:
            r3 = move-exception
        L3b:
            boolean r0 = r6.enableDebug     // Catch: java.lang.Throwable -> L66
            if (r0 == 0) goto L48
            com.byted.cast.proxy.ILogger r2 = r6.logger     // Catch: java.lang.Throwable -> L66
            java.lang.String r1 = "CastProxy"
            java.lang.String r0 = "Couldn't assign port to your service."
            r2.onDebug(r1, r0)     // Catch: java.lang.Throwable -> L66
        L48:
            com.byted.cast.proxy.IMonitor r0 = r6.monitor     // Catch: java.lang.Throwable -> L66
            if (r0 == 0) goto L53
            com.byted.cast.proxy.IMonitor r1 = r6.monitor     // Catch: java.lang.Throwable -> L66
            java.lang.String r0 = "Couldn't assign port to your service. "
            r1.onException(r0, r3)     // Catch: java.lang.Throwable -> L66
        L53:
            if (r5 == 0) goto L64
            r5.close()     // Catch: java.io.IOException -> L59
            goto L64
        L59:
            r1 = move-exception
            r1.printStackTrace()
            com.byted.cast.proxy.IMonitor r0 = r6.monitor
            if (r0 == 0) goto L64
            r0.onException(r4, r1)
        L64:
            r0 = -1
            return r0
        L66:
            r2 = move-exception
            if (r5 == 0) goto L78
        L69:
            r5.close()     // Catch: java.io.IOException -> L6d
            throw r2
        L6d:
            r1 = move-exception
            r1.printStackTrace()
            com.byted.cast.proxy.IMonitor r0 = r6.monitor
            if (r0 == 0) goto L78
            r0.onException(r4, r1)
        L78:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.byted.cast.proxy.impl.CastProxyImpl.findAvaiablePort():int");
    }

    private void setPortValue(int i) {
        if (PatchProxy.proxy(new Object[]{Integer.valueOf(i)}, this, changeQuickRedirect, false, 8).isSupported) {
            return;
        }
        SharedPreferences.Editor edit = G4Y.LIZ(this.context, "ByteCastLMS", 0).edit();
        edit.putInt("port", i);
        edit.apply();
    }

    public boolean start(Context context, Config config) {
        boolean z = false;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{context, config}, this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        if (context != null && config != null) {
            long currentTimeMillis = System.currentTimeMillis();
            this.context = context;
            this.port = getHttpServerPort();
            this.httpServer = new HttpServer(context, this.port);
            String proxy2 = config.getProxy();
            if (!TextUtils.isEmpty(proxy2)) {
                this.httpServer.setProxy(proxy2);
            }
            this.appId = config.getAppId();
            this.httpServer.setAppId(this.appId);
            this.type = config.getCastProxyType();
            this.httpServer.setCastProxyType(this.type);
            this.enableDebug = config.isEnableDebug();
            this.httpServer.enableDebug(this.enableDebug);
            this.logger = config.getLogger();
            this.httpServer.setLogger(this.logger);
            this.monitor = config.getMonitor();
            this.httpServer.setMonitor(this.monitor);
            try {
                this.httpServer.start();
                setPortValue(this.port);
                z = true;
            } catch (IOException e) {
                e.printStackTrace();
            }
            long currentTimeMillis2 = System.currentTimeMillis();
            IMonitor iMonitor = this.monitor;
            if (iMonitor != null) {
                iMonitor.onEvent("ByteCast_CastProxy_Start", new Event(context, this.appId, currentTimeMillis2 - currentTimeMillis, z));
            }
            return z;
        }
        ILogger iLogger = this.logger;
        if (iLogger != null) {
            iLogger.onError("CastProxy", "context and config cannot be null");
        }
        return false;
    }

    public String proxyUrl(String str, String str2, String str3) {
        String str4;
        String str5;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str, str2, str3}, this, changeQuickRedirect, false, 3);
        if (proxy.isSupported) {
            return (String) proxy.result;
        }
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            try {
                if (new URL(str2).getPath().endsWith(".flv")) {
                    return str2;
                }
                String connectionIP = C2510Utils.getConnectionIP(str);
                boolean startsWith = str2.startsWith("https://");
                if (startsWith) {
                    str4 = "https";
                } else {
                    str4 = "http";
                }
                if (!TextUtils.isEmpty(str3)) {
                    str5 = C0002O.m25085C("/", str3, "/none/");
                } else {
                    str5 = "/none/none/";
                }
                if (startsWith) {
                    return str2.replace("https://", C0002O.m25080C("http://", connectionIP, Constants.COLON_SEPARATOR, Integer.valueOf(this.port), "/", this.httpServer.getProxy(), "/", str4, str5));
                }
                return str2.replace("http://", C0002O.m25080C("http://", connectionIP, Constants.COLON_SEPARATOR, Integer.valueOf(this.port), "/", this.httpServer.getProxy(), "/", str4, str5));
            } catch (MalformedURLException e) {
                e.printStackTrace();
                return null;
            }
        }
        if (this.enableDebug) {
            this.logger.onError("CastProxy", "ip or url cannot be null");
        }
        return null;
    }

    public String proxyUrl(String str, String str2, String str3, String str4) {
        String str5;
        String str6;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str, str2, str3, str4}, this, changeQuickRedirect, false, 4);
        if (proxy.isSupported) {
            return (String) proxy.result;
        }
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            if ((TextUtils.isEmpty(str3) && !TextUtils.isEmpty(str4)) || (!TextUtils.isEmpty(str3) && TextUtils.isEmpty(str4))) {
                if (this.enableDebug) {
                    this.logger.onError("CastProxy", "key and iv need both exist");
                }
                return null;
            } else if (str3.getBytes().length < 16) {
                if (this.enableDebug) {
                    this.logger.onError("CastProxy", "key's length should >= 16");
                }
                return null;
            } else {
                try {
                    if (new URL(str2).getPath().endsWith(".flv")) {
                        return str2;
                    }
                    C2510Utils.getConnectionIP(str);
                    boolean startsWith = str2.startsWith("https://");
                    if (startsWith) {
                        str5 = "https";
                    } else {
                        str5 = "http";
                    }
                    if (!TextUtils.isEmpty(str3) && !TextUtils.isEmpty(str4)) {
                        str6 = C0002O.m25083C("/", str3, "/", str4, "/");
                    } else {
                        str6 = "/none/none/";
                    }
                    if (startsWith) {
                        return str2.replace("https://", C0002O.m25080C("https://", str, Constants.COLON_SEPARATOR, Integer.valueOf(this.port), "/", this.httpServer.getProxy(), "/", str5, str6));
                    }
                    return str2.replace("http://", C0002O.m25080C("http://", str, Constants.COLON_SEPARATOR, Integer.valueOf(this.port), "/", this.httpServer.getProxy(), "/", str5, str6));
                } catch (MalformedURLException e) {
                    e.printStackTrace();
                    return null;
                }
            }
        }
        if (this.enableDebug) {
            this.logger.onError("CastProxy", "ip or url cannot be null");
        }
        return null;
    }
}
