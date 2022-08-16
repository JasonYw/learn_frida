package cn.ever.cloud.android.services.task.entity;

import androidx.core.view.MotionEventCompat;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p003X.C106862S5w;

/* loaded from: classes23.dex */
public enum PauseReason {
    Manual { // from class: cn.ever.cloud.android.services.task.entity.PauseReason.Manual
        public static ChangeQuickRedirect changeQuickRedirect;

        @Override // cn.ever.cloud.android.services.task.entity.PauseReason
        public final boolean isAbleToResumeBy(PauseReason pauseReason) {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[]{pauseReason}, this, changeQuickRedirect, false, 1);
            if (proxy.isSupported) {
                return ((Boolean) proxy.result).booleanValue();
            }
            C106862S5w.LIZ(pauseReason);
            if (super.isAbleToResumeBy(pauseReason)) {
                return true;
            }
            return false;
        }
    },
    WifiToCell(1),
    Unknown(MotionEventCompat.ACTION_MASK);
    
    public static final Companion Companion = new Companion(null);
    public static ChangeQuickRedirect changeQuickRedirect;
    public final int intVal;

    public static PauseReason valueOf(String str) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 3);
        return (PauseReason) (proxy.isSupported ? proxy.result : Enum.valueOf(PauseReason.class, str));
    }

    /* renamed from: values  reason: to resolve conflict with enum method */
    public static PauseReason[] valuesCustom() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 2);
        return (PauseReason[]) (proxy.isSupported ? proxy.result : values().clone());
    }

    /* loaded from: classes23.dex */
    public static final class Companion {
        public static ChangeQuickRedirect changeQuickRedirect;

        static {
            Covode.recordClassIndex(3094);
        }

        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final PauseReason from(int i) {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[]{Integer.valueOf(i)}, this, changeQuickRedirect, false, 1);
            if (proxy.isSupported) {
                return (PauseReason) proxy.result;
            }
            if (i == PauseReason.Manual.getIntVal()) {
                return PauseReason.Manual;
            }
            if (i == PauseReason.WifiToCell.getIntVal()) {
                return PauseReason.WifiToCell;
            }
            if (i == PauseReason.Unknown.getIntVal()) {
                return PauseReason.Unknown;
            }
            return null;
        }
    }

    public final int getIntVal() {
        return this.intVal;
    }

    static {
        Covode.recordClassIndex(3093);
    }

    public boolean isAbleToResumeBy(PauseReason pauseReason) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{pauseReason}, this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        C106862S5w.LIZ(pauseReason);
        if (pauseReason == Manual || pauseReason == this) {
            return true;
        }
        return false;
    }

    PauseReason(int i) {
        this.intVal = i;
    }

    /* synthetic */ PauseReason(int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(i);
    }
}
