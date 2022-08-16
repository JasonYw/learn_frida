package com.bytedance.android.live.broadcast.widget;

import android.text.TextUtils;
import android.widget.TextView;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import com.bytedance.android.live.broadcast.widget.StickerTipWidget;
import com.bytedance.android.live.core.tetris.widgets.LiveRecyclableWidget;
import com.bytedance.common.utility.StringUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.ies.sdk.widgets.KVData;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import java.util.concurrent.TimeUnit;
import p003X.AbstractC4569445g;
import p003X.C413132Wt;
import p003X.C413142Wu;
import p003X.C87010KQi;

/* loaded from: classes12.dex */
public class StickerTipWidget extends LiveRecyclableWidget implements Observer<KVData>, AbstractC4569445g {
    public static ChangeQuickRedirect LIZ;
    public Disposable LIZIZ;

    static {
        Covode.recordClassIndex(18840);
    }

    @Override // com.bytedance.ies.sdk.widgets.Widget
    public int getLayoutId() {
        return 2131699805;
    }

    @Override // com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.android.logsdk.collect.p785a.AbstractC9727b
    public String getSpm() {
        return "a100.a100.a189";
    }

    @Override // com.bytedance.android.live.core.tetris.widgets.LiveRecyclableWidget
    public void onInit(Object... objArr) {
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
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 4).isSupported) {
            return;
        }
        this.dataCenter.removeObserver(this);
        Disposable disposable = this.LIZIZ;
        if (disposable != null && !disposable.isDisposed()) {
            this.LIZIZ.dispose();
        }
    }

    @Override // androidx.lifecycle.Observer
    public /* synthetic */ void onChanged(KVData kVData) {
        KVData kVData2 = kVData;
        if (!PatchProxy.proxy(new Object[]{kVData2}, this, LIZ, false, 1).isSupported && kVData2 != null && !TextUtils.isEmpty(kVData2.getKey())) {
            String key = kVData2.getKey();
            if (key.hashCode() == 1351936788 && key.equals("cmd_sticker_tip")) {
                LIZ((String) kVData2.getData());
            }
        }
    }

    @Override // com.bytedance.android.live.core.tetris.widgets.LiveRecyclableWidget
    public void onLoad(Object... objArr) {
        if (PatchProxy.proxy(new Object[]{objArr}, this, LIZ, false, 3).isSupported) {
            return;
        }
        this.dataCenter.observe("cmd_sticker_tip", this);
        C87010KQi.LIZ().LIZ(C413142Wu.class).compose(getAutoUnbindTransformer()).subscribe(new Consumer(this) { // from class: X.2Ws
            public static ChangeQuickRedirect LIZ;
            public final StickerTipWidget LIZIZ;

            static {
                Covode.recordClassIndex(18937);
            }

            {
                this.LIZIZ = this;
            }

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                if (PatchProxy.proxy(new Object[]{obj}, this, LIZ, false, 1).isSupported) {
                    return;
                }
                StickerTipWidget stickerTipWidget = this.LIZIZ;
                C413142Wu c413142Wu = (C413142Wu) obj;
                if (PatchProxy.proxy(new Object[]{c413142Wu}, stickerTipWidget, StickerTipWidget.LIZ, false, 5).isSupported) {
                    return;
                }
                stickerTipWidget.LIZ(c413142Wu.LIZ);
            }
        });
    }

    public void LIZ(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, LIZ, false, 2).isSupported) {
            return;
        }
        Disposable disposable = this.LIZIZ;
        if (disposable != null && !disposable.isDisposed()) {
            this.LIZIZ.dispose();
        }
        if (StringUtils.isEmpty(str)) {
            this.contentView.setVisibility(4);
            return;
        }
        this.contentView.setVisibility(0);
        ((TextView) this.contentView).setText(str);
        this.LIZIZ = Observable.timer(3L, TimeUnit.SECONDS).compose(getAutoUnbindTransformer()).observeOn(AndroidSchedulers.mainThread()).subscribe(new Consumer(this) { // from class: X.2Wr
            public static ChangeQuickRedirect LIZ;
            public final StickerTipWidget LIZIZ;

            static {
                Covode.recordClassIndex(18935);
            }

            {
                this.LIZIZ = this;
            }

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                if (PatchProxy.proxy(new Object[]{obj}, this, LIZ, false, 1).isSupported) {
                    return;
                }
                StickerTipWidget stickerTipWidget = this.LIZIZ;
                if (PatchProxy.proxy(new Object[]{obj}, stickerTipWidget, StickerTipWidget.LIZ, false, 6).isSupported) {
                    return;
                }
                stickerTipWidget.contentView.setVisibility(8);
            }
        }, C413132Wt.LIZIZ);
    }
}
