package com.bytedance.android.live.liveinteract.videotalk.dialog;

import android.view.View;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.bytedance.android.live.liveinteract.linkroomfight.core.C4492d;
import com.bytedance.android.live.liveinteract.voicechat.fight.C5056a;
import com.bytedance.android.livesdk.chatroom.C5923dp;
import com.bytedance.android.livesdk.chatroom.p517u.AbstractC6302f;
import com.bytedance.android.livesdk.chatroom.p517u.C6307m;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import io.reactivex.Observable;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import java.util.HashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import p003X.AbstractC413392Xt;
import p003X.C106862S5w;
import p003X.C116971W2r;
import p003X.C4574547f;
import p003X.C78828H5q;
import p003X.C79142HHs;
import p003X.C79220HKs;
import p003X.C88440Kt0;
import p003X.DialogC77790Glc;
import p003X.QB4;

/* loaded from: classes3.dex */
public final class VideoTalkSettingDialog$onCreate$21 extends Lambda implements Function1<View, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ DialogC77790Glc this$0;

    static {
        Covode.recordClassIndex(30044);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VideoTalkSettingDialog$onCreate$21(DialogC77790Glc dialogC77790Glc) {
        super(1);
        this.this$0 = dialogC77790Glc;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(View view) {
        DialogFragment LIZIZ;
        FragmentManager fragmentManager;
        AbstractC413392Xt<AbstractC6302f> LJJZZIII;
        AbstractC6302f LIZIZ2;
        Observable<C6307m> mo15536LJ;
        Observable<C6307m> skip;
        Observable<C6307m> take;
        Disposable subscribe;
        if (!PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 1).isSupported) {
            C106862S5w.LIZ(view);
            if (this.this$0.LIZLLL()) {
                if (C5056a.LIZJ.LJFF()) {
                    C88440Kt0.LIZ(2131588001);
                } else if (C4492d.LIZLLL.LIZJ()) {
                    C88440Kt0.LIZ(2131584986);
                } else {
                    C79142HHs LIZ = C79220HKs.LIZ(this.this$0.LJIILJJIL, this.this$0.LJIIJ);
                    PatchProxyResult proxy = PatchProxy.proxy(new Object[0], LIZ, C79142HHs.LIZ, false, 11);
                    if (proxy.isSupported) {
                        LIZIZ = (DialogFragment) proxy.result;
                    } else {
                        LIZIZ = LIZ.LIZIZ(18);
                    }
                    FragmentActivity fragmentActivity = this.this$0.LJIIJ;
                    if (fragmentActivity != null) {
                        fragmentManager = fragmentActivity.getSupportFragmentManager();
                    } else {
                        fragmentManager = null;
                    }
                    LIZIZ.show(fragmentManager, "VideoTalkAdminInviteFragment");
                    C5923dp c5923dp = this.this$0.LJII;
                    if (c5923dp != null && (LJJZZIII = c5923dp.LJJZZIII()) != null && (LIZIZ2 = LJJZZIII.LIZIZ()) != null && (mo15536LJ = LIZIZ2.mo15536LJ()) != null && (skip = mo15536LJ.skip(1L)) != null && (take = skip.take(1L)) != null && (subscribe = take.subscribe(new Consumer<C6307m>() { // from class: com.bytedance.android.live.liveinteract.videotalk.dialog.VideoTalkSettingDialog$onCreate$21.1
                        public static ChangeQuickRedirect LIZ;

                        static {
                            Covode.recordClassIndex(30045);
                        }

                        @Override // io.reactivex.functions.Consumer
                        public final /* synthetic */ void accept(C6307m c6307m) {
                            if (!PatchProxy.proxy(new Object[]{c6307m}, this, LIZ, false, 1).isSupported) {
                                C116971W2r.LIZ(VideoTalkSettingDialog$onCreate$21.this.this$0);
                            }
                        }
                    })) != null) {
                        QB4.LIZ(subscribe, this.this$0.LIZIZ);
                    }
                    HashMap hashMap = new HashMap();
                    C78828H5q.LIZIZ(hashMap, 0, 2, (Object) null);
                    C78828H5q.LIZIZ(hashMap, (Integer) null, (Integer) null, 6, (Object) null);
                    hashMap.put("action_type", "click");
                    C4574547f.LIZ().LIZ("livesdk_anchor_function_icon", hashMap, Room.class);
                }
            }
        }
        return Unit.INSTANCE;
    }
}
