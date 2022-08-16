package com.bytedance.android.live.liveinteract.chatroom.chatroom.p353ui;

import android.content.Context;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.linkpk.LinkCrossRoomDataHolder;
import com.bytedance.android.live.liveinteract.newpk.p379vm.PkDataContext;
import com.bytedance.common.utility.UIUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.live.datacontext.C13491f;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import p003X.C106862S5w;
import p003X.C47A;
import p003X.C499305oK;
import p003X.C88440Kt0;
import p003X.HSZ;
import p003X.HV3;
import p003X.HV6;
import p003X.IQV;
import p003X.LK1;
import p003X.LK5;

/* renamed from: com.bytedance.android.live.liveinteract.chatroom.chatroom.ui.LinkInRoomMuteView */
/* loaded from: classes3.dex */
public final class LinkInRoomMuteView extends AppCompatImageView {
    public static ChangeQuickRedirect LIZ;
    public static final int LJIIIZ = 2130857643;
    public static final int LJIIJ = 2130857642;
    public boolean LIZIZ;
    public boolean LIZJ;
    public HV6 LIZLLL;

    /* renamed from: LJ */
    public LinkCrossRoomDataHolder f26293LJ;
    public long LJFF;
    public long LJI;
    public HSZ LJII;
    public boolean LJIIIIZZ;

    static {
        Covode.recordClassIndex(26410);
    }

    private final void LIZ() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 1).isSupported) {
            return;
        }
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        setImageDrawable(LK1.LIZ(context, LJIIIZ));
        setOnClickListener(new HV3(this));
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onDetachedFromWindow() {
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 11).isSupported && !PatchProxy.proxy(new Object[]{this}, null, LIZ, true, 10).isSupported) {
            if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 12).isSupported) {
                super.onDetachedFromWindow();
            }
            C499305oK.LIZ(this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LinkInRoomMuteView(Context context) {
        super(context);
        C106862S5w.LIZ(context);
        LIZ();
    }

    public final void setMute(boolean z) {
        if (PatchProxy.proxy(new Object[]{Byte.valueOf(z ? (byte) 1 : (byte) 0)}, this, LIZ, false, 6).isSupported) {
            return;
        }
        LIZ(z, false);
    }

    public final void setMuteStateChangeListener(HSZ hsz) {
        if (PatchProxy.proxy(new Object[]{hsz}, this, LIZ, false, 5).isSupported) {
            return;
        }
        C106862S5w.LIZ(hsz);
        this.LJII = hsz;
    }

    public final void setAnchorAndInit(boolean z) {
        if (PatchProxy.proxy(new Object[]{Byte.valueOf(z ? (byte) 1 : (byte) 0)}, this, LIZ, false, 3).isSupported) {
            return;
        }
        this.LJIIIIZZ = true;
        this.LIZJ = z;
        if (!z) {
            UIUtils.setViewVisibility(this, 8);
        } else {
            UIUtils.setViewVisibility(this, 0);
        }
    }

    public final void LIZ(Map<String, String> map) {
        LinkCrossRoomDataHolder linkCrossRoomDataHolder;
        String str;
        String str2;
        if (!PatchProxy.proxy(new Object[]{map}, this, LIZ, false, 2).isSupported && (linkCrossRoomDataHolder = this.f26293LJ) != null) {
            if (linkCrossRoomDataHolder.LJIIJJI == 0) {
                str = "anchor";
            } else if (linkCrossRoomDataHolder.LJIJJLI == 0) {
                str = "manual_pk";
            } else if (linkCrossRoomDataHolder.LJIJJLI == 1) {
                str = "random_pk";
            } else {
                str = "";
            }
            map.put("pk_time", String.valueOf(linkCrossRoomDataHolder.LJIIJJI));
            map.put("anchor_id", String.valueOf(this.LJI));
            map.put("pk_id", String.valueOf(linkCrossRoomDataHolder.f26249LJ));
            map.put("connection_type", str);
            map.put("anchor_cnt", "2");
            map.put("right_user_id", String.valueOf(linkCrossRoomDataHolder.LJFF));
            if (linkCrossRoomDataHolder.LJIIJJI != 0) {
                if (LinkCrossRoomDataHolder.LJII().LJJI) {
                    str2 = "1";
                } else {
                    str2 = "0";
                }
                map.put("is_oncemore", str2);
            }
            long j = this.LJFF;
            if (j != -1) {
                map.put("room_id", String.valueOf(j));
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LinkInRoomMuteView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C106862S5w.LIZ(context);
        LIZ();
    }

    public final void LIZ(boolean z, boolean z2) {
        int i;
        String LIZ2;
        MutableLiveData<User> mutableLiveData;
        User value;
        if (PatchProxy.proxy(new Object[]{Byte.valueOf(z ? (byte) 1 : (byte) 0), Byte.valueOf(z2 ? (byte) 1 : (byte) 0)}, this, LIZ, false, 7).isSupported || !this.LJIIIIZZ || this.LIZIZ == z) {
            return;
        }
        this.LIZIZ = z;
        if (!this.LIZJ) {
            if (z && !C47A.LIZIZ()) {
                UIUtils.setViewVisibility(this, 0);
                Context context = getContext();
                Intrinsics.checkNotNullExpressionValue(context, "");
                setImageDrawable(LK1.LIZ(context, LJIIJ));
                if (!z2) {
                    C13491f LIZ3 = IQV.LIZ("PkDataContext");
                    if (!(LIZ3 instanceof PkDataContext)) {
                        LIZ3 = null;
                    }
                    PkDataContext pkDataContext = (PkDataContext) LIZ3;
                    if (pkDataContext != null && (mutableLiveData = pkDataContext.LJJI) != null && (value = mutableLiveData.getValue()) != null) {
                        LIZ2 = value.getRemarkNameOrNickname();
                    } else {
                        LIZ2 = LK5.LIZ(2131584210);
                    }
                    C88440Kt0.LIZ(LK5.LIZ(2131584054, LIZ2));
                }
            } else {
                UIUtils.setViewVisibility(this, 8);
            }
        } else {
            Context context2 = getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "");
            if (z) {
                i = LJIIJ;
            } else {
                i = LJIIIZ;
            }
            setImageDrawable(LK1.LIZ(context2, i));
        }
        HSZ hsz = this.LJII;
        if (hsz != null) {
            hsz.LIZ(z);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LinkInRoomMuteView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C106862S5w.LIZ(context);
        LIZ();
    }
}
