package com.bytedance.android.live.liveinteract.api;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import p003X.AbstractC79093HFv;
import p003X.C106862S5w;
import p003X.HF6;

/* loaded from: classes3.dex */
public final class MediaOperation {
    public static final HF6 LIZLLL = new HF6((byte) 0);
    public final Type LIZ;
    public final Action LIZIZ;
    public final AbstractC79093HFv LIZJ;

    static {
        Covode.recordClassIndex(25104);
    }

    /* loaded from: classes3.dex */
    public enum Action {
        CLOSE(0),
        OPEN(1);
        
        public static ChangeQuickRedirect changeQuickRedirect;
        public final int value;

        public static Action valueOf(String str) {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 2);
            return (Action) (proxy.isSupported ? proxy.result : Enum.valueOf(Action.class, str));
        }

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static Action[] valuesCustom() {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 1);
            return (Action[]) (proxy.isSupported ? proxy.result : values().clone());
        }

        static {
            Covode.recordClassIndex(25105);
        }

        Action(int i) {
            this.value = i;
        }
    }

    /* loaded from: classes3.dex */
    public enum Type {
        CAMERA(0),
        MIC(1);
        
        public static ChangeQuickRedirect changeQuickRedirect;
        public final int value;

        public static Type valueOf(String str) {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 2);
            return (Type) (proxy.isSupported ? proxy.result : Enum.valueOf(Type.class, str));
        }

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static Type[] valuesCustom() {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 1);
            return (Type[]) (proxy.isSupported ? proxy.result : values().clone());
        }

        static {
            Covode.recordClassIndex(25106);
        }

        Type(int i) {
            this.value = i;
        }
    }

    public MediaOperation(Type type, Action action, AbstractC79093HFv abstractC79093HFv) {
        C106862S5w.LIZ(type, action);
        this.LIZ = type;
        this.LIZIZ = action;
        this.LIZJ = abstractC79093HFv;
    }
}
