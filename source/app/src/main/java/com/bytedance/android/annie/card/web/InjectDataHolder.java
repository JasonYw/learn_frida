package com.bytedance.android.annie.card.web;

import android.webkit.JavascriptInterface;
import com.bytedance.covode.number.Covode;
import p003X.C106862S5w;

/* loaded from: classes7.dex */
public final class InjectDataHolder {
    public final String LIZ;
    public String LIZIZ;
    public final String LIZJ;

    static {
        Covode.recordClassIndex(10687);
    }

    @JavascriptInterface
    public final String getGlobalProps() {
        return this.LIZ;
    }

    @JavascriptInterface
    public final String getInitialProps() {
        return this.LIZIZ;
    }

    @JavascriptInterface
    public final String getInjectInitData() {
        return this.LIZJ;
    }

    public InjectDataHolder(String str, String str2, String str3) {
        C106862S5w.LIZ(str, str2, str3);
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = str3;
    }
}
