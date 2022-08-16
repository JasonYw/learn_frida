package anet.channel.entity;

import anet.channel.strategy.IConnStrategy;
import com.bytedance.covode.number.Covode;
import com.meizu.cloud.pushsdk.constants.PushConstants;

/* renamed from: anet.channel.entity.a */
/* loaded from: classes2.dex */
public class C0502a {

    /* renamed from: a */
    public final IConnStrategy f20497a;

    /* renamed from: b */
    public int f20498b;

    /* renamed from: c */
    public int f20499c;

    /* renamed from: d */
    public String f20500d;

    /* renamed from: e */
    public String f20501e;

    static {
        Covode.recordClassIndex(PushConstants.ON_TIME_NOTIFICATION);
    }

    /* renamed from: f */
    public String m20990f() {
        return this.f20500d;
    }

    /* renamed from: h */
    public String m20988h() {
        return this.f20501e;
    }

    /* renamed from: a */
    public String m20995a() {
        IConnStrategy iConnStrategy = this.f20497a;
        if (iConnStrategy != null) {
            return iConnStrategy.getIp();
        }
        return null;
    }

    /* renamed from: b */
    public int m20994b() {
        IConnStrategy iConnStrategy = this.f20497a;
        if (iConnStrategy != null) {
            return iConnStrategy.getPort();
        }
        return 0;
    }

    /* renamed from: c */
    public ConnType m20993c() {
        IConnStrategy iConnStrategy = this.f20497a;
        if (iConnStrategy != null) {
            return ConnType.valueOf(iConnStrategy.getProtocol());
        }
        return ConnType.HTTP;
    }

    /* renamed from: g */
    public int m20989g() {
        IConnStrategy iConnStrategy = this.f20497a;
        if (iConnStrategy != null) {
            return iConnStrategy.getHeartbeat();
        }
        return 45000;
    }

    /* renamed from: d */
    public int m20992d() {
        IConnStrategy iConnStrategy = this.f20497a;
        if (iConnStrategy == null || iConnStrategy.getConnectionTimeout() == 0) {
            return 20000;
        }
        return this.f20497a.getConnectionTimeout();
    }

    /* renamed from: e */
    public int m20991e() {
        IConnStrategy iConnStrategy = this.f20497a;
        if (iConnStrategy == null || iConnStrategy.getReadTimeout() == 0) {
            return 20000;
        }
        return this.f20497a.getReadTimeout();
    }

    public String toString() {
        return "ConnInfo [ip=" + m20995a() + ",port=" + m20994b() + ",type=" + m20993c() + ",hb" + m20989g() + "]";
    }

    public C0502a(String str, String str2, IConnStrategy iConnStrategy) {
        this.f20497a = iConnStrategy;
        this.f20500d = str;
        this.f20501e = str2;
    }
}
