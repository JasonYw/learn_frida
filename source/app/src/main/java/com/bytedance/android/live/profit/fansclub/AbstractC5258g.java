package com.bytedance.android.live.profit.fansclub;

import com.bytedance.android.live.base.model.user.User;
import com.bytedance.covode.number.Covode;
import p003X.C106862S5w;
import p003X.C4BP;

/* renamed from: com.bytedance.android.live.profit.fansclub.g */
/* loaded from: classes12.dex */
public abstract class AbstractC5258g {

    /* renamed from: com.bytedance.android.live.profit.fansclub.g$h */
    /* loaded from: classes12.dex */
    public static final class C5260h extends C4BP {
        public final String LIZ;

        static {
            Covode.recordClassIndex(33286);
        }
    }

    /* renamed from: com.bytedance.android.live.profit.fansclub.g$i */
    /* loaded from: classes12.dex */
    public static final class C5261i extends AbstractC5258g {
        public final String LIZ;
        public final long LIZIZ;

        static {
            Covode.recordClassIndex(33287);
        }
    }

    static {
        Covode.recordClassIndex(33278);
    }

    public AbstractC5258g() {
    }

    /* renamed from: com.bytedance.android.live.profit.fansclub.g$j */
    /* loaded from: classes12.dex */
    public static final class C5262j extends AbstractC5258g {
        public final boolean LIZ;

        static {
            Covode.recordClassIndex(33288);
        }

        public C5262j(boolean z) {
            super((byte) 0);
            this.LIZ = z;
        }
    }

    public /* synthetic */ AbstractC5258g(byte b) {
        this();
    }

    /* renamed from: com.bytedance.android.live.profit.fansclub.g$a */
    /* loaded from: classes12.dex */
    public static class C5259a extends AbstractC5258g {
        public final User LIZ;

        static {
            Covode.recordClassIndex(33279);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C5259a(User user) {
            super((byte) 0);
            C106862S5w.LIZ(user);
            this.LIZ = user;
        }
    }
}
