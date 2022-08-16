package cn.ever.cloud.android.services.upload;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.Objects;
import p003X.C106862S5w;

/* loaded from: classes23.dex */
public final class FailedItem {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final Integer errCode;
    public final String errMsg;
    public final String itemKey;

    static {
        Covode.recordClassIndex(3127);
    }

    public static /* synthetic */ FailedItem copy$default(FailedItem failedItem, String str, Integer num, String str2, int i, Object obj) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{failedItem, str, num, str2, Integer.valueOf(i), obj}, null, changeQuickRedirect, true, 2);
        if (proxy.isSupported) {
            return (FailedItem) proxy.result;
        }
        if ((i & 1) != 0) {
            str = failedItem.itemKey;
        }
        if ((i & 2) != 0) {
            num = failedItem.errCode;
        }
        if ((i & 4) != 0) {
            str2 = failedItem.errMsg;
        }
        return failedItem.copy(str, num, str2);
    }

    private Object[] getObjects() {
        return new Object[]{this.itemKey, this.errCode, this.errMsg};
    }

    public final String component1() {
        return this.itemKey;
    }

    public final Integer component2() {
        return this.errCode;
    }

    public final String component3() {
        return this.errMsg;
    }

    public final FailedItem copy(String str, Integer num, String str2) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str, num, str2}, this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return (FailedItem) proxy.result;
        }
        C106862S5w.LIZ(str);
        return new FailedItem(str, num, str2);
    }

    public final boolean equals(Object obj) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 3);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof FailedItem) {
            return C106862S5w.LIZ(((FailedItem) obj).getObjects(), getObjects());
        }
        return false;
    }

    public final int hashCode() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 4);
        return proxy.isSupported ? ((Integer) proxy.result).intValue() : Objects.hash(getObjects());
    }

    public final String toString() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 5);
        return proxy.isSupported ? (String) proxy.result : C106862S5w.LIZ("FailedItem:%s,%s,%s", getObjects());
    }

    public final Integer getErrCode() {
        return this.errCode;
    }

    public final String getErrMsg() {
        return this.errMsg;
    }

    public final String getItemKey() {
        return this.itemKey;
    }

    public FailedItem(String str, Integer num, String str2) {
        C106862S5w.LIZ(str);
        this.itemKey = str;
        this.errCode = num;
        this.errMsg = str2;
    }
}
