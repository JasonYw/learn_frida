package com.bytedance.android.live.broadcast.floatview.datacontext;

import com.bytedance.android.live.broadcast.floatview.MessagePriority;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.live.datacontext.C13491f;
import java.util.HashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import p003X.C106862S5w;
import p003X.C2WC;
import p003X.C81289I2h;
import p003X.C81909IQd;
import p003X.L04;
import p003X.QB4;

/* loaded from: classes5.dex */
public final class BroadcastFloatContext extends C13491f {
    public static ChangeQuickRedirect LIZ;
    public static final /* synthetic */ KProperty[] LIZIZ;
    public final C81289I2h LIZJ = C81909IQd.LIZ(this, 0, null, 2, null);
    public final C81289I2h LIZLLL = C81909IQd.LIZ(this, 0L, null, 2, null);

    /* renamed from: LJ */
    public final C81289I2h f25832LJ = C81909IQd.LIZ(this, 0L, null, 2, null);
    public final C81289I2h LJFF = C81909IQd.LIZ(this, 0L, null, 2, null);
    public final C81289I2h LJI = C81909IQd.LIZ(this, 0, null, 2, null);
    public final C81289I2h LJII = C81909IQd.LIZ(this, Boolean.FALSE, null, 2, null);
    public final C81289I2h LJIIIIZZ = C81909IQd.LIZ(this, MessagePriority.NONE, null, 2, null);
    public final C81289I2h LJIIIZ;
    public final C81289I2h LJIIJ;

    /* loaded from: classes5.dex */
    public enum FloatStatus {
        NONE,
        INIT,
        HIDDEN,
        SHOWING,
        DESTROY;
        
        public static ChangeQuickRedirect changeQuickRedirect;

        static {
            Covode.recordClassIndex(15892);
        }

        public static FloatStatus valueOf(String str) {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 2);
            return (FloatStatus) (proxy.isSupported ? proxy.result : Enum.valueOf(FloatStatus.class, str));
        }

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static FloatStatus[] valuesCustom() {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 1);
            return (FloatStatus[]) (proxy.isSupported ? proxy.result : values().clone());
        }
    }

    static {
        Covode.recordClassIndex(15890);
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(BroadcastFloatContext.class, "showNumber", "getShowNumber()Lcom/bytedance/live/datacontext/IMutableNonNull;", 0);
        Reflection.property1(propertyReference1Impl);
        PropertyReference1Impl propertyReference1Impl2 = new PropertyReference1Impl(BroadcastFloatContext.class, "startTime", "getStartTime()Lcom/bytedance/live/datacontext/IMutableNonNull;", 0);
        Reflection.property1(propertyReference1Impl2);
        PropertyReference1Impl propertyReference1Impl3 = new PropertyReference1Impl(BroadcastFloatContext.class, "showDuration", "getShowDuration()Lcom/bytedance/live/datacontext/IMutableNonNull;", 0);
        Reflection.property1(propertyReference1Impl3);
        PropertyReference1Impl propertyReference1Impl4 = new PropertyReference1Impl(BroadcastFloatContext.class, "allShowDuration", "getAllShowDuration()Lcom/bytedance/live/datacontext/IMutableNonNull;", 0);
        Reflection.property1(propertyReference1Impl4);
        PropertyReference1Impl propertyReference1Impl5 = new PropertyReference1Impl(BroadcastFloatContext.class, "floatDragNumber", "getFloatDragNumber()Lcom/bytedance/live/datacontext/IMutableNonNull;", 0);
        Reflection.property1(propertyReference1Impl5);
        PropertyReference1Impl propertyReference1Impl6 = new PropertyReference1Impl(BroadcastFloatContext.class, "clickFloat", "getClickFloat()Lcom/bytedance/live/datacontext/IMutableNonNull;", 0);
        Reflection.property1(propertyReference1Impl6);
        PropertyReference1Impl propertyReference1Impl7 = new PropertyReference1Impl(BroadcastFloatContext.class, "currentShowingMessageType", "getCurrentShowingMessageType()Lcom/bytedance/live/datacontext/IMutableNonNull;", 0);
        Reflection.property1(propertyReference1Impl7);
        PropertyReference1Impl propertyReference1Impl8 = new PropertyReference1Impl(BroadcastFloatContext.class, "showedMessageNumber", "getShowedMessageNumber()Lcom/bytedance/live/datacontext/IMutableNonNull;", 0);
        Reflection.property1(propertyReference1Impl8);
        PropertyReference1Impl propertyReference1Impl9 = new PropertyReference1Impl(BroadcastFloatContext.class, "floatStatus", "getFloatStatus()Lcom/bytedance/live/datacontext/IMutableNonNull;", 0);
        Reflection.property1(propertyReference1Impl9);
        LIZIZ = new KProperty[]{propertyReference1Impl, propertyReference1Impl2, propertyReference1Impl3, propertyReference1Impl4, propertyReference1Impl5, propertyReference1Impl6, propertyReference1Impl7, propertyReference1Impl8, propertyReference1Impl9};
    }

    public final C2WC<Integer> LIZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 1);
        return (C2WC) (proxy.isSupported ? proxy.result : this.LIZJ.LIZ(this, LIZIZ[0]));
    }

    public final C2WC<Long> LIZIZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 2);
        return (C2WC) (proxy.isSupported ? proxy.result : this.LIZLLL.LIZ(this, LIZIZ[1]));
    }

    public final C2WC<Long> LIZJ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 3);
        return (C2WC) (proxy.isSupported ? proxy.result : this.f25832LJ.LIZ(this, LIZIZ[2]));
    }

    public final C2WC<Long> LIZLLL() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 4);
        return (C2WC) (proxy.isSupported ? proxy.result : this.LJFF.LIZ(this, LIZIZ[3]));
    }

    /* renamed from: LJ */
    public final C2WC<Integer> m15901LJ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 5);
        return (C2WC) (proxy.isSupported ? proxy.result : this.LJI.LIZ(this, LIZIZ[4]));
    }

    public final C2WC<Boolean> LJFF() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 6);
        return (C2WC) (proxy.isSupported ? proxy.result : this.LJII.LIZ(this, LIZIZ[5]));
    }

    public final C2WC<MessagePriority> LJI() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 7);
        return (C2WC) (proxy.isSupported ? proxy.result : this.LJIIIIZZ.LIZ(this, LIZIZ[6]));
    }

    public final C2WC<HashMap<MessagePriority, Integer>> LJII() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 8);
        return (C2WC) (proxy.isSupported ? proxy.result : this.LJIIIZ.LIZ(this, LIZIZ[7]));
    }

    public final C2WC<FloatStatus> LJIIIIZZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 9);
        return (C2WC) (proxy.isSupported ? proxy.result : this.LJIIJ.LIZ(this, LIZIZ[8]));
    }

    public BroadcastFloatContext() {
        HashMap hashMap = new HashMap();
        for (MessagePriority messagePriority : MessagePriority.valuesCustom()) {
            hashMap.put(messagePriority, 0);
        }
        this.LJIIIZ = C81909IQd.LIZ(this, hashMap, null, 2, null);
        this.LJIIJ = C81909IQd.LIZ(this, FloatStatus.NONE, null, 2, null);
        QB4.LIZ(LJIIIIZZ().LIZIZ(), new C30141());
    }

    /* renamed from: com.bytedance.android.live.broadcast.floatview.datacontext.BroadcastFloatContext$1 */
    /* loaded from: classes5.dex */
    public static final class C30141 extends Lambda implements Function1<FloatStatus, Unit> {
        public static ChangeQuickRedirect changeQuickRedirect;

        static {
            Covode.recordClassIndex(15891);
        }

        public C30141() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Unit invoke(FloatStatus floatStatus) {
            FloatStatus floatStatus2 = floatStatus;
            if (!PatchProxy.proxy(new Object[]{floatStatus2}, this, changeQuickRedirect, false, 1).isSupported) {
                C106862S5w.LIZ(floatStatus2);
                int i = L04.LIZ[floatStatus2.ordinal()];
                if (i != 1 && i != 2) {
                    if (i != 3) {
                        if (i == 4) {
                            BroadcastFloatContext.this.LIZJ().LIZ(Long.valueOf(System.currentTimeMillis() - BroadcastFloatContext.this.LIZIZ().LIZ().longValue()));
                            BroadcastFloatContext.this.LIZLLL().LIZ(Long.valueOf(BroadcastFloatContext.this.LIZLLL().LIZ().longValue() + BroadcastFloatContext.this.LIZJ().LIZ().longValue()));
                        }
                    } else {
                        BroadcastFloatContext.this.m15901LJ().LIZ(0);
                        BroadcastFloatContext.this.LIZ().LIZ(Integer.valueOf(BroadcastFloatContext.this.LIZ().LIZ().intValue() + 1));
                        BroadcastFloatContext.this.LJFF().LIZ(Boolean.FALSE);
                        BroadcastFloatContext.this.LIZIZ().LIZ(Long.valueOf(System.currentTimeMillis()));
                        BroadcastFloatContext.this.LJI().LIZ(MessagePriority.NONE);
                        for (MessagePriority messagePriority : MessagePriority.valuesCustom()) {
                            BroadcastFloatContext.this.LJII().LIZ().put(messagePriority, 0);
                        }
                    }
                }
            }
            return Unit.INSTANCE;
        }
    }
}
