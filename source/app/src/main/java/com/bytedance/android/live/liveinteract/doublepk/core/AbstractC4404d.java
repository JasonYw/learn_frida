package com.bytedance.android.live.liveinteract.doublepk.core;

import com.bytedance.android.livesdk.chatroom.model.interact.C6174n;
import com.bytedance.covode.number.Covode;
import p003X.C106862S5w;

/* renamed from: com.bytedance.android.live.liveinteract.doublepk.core.d */
/* loaded from: classes3.dex */
public abstract class AbstractC4404d {
    public final String LIZ;

    static {
        Covode.recordClassIndex(26777);
    }

    /* renamed from: com.bytedance.android.live.liveinteract.doublepk.core.d$c */
    /* loaded from: classes3.dex */
    public static final class C4407c extends AbstractC4404d {
        static {
            Covode.recordClassIndex(26780);
        }

        public C4407c() {
            super("onPrepare", (byte) 0);
        }
    }

    public AbstractC4404d(String str) {
        this.LIZ = str;
    }

    /* renamed from: com.bytedance.android.live.liveinteract.doublepk.core.d$a */
    /* loaded from: classes3.dex */
    public static final class C4405a extends AbstractC4404d {
        public final C6174n LIZIZ;

        static {
            Covode.recordClassIndex(26778);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C4405a(C6174n c6174n) {
            super("onFinish", (byte) 0);
            C106862S5w.LIZ(c6174n);
            this.LIZIZ = c6174n;
        }
    }

    /* renamed from: com.bytedance.android.live.liveinteract.doublepk.core.d$b */
    /* loaded from: classes3.dex */
    public static final class C4406b extends AbstractC4404d {
        public final C6174n LIZIZ;

        static {
            Covode.recordClassIndex(26779);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C4406b(C6174n c6174n) {
            super("onPk", (byte) 0);
            C106862S5w.LIZ(c6174n);
            this.LIZIZ = c6174n;
        }
    }

    public /* synthetic */ AbstractC4404d(String str, byte b) {
        this(str);
    }
}
