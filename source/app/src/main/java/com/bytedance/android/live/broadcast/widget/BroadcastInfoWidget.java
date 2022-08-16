package com.bytedance.android.live.broadcast.widget;

import android.os.SystemClock;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.broadcast.widget.BroadcastInfoWidget;
import com.bytedance.android.live.core.tetris.widgets.LiveRecyclableWidget;
import com.bytedance.android.livesdk.config.LiveConfigSettingKeys;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.functions.Consumer;
import p003X.AbstractC408922Go;
import p003X.AbstractC4569445g;
import p003X.AbstractC80293Hkt;
import p003X.C413712Yz;
import p003X.C81294I2m;

/* loaded from: classes12.dex */
public class BroadcastInfoWidget extends LiveRecyclableWidget implements AbstractC408922Go, AbstractC4569445g {
    public static ChangeQuickRedirect LIZ;
    public ImageView LIZIZ;
    public TextView LIZJ;
    public long LIZLLL;

    /* renamed from: LJ */
    public View f25967LJ;
    public final Runnable LJFF = new Runnable() { // from class: com.bytedance.android.live.broadcast.widget.BroadcastInfoWidget.1
        public static ChangeQuickRedirect LIZ;

        static {
            Covode.recordClassIndex(18306);
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 1).isSupported && BroadcastInfoWidget.this.isViewValid()) {
                BroadcastInfoWidget broadcastInfoWidget = BroadcastInfoWidget.this;
                long elapsedRealtime = SystemClock.elapsedRealtime();
                if (!PatchProxy.proxy(new Object[]{new Long(elapsedRealtime)}, broadcastInfoWidget, BroadcastInfoWidget.LIZ, false, 3).isSupported) {
                    long j = elapsedRealtime - broadcastInfoWidget.LIZLLL;
                    if (j < 0) {
                        j = 0;
                    }
                    broadcastInfoWidget.LIZJ.setText(C81294I2m.LIZ((int) (j / 1000), "."));
                }
                BroadcastInfoWidget.this.LIZJ.postDelayed(BroadcastInfoWidget.this.LJFF, 1000L);
            }
        }
    };
    public Integer[] LJI;
    public Room LJII;

    static {
        Covode.recordClassIndex(18305);
    }

    @Override // com.bytedance.ies.sdk.widgets.Widget
    public int getLayoutId() {
        return 2131699762;
    }

    @Override // com.bytedance.android.live.core.tetris.widgets.LiveRecyclableWidget, com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.ies.sdk.widgets.Widget, androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (PatchProxy.proxy(new Object[]{lifecycleOwner, event}, this, LIZ, false, 7).isSupported) {
            return;
        }
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.android.live.core.tetris.widgets.LiveRecyclableWidget
    public void onUnload() {
    }

    @Override // p003X.AbstractC408922Go
    public final void LIZ(float f) {
        final int i = 4;
        if (PatchProxy.proxy(new Object[]{Float.valueOf(f)}, this, LIZ, false, 4).isSupported) {
            return;
        }
        Integer[] numArr = this.LJI;
        if (this.LJII.getStreamType() == LiveMode.AUDIO) {
            if (f == 0.0f) {
                i = 0;
            }
        } else {
            int i2 = 0;
            while (true) {
                if (i2 < numArr.length) {
                    if (f >= numArr[i2].intValue()) {
                        i = (numArr.length - i2) - 1;
                        break;
                    }
                    i2++;
                } else {
                    i = 0;
                    break;
                }
            }
        }
        Observable.just(0).observeOn(AndroidSchedulers.mainThread()).compose(getAutoUnbindTransformer()).subscribe(new Consumer(this, i) { // from class: X.2Yy
            public static ChangeQuickRedirect LIZ;
            public final BroadcastInfoWidget LIZIZ;
            public final int LIZJ;

            static {
                Covode.recordClassIndex(18965);
            }

            {
                this.LIZIZ = this;
                this.LIZJ = i;
            }

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                if (PatchProxy.proxy(new Object[]{obj}, this, LIZ, false, 1).isSupported) {
                    return;
                }
                BroadcastInfoWidget broadcastInfoWidget = this.LIZIZ;
                int i3 = this.LIZJ;
                if (PatchProxy.proxy(new Object[]{Integer.valueOf(i3), obj}, broadcastInfoWidget, BroadcastInfoWidget.LIZ, false, 6).isSupported || PatchProxy.proxy(new Object[]{Integer.valueOf(i3)}, broadcastInfoWidget, BroadcastInfoWidget.LIZ, false, 5).isSupported) {
                    return;
                }
                if (i3 == 0) {
                    broadcastInfoWidget.f25967LJ.setVisibility(0);
                    broadcastInfoWidget.LIZIZ.setVisibility(4);
                    return;
                }
                broadcastInfoWidget.f25967LJ.setVisibility(4);
                broadcastInfoWidget.LIZIZ.setVisibility(0);
                broadcastInfoWidget.LIZIZ.setImageLevel(i3);
            }
        }, C413712Yz.LIZIZ);
    }

    @Override // com.bytedance.android.live.core.tetris.widgets.LiveRecyclableWidget
    public void onInit(Object... objArr) {
        if (PatchProxy.proxy(new Object[]{objArr}, this, LIZ, false, 1).isSupported) {
            return;
        }
        this.LJII = (Room) this.dataCenter.get("data_room");
        this.LJI = LiveConfigSettingKeys.LIVE_VIDEO_PUSH_BITRATE_LEVEL.getValue();
        this.LIZIZ = (ImageView) this.contentView.findViewById(2131179175);
        this.LIZIZ.setImageLevel(4);
        this.LIZJ = (TextView) this.contentView.findViewById(2131181114);
        this.f25967LJ = this.contentView.findViewById(2131186665);
    }

    @Override // com.bytedance.android.live.core.tetris.widgets.LiveRecyclableWidget
    public void onLoad(Object... objArr) {
        if (PatchProxy.proxy(new Object[]{objArr}, this, LIZ, false, 2).isSupported) {
            return;
        }
        this.LJII = (Room) this.dataCenter.get("data_room");
        if (this.LJII.getId() == AbstractC80293Hkt.LJIJ.LIZ().longValue() && AbstractC80293Hkt.LJIJI.LIZ().longValue() > 0) {
            this.LIZLLL = AbstractC80293Hkt.LJIJI.LIZ().longValue();
        } else {
            this.LIZLLL = SystemClock.elapsedRealtime();
            AbstractC80293Hkt.LJIJ.LIZ(Long.valueOf(this.LJII.getId()));
            AbstractC80293Hkt.LJIJI.LIZ(Long.valueOf(this.LIZLLL));
        }
        this.LIZJ.postDelayed(this.LJFF, 1000L);
    }
}
