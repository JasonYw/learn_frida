package com.bytedance.android.live.liveinteract.linkroomfight.core;

import com.bytedance.android.livesdk.chatroom.p517u.C6307m;
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
import p003X.H4P;

/* loaded from: classes3.dex */
public final /* synthetic */ class VideoLinkRoomFightWidget$initSceneSwitchListener$1 extends FunctionReferenceImpl implements Function1<C6307m, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(27633);
    }

    public VideoLinkRoomFightWidget$initSceneSwitchListener$1(VideoLinkRoomFightWidget videoLinkRoomFightWidget) {
        super(1, videoLinkRoomFightWidget, VideoLinkRoomFightWidget.class, "onSceneWithPlayModeChanged", "onSceneWithPlayModeChanged(Lcom/bytedance/android/livesdk/chatroom/viewmodel/SwitchSceneWithPlayModeEvent;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(C6307m c6307m) {
        C6307m c6307m2 = c6307m;
        if (!PatchProxy.proxy(new Object[]{c6307m2}, this, changeQuickRedirect, false, 1).isSupported) {
            C106862S5w.LIZ(c6307m2);
            VideoLinkRoomFightWidget videoLinkRoomFightWidget = (VideoLinkRoomFightWidget) this.receiver;
            if (!PatchProxy.proxy(new Object[]{c6307m2}, videoLinkRoomFightWidget, VideoLinkRoomFightWidget.LJIIIIZZ, false, 2).isSupported) {
                int i = videoLinkRoomFightWidget.LIZIZ;
                videoLinkRoomFightWidget.LIZIZ = c6307m2.LIZIZ;
                if (i != c6307m2.LIZIZ && videoLinkRoomFightWidget.LJFF().LIZJ().LIZ().m15731LJ() && !PatchProxy.proxy(new Object[0], videoLinkRoomFightWidget, VideoLinkRoomFightWidget.LJIIIIZZ, false, 3).isSupported) {
                    Disposable disposable = videoLinkRoomFightWidget.LJIIIZ;
                    if (disposable != null) {
                        disposable.dispose();
                    }
                    videoLinkRoomFightWidget.LJIIIZ = Observable.timer(videoLinkRoomFightWidget.LJI, TimeUnit.SECONDS).observeOn(AndroidSchedulers.mainThread()).subscribe(new H4P(videoLinkRoomFightWidget));
                }
            }
        }
        return Unit.INSTANCE;
    }
}
