package com.bytedance.android.live.liveinteract.doublepk.core;

import com.bytedance.android.livesdk.chatroom.model.interact.C6174n;
import com.bytedance.covode.number.Covode;
import p003X.C106862S5w;

/* renamed from: com.bytedance.android.live.liveinteract.doublepk.core.b */
/* loaded from: classes3.dex */
public abstract class AbstractC4399b {
    static {
        Covode.recordClassIndex(26769);
    }

    /* renamed from: com.bytedance.android.live.liveinteract.doublepk.core.b$b */
    /* loaded from: classes3.dex */
    public static final class C4401b extends AbstractC4399b {
        static {
            Covode.recordClassIndex(26771);
        }

        public C4401b() {
            super("prepare", (byte) 0);
        }
    }

    public AbstractC4399b(String str) {
    }

    /* renamed from: com.bytedance.android.live.liveinteract.doublepk.core.b$a */
    /* loaded from: classes3.dex */
    public static final class C4400a extends AbstractC4399b {
        public final C6174n LIZ;

        static {
            Covode.recordClassIndex(26770);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C4400a(C6174n c6174n) {
            super("finishPk", (byte) 0);
            C106862S5w.LIZ(c6174n);
            this.LIZ = c6174n;
        }
    }

    /* renamed from: com.bytedance.android.live.liveinteract.doublepk.core.b$c */
    /* loaded from: classes3.dex */
    public static final class C4402c extends AbstractC4399b {
        public final C6174n LIZ;

        static {
            Covode.recordClassIndex(26772);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C4402c(C6174n c6174n) {
            super("StarPk", (byte) 0);
            C106862S5w.LIZ(c6174n);
            this.LIZ = c6174n;
        }
    }

    public /* synthetic */ AbstractC4399b(String str, byte b) {
        this(str);
    }
}
