package anet.channel.security;

import android.content.Context;
import android.text.TextUtils;
import anet.channel.util.HMacUtil;
import com.bytedance.covode.number.Covode;

/* renamed from: anet.channel.security.a */
/* loaded from: classes2.dex */
public class C0528a implements ISecurity {

    /* renamed from: a */
    public String f20619a;

    static {
        Covode.recordClassIndex(2244);
    }

    @Override // anet.channel.security.ISecurity
    public byte[] decrypt(Context context, String str, String str2, byte[] bArr) {
        return null;
    }

    @Override // anet.channel.security.ISecurity
    public byte[] getBytes(Context context, String str) {
        return null;
    }

    @Override // anet.channel.security.ISecurity
    public boolean isSecOff() {
        return true;
    }

    @Override // anet.channel.security.ISecurity
    public boolean saveBytes(Context context, String str, byte[] bArr) {
        return false;
    }

    public C0528a(String str) {
        this.f20619a = str;
    }

    @Override // anet.channel.security.ISecurity
    public String sign(Context context, String str, String str2, String str3) {
        if (TextUtils.isEmpty(this.f20619a) || !"HMAC_SHA1".equalsIgnoreCase(str)) {
            return null;
        }
        return HMacUtil.hmacSha1Hex(this.f20619a.getBytes(), str3.getBytes());
    }
}
