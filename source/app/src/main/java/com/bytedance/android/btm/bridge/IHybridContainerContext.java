package com.bytedance.android.btm.bridge;

import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.xbridge.model.context.XContextProviderFactory;

/* loaded from: classes18.dex */
public interface IHybridContainerContext {
    public static final Companion Companion = Companion.$$INSTANCE;

    static {
        Covode.recordClassIndex(11341);
    }

    String getHybridContainerType(XContextProviderFactory xContextProviderFactory);

    View obtainView(XContextProviderFactory xContextProviderFactory);

    /* loaded from: classes18.dex */
    public static final class Companion {
        public static final /* synthetic */ Companion $$INSTANCE = new Companion();

        static {
            Covode.recordClassIndex(11342);
        }
    }
}
