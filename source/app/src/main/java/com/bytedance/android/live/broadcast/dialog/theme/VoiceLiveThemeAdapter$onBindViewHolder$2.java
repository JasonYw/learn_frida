package com.bytedance.android.live.broadcast.dialog.theme;

import android.view.View;
import com.bytedance.android.livesdkapi.depend.model.live.audio.VoiceLiveTheme;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import p003X.C106862S5w;
import p003X.ISK;

/* loaded from: classes3.dex */
public final class VoiceLiveThemeAdapter$onBindViewHolder$2 extends Lambda implements Function1<View, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ VoiceLiveTheme $theme;
    public final /* synthetic */ ISK this$0;

    static {
        Covode.recordClassIndex(15454);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VoiceLiveThemeAdapter$onBindViewHolder$2(ISK isk, VoiceLiveTheme voiceLiveTheme) {
        super(1);
        this.this$0 = isk;
        this.$theme = voiceLiveTheme;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(View view) {
        if (!PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 1).isSupported) {
            C106862S5w.LIZ(view);
            this.this$0.LIZLLL.LIZ(this.$theme);
        }
        return Unit.INSTANCE;
    }
}
