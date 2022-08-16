package com.bytedance.android.live.broadcastgame.opengame.lynx;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.io.File;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p003X.C87965KlL;

/* loaded from: classes5.dex */
public final class LynxOpenPlugin$onStart$3$$special$$inlined$let$lambda$1 extends Lambda implements Function0<Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ String $heightType;
    public final /* synthetic */ File $it;
    public final /* synthetic */ String $path;
    public final /* synthetic */ byte[] $template;
    public final /* synthetic */ C87965KlL this$0;

    static {
        Covode.recordClassIndex(20222);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LynxOpenPlugin$onStart$3$$special$$inlined$let$lambda$1(byte[] bArr, File file, String str, String str2, C87965KlL c87965KlL) {
        super(0);
        this.$template = bArr;
        this.$it = file;
        this.$heightType = str;
        this.$path = str2;
        this.this$0 = c87965KlL;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ Unit mo30099invoke() {
        if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1).isSupported) {
            if (this.$template != null) {
                this.this$0.LIZIZ.resFileRootPath = this.$it.getAbsolutePath();
                this.this$0.LIZIZ.setHeight(this.$heightType);
                this.this$0.LIZIZ.loadTemplate(this.$path, this.$template);
                this.this$0.LIZIZ.onStartSucceed();
            } else {
                this.this$0.LIZIZ.startFail("parse resource fail");
            }
        }
        return Unit.INSTANCE;
    }
}
