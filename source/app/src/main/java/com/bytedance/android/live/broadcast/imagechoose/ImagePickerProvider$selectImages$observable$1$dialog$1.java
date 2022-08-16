package com.bytedance.android.live.broadcast.imagechoose;

import com.bytedance.android.live.broadcast.api.model.C2917q;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import io.reactivex.ObservableEmitter;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import p003X.C106862S5w;

/* loaded from: classes28.dex */
public final class ImagePickerProvider$selectImages$observable$1$dialog$1 extends Lambda implements Function1<ArrayList<C2917q>, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ Ref.BooleanRef $confirm;
    public final /* synthetic */ ObservableEmitter $emitter;

    static {
        Covode.recordClassIndex(16794);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ImagePickerProvider$selectImages$observable$1$dialog$1(Ref.BooleanRef booleanRef, ObservableEmitter observableEmitter) {
        super(1);
        this.$confirm = booleanRef;
        this.$emitter = observableEmitter;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(ArrayList<C2917q> arrayList) {
        if (!PatchProxy.proxy(new Object[]{arrayList}, this, changeQuickRedirect, false, 1).isSupported) {
            C106862S5w.LIZ(arrayList);
            this.$confirm.element = true;
            this.$emitter.onNext(arrayList);
            this.$emitter.onComplete();
        }
        return Unit.INSTANCE;
    }
}
