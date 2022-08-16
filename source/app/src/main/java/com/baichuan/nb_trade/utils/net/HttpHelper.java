package com.baichuan.nb_trade.utils.net;

import com.bytedance.covode.number.Covode;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.umeng.message.proguard.C34037f;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;
import p002O.C0002O;
import p003X.BWB;
import p003X.C116971W2r;
import p003X.TFG;
import p003X.V4K;

/* loaded from: classes13.dex */
public final class HttpHelper {

    /* loaded from: classes13.dex */
    public static class HttpHelperException extends Exception {
        public int statusCode;

        static {
            Covode.recordClassIndex(9493);
        }

        public HttpHelperException(Throwable th) {
            super(th);
        }
    }

    static {
        Covode.recordClassIndex(9492);
    }

    public static String LIZ(String str, Map<String, String> map) {
        try {
            return BWB.LIZ(LIZ(str, "POST", map));
        } catch (Exception e) {
            if (!(e instanceof HttpHelperException)) {
                throw new HttpHelperException(e);
            }
            throw e;
        }
    }

    public static String LIZIZ(String str, Map<String, String> map) {
        try {
            return BWB.LIZ(LIZ(str, "GET", new HashMap(16)));
        } catch (Exception e) {
            if (!(e instanceof HttpHelperException)) {
                throw new HttpHelperException(e);
            }
            throw e;
        }
    }

    public static InputStream LIZ(String str, String str2, Map<String, String> map) {
        try {
            HttpURLConnection LIZIZ = LIZIZ(str, str2, map);
            new StringBuilder("method: ").append(LIZIZ.getRequestMethod());
            int LIZ = C116971W2r.LIZ(LIZIZ);
            if (LIZ == 200) {
                return C116971W2r.LIZJ(LIZIZ);
            }
            throw new RuntimeException("http request exception, response code: " + LIZ);
        } catch (Exception e) {
            HttpHelperException httpHelperException = new HttpHelperException(e);
            httpHelperException.statusCode = -999;
            throw httpHelperException;
        }
    }

    public static HttpURLConnection LIZIZ(String str, String str2, Map<String, String> map) {
        DataOutputStream dataOutputStream;
        DataOutputStream dataOutputStream2 = null;
        try {
            try {
                HttpURLConnection httpURLConnection = (HttpURLConnection) C116971W2r.LIZ(new URL(str));
                httpURLConnection.setConnectTimeout(TFG.LIZIZ);
                httpURLConnection.setReadTimeout(TFG.LIZIZ);
                if ("POST".equals(str2)) {
                    httpURLConnection.setRequestMethod(str2);
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("appkey", V4K.LIZ());
                    jSONObject.put("adzoneid", map.get("adzoneid"));
                    jSONObject.put("taokeAppkey", map.get("taokeAppkey"));
                    jSONObject.put("deviceModel", V4K.LIZLLL());
                    jSONObject.put("os", C0002O.m25086C("android", V4K.m22557LJ()));
                    jSONObject.put("pcv", "1.0");
                    jSONObject.put("sdkVersion", "1.0.0");
                    jSONObject.put("mcid", "");
                    jSONObject.put("unid", map.get("unionId"));
                    jSONObject.put(PushConstants.WEB_URL, map.get(PushConstants.WEB_URL));
                    byte[] bytes = jSONObject.toString().getBytes(C34037f.f43302f);
                    C116971W2r.LIZ(httpURLConnection, "Content-Type", "application/json; charset=utf-8");
                    httpURLConnection.setInstanceFollowRedirects(true);
                    httpURLConnection.setUseCaches(false);
                    httpURLConnection.setDoInput(true);
                    httpURLConnection.setDoOutput(true);
                    httpURLConnection.connect();
                    OutputStream outputStream = httpURLConnection.getOutputStream();
                    dataOutputStream = new DataOutputStream(outputStream);
                    try {
                        dataOutputStream.write(bytes);
                        dataOutputStream.flush();
                        dataOutputStream.close();
                        outputStream.close();
                    } catch (Exception e) {
                        e = e;
                        throw new RuntimeException(e);
                    } catch (Throwable th) {
                        th = th;
                        dataOutputStream2 = dataOutputStream;
                        if (dataOutputStream2 != null) {
                            try {
                                dataOutputStream2.close();
                            } catch (IOException unused) {
                            }
                        }
                        throw th;
                    }
                } else {
                    dataOutputStream = null;
                }
                if (dataOutputStream != null) {
                    try {
                        dataOutputStream.close();
                    } catch (IOException unused2) {
                    }
                }
                return httpURLConnection;
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Exception e2) {
            e = e2;
        }
    }
}
