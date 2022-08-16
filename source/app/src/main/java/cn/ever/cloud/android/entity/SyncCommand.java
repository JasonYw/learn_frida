package cn.ever.cloud.android.entity;

import cn.ever.cloud.utils.IdGenerator;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;

/* loaded from: classes23.dex */
public enum SyncCommand {
    TagCreate("tag_create"),
    PredefineTagCreate("predefine_tag_create"),
    TagDelete("tag_delete"),
    TagUpdate("tag_update"),
    AssetRemoveFromTagByLink("asset_remove_from_tag_by_link");
    
    public static ChangeQuickRedirect changeQuickRedirect;
    public final long commandId = IdGenerator.gen$default(IdGenerator.INSTANCE, 0, 1, null);
    public final String commandName;

    public static SyncCommand valueOf(String str) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 2);
        return (SyncCommand) (proxy.isSupported ? proxy.result : Enum.valueOf(SyncCommand.class, str));
    }

    /* renamed from: values  reason: to resolve conflict with enum method */
    public static SyncCommand[] valuesCustom() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 1);
        return (SyncCommand[]) (proxy.isSupported ? proxy.result : values().clone());
    }

    public final long getCommandId() {
        return this.commandId;
    }

    public final String getCommandName() {
        return this.commandName;
    }

    static {
        Covode.recordClassIndex(2866);
    }

    SyncCommand(String str) {
        this.commandName = str;
    }
}
