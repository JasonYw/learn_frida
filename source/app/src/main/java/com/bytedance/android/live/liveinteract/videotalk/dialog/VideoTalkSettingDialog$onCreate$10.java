package com.bytedance.android.live.liveinteract.videotalk.dialog;

import android.view.View;
import android.widget.Switch;
import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.bytedance.android.live.liveinteract.linkroomfight.core.C4492d;
import com.bytedance.android.live.liveinteract.plantform.api.LinkApi;
import com.bytedance.android.live.liveinteract.videotalk.battle.C4891b;
import com.bytedance.android.live.liveinteract.voicechat.fight.C5056a;
import com.bytedance.android.live.network.response.C5176i;
import com.bytedance.android.live.utility.ServiceManager;
import com.bytedance.android.livesdk.log.model.C8668v;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import io.reactivex.functions.Consumer;
import java.util.HashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.json.JSONArray;
import org.json.JSONObject;
import p003X.AbstractC80293Hkt;
import p003X.C100839PnV;
import p003X.C106862S5w;
import p003X.C4574547f;
import p003X.C87308Kak;
import p003X.C88306Kqq;
import p003X.C88440Kt0;
import p003X.DialogC77790Glc;

/* loaded from: classes3.dex */
public final class VideoTalkSettingDialog$onCreate$10 extends Lambda implements Function1<View, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ DialogC77790Glc this$0;

    /* renamed from: com.bytedance.android.live.liveinteract.videotalk.dialog.VideoTalkSettingDialog$onCreate$10$2 */
    /* loaded from: classes3.dex */
    public static final class C49212<T> implements Consumer<Throwable> {
        public static final C49212 LIZ = new C49212();

        static {
            Covode.recordClassIndex(30042);
        }

        @Override // io.reactivex.functions.Consumer
        public final /* bridge */ /* synthetic */ void accept(Throwable th) {
        }
    }

    static {
        Covode.recordClassIndex(30040);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VideoTalkSettingDialog$onCreate$10(DialogC77790Glc dialogC77790Glc) {
        super(1);
        this.this$0 = dialogC77790Glc;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(View view) {
        int i = 1;
        if (!PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 1).isSupported) {
            C106862S5w.LIZ(view);
            if (C4891b.LIZJ.m23816LJ()) {
                C88440Kt0.LIZ(2131583897);
            } else if (C5056a.LIZJ.LJFF()) {
                C88440Kt0.LIZ(2131588002);
            } else if (C4492d.LIZLLL.LIZJ()) {
                C88440Kt0.LIZ(2131584987);
            } else {
                Switch r1 = (Switch) this.this$0.findViewById(2131191309);
                Intrinsics.checkNotNullExpressionValue(r1, "");
                final boolean z = !r1.isChecked();
                HashMap hashMap = new HashMap();
                hashMap.put("scene", 4);
                JSONArray jSONArray = new JSONArray();
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("key", 11);
                if (!z) {
                    i = 2;
                }
                jSONObject.put("value", i);
                jSONArray.put(jSONObject);
                hashMap.put("incremental_update", jSONArray);
                this.this$0.LIZIZ.add(((LinkApi) C88306Kqq.LIZ().LIZ(LinkApi.class)).updateSetting(this.this$0.LJIIIZ.getId(), hashMap).compose(C100839PnV.LIZJ()).subscribe(new Consumer<C5176i<Void>>() { // from class: com.bytedance.android.live.liveinteract.videotalk.dialog.VideoTalkSettingDialog$onCreate$10.1
                    public static ChangeQuickRedirect LIZ;

                    static {
                        Covode.recordClassIndex(30041);
                    }

                    @Override // io.reactivex.functions.Consumer
                    public final /* synthetic */ void accept(C5176i<Void> c5176i) {
                        String str;
                        String str2;
                        if (!PatchProxy.proxy(new Object[]{c5176i}, this, LIZ, false, 1).isSupported) {
                            Switch r12 = (Switch) VideoTalkSettingDialog$onCreate$10.this.this$0.findViewById(2131191309);
                            Intrinsics.checkNotNullExpressionValue(r12, "");
                            r12.setChecked(z);
                            C87308Kak<Boolean> c87308Kak = AbstractC80293Hkt.f6983aK;
                            Intrinsics.checkNotNullExpressionValue(c87308Kak, "");
                            c87308Kak.LIZ(Boolean.valueOf(z));
                            HashMap hashMap2 = new HashMap();
                            hashMap2.put("anchor_id", String.valueOf(VideoTalkSettingDialog$onCreate$10.this.this$0.LJIIIZ.ownerUserId));
                            hashMap2.put("room_id", String.valueOf(VideoTalkSettingDialog$onCreate$10.this.this$0.LJIIIZ.getId()));
                            if (VideoTalkSettingDialog$onCreate$10.this.this$0.LJIIL) {
                                str = "0";
                            } else {
                                str = "1";
                            }
                            hashMap2.put("room_orientation", str);
                            if (z) {
                                str2 = "on";
                            } else {
                                str2 = "off";
                            }
                            hashMap2.put("gift_guest_switch_type", str2);
                            String changeMode2String = ((IInteractService) ServiceManager.getService(IInteractService.class)).changeMode2String(32);
                            Intrinsics.checkNotNullExpressionValue(changeMode2String, "");
                            hashMap2.put("send_gift_scene", changeMode2String);
                            C4574547f.LIZ().LIZ("gift_guest_switch", hashMap2, C8668v.class, Room.class);
                        }
                    }
                }, C49212.LIZ));
            }
        }
        return Unit.INSTANCE;
    }
}
