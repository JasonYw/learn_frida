package cn.everphoto.template_panel.model;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;

/* loaded from: classes4.dex */
public enum ErrorState {
    DOWNLOAD_TEMPLATE_ERROR,
    CLICK_DIALOG_CANCEL,
    PLAY_VIDEO_ERROR;
    
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(3810);
    }

    public static ErrorState valueOf(String str) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 2);
        return (ErrorState) (proxy.isSupported ? proxy.result : Enum.valueOf(ErrorState.class, str));
    }

    /* renamed from: values  reason: to resolve conflict with enum method */
    public static ErrorState[] valuesCustom() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 1);
        return (ErrorState[]) (proxy.isSupported ? proxy.result : values().clone());
    }
}
