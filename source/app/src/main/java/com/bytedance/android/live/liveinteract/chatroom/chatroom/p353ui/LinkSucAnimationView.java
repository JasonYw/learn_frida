package com.bytedance.android.live.liveinteract.chatroom.chatroom.p353ui;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.core.widget.HSImageView;
import com.bytedance.android.livesdkapi.depend.model.live.linker.C9531aq;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p003X.AbstractC81060HxG;
import p003X.C106862S5w;
import p003X.C499305oK;

/* renamed from: com.bytedance.android.live.liveinteract.chatroom.chatroom.ui.LinkSucAnimationView */
/* loaded from: classes3.dex */
public final class LinkSucAnimationView extends HSImageView {
    public static ChangeQuickRedirect LIZIZ;
    public ImageView LIZJ;
    public TextView LIZLLL;

    /* renamed from: LJ */
    public C9531aq f26294LJ;
    public String LJFF;
    public ImageModel LJI;
    public AbstractC81060HxG LJII;
    public Function0<Unit> LJIIIIZZ;
    public boolean LJIIIZ;
    public boolean LJIIJ;

    static {
        Covode.recordClassIndex(26414);
    }

    public LinkSucAnimationView(Context context) {
        this(context, null, 0, 6, null);
    }

    public LinkSucAnimationView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    @Override // com.facebook.drawee.view.DraweeView, android.widget.ImageView, android.view.View
    public final void onDetachedFromWindow() {
        if (!PatchProxy.proxy(new Object[0], this, LIZIZ, false, 11).isSupported && !PatchProxy.proxy(new Object[]{this}, null, LIZIZ, true, 10).isSupported) {
            if (!PatchProxy.proxy(new Object[0], this, LIZIZ, false, 12).isSupported) {
                super.onDetachedFromWindow();
                this.LJIIIZ = true;
                this.LJIIJ = false;
            }
            C499305oK.LIZ(this);
        }
    }

    public final void setCallback(AbstractC81060HxG abstractC81060HxG) {
        if (PatchProxy.proxy(new Object[]{abstractC81060HxG}, this, LIZIZ, false, 9).isSupported) {
            return;
        }
        C106862S5w.LIZ(abstractC81060HxG);
        this.LJII = abstractC81060HxG;
    }

    public final void setGuestAvatar(ImageView imageView) {
        if (PatchProxy.proxy(new Object[]{imageView}, this, LIZIZ, false, 1).isSupported) {
            return;
        }
        C106862S5w.LIZ(imageView);
        this.LIZJ = imageView;
    }

    public final void setGuestName(TextView textView) {
        if (PatchProxy.proxy(new Object[]{textView}, this, LIZIZ, false, 2).isSupported) {
            return;
        }
        C106862S5w.LIZ(textView);
        this.LIZLLL = textView;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LinkSucAnimationView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C106862S5w.LIZ(context);
    }

    public /* synthetic */ LinkSucAnimationView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
