package com.bytedance.android.live.liveinteract.p382pk.task.api;

import com.bytedance.covode.number.Covode;
import p003X.C106862S5w;

/* renamed from: com.bytedance.android.live.liveinteract.pk.task.api.h$a */
/* loaded from: classes8.dex */
public abstract class h$a {
    static {
        Covode.recordClassIndex(29074);
    }

    public h$a(String str) {
    }

    /* renamed from: com.bytedance.android.live.liveinteract.pk.task.api.h$a$a */
    /* loaded from: classes8.dex */
    public static final class C4747a extends h$a {
        public final AbstractC4746f<?, Exception> LIZ;

        static {
            Covode.recordClassIndex(29075);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C4747a(AbstractC4746f<?, ? extends Exception> abstractC4746f) {
            super("Finish", (byte) 0);
            C106862S5w.LIZ(abstractC4746f);
            this.LIZ = abstractC4746f;
        }
    }

    /* renamed from: com.bytedance.android.live.liveinteract.pk.task.api.h$a$b */
    /* loaded from: classes8.dex */
    public static final class C4748b extends h$a {
        public final Object LIZ;

        static {
            Covode.recordClassIndex(29076);
        }

        public C4748b(Object obj) {
            super("Start", (byte) 0);
            this.LIZ = obj;
        }
    }

    public /* synthetic */ h$a(String str, byte b) {
        this(str);
    }
}
