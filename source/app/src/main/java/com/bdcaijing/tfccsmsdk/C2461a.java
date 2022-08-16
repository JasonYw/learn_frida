package com.bdcaijing.tfccsmsdk;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import p003X.C116971W2r;

/* renamed from: com.bdcaijing.tfccsmsdk.a */
/* loaded from: classes17.dex */
public final class C2461a {
    public static ChangeQuickRedirect LIZ;
    public static AbstractC2463b LIZIZ = new C2462a((byte) 0);

    /* renamed from: com.bdcaijing.tfccsmsdk.a$b */
    /* loaded from: classes17.dex */
    public interface AbstractC2463b {
        static {
            Covode.recordClassIndex(9501);
        }

        void LIZ(String str);
    }

    /* renamed from: com.bdcaijing.tfccsmsdk.a$a */
    /* loaded from: classes17.dex */
    public static class C2462a implements AbstractC2463b {
        public static ChangeQuickRedirect LIZ;

        static {
            Covode.recordClassIndex(9500);
        }

        public C2462a() {
        }

        public /* synthetic */ C2462a(byte b) {
            this();
        }

        @Override // com.bdcaijing.tfccsmsdk.C2461a.AbstractC2463b
        public final void LIZ(String str) {
            if (PatchProxy.proxy(new Object[]{str}, this, LIZ, false, 1).isSupported) {
                return;
            }
            try {
                C116971W2r.LIZIZ(str);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    static {
        Covode.recordClassIndex(9499);
    }
}
