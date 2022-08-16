package com.bytedance.android.live.liveinteract.voicechat;

import android.view.SurfaceView;
import android.view.TextureView;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.liveinteract.api.BaseLinkWidget;
import com.bytedance.android.live.liveinteract.plantform.core.AbstractC4796f;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.p1594ss.avframework.livestreamv2.core.ILayerControl;
import com.p1594ss.avframework.livestreamv2.core.interact.model.InteractConfig;
import p003X.AbstractC4569445g;

/* loaded from: classes3.dex */
public abstract class BaseVoiceChatWidget extends BaseLinkWidget implements AbstractC4796f, AbstractC4569445g {

    /* renamed from: g_ */
    public static ChangeQuickRedirect f26471g_;

    static {
        Covode.recordClassIndex(30807);
    }

    public static String LIZ(int i) {
        return i == 9 ? "multi_ktv" : i == 10 ? "share_video" : "fm";
    }

    @Override // com.bytedance.android.live.liveinteract.plantform.core.AbstractC4805r
    public void LIZ(long j, long j2) {
    }

    @Override // com.bytedance.android.live.liveinteract.plantform.core.AbstractC4805r
    public void LIZ(long j, Exception exc) {
    }

    @Override // p003X.HHU
    public final void LIZ(InteractConfig interactConfig) {
    }

    @Override // com.bytedance.android.live.liveinteract.plantform.core.AbstractC4805r
    public void LIZ(String str, int i, int i2) {
    }

    @Override // com.bytedance.android.live.liveinteract.plantform.core.AbstractC4805r
    public void LIZ(String str, long j) {
    }

    @Override // com.bytedance.android.live.liveinteract.plantform.core.AbstractC4805r
    public void LIZ(String str, SurfaceView surfaceView, int i, int i2) {
    }

    @Override // com.bytedance.android.live.liveinteract.plantform.core.AbstractC4805r
    public final void LIZ(String str, TextureView textureView, int i, int i2) {
    }

    @Override // com.bytedance.android.live.liveinteract.plantform.core.AbstractC4805r
    public final void LIZ(String str, ILayerControl.ILayer iLayer, int i, int i2) {
    }

    @Override // com.bytedance.android.live.liveinteract.plantform.core.AbstractC4805r
    public final void LIZ(String str, Boolean bool) {
    }

    @Override // com.bytedance.android.live.liveinteract.plantform.core.AbstractC4805r
    public void LIZ(String[] strArr, boolean[] zArr, int[] iArr) {
    }

    @Override // com.bytedance.android.live.liveinteract.plantform.core.AbstractC4805r
    public void LIZIZ(long j, Exception exc) {
    }

    @Override // com.bytedance.android.live.liveinteract.plantform.core.AbstractC4805r
    public final void LIZIZ(String str, Boolean bool) {
    }

    @Override // com.bytedance.android.live.liveinteract.plantform.core.AbstractC4805r
    public void LIZJ(long j, Exception exc) {
    }

    @Override // com.bytedance.android.live.liveinteract.plantform.core.AbstractC4805r
    /* renamed from: V_ */
    public void mo15660V_() {
    }

    @Override // com.bytedance.android.live.liveinteract.plantform.core.AbstractC4805r
    /* renamed from: W_ */
    public void mo15659W_() {
    }

    @Override // com.bytedance.android.live.liveinteract.plantform.core.AbstractC4796f
    public final void am_() {
    }

    @Override // com.bytedance.android.live.liveinteract.plantform.core.AbstractC4796f
    public final void an_() {
    }

    @Override // com.bytedance.android.live.liveinteract.plantform.core.AbstractC4805r
    /* renamed from: d_ */
    public void mo15658d_(String str) {
    }

    @Override // com.bytedance.android.live.liveinteract.plantform.core.AbstractC4805r
    /* renamed from: e_ */
    public void mo15661e_(String str) {
    }

    @Override // com.bytedance.android.live.liveinteract.plantform.core.AbstractC4805r
    /* renamed from: f_ */
    public void mo15657f_(String str) {
    }

    @Override // com.bytedance.android.live.liveinteract.api.BaseLinkWidget, com.bytedance.android.livesdk.chatroom.widget.RoomWidget, com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.ies.sdk.widgets.Widget, androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (PatchProxy.proxy(new Object[]{lifecycleOwner, event}, this, f26471g_, false, 1).isSupported) {
            return;
        }
        super.onStateChanged(lifecycleOwner, event);
    }
}
