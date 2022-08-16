package com.bytedance.android.live.core.tetris.layer.core;

import com.bytedance.android.live.core.tetris.layer.AbstractC4092b;
import com.bytedance.android.live.core.tetris.layer.core.delegate.LayerDelegate;
import com.bytedance.android.live.core.tetris.layer.core.descriptor.C4100c;
import com.bytedance.android.live.core.tetris.layer.core.element.Element;
import com.bytedance.android.live.core.tetris.layer.initialization.LayerIndex;
import com.bytedance.covode.number.Covode;
import p003X.C2QT;

/* renamed from: com.bytedance.android.live.core.tetris.layer.core.a */
/* loaded from: classes12.dex */
public interface AbstractC4093a {
    static {
        Covode.recordClassIndex(23638);
    }

    Element<?> LIZ(C4100c c4100c);

    void LIZ(C2QT<AbstractC4092b> c2qt);

    LayerDelegate<? extends AbstractC4093a, ? extends AbstractC4092b> getLayerDelegate();

    LayerIndex getLayerIndex();
}
