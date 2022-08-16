package com.bytedance.android.live.media.impl.widget.count;

import android.text.TextUtils;
import android.widget.TextView;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.base.model.live.RoomStats;
import com.bytedance.android.live.core.log.ALogger;
import com.bytedance.android.live.core.setting.SettingKey;
import com.bytedance.android.live.core.tetris.widgets.LiveRecyclableWidget;
import com.bytedance.android.livesdk.config.LiveConfigSettingKeys;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.ies.sdk.widgets.DataCenter;
import kotlin.jvm.internal.Intrinsics;
import p002O.C0002O;
import p003X.AbstractC416582eC;
import p003X.AbstractC4569445g;
import p003X.C106862S5w;
import p003X.C419432in;
import p003X.C423702pg;
import p003X.C426942uu;
import p003X.C81918IQm;
import p003X.HNR;
import p003X.LK5;

/* loaded from: classes12.dex */
public final class MediaCountWidget extends LiveRecyclableWidget implements AbstractC5165a, AbstractC4569445g {
    public static ChangeQuickRedirect LIZ;
    public TextView LIZIZ;
    public HNR<AbstractC5165a> LIZJ;
    public long LIZLLL = -1;

    /* renamed from: LJ */
    public String f26521LJ = "";
    public final int LJFF = LK5.LIZ(76.0f);
    public final float LJI = 12.0f;
    public final float LJII = 11.0f;

    static {
        Covode.recordClassIndex(32488);
    }

    @Override // com.bytedance.android.livesdk.chatroom.viewmodule.AbstractC6416aw
    public final void LIZIZ(Throwable th) {
        if (PatchProxy.proxy(new Object[]{th}, this, LIZ, false, 6).isSupported) {
            return;
        }
        AbstractC416582eC.LIZ(this, th);
    }

    @Override // com.bytedance.android.livesdk.chatroom.viewmodule.AbstractC6416aw
    public final String LJJIJ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 5);
        return proxy.isSupported ? (String) proxy.result : AbstractC416582eC.LIZ(this);
    }

    @Override // com.bytedance.ies.sdk.widgets.Widget
    public final int getLayoutId() {
        return 2131699997;
    }

    @Override // com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.android.logsdk.collect.p785a.AbstractC9727b
    public final String getSpm() {
        return "a100.a100.a190";
    }

    @Override // com.bytedance.android.live.core.tetris.widgets.LiveRecyclableWidget, com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.ies.sdk.widgets.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (PatchProxy.proxy(new Object[]{lifecycleOwner, event}, this, LIZ, false, 7).isSupported) {
            return;
        }
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.android.live.core.tetris.widgets.LiveRecyclableWidget
    public final void onUnload() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 4).isSupported) {
            return;
        }
        HNR<AbstractC5165a> hnr = this.LIZJ;
        if (hnr != null) {
            Intrinsics.checkNotNull(hnr);
            hnr.LIZJ();
        }
        this.LIZLLL = 0L;
    }

    @Override // com.bytedance.android.live.core.tetris.widgets.LiveRecyclableWidget
    public final void onInit(Object[] objArr) {
        if (PatchProxy.proxy(new Object[]{objArr}, this, LIZ, false, 1).isSupported) {
            return;
        }
        this.LIZIZ = (TextView) findViewById(2131182795);
        this.LIZJ = new C419432in();
    }

    @Override // com.bytedance.android.live.core.tetris.widgets.LiveRecyclableWidget
    public final void onLoad(Object[] objArr) {
        DataCenter dataCenter;
        RoomStats stats;
        String str;
        RoomStats stats2;
        if (PatchProxy.proxy(new Object[]{objArr}, this, LIZ, false, 2).isSupported) {
            return;
        }
        this.LIZLLL = 0L;
        Room room = (Room) this.dataCenter.get("data_room", (String) null);
        if (TextUtils.isEmpty(this.f26521LJ) && room != null && (stats2 = room.getStats()) != null) {
            if (TextUtils.isEmpty(stats2.totalUserDesp)) {
                String LIZ2 = LK5.LIZ(2131586251);
                Intrinsics.checkNotNullExpressionValue(LIZ2, "");
                this.f26521LJ = LIZ2;
            } else {
                String str2 = stats2.totalUserDesp;
                Intrinsics.checkNotNullExpressionValue(str2, "");
                this.f26521LJ = str2;
            }
        }
        HNR<AbstractC5165a> hnr = this.LIZJ;
        if (hnr != null) {
            Intrinsics.checkNotNull(hnr);
            hnr.LIZ((HNR<AbstractC5165a>) this);
        }
        if (room != null && (stats = room.getStats()) != null) {
            RoomStats stats3 = room.getStats();
            if (stats3 == null || (str = stats3.getTotalUserStr()) == null) {
                str = "";
            }
            LIZ(stats.getTotalUser(), str, str);
        }
        if (!isScreenPortrait()) {
            TextView textView = this.LIZIZ;
            if (textView != null) {
                textView.setTextSize(2, this.LJI);
            }
            TextView textView2 = this.LIZIZ;
            if (textView2 != null) {
                textView2.setMinimumWidth(this.LJFF);
            }
            if (C426942uu.LIZ(false)) {
                TextView textView3 = this.LIZIZ;
                if (textView3 != null) {
                    textView3.setTextColor(LK5.LIZIZ(2131626090));
                }
                TextView textView4 = this.LIZIZ;
                if (textView4 != null) {
                    textView4.setBackgroundResource(2130857511);
                }
                TextView textView5 = this.LIZIZ;
                if (textView5 != null) {
                    textView5.setPadding((int) C81918IQm.LIZ(getContext(), 8.0f), (int) C81918IQm.LIZ(getContext(), 2.0f), (int) C81918IQm.LIZ(getContext(), 8.0f), (int) C81918IQm.LIZ(getContext(), 2.0f));
                }
            } else {
                TextView textView6 = this.LIZIZ;
                if (textView6 != null) {
                    textView6.setTextColor(LK5.LIZIZ(2131628971));
                }
                TextView textView7 = this.LIZIZ;
                if (textView7 != null) {
                    textView7.setBackgroundResource(2130857510);
                }
                TextView textView8 = this.LIZIZ;
                if (textView8 != null) {
                    textView8.setPadding((int) C81918IQm.LIZ(getContext(), 8.0f), (int) C81918IQm.LIZ(getContext(), 7.0f), (int) C81918IQm.LIZ(getContext(), 8.0f), (int) C81918IQm.LIZ(getContext(), 7.0f));
                }
            }
        } else {
            TextView textView9 = this.LIZIZ;
            if (textView9 != null) {
                textView9.setTextSize(2, this.LJII);
            }
            TextView textView10 = this.LIZIZ;
            if (textView10 != null) {
                textView10.setMinimumWidth(0);
            }
            TextView textView11 = this.LIZIZ;
            if (textView11 != null) {
                textView11.setTextColor(LK5.LIZIZ(2131628972));
            }
            TextView textView12 = this.LIZIZ;
            if (textView12 != null) {
                textView12.setBackgroundResource(2130857510);
            }
            TextView textView13 = this.LIZIZ;
            if (textView13 != null) {
                textView13.setPadding((int) C81918IQm.LIZ(getContext(), 8.0f), (int) C81918IQm.LIZ(getContext(), 7.0f), (int) C81918IQm.LIZ(getContext(), 8.0f), (int) C81918IQm.LIZ(getContext(), 7.0f));
            }
        }
        SettingKey<Boolean> settingKey = LiveConfigSettingKeys.LIVE_CLEAR_SCREEN_OPTIMIZE_ENABLE;
        Intrinsics.checkNotNullExpressionValue(settingKey, "");
        Boolean value = settingKey.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "");
        if (value.booleanValue() && (dataCenter = this.dataCenter) != null) {
            dataCenter.put("cmd_live_update_media_count", Boolean.TRUE);
        }
    }

    @Override // com.bytedance.android.live.media.impl.widget.count.AbstractC5165a
    public final void LIZ(long j, String str, String str2) {
        RoomStats stats;
        if (PatchProxy.proxy(new Object[]{new Long(j), str, str2}, this, LIZ, false, 3).isSupported) {
            return;
        }
        C106862S5w.LIZ(str, str2);
        if (!isViewValid() || j < this.LIZLLL) {
            return;
        }
        this.LIZLLL = j;
        Room room = (Room) this.dataCenter.get("data_room", (String) null);
        if (C423702pg.LIZIZ(this.dataCenter, false, 1, null)) {
            str = str2;
        }
        if (room != null && (stats = room.getStats()) != null) {
            stats.setTotalUser((int) j);
            if (str.length() > 0) {
                stats.setTotalUserStr(str);
            }
        }
        if (str.length() <= 0) {
            if (this.LIZLLL == 0) {
                str = "0";
            } else {
                ALogger.m15795w("MediaCountWidget", "updateOnlineInfo: totalUserStr is empty");
                return;
            }
        }
        TextView textView = this.LIZIZ;
        if (textView != null) {
            new StringBuilder();
            textView.setText(C0002O.m25086C(str, this.f26521LJ));
        }
    }
}
