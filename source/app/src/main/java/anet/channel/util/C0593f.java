package anet.channel.util;

import com.bytedance.covode.number.Covode;
import java.net.Inet6Address;

/* renamed from: anet.channel.util.f */
/* loaded from: classes2.dex */
public class C0593f {

    /* renamed from: a */
    public int f20837a;

    /* renamed from: b */
    public Inet6Address f20838b;

    static {
        Covode.recordClassIndex(2377);
    }

    public String toString() {
        return this.f20838b.getHostAddress() + "/" + this.f20837a;
    }

    public C0593f(Inet6Address inet6Address, int i) {
        this.f20837a = i;
        this.f20838b = inet6Address;
    }
}
