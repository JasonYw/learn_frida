package com.bytedance.android.live.broadcastgame.opengame.panel;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import com.bytedance.covode.number.Covode;
import p003X.AbstractC87833KjD;

/* renamed from: com.bytedance.android.live.broadcastgame.opengame.panel.d */
/* loaded from: classes5.dex */
public interface AbstractC3609d extends AbstractC87833KjD<AbstractC3610e> {
    static {
        Covode.recordClassIndex(20784);
    }

    void LIZ(int i);

    void LIZ(View.OnClickListener onClickListener);

    void LIZ(PanelType panelType);

    void LIZ(boolean z);

    void LIZIZ(int i);

    void LIZIZ(boolean z);

    ViewGroup LIZJ();

    void LIZJ(boolean z);

    Window LIZLLL();

    /* renamed from: LJ */
    PanelType mo15844LJ();

    void LJFF();

    void LJI();

    void LJII();

    void LJIIIIZZ();

    int LJIIIZ();

    Context LJIIJ();

    void addTopMessageView(View view);

    void addTopRightBtnView(View view);

    void dismiss();

    void hide();

    boolean isShowing();

    void show();
}
