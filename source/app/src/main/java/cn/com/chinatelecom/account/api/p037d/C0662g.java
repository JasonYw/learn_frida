package cn.com.chinatelecom.account.api.p037d;

import android.net.Network;
import com.bytedance.covode.number.Covode;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import java.util.Map;

/* renamed from: cn.com.chinatelecom.account.api.d.g */
/* loaded from: classes2.dex */
public final class C0662g {

    /* renamed from: a */
    public Network f20963a;

    /* renamed from: b */
    public int f20964b = 0;

    /* renamed from: c */
    public String f20965c;

    /* renamed from: d */
    public String f20966d;

    /* renamed from: e */
    public boolean f20967e;

    /* renamed from: f */
    public boolean f20968f;

    /* renamed from: g */
    public String f20969g;

    /* renamed from: h */
    public String f20970h;

    /* renamed from: i */
    public Map f20971i;

    /* renamed from: j */
    public int f20972j;

    /* renamed from: k */
    public int f20973k;

    static {
        Covode.recordClassIndex(2713);
    }

    public C0662g(C0663h c0663h) {
        int i;
        int i2;
        Network network;
        String str;
        String str2;
        boolean z;
        boolean z2;
        String str3;
        String str4;
        Map map;
        i = c0663h.f20974a;
        this.f20972j = i;
        i2 = c0663h.f20975b;
        this.f20973k = i2;
        network = c0663h.f20976c;
        this.f20963a = network;
        str = c0663h.f20977d;
        this.f20965c = str;
        str2 = c0663h.f20978e;
        this.f20966d = str2;
        z = c0663h.f20979f;
        this.f20967e = z;
        z2 = c0663h.f20980g;
        this.f20968f = z2;
        str3 = c0663h.f20981h;
        this.f20969g = str3;
        str4 = c0663h.f20982i;
        this.f20970h = str4;
        map = c0663h.f20983j;
        this.f20971i = map;
    }

    /* renamed from: a */
    public final int m20677a() {
        int i = this.f20972j;
        return i > 0 ? i : PushConstants.WORK_RECEIVER_EVENT_CORE_ERROR;
    }

    /* renamed from: b */
    public final int m20676b() {
        int i = this.f20973k;
        return i > 0 ? i : PushConstants.WORK_RECEIVER_EVENT_CORE_ERROR;
    }
}
