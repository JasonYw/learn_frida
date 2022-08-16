package com.bytedance.android.live.broadcast.props;

import com.bytedance.android.live.broadcast.props.p278a.C3219d;
import com.bytedance.android.live.broadcast.props.p278a.C3223h;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import p003X.C106862S5w;
import p003X.C116971W2r;
import p003X.C89181LBv;
import p003X.DialogC89183LBx;
import p003X.L43;

/* loaded from: classes5.dex */
public final class PropAccountListDialog$initView$2 extends Lambda implements Function2<Integer, C3219d, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ DialogC89183LBx this$0;

    static {
        Covode.recordClassIndex(17581);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PropAccountListDialog$initView$2(DialogC89183LBx dialogC89183LBx) {
        super(2);
        this.this$0 = dialogC89183LBx;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ Unit invoke(Integer num, C3219d c3219d) {
        C3219d c3219d2 = c3219d;
        if (!PatchProxy.proxy(new Object[]{Integer.valueOf(num.intValue()), c3219d2}, this, changeQuickRedirect, false, 1).isSupported) {
            C106862S5w.LIZ(c3219d2);
            boolean z = !c3219d2.LJII ? 1 : 0;
            C3231j c3231j = this.this$0.LJIIJJI;
            String str = "2";
            if (c3231j != null) {
                c3231j.LIZ(c3219d2, Boolean.FALSE, str);
            }
            C89181LBv c89181LBv = C89181LBv.LIZIZ;
            C3231j c3231j2 = this.this$0.LJIIJJI;
            C3223h c3223h = null;
            if (c3231j2 != null) {
                c3223h = c3231j2.LIZJ;
            }
            Map<String, Object> map = this.this$0.LJIIJ;
            String str2 = c3219d2.LIZIZ;
            if (!PatchProxy.proxy(new Object[]{c3223h, map, Byte.valueOf(z ? (byte) 1 : (byte) 0), str2}, c89181LBv, C89181LBv.LIZ, false, 51).isSupported) {
                C106862S5w.LIZ(map);
                Map<String, String> LIZ = c89181LBv.LIZ(c3223h, map);
                if (z) {
                    str = "1";
                }
                LIZ.put("is_change", str);
                if (str2 != null && str2.length() > 0) {
                    LIZ.put("user_game_id", str2);
                }
                L43.LIZ(L43.LIZIZ, "livesdk_gcom_user_confirm_game_role", LIZ, c89181LBv.LIZIZ(), false, true, null, 32, null);
            }
            C116971W2r.LIZ(this.this$0);
        }
        return Unit.INSTANCE;
    }
}
