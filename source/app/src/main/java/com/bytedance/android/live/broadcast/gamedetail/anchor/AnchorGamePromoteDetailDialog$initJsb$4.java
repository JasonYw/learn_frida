package com.bytedance.android.live.broadcast.gamedetail.anchor;

import android.text.TextUtils;
import com.bytedance.android.live.broadcast.C3243u;
import com.bytedance.android.live.browser.jsbridge.event.C3952am;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import p003X.C88929L2d;

/* loaded from: classes5.dex */
public final class AnchorGamePromoteDetailDialog$initJsb$4 extends Lambda implements Function1<C3952am, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ C88929L2d this$0;

    static {
        Covode.recordClassIndex(16027);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnchorGamePromoteDetailDialog$initJsb$4(C88929L2d c88929L2d) {
        super(1);
        this.this$0 = c88929L2d;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(C3952am c3952am) {
        String str;
        Object obj;
        C3243u c3243u;
        C3952am c3952am2 = c3952am;
        if (!PatchProxy.proxy(new Object[]{c3952am2}, this, changeQuickRedirect, false, 1).isSupported) {
            C3036d c3036d = this.this$0.LIZLLL;
            String str2 = "";
            if (c3036d == null || (c3243u = c3036d.LIZIZ) == null || (str = c3243u.LIZJ) == null) {
                str = str2;
            }
            Map<String, Object> map = c3952am2.LIZJ;
            if (map != null) {
                obj = map.get("gameId");
            } else {
                obj = null;
            }
            if (!(obj instanceof String)) {
                obj = null;
            }
            String str3 = (String) obj;
            if (str3 != null) {
                str2 = str3;
            }
            if (TextUtils.equals(c3952am2.LIZIZ, "gamecpRefreshGameData") && TextUtils.equals(str2, str)) {
                this.this$0.LIZIZ();
            }
        }
        return Unit.INSTANCE;
    }
}
