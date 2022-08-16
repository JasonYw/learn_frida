package com.bytedance.android.live.broadcast.gamedetailv2.widget;

import com.bytedance.covode.number.Covode;
import com.bytedance.ugc.glue.monitor.UGCMonitor;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.reflect.KProperty1;

/* loaded from: classes5.dex */
public final /* synthetic */ class GameDetailCommentWidget$onUpdate$1 extends PropertyReference1Impl {
    public static final KProperty1 INSTANCE = new GameDetailCommentWidget$onUpdate$1();

    static {
        Covode.recordClassIndex(16738);
    }

    public GameDetailCommentWidget$onUpdate$1() {
        super(C3138a.class, UGCMonitor.EVENT_COMMENT, "getComment()Ljava/util/List;", 0);
    }

    @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
    public final Object get(Object obj) {
        return ((C3138a) obj).f25901LJ;
    }
}
