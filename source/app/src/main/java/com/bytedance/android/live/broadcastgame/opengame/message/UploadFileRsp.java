package com.bytedance.android.live.broadcastgame.opengame.message;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.google.gson.annotations.SerializedName;
import java.util.Objects;
import p003X.C106862S5w;

/* loaded from: classes.dex */
public final class UploadFileRsp {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("etag")
    public final String md5;
    public final String oid;
    public final String uri;

    static {
        Covode.recordClassIndex(20260);
    }

    public static /* synthetic */ UploadFileRsp copy$default(UploadFileRsp uploadFileRsp, String str, String str2, String str3, int i, Object obj) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{uploadFileRsp, str, str2, str3, Integer.valueOf(i), obj}, null, changeQuickRedirect, true, 2);
        if (proxy.isSupported) {
            return (UploadFileRsp) proxy.result;
        }
        if ((i & 1) != 0) {
            str = uploadFileRsp.md5;
        }
        if ((i & 2) != 0) {
            str2 = uploadFileRsp.oid;
        }
        if ((i & 4) != 0) {
            str3 = uploadFileRsp.uri;
        }
        return uploadFileRsp.copy(str, str2, str3);
    }

    private Object[] getObjects() {
        return new Object[]{this.md5, this.oid, this.uri};
    }

    public final String component1() {
        return this.md5;
    }

    public final String component2() {
        return this.oid;
    }

    public final String component3() {
        return this.uri;
    }

    public final UploadFileRsp copy(String str, String str2, String str3) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str, str2, str3}, this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return (UploadFileRsp) proxy.result;
        }
        C106862S5w.LIZ(str, str2, str3);
        return new UploadFileRsp(str, str2, str3);
    }

    public final boolean equals(Object obj) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 3);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof UploadFileRsp) {
            return C106862S5w.LIZ(((UploadFileRsp) obj).getObjects(), getObjects());
        }
        return false;
    }

    public final int hashCode() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 4);
        return proxy.isSupported ? ((Integer) proxy.result).intValue() : Objects.hash(getObjects());
    }

    public final String toString() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 5);
        return proxy.isSupported ? (String) proxy.result : C106862S5w.LIZ("UploadFileRsp:%s,%s,%s", getObjects());
    }

    public final String getMd5() {
        return this.md5;
    }

    public final String getOid() {
        return this.oid;
    }

    public final String getUri() {
        return this.uri;
    }

    public UploadFileRsp(String str, String str2, String str3) {
        C106862S5w.LIZ(str, str2, str3);
        this.md5 = str;
        this.oid = str2;
        this.uri = str3;
    }
}
