package com.bytedance.android.live.broadcast.gamedetail.block.widget;

import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.broadcast.gamedetail.order.model.C3106b;
import com.bytedance.android.live.broadcast.gamedetail.order.model.GroupJoinStatus;
import com.bytedance.android.live.broadcast.gamedetailv2.pageview.AbstractC3125c;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.ies.sve_list.AbstractC12648a;
import java.util.List;
import p003X.C106862S5w;
import p003X.L6P;

/* renamed from: com.bytedance.android.live.broadcast.gamedetail.block.widget.f */
/* loaded from: classes5.dex */
public final class C3085f implements AbstractC3125c {
    public static ChangeQuickRedirect LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;

    /* renamed from: LJ */
    public final String f25870LJ;
    public final long LJFF;
    public final String LJI;
    public final ImageModel LJII;
    public final GroupJoinStatus LJIIIIZZ;
    public final List<C3106b> LJIIIZ;

    static {
        Covode.recordClassIndex(16431);
    }

    @Override // com.bytedance.ies.sve_list.AbstractC12648a
    public final int LIZIZ() {
        return 7;
    }

    @Override // com.bytedance.ies.sve_list.AbstractC12648a
    public final String LIZ() {
        return this.LIZIZ;
    }

    @Override // com.bytedance.ies.sve_list.AbstractC12648a
    public final boolean LIZ(AbstractC12648a abstractC12648a) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{abstractC12648a}, this, LIZ, false, 1);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        C106862S5w.LIZ(abstractC12648a);
        return L6P.LIZ(this, abstractC12648a);
    }

    public C3085f(String str, String str2, String str3, String str4, long j, String str5, ImageModel imageModel, GroupJoinStatus groupJoinStatus, List<C3106b> list) {
        C106862S5w.LIZ(str, groupJoinStatus);
        this.LIZIZ = str;
        this.LIZJ = str2;
        this.LIZLLL = str3;
        this.f25870LJ = str4;
        this.LJFF = j;
        this.LJI = str5;
        this.LJII = imageModel;
        this.LJIIIIZZ = groupJoinStatus;
        this.LJIIIZ = list;
    }
}
