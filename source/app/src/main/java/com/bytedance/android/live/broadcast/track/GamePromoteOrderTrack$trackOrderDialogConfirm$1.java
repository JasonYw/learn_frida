package com.bytedance.android.live.broadcast.track;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import p003X.C106862S5w;

/* loaded from: classes.dex */
public final class GamePromoteOrderTrack$trackOrderDialogConfirm$1 extends Lambda implements Function1<Map<String, String>, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ boolean $isWifiAutoDownload;

    static {
        Covode.recordClassIndex(17959);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GamePromoteOrderTrack$trackOrderDialogConfirm$1(boolean z) {
        super(1);
        this.$isWifiAutoDownload = z;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(Map<String, String> map) {
        String str;
        Map<String, String> map2 = map;
        if (!PatchProxy.proxy(new Object[]{map2}, this, changeQuickRedirect, false, 1).isSupported) {
            C106862S5w.LIZ(map2);
            if (this.$isWifiAutoDownload) {
                str = "1";
            } else {
                str = "0";
            }
            map2.put("is_wifi_auto_download", str);
        }
        return Unit.INSTANCE;
    }
}
