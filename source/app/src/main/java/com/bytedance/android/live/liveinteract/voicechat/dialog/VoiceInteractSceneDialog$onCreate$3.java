package com.bytedance.android.live.liveinteract.voicechat.dialog;

import android.content.Context;
import android.content.DialogInterface;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.bytedance.android.live.base.IService;
import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.bytedance.android.live.liveinteract.voicechat.AbstractC5004d;
import com.bytedance.android.live.liveinteract.voicechat.AbstractC5015e;
import com.bytedance.android.live.utility.ServiceManager;
import com.bytedance.android.livesdk.C9078n;
import com.bytedance.android.livesdk.chatroom.C5923dp;
import com.bytedance.android.livesdk.chatroom.p517u.AbstractC6303g;
import com.bytedance.android.livesdk.chatroom.p517u.C6306l;
import com.bytedance.android.livesdk.ktvapi.IKtvService;
import com.bytedance.android.livesdk.log.model.C8668v;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.HashMap;
import kotlin.Unit;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p003X.AbstractC413392Xt;
import p003X.AbstractC413402Xu;
import p003X.AbstractC81343I4j;
import p003X.C106862S5w;
import p003X.C116971W2r;
import p003X.C409882Kg;
import p003X.C419012i7;
import p003X.C4574547f;
import p003X.C77917Gnf;
import p003X.C79169HIt;
import p003X.C79242HLo;
import p003X.C80247Hk9;
import p003X.C80248HkA;
import p003X.DialogC77846GmW;
import p003X.DialogInterface$OnClickListenerC77854Gme;
import p003X.DialogInterface$OnClickListenerC78000Gp0;
import p003X.H04;
import p003X.LK5;

/* loaded from: classes3.dex */
public final class VoiceInteractSceneDialog$onCreate$3 extends Lambda implements Function1<View, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ DialogC77846GmW this$0;

    static {
        Covode.recordClassIndex(30991);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VoiceInteractSceneDialog$onCreate$3(DialogC77846GmW dialogC77846GmW) {
        super(1);
        this.this$0 = dialogC77846GmW;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(View view) {
        int i;
        String LIZ;
        String str;
        AbstractC413392Xt<AbstractC6303g> LJJLL;
        AbstractC6303g LIZIZ;
        C6306l LIZ2;
        if (!PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 1).isSupported) {
            C106862S5w.LIZ(view);
            C4574547f.LIZ().LIZ("livesdk_anchor_voice_live_open", MapsKt__MapsKt.emptyMap(), Room.class);
            C5923dp c5923dp = this.this$0.LIZJ;
            if (c5923dp != null && (LJJLL = c5923dp.LJJLL()) != null && (LIZIZ = LJJLL.LIZIZ()) != null && (LIZ2 = LIZIZ.LIZ()) != null) {
                i = LIZ2.f26940LJ;
            } else {
                i = 0;
            }
            if (C77917Gnf.LIZ(true)) {
                C116971W2r.LIZ(this.this$0);
                if (i == 9) {
                    C9078n ktvFeedbackDialog = ((IKtvService) ServiceManager.getService(IKtvService.class)).getKtvFeedbackDialog("scene_panel", new AbstractC81343I4j() { // from class: com.bytedance.android.live.liveinteract.voicechat.dialog.VoiceInteractSceneDialog$onCreate$3.1
                        public static ChangeQuickRedirect LIZ;

                        static {
                            Covode.recordClassIndex(30992);
                        }

                        @Override // p003X.AbstractC81343I4j
                        public final void LIZ() {
                            boolean z = PatchProxy.proxy(new Object[0], this, LIZ, false, 2).isSupported;
                        }

                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // p003X.AbstractC81343I4j
                        public final void LIZ(C9078n c9078n, boolean z, int i2) {
                            AbstractC413402Xu<Boolean> LJIILJJIL;
                            if (PatchProxy.proxy(new Object[]{c9078n, Byte.valueOf(z ? (byte) 1 : (byte) 0), Integer.valueOf(i2)}, this, LIZ, false, 1).isSupported) {
                                return;
                            }
                            C106862S5w.LIZ(c9078n);
                            if (!PatchProxy.proxy(new Object[]{Byte.valueOf((byte) z), Integer.valueOf(i2)}, VoiceInteractSceneDialog$onCreate$3.this.this$0, DialogC77846GmW.LIZ, false, 2).isSupported) {
                                IService service = ServiceManager.getService(IInteractService.class);
                                Intrinsics.checkNotNullExpressionValue(service, "");
                                if (C79169HIt.LIZIZ(((IInteractService) service).getLinkMode(), 8)) {
                                    C5923dp LIZ3 = C409882Kg.LIZ(C5923dp.LJIIJ, null, 0L, 3, null);
                                    if (LIZ3 != null && (LJIILJJIL = LIZ3.LJIILJJIL()) != null && LJIILJJIL.LIZIZ().booleanValue()) {
                                        AbstractC5004d LIZ4 = AbstractC5004d.LIZIZ.LIZ();
                                        if (LIZ4 != null) {
                                            LIZ4.LJIILLIIL();
                                            return;
                                        }
                                        return;
                                    }
                                    AbstractC5015e LIZ5 = AbstractC5015e.LIZIZ.LIZ();
                                    if (LIZ5 != null) {
                                        LIZ5.LIZ(i2, false, !z ? 1 : 0);
                                    }
                                }
                            }
                        }
                    });
                    if (ktvFeedbackDialog != null) {
                        Context context = this.this$0.LIZIZ;
                        if (context != null) {
                            ktvFeedbackDialog.show(((FragmentActivity) context).getSupportFragmentManager(), "KtvFeedbackDialog");
                        } else {
                            throw new NullPointerException("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
                        }
                    }
                } else if (C79242HLo.LJIJI()) {
                    C116971W2r.LIZ(this.this$0);
                    Intrinsics.checkNotNullExpressionValue(C419012i7.LIZ().LIZ(this.this$0.getContext()).mo15264LJ(2131585696).LIZLLL(2131584974).LIZ(2.0f).LIZIZ(0, LK5.LIZ(2131584972), DialogInterface$OnClickListenerC77854Gme.LIZIZ).LIZIZ(1, LK5.LIZ(2131584971), DialogInterface$OnClickListenerC78000Gp0.LIZIZ).LIZJ(), "");
                } else {
                    C80247Hk9 LIZ3 = C80248HkA.LIZ(C80247Hk9.LJIIJ, i, true, "scene_panel", null, null, null, 56, null);
                    Context context2 = this.this$0.LIZIZ;
                    if (context2 != null) {
                        LIZ3.show(((FragmentActivity) context2).getSupportFragmentManager(), C80247Hk9.LJIIIZ);
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
                    }
                }
            } else {
                if (!PatchProxy.proxy(new Object[]{Integer.valueOf(i)}, this.this$0, DialogC77846GmW.LIZ, false, 5).isSupported) {
                    HashMap hashMap = new HashMap();
                    if (i != 9) {
                        str = "chat_room";
                    } else {
                        str = "sing_room";
                    }
                    hashMap.put("before_function", str);
                    hashMap.put("interact_function", "live_room");
                    C4574547f.LIZ().LIZ("anchor_switch_room_type", hashMap, Room.class, C8668v.class);
                }
                if (i != 9) {
                    LIZ = LK5.LIZ(2131586176);
                } else {
                    LIZ = LK5.LIZ(2131585688);
                }
                Context context3 = this.this$0.getContext();
                Intrinsics.checkNotNullExpressionValue(context3, "");
                H04 h04 = new H04(context3);
                h04.LIZ(LIZ);
                String LIZ4 = LK5.LIZ(2131584561);
                Intrinsics.checkNotNullExpressionValue(LIZ4, "");
                H04 LIZIZ2 = h04.LIZIZ(LIZ4, new DialogInterface.OnClickListener() { // from class: com.bytedance.android.live.liveinteract.voicechat.dialog.VoiceInteractSceneDialog$onCreate$3.2
                    public static ChangeQuickRedirect LIZ;

                    static {
                        Covode.recordClassIndex(30993);
                    }

                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i2) {
                        if (PatchProxy.proxy(new Object[]{dialogInterface, Integer.valueOf(i2)}, this, LIZ, false, 1).isSupported) {
                            return;
                        }
                        AbstractC5004d LIZ5 = AbstractC5004d.LIZIZ.LIZ();
                        if (LIZ5 != null) {
                            LIZ5.LJIILLIIL();
                        }
                        dialogInterface.dismiss();
                        C116971W2r.LIZ(VoiceInteractSceneDialog$onCreate$3.this.this$0);
                    }
                });
                String LIZ5 = LK5.LIZ(2131582393);
                Intrinsics.checkNotNullExpressionValue(LIZ5, "");
                LIZIZ2.LIZ(LIZ5, DialogInterface$OnClickListenerC50103.LIZIZ).LIZ();
            }
        }
        return Unit.INSTANCE;
    }

    /* renamed from: com.bytedance.android.live.liveinteract.voicechat.dialog.VoiceInteractSceneDialog$onCreate$3$3 */
    /* loaded from: classes3.dex */
    public static final class DialogInterface$OnClickListenerC50103 implements DialogInterface.OnClickListener {
        public static ChangeQuickRedirect LIZ;
        public static final DialogInterface$OnClickListenerC50103 LIZIZ = new DialogInterface$OnClickListenerC50103();

        static {
            Covode.recordClassIndex(30994);
        }

        @Override // android.content.DialogInterface.OnClickListener
        public final void onClick(DialogInterface dialogInterface, int i) {
            if (PatchProxy.proxy(new Object[]{dialogInterface, Integer.valueOf(i)}, this, LIZ, false, 1).isSupported) {
                return;
            }
            dialogInterface.dismiss();
        }
    }
}
