package com.bytedance.android.live.broadcastgame.api.model;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import p003X.C87837KjH;
import p003X.C87840KjK;
import p003X.C87842KjM;

/* loaded from: classes5.dex */
public final class PageData {
    public static ChangeQuickRedirect LIZ;

    /* renamed from: LJ */
    public C87837KjH f26016LJ;
    public boolean LJFF;
    public C87840KjK LIZIZ = new C87840KjK(null, null, 3);
    public C87840KjK LIZJ = new C87840KjK(null, null, 3);
    public String LIZLLL = "";
    public boolean LJI = true;
    public ReviewStatus LJII = ReviewStatus.REVIEW_PASS;
    public C87840KjK LJIIIIZZ = new C87840KjK(null, null, 3);

    static {
        Covode.recordClassIndex(19152);
    }

    /* loaded from: classes5.dex */
    public enum ReviewStatus {
        REVIEW_PASS(1),
        REVIEW_REJECT(2),
        REVIEW_UNKNOWN(0);
        
        public static final C87842KjM Companion = new C87842KjM((byte) 0);
        public static ChangeQuickRedirect changeQuickRedirect;
        public final Integer TYPE;

        public static ReviewStatus valueOf(String str) {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 2);
            return (ReviewStatus) (proxy.isSupported ? proxy.result : Enum.valueOf(ReviewStatus.class, str));
        }

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static ReviewStatus[] valuesCustom() {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 1);
            return (ReviewStatus[]) (proxy.isSupported ? proxy.result : values().clone());
        }

        static {
            Covode.recordClassIndex(19153);
        }

        ReviewStatus(Integer num) {
            this.TYPE = num;
        }
    }
}
