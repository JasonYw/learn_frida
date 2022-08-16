package com.bytedance.android.live.broadcast.widget;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.broadcast.widget.MsSeiSignWidget;
import com.bytedance.android.live.core.log.ALogger;
import com.bytedance.android.live.pushstream.AbstractC5436a;
import com.bytedance.android.live.pushstream.IPushStreamService;
import com.bytedance.android.live.pushstream.p420g.AbstractC5442a;
import com.bytedance.android.live.utility.ServiceManager;
import com.bytedance.android.livesdk.chatroom.C5923dp;
import com.bytedance.android.livesdk.chatroom.widget.RoomWidget;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.unisus.uniservice.logger.LoggerUtil;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;
import java.util.concurrent.TimeUnit;
import p003X.AbstractC4569445g;
import p003X.C2WC;
import p003X.C7HK;

/* loaded from: classes12.dex */
public final class MsSeiSignWidget extends RoomWidget implements AbstractC4569445g {
    public static ChangeQuickRedirect LIZ;
    public final String LIZIZ = "MsSeiSignWidget[" + hashCode() + LoggerUtil.M_RIGHT_TAG;
    public boolean LIZJ;
    public Disposable LIZLLL;

    /* renamed from: LJ */
    public AbstractC5442a f25975LJ;
    public int LJFF;
    public AbstractC5436a LJI;

    static {
        Covode.recordClassIndex(18365);
    }

    @Override // com.bytedance.android.livesdk.chatroom.widget.RoomWidget, com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.ies.sdk.widgets.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (PatchProxy.proxy(new Object[]{lifecycleOwner, event}, this, LIZ, false, 8).isSupported) {
            return;
        }
        super.onStateChanged(lifecycleOwner, event);
    }

    public final void LIZIZ() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 6).isSupported) {
            return;
        }
        LIZJ();
        AbstractC5442a abstractC5442a = this.f25975LJ;
        if (abstractC5442a != null) {
            abstractC5442a.LIZ(this.LJI);
        }
    }

    @Override // com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.ies.sdk.widgets.Widget
    public final void onCreate() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 1).isSupported) {
            return;
        }
        super.onCreate();
        ALogger.m15801d(this.LIZIZ, "widget on create");
    }

    @Override // com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.ies.sdk.widgets.Widget
    public final void onPause() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 2).isSupported) {
            return;
        }
        super.onPause();
        this.isViewValid = false;
    }

    @Override // com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.ies.sdk.widgets.Widget
    public final void onResume() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 3).isSupported) {
            return;
        }
        super.onResume();
        this.isViewValid = true;
    }

    @Override // com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.ies.sdk.widgets.Widget
    public final void onDestroy() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 7).isSupported) {
            return;
        }
        super.onDestroy();
        this.LJI = null;
        AbstractC5442a abstractC5442a = this.f25975LJ;
        if (abstractC5442a != null) {
            abstractC5442a.LIZ();
        }
        Disposable disposable = this.LIZLLL;
        if (disposable != null) {
            disposable.dispose();
        }
        ALogger.m15801d(this.LIZIZ, "onDestroy");
    }

    private final void LIZJ() {
        Room room;
        C2WC<Room> LIZ2;
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 4).isSupported) {
            return;
        }
        if (this.LIZJ) {
            ALogger.m15795w(this.LIZIZ, "hasInit, skip");
            return;
        }
        IPushStreamService iPushStreamService = (IPushStreamService) ServiceManager.getService(IPushStreamService.class);
        C5923dp c5923dp = this.LJJJJI;
        if (c5923dp != null && (LIZ2 = c5923dp.LIZ()) != null) {
            room = LIZ2.LIZ();
        } else {
            room = null;
        }
        this.f25975LJ = iPushStreamService.createStreamSignHelper(room);
        this.LJFF = 0;
        Disposable disposable = this.LIZLLL;
        if (disposable != null) {
            disposable.dispose();
        }
        this.LIZLLL = C7HK.LIZIZ.LIZ(500L, 30000L, TimeUnit.MILLISECONDS).subscribeOn(Schedulers.m138io()).observeOn(Schedulers.m138io()).subscribe(new Consumer<Long>() { // from class: X.2dk
            public static ChangeQuickRedirect LIZ;

            static {
                Covode.recordClassIndex(18366);
            }

            @Override // io.reactivex.functions.Consumer
            public final /* synthetic */ void accept(Long l) {
                if (!PatchProxy.proxy(new Object[]{l}, this, LIZ, false, 1).isSupported) {
                    MsSeiSignWidget.this.LIZ();
                }
            }
        });
        ALogger.m15801d(this.LIZIZ, "initSignLoop complete");
        this.LIZJ = true;
    }

    public final void LIZ() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 5).isSupported) {
            return;
        }
        if (this.isViewValid) {
            try {
                AbstractC5442a abstractC5442a = this.f25975LJ;
                if (abstractC5442a != null) {
                    abstractC5442a.LIZ(this.LJI, String.valueOf(this.LJFF));
                }
                return;
            } catch (Exception e) {
                ALogger.m15799e(this.LIZIZ, "do signField failed: ", e);
                return;
            } finally {
                this.LJFF++;
            }
        }
        ALogger.m15800e(this.LIZIZ, "do signField failed: view is not Valid");
    }

    public MsSeiSignWidget(AbstractC5436a abstractC5436a) {
        this.LJI = abstractC5436a;
    }
}
