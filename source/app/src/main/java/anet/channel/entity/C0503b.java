package anet.channel.entity;

import com.bytedance.covode.number.Covode;
import com.meizu.cloud.pushsdk.constants.PushConstants;

/* renamed from: anet.channel.entity.b */
/* loaded from: classes20.dex */
public class C0503b {

    /* renamed from: a */
    public final int f20502a;

    /* renamed from: b */
    public int f20503b;

    /* renamed from: c */
    public String f20504c;

    static {
        Covode.recordClassIndex(PushConstants.DELAY_NOTIFICATION);
    }

    public C0503b(int i) {
        this.f20502a = i;
    }

    public C0503b(int i, int i2, String str) {
        this.f20502a = i;
        this.f20503b = i2;
        this.f20504c = str;
    }
}
