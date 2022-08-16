package cn.ever.cloud.android.services.task.entity;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.Objects;
import p003X.C106862S5w;

/* loaded from: classes.dex */
public final class CommandResult {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final int code;
    public final CommandResultData data;

    static {
        Covode.recordClassIndex(3080);
    }

    public static /* synthetic */ CommandResult copy$default(CommandResult commandResult, int i, CommandResultData commandResultData, int i2, Object obj) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{commandResult, Integer.valueOf(i), commandResultData, Integer.valueOf(i2), obj}, null, changeQuickRedirect, true, 2);
        if (proxy.isSupported) {
            return (CommandResult) proxy.result;
        }
        if ((i2 & 1) != 0) {
            i = commandResult.code;
        }
        if ((i2 & 2) != 0) {
            commandResultData = commandResult.data;
        }
        return commandResult.copy(i, commandResultData);
    }

    private Object[] getObjects() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 3);
        return proxy.isSupported ? (Object[]) proxy.result : new Object[]{Integer.valueOf(this.code), this.data};
    }

    public final int component1() {
        return this.code;
    }

    public final CommandResultData component2() {
        return this.data;
    }

    public final CommandResult copy(int i, CommandResultData commandResultData) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{Integer.valueOf(i), commandResultData}, this, changeQuickRedirect, false, 1);
        return proxy.isSupported ? (CommandResult) proxy.result : new CommandResult(i, commandResultData);
    }

    public final boolean equals(Object obj) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 4);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof CommandResult) {
            return C106862S5w.LIZ(((CommandResult) obj).getObjects(), getObjects());
        }
        return false;
    }

    public final int hashCode() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 5);
        return proxy.isSupported ? ((Integer) proxy.result).intValue() : Objects.hash(getObjects());
    }

    public final String toString() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 6);
        return proxy.isSupported ? (String) proxy.result : C106862S5w.LIZ("CommandResult:%s,%s", getObjects());
    }

    public final int getCode() {
        return this.code;
    }

    public final CommandResultData getData() {
        return this.data;
    }

    public CommandResult(int i, CommandResultData commandResultData) {
        this.code = i;
        this.data = commandResultData;
    }
}
