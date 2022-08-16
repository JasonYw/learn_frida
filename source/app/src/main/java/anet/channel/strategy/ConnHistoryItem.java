package anet.channel.strategy;

import com.bytedance.covode.number.Covode;
import com.heytap.mcssdk.constant.C15151a;
import com.xiaomi.mipush.sdk.Constants;
import java.io.Serializable;

/* loaded from: classes11.dex */
public class ConnHistoryItem implements Serializable {

    /* renamed from: a */
    public byte f20695a;

    /* renamed from: b */
    public long f20696b;

    /* renamed from: c */
    public long f20697c;

    static {
        Covode.recordClassIndex(2291);
    }

    /* renamed from: a */
    public int m20875a() {
        int i = 0;
        for (int i2 = this.f20695a & 255; i2 > 0; i2 >>= 1) {
            i += i2 & 1;
        }
        return i;
    }

    /* renamed from: b */
    public boolean m20873b() {
        if ((this.f20695a & 1) == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public boolean m20872c() {
        if (m20875a() < 3 || System.currentTimeMillis() - this.f20697c > Constants.ASSEMBLE_PUSH_NETWORK_INTERVAL) {
            return false;
        }
        return true;
    }

    /* renamed from: d */
    public boolean m20871d() {
        long j = this.f20696b;
        long j2 = this.f20697c;
        if (j <= j2) {
            j = j2;
        }
        if (j != 0 && System.currentTimeMillis() - j > C15151a.f30809f) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public void m20874a(boolean z) {
        long j;
        long currentTimeMillis = System.currentTimeMillis();
        if (z) {
            j = this.f20696b;
        } else {
            j = this.f20697c;
        }
        if (currentTimeMillis - j > 10000) {
            this.f20695a = (byte) ((this.f20695a << 1) | (!z ? 1 : 0));
            if (z) {
                this.f20696b = currentTimeMillis;
            } else {
                this.f20697c = currentTimeMillis;
            }
        }
    }
}
