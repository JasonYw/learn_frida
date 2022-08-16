package com.bytedance.android.live.effect.template;

import com.bytedance.android.live.effect.base.C4181a;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.unisus.uniservice.logger.LoggerUtil;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import p003X.C106862S5w;
import p003X.KB3;

/* loaded from: classes5.dex */
public final class BeautifyTemplate {
    public static ChangeQuickRedirect LIZ;
    public static final KB3 LIZLLL = new KB3((byte) 0);
    public C4181a LIZIZ;
    public final List<BeautifyContentType> LIZJ;

    /* loaded from: classes5.dex */
    public enum BeautifyContentType {
        BEAUTY,
        FILTER,
        MAKEUPS;
        
        public static ChangeQuickRedirect changeQuickRedirect;

        static {
            Covode.recordClassIndex(24769);
        }

        public static BeautifyContentType valueOf(String str) {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 2);
            return (BeautifyContentType) (proxy.isSupported ? proxy.result : Enum.valueOf(BeautifyContentType.class, str));
        }

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static BeautifyContentType[] valuesCustom() {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 1);
            return (BeautifyContentType[]) (proxy.isSupported ? proxy.result : values().clone());
        }
    }

    static {
        Covode.recordClassIndex(24768);
    }

    public final int hashCode() {
        int i = 0;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 2);
        if (proxy.isSupported) {
            return ((Integer) proxy.result).intValue();
        }
        for (BeautifyContentType beautifyContentType : this.LIZJ) {
            i += beautifyContentType.hashCode();
        }
        return i;
    }

    public final String toString() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 3);
        if (proxy.isSupported) {
            return (String) proxy.result;
        }
        return "BeautyFilterDialogTemplate(types=" + this.LIZJ + LoggerUtil.S_RIGHT_TAG;
    }

    public final BeautifyTemplate LIZ(C4181a c4181a) {
        this.LIZIZ = c4181a;
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public BeautifyTemplate(List<? extends BeautifyContentType> list) {
        C106862S5w.LIZ(list);
        this.LIZJ = list;
    }

    public final boolean equals(Object obj) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{obj}, this, LIZ, false, 1);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        Class<?> cls = getClass();
        Class<?> cls2 = null;
        if (obj != null) {
            cls2 = obj.getClass();
        }
        if (!Intrinsics.areEqual(cls, cls2)) {
            return false;
        }
        if (obj != null) {
            BeautifyTemplate beautifyTemplate = (BeautifyTemplate) obj;
            if (beautifyTemplate.LIZJ.size() != this.LIZJ.size()) {
                return false;
            }
            Iterator<T> it = beautifyTemplate.LIZJ.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                if (!this.LIZJ.contains(next)) {
                    if (next != null) {
                        return false;
                    }
                }
            }
            return true;
        }
        throw new NullPointerException("null cannot be cast to non-null type com.bytedance.android.live.effect.template.BeautifyTemplate");
    }
}
