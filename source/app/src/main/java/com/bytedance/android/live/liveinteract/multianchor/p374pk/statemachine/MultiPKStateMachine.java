package com.bytedance.android.live.liveinteract.multianchor.p374pk.statemachine;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.unisus.uniservice.logger.LoggerUtil;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import p003X.AbstractC103391QnZ;
import p003X.C103397Qnf;
import p003X.C106862S5w;
import p003X.C79511HVx;

/* renamed from: com.bytedance.android.live.liveinteract.multianchor.pk.statemachine.MultiPKStateMachine */
/* loaded from: classes3.dex */
public final class MultiPKStateMachine {
    public static ChangeQuickRedirect LIZ;
    public final C103397Qnf<AbstractC4545c, AbstractC4538a, AbstractC4544b> LIZIZ = C103397Qnf.LIZJ.LIZ(new MultiPKStateMachine$stateMachine$1(this));
    public final Function1<AbstractC103391QnZ<? extends AbstractC4545c, ? extends AbstractC4538a, ? extends AbstractC4544b>, Unit> LIZJ;

    static {
        Covode.recordClassIndex(28231);
    }

    /* renamed from: com.bytedance.android.live.liveinteract.multianchor.pk.statemachine.MultiPKStateMachine$b */
    /* loaded from: classes3.dex */
    public static abstract class AbstractC4544b {
        public final String LIZ;

        static {
            Covode.recordClassIndex(28239);
        }

        public String toString() {
            return this.LIZ;
        }

        public AbstractC4544b(String str) {
            this.LIZ = str;
        }

        public /* synthetic */ AbstractC4544b(String str, byte b) {
            this(str);
        }
    }

    /* renamed from: com.bytedance.android.live.liveinteract.multianchor.pk.statemachine.MultiPKStateMachine$c */
    /* loaded from: classes3.dex */
    public static abstract class AbstractC4545c {
        public final C79511HVx LIZ;
        public final Source LIZIZ;
        public final String LIZJ;

        static {
            Covode.recordClassIndex(28243);
        }

        public String toString() {
            return this.LIZJ;
        }

        /* renamed from: com.bytedance.android.live.liveinteract.multianchor.pk.statemachine.MultiPKStateMachine$c$a */
        /* loaded from: classes3.dex */
        public static final class C4546a extends AbstractC4545c {
            public static final C4546a LIZLLL = new C4546a();

            static {
                Covode.recordClassIndex(28244);
            }

            public C4546a() {
                super(new C79511HVx(), Source.Init, "Disable", (byte) 0);
            }
        }

        /* renamed from: com.bytedance.android.live.liveinteract.multianchor.pk.statemachine.MultiPKStateMachine$c$b */
        /* loaded from: classes3.dex */
        public static final class C4547b extends AbstractC4545c {
            static {
                Covode.recordClassIndex(28245);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C4547b(C79511HVx c79511HVx, Source source) {
                super(c79511HVx, source, "Finished", (byte) 0);
                C106862S5w.LIZ(c79511HVx, source);
            }
        }

        /* renamed from: com.bytedance.android.live.liveinteract.multianchor.pk.statemachine.MultiPKStateMachine$c$c */
        /* loaded from: classes3.dex */
        public static final class C4548c extends AbstractC4545c {
            static {
                Covode.recordClassIndex(28246);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C4548c(C79511HVx c79511HVx, Source source) {
                super(c79511HVx, source, "PK", (byte) 0);
                C106862S5w.LIZ(c79511HVx, source);
            }
        }

        /* renamed from: com.bytedance.android.live.liveinteract.multianchor.pk.statemachine.MultiPKStateMachine$c$d */
        /* loaded from: classes3.dex */
        public static final class C4549d extends AbstractC4545c {
            static {
                Covode.recordClassIndex(28247);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C4549d(C79511HVx c79511HVx, Source source) {
                super(c79511HVx, source, "Penal", (byte) 0);
                C106862S5w.LIZ(c79511HVx, source);
            }
        }

        public AbstractC4545c(C79511HVx c79511HVx, Source source, String str) {
            this.LIZ = c79511HVx;
            this.LIZIZ = source;
            this.LIZJ = str;
        }

        public /* synthetic */ AbstractC4545c(C79511HVx c79511HVx, Source source, String str, byte b) {
            this(c79511HVx, source, str);
        }
    }

    /* renamed from: com.bytedance.android.live.liveinteract.multianchor.pk.statemachine.MultiPKStateMachine$a */
    /* loaded from: classes3.dex */
    public static abstract class AbstractC4538a {
        public static ChangeQuickRedirect LIZ;
        public final Source LIZIZ;
        public final String LIZJ;

        static {
            Covode.recordClassIndex(28233);
        }

        /* renamed from: com.bytedance.android.live.liveinteract.multianchor.pk.statemachine.MultiPKStateMachine$a$a */
        /* loaded from: classes3.dex */
        public static final class C4539a extends AbstractC4538a {
            public static final C4539a LIZLLL = new C4539a();

            static {
                Covode.recordClassIndex(28234);
            }

            public C4539a() {
                super(Source.LinkerLeave, "BattleLinkerLeave", (byte) 0);
            }
        }

        /* renamed from: com.bytedance.android.live.liveinteract.multianchor.pk.statemachine.MultiPKStateMachine$a$d */
        /* loaded from: classes3.dex */
        public static final class C4542d extends AbstractC4538a {
            public static final C4542d LIZLLL = new C4542d();

            static {
                Covode.recordClassIndex(28237);
            }

            public C4542d() {
                super(Source.PunishTimeUp, "BattlePunishTimeUp", (byte) 0);
            }
        }

        public String toString() {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 1);
            if (proxy.isSupported) {
                return (String) proxy.result;
            }
            return this.LIZJ + LoggerUtil.S_LEFT_TAG + this.LIZIZ + LoggerUtil.S_RIGHT_TAG;
        }

        /* renamed from: com.bytedance.android.live.liveinteract.multianchor.pk.statemachine.MultiPKStateMachine$a$b */
        /* loaded from: classes3.dex */
        public static final class C4540b extends AbstractC4538a {
            public final C79511HVx LIZLLL;

            static {
                Covode.recordClassIndex(28235);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C4540b(C79511HVx c79511HVx) {
                super(Source.MetaUpdate, "BattleMetaUpdate", (byte) 0);
                C106862S5w.LIZ(c79511HVx);
                this.LIZLLL = c79511HVx;
            }
        }

        /* renamed from: com.bytedance.android.live.liveinteract.multianchor.pk.statemachine.MultiPKStateMachine$a$c */
        /* loaded from: classes3.dex */
        public static final class C4541c extends AbstractC4538a {
            public final C79511HVx LIZLLL;

            static {
                Covode.recordClassIndex(28236);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C4541c(C79511HVx c79511HVx) {
                super(Source.BattleMsg, "BattleMsg", (byte) 0);
                C106862S5w.LIZ(c79511HVx);
                this.LIZLLL = c79511HVx;
            }
        }

        public AbstractC4538a(Source source, String str) {
            this.LIZIZ = source;
            this.LIZJ = str;
        }

        public /* synthetic */ AbstractC4538a(Source source, String str, byte b) {
            this(source, str);
        }

        /* renamed from: com.bytedance.android.live.liveinteract.multianchor.pk.statemachine.MultiPKStateMachine$a$e */
        /* loaded from: classes3.dex */
        public static final class C4543e extends AbstractC4538a {
            public final C79511HVx LIZLLL;

            /* renamed from: LJ */
            public final boolean f26359LJ;

            static {
                Covode.recordClassIndex(28238);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C4543e(C79511HVx c79511HVx, Source source, boolean z) {
                super(source, "GetBattleState", (byte) 0);
                C106862S5w.LIZ(c79511HVx, source);
                this.LIZLLL = c79511HVx;
                this.f26359LJ = z;
            }

            public /* synthetic */ C4543e(C79511HVx c79511HVx, Source source, boolean z, int i) {
                this(c79511HVx, source, true);
            }
        }
    }

    /* renamed from: com.bytedance.android.live.liveinteract.multianchor.pk.statemachine.MultiPKStateMachine$Source */
    /* loaded from: classes3.dex */
    public enum Source {
        Init,
        BattleMsg,
        MetaUpdate,
        PKTimeUp,
        BattleFinishInstantKill,
        BattleFinishTimeUp,
        PunishTimeUp,
        LinkerLeave;
        
        public static ChangeQuickRedirect changeQuickRedirect;

        public static Source valueOf(String str) {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 2);
            return (Source) (proxy.isSupported ? proxy.result : Enum.valueOf(Source.class, str));
        }

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static Source[] valuesCustom() {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 1);
            return (Source[]) (proxy.isSupported ? proxy.result : values().clone());
        }

        static {
            Covode.recordClassIndex(28232);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public MultiPKStateMachine(Function1<? super AbstractC103391QnZ<? extends AbstractC4545c, ? extends AbstractC4538a, ? extends AbstractC4544b>, Unit> function1) {
        C106862S5w.LIZ(function1);
        this.LIZJ = function1;
    }

    public final void LIZ(AbstractC4538a abstractC4538a) {
        if (PatchProxy.proxy(new Object[]{abstractC4538a}, this, LIZ, false, 1).isSupported) {
            return;
        }
        C106862S5w.LIZ(abstractC4538a);
        C103397Qnf.LIZ(this.LIZIZ, abstractC4538a, null, 2, null);
    }
}
