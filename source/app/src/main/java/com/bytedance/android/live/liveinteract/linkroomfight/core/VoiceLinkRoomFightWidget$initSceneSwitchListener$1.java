package com.bytedance.android.live.liveinteract.linkroomfight.core;

import com.bytedance.android.livesdk.chatroom.p517u.C6306l;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import p003X.C106862S5w;
import p003X.H4Q;

/* loaded from: classes3.dex */
public final /* synthetic */ class VoiceLinkRoomFightWidget$initSceneSwitchListener$1 extends FunctionReferenceImpl implements Function1<C6306l, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(27636);
    }

    public VoiceLinkRoomFightWidget$initSceneSwitchListener$1(VoiceLinkRoomFightWidget voiceLinkRoomFightWidget) {
        super(1, voiceLinkRoomFightWidget, VoiceLinkRoomFightWidget.class, "onVoiceSceneChanged", "onVoiceSceneChanged(Lcom/bytedance/android/livesdk/chatroom/viewmodel/SwitchSceneEvent;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(C6306l c6306l) {
        C6306l c6306l2 = c6306l;
        if (!PatchProxy.proxy(new Object[]{c6306l2}, this, changeQuickRedirect, false, 1).isSupported) {
            C106862S5w.LIZ(c6306l2);
            VoiceLinkRoomFightWidget voiceLinkRoomFightWidget = (VoiceLinkRoomFightWidget) this.receiver;
            if (!PatchProxy.proxy(new Object[]{c6306l2}, voiceLinkRoomFightWidget, VoiceLinkRoomFightWidget.LJIIIIZZ, false, 2).isSupported) {
                int i = voiceLinkRoomFightWidget.LIZIZ;
                voiceLinkRoomFightWidget.LIZIZ = c6306l2.f26940LJ;
                if (i != 0 && voiceLinkRoomFightWidget.LJFF().LIZJ().LIZ().m15731LJ() && !PatchProxy.proxy(new Object[0], voiceLinkRoomFightWidget, VoiceLinkRoomFightWidget.LJIIIIZZ, false, 3).isSupported) {
                    Disposable disposable = voiceLinkRoomFightWidget.LJIIIZ;
                    if (disposable != null) {
                        disposable.dispose();
                    }
                    voiceLinkRoomFightWidget.LJIIIZ = Observable.timer(voiceLinkRoomFightWidget.LJI, TimeUnit.SECONDS).observeOn(AndroidSchedulers.mainThread()).subscribe(new H4Q(voiceLinkRoomFightWidget));
                }
            }
        }
        return Unit.INSTANCE;
    }
}
