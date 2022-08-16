package com.bytedance.android.live.liveinteract.chatroom.chatroom.seat.layer.p352d;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.android.live.core.widget.HSImageView;
import com.bytedance.android.live.liveinteract.chatroom.chatroom.seat.layer.base.AbstractC4371c;
import com.bytedance.android.live.liveinteract.chatroom.chatroom.seat.layer.base.MicSeatScene;
import com.bytedance.android.live.liveinteract.plantform.model.LinkPlayerInfo;
import com.bytedance.android.live.liveinteract.view.PositionNameTv;
import com.bytedance.android.livesdkapi.depend.model.live.audio.VoiceLiveTheme;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import p003X.C106862S5w;
import p003X.C30K;
import p003X.C79046HEa;
import p003X.View$OnClickListenerC81055HxB;
import p003X.View$OnClickListenerC81056HxC;

/* renamed from: com.bytedance.android.live.liveinteract.chatroom.chatroom.seat.layer.d.c */
/* loaded from: classes3.dex */
public class C4376c extends AbstractC4371c implements C30K<Integer> {
    public static ChangeQuickRedirect LIZIZ;
    public ImageView LIZJ;
    public TextView LJII;
    public PositionNameTv LJIIIIZZ;
    public View LJIIIZ;
    public HSImageView LJIIJ;
    public LinkPlayerInfo LJIIJJI;
    public int LJIIL = -1;
    public VoiceLiveTheme LJIILIIL;
    public final boolean LJIILJJIL;

    static {
        Covode.recordClassIndex(26352);
    }

    public void LIZ() {
    }

    public void LIZ(boolean z) {
    }

    public void LIZJ() {
    }

    @Override // com.bytedance.android.live.liveinteract.chatroom.chatroom.seat.layer.base.AbstractC4373j
    public final void LJFF() {
    }

    public void LIZIZ() {
        if (PatchProxy.proxy(new Object[0], this, LIZIZ, false, 3).isSupported) {
            return;
        }
        TextView textView = this.LJII;
        if (textView != null) {
            textView.setOnClickListener(null);
        }
        TextView textView2 = this.LJII;
        if (textView2 != null) {
            textView2.setVisibility(0);
        }
        C79046HEa LIZ = C79046HEa.LIZ();
        Intrinsics.checkNotNullExpressionValue(LIZ, "");
        Integer num = (Integer) LIZ.LJJIIZI;
        if (num != null && num.intValue() == 1) {
            TextView textView3 = this.LJII;
            if (textView3 != null) {
                textView3.setText(2131588274);
            }
            TextView textView4 = this.LJII;
            if (textView4 != null) {
                textView4.setSelected(true);
            }
            LIZ(true);
            TextView textView5 = this.LJII;
            if (textView5 != null) {
                textView5.setOnClickListener(new View$OnClickListenerC81055HxB(this));
                return;
            }
            return;
        }
        TextView textView6 = this.LJII;
        if (textView6 != null) {
            textView6.setSelected(false);
        }
        TextView textView7 = this.LJII;
        if (textView7 != null) {
            textView7.setText(2131588272);
        }
        LIZ(false);
        TextView textView8 = this.LJII;
        if (textView8 != null) {
            textView8.setOnClickListener(new View$OnClickListenerC81056HxC(this));
        }
    }

    @Override // com.bytedance.android.live.liveinteract.chatroom.chatroom.seat.layer.base.AbstractC4373j
    public final void LIZ(VoiceLiveTheme voiceLiveTheme) {
        this.LJIILIIL = voiceLiveTheme;
    }

    @Override // p003X.C30K
    /* renamed from: LIZ */
    public void onChanged(Integer num) {
        if (PatchProxy.proxy(new Object[]{num}, this, LIZIZ, false, 5).isSupported) {
            return;
        }
        LIZIZ();
    }

    @Override // com.bytedance.android.live.liveinteract.chatroom.chatroom.seat.layer.base.AbstractC4371c, com.bytedance.android.live.liveinteract.chatroom.chatroom.seat.layer.base.AbstractC4373j
    public final void LIZ(Context context) {
        if (PatchProxy.proxy(new Object[]{context}, this, LIZIZ, false, 1).isSupported) {
            return;
        }
        C106862S5w.LIZ(context);
        super.LIZ(context);
        this.LIZJ = (ImageView) m15748U_().findViewById(2131192863);
        this.LJII = (TextView) m15748U_().findViewById(2131193010);
        this.LJIIIIZZ = (PositionNameTv) m15748U_().findViewById(2131193077);
        this.LJIIIZ = m15748U_().findViewById(2131192866);
        this.LJIIJ = (HSImageView) m15748U_().findViewById(2131192865);
        C79046HEa.LIZ().LIZIZ(this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4376c(MicSeatScene micSeatScene, boolean z) {
        super(micSeatScene);
        C106862S5w.LIZ(micSeatScene);
        this.LJIILJJIL = z;
    }

    @Override // com.bytedance.android.live.liveinteract.chatroom.chatroom.seat.layer.base.AbstractC4373j
    public void LIZ(List<LinkPlayerInfo> list, int i) {
        if (PatchProxy.proxy(new Object[]{list, Integer.valueOf(i)}, this, LIZIZ, false, 2).isSupported) {
            return;
        }
        C106862S5w.LIZ(list);
        this.LJIIJJI = list.get(i);
        this.LJIIL = i;
        LIZIZ();
        PositionNameTv positionNameTv = this.LJIIIIZZ;
        if (positionNameTv != null) {
            positionNameTv.LIZ(this.LJIIJJI, this.LJIILJJIL);
        }
        LIZJ();
    }

    @Override // com.bytedance.android.live.liveinteract.chatroom.chatroom.seat.layer.base.AbstractC4373j
    public void LIZ(List<LinkPlayerInfo> list, int i, Bundle bundle) {
        if (PatchProxy.proxy(new Object[]{list, Integer.valueOf(i), bundle}, this, LIZIZ, false, 4).isSupported) {
            return;
        }
        C106862S5w.LIZ(list, bundle);
        this.LJIIJJI = list.get(i);
    }
}
