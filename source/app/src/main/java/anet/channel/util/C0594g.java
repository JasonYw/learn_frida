package anet.channel.util;

import android.util.Base64;
import com.bytedance.covode.number.Covode;
import com.xiaomi.mipush.sdk.Constants;
import java.net.InetSocketAddress;
import java.net.Proxy;

/* renamed from: anet.channel.util.g */
/* loaded from: classes2.dex */
public class C0594g {

    /* renamed from: a */
    public static C0594g f20839a;

    /* renamed from: b */
    public final Proxy f20840b;

    /* renamed from: c */
    public final String f20841c;

    /* renamed from: d */
    public final String f20842d;

    static {
        Covode.recordClassIndex(2378);
    }

    /* renamed from: a */
    public static C0594g m20758a() {
        return f20839a;
    }

    /* renamed from: b */
    public Proxy m20757b() {
        return this.f20840b;
    }

    /* renamed from: c */
    public String m20756c() {
        StringBuilder sb = new StringBuilder(32);
        sb.append(this.f20841c);
        sb.append(Constants.COLON_SEPARATOR);
        sb.append(this.f20842d);
        String encodeToString = Base64.encodeToString(sb.toString().getBytes(), 0);
        StringBuilder sb2 = new StringBuilder(64);
        sb2.append("Basic ");
        sb2.append(encodeToString);
        return sb2.toString();
    }

    public C0594g(String str, int i, String str2, String str3) {
        this.f20840b = new Proxy(Proxy.Type.HTTP, new InetSocketAddress(str, i));
        this.f20841c = str2;
        this.f20842d = str3;
    }
}
