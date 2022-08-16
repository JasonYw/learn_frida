package com.bytedance.android.live.liveinteract.videotalk.selfdiscipline.dialog;

import android.widget.Button;
import android.widget.TextView;
import com.bytedance.android.livesdk.chatroom.model.interact.SelfDisciplineInfo;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.LinkedHashMap;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt__StringsJVMKt;
import p003X.AbstractC80293Hkt;
import p003X.C106862S5w;
import p003X.C4574547f;
import p003X.C78656Gza;
import p003X.C78828H5q;
import p003X.C79121HGx;
import p003X.C87308Kak;
import p003X.DialogC448093nv;

/* loaded from: classes12.dex */
public final class SelfDisciplineManageDialog$mSelectTargetCallback$2 extends Lambda implements Function0<C49501> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ DialogC448093nv this$0;

    static {
        Covode.recordClassIndex(30410);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SelfDisciplineManageDialog$mSelectTargetCallback$2(DialogC448093nv dialogC448093nv) {
        super(0);
        this.this$0 = dialogC448093nv;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [com.bytedance.android.live.liveinteract.videotalk.selfdiscipline.dialog.SelfDisciplineManageDialog$mSelectTargetCallback$2$1] */
    /* JADX WARN: Type inference failed for: r0v3, types: [com.bytedance.android.live.liveinteract.videotalk.selfdiscipline.dialog.SelfDisciplineManageDialog$mSelectTargetCallback$2$1, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ C49501 mo30099invoke() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        return new b$a() { // from class: com.bytedance.android.live.liveinteract.videotalk.selfdiscipline.dialog.SelfDisciplineManageDialog$mSelectTargetCallback$2.1
            public static ChangeQuickRedirect LIZ;

            static {
                Covode.recordClassIndex(30411);
            }

            @Override // com.bytedance.android.live.liveinteract.videotalk.selfdiscipline.dialog.b$a
            public final void LIZ(String str) {
                boolean areEqual;
                if (!PatchProxy.proxy(new Object[]{str}, this, LIZ, false, 1).isSupported && str != null && (!StringsKt__StringsJVMKt.isBlank(str))) {
                    DialogC448093nv dialogC448093nv = SelfDisciplineManageDialog$mSelectTargetCallback$2.this.this$0;
                    if (!PatchProxy.proxy(new Object[]{str}, dialogC448093nv, DialogC448093nv.LIZ, false, 4).isSupported) {
                        if (!PatchProxy.proxy(new Object[]{str}, C79121HGx.LIZJ, C79121HGx.LIZ, false, 4).isSupported) {
                            C106862S5w.LIZ(str);
                            LinkedHashMap linkedHashMap = new LinkedHashMap();
                            C78828H5q.LIZIZ(linkedHashMap, 0, 2, (Object) null);
                            C78828H5q.LIZIZ(linkedHashMap, (Integer) null, (Integer) null, 6, (Object) null);
                            C78828H5q.LIZIZ(linkedHashMap);
                            linkedHashMap.put("play_mode", C78656Gza.LIZ());
                            linkedHashMap.put("edit_time", C79121HGx.LIZIZ.LIZLLL());
                            linkedHashMap.put("discipline_theme", str);
                            C4574547f.LIZ().LIZ("livesdk_anchor_set_discipline_theme_click", linkedHashMap, Room.class);
                        }
                        TextView textView = (TextView) dialogC448093nv.findViewById(2131195291);
                        if (textView != null) {
                            textView.setText(str);
                        }
                        if (dialogC448093nv.LIZIZ) {
                            Button button = (Button) dialogC448093nv.findViewById(2131168682);
                            if (button != null) {
                                PatchProxyResult proxy2 = PatchProxy.proxy(new Object[]{str}, dialogC448093nv, DialogC448093nv.LIZ, false, 5);
                                if (proxy2.isSupported) {
                                    areEqual = ((Boolean) proxy2.result).booleanValue();
                                } else {
                                    C87308Kak<SelfDisciplineInfo> c87308Kak = AbstractC80293Hkt.f6989aQ;
                                    Intrinsics.checkNotNullExpressionValue(c87308Kak, "");
                                    areEqual = Intrinsics.areEqual(c87308Kak.LIZ().currentTarget, str);
                                }
                                button.setSelected(!areEqual);
                                return;
                            }
                            return;
                        }
                        Button button2 = (Button) dialogC448093nv.findViewById(2131168682);
                        if (button2 != null) {
                            button2.setSelected(true);
                        }
                        C87308Kak<SelfDisciplineInfo> c87308Kak2 = AbstractC80293Hkt.f6989aQ;
                        Intrinsics.checkNotNullExpressionValue(c87308Kak2, "");
                        c87308Kak2.LIZ().currentTarget = str;
                    }
                }
            }
        };
    }
}
