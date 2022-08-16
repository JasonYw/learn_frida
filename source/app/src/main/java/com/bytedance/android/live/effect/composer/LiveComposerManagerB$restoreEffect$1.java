package com.bytedance.android.live.effect.composer;

import com.bytedance.android.livesdkapi.depend.model.Sticker;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import p003X.C106862S5w;
import p003X.C86726KFk;

/* loaded from: classes5.dex */
public final class LiveComposerManagerB$restoreEffect$1 extends Lambda implements Function2<C4193d, Sticker, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ String $panel;
    public final /* synthetic */ String $parentResId;
    public final /* synthetic */ C86726KFk this$0;

    static {
        Covode.recordClassIndex(24459);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LiveComposerManagerB$restoreEffect$1(C86726KFk c86726KFk, String str, String str2) {
        super(2);
        this.this$0 = c86726KFk;
        this.$parentResId = str;
        this.$panel = str2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ Unit invoke(C4193d c4193d, Sticker sticker) {
        LIZ(c4193d, sticker);
        return Unit.INSTANCE;
    }

    public final void LIZ(C4193d c4193d, Sticker sticker) {
        float f;
        if (PatchProxy.proxy(new Object[]{c4193d, sticker}, this, changeQuickRedirect, false, 1).isSupported) {
            return;
        }
        C106862S5w.LIZ(c4193d, sticker);
        sticker.setParentResId(this.$parentResId);
        for (C4197i c4197i : c4193d.LJIIIIZZ) {
            sticker.getUpdateKeys().add(c4197i.LIZJ);
        }
        Iterator<T> it = c4193d.LJIIIIZZ.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (((C4197i) next).LIZIZ != null) {
                if (next != null) {
                    this.this$0.LIZ(this.$panel, sticker, false, c4193d.LJIIIZ, Long.valueOf(c4193d.LJI));
                    List<C4197i> list = c4193d.LJIIIIZZ;
                    ArrayList<C4197i> arrayList = new ArrayList();
                    for (Object obj : list) {
                        if (((C4197i) obj).LIZIZ != null) {
                            arrayList.add(obj);
                        }
                    }
                    for (C4197i c4197i2 : arrayList) {
                        C86726KFk c86726KFk = this.this$0;
                        String str = this.$panel;
                        String str2 = c4197i2.LIZJ;
                        Float f2 = c4197i2.LIZIZ;
                        if (f2 != null) {
                            f = f2.floatValue();
                        } else {
                            f = 0.0f;
                        }
                        c86726KFk.LIZ(str, sticker, str2, f, Long.valueOf(c4193d.LJI));
                    }
                    return;
                }
            }
        }
        this.this$0.LIZ(this.$panel, sticker, c4193d.LJIIIZ, c4193d.LJIIIZ, Long.valueOf(c4193d.LJI));
    }
}
