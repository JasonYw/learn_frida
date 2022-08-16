package com.bytedance.android.annie.service.network;

import android.util.Pair;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.io.InputStream;
import java.util.List;

/* loaded from: classes5.dex */
public class AnnieResponse {
    public static ChangeQuickRedirect changeQuickRedirect;
    public byte[] body;
    public int clientCode;
    public List<Pair<String, String>> headers;
    public String mimeType;
    public String reason;
    public int statusCode;
    public InputStream stream;
    public String url;

    static {
        Covode.recordClassIndex(11123);
    }

    public byte[] getBody() {
        return this.body;
    }

    public int getClientCode() {
        return this.clientCode;
    }

    public List<Pair<String, String>> getHeaders() {
        return this.headers;
    }

    public String getMimeType() {
        return this.mimeType;
    }

    public String getReason() {
        return this.reason;
    }

    public int getStatusCode() {
        return this.statusCode;
    }

    public InputStream getStream() {
        return this.stream;
    }

    public String getUrl() {
        return this.url;
    }

    public AnnieResponse setBody(byte[] bArr) {
        this.body = bArr;
        return this;
    }

    public AnnieResponse setClientCode(int i) {
        this.clientCode = i;
        return this;
    }

    public AnnieResponse setHeaders(List<Pair<String, String>> list) {
        this.headers = list;
        return this;
    }

    public AnnieResponse setMimeType(String str) {
        this.mimeType = str;
        return this;
    }

    public AnnieResponse setReason(String str) {
        this.reason = str;
        return this;
    }

    public AnnieResponse setStatusCode(int i) {
        this.statusCode = i;
        return this;
    }

    public AnnieResponse setStream(InputStream inputStream) {
        this.stream = inputStream;
        return this;
    }

    public AnnieResponse setUrl(String str) {
        this.url = str;
        return this;
    }

    public String header(String str) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return (String) proxy.result;
        }
        for (int i = 0; i < this.headers.size(); i++) {
            if (str.equalsIgnoreCase((String) this.headers.get(i).first)) {
                return (String) this.headers.get(i).second;
            }
        }
        return null;
    }
}
