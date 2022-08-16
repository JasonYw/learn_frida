package com.bytedance.android.btm.api;

import com.bytedance.covode.number.Covode;
import kotlin.annotation.AnnotationRetention;
import kotlin.annotation.AnnotationTarget;
import kotlin.annotation.Retention;
import kotlin.annotation.Target;

@Target(allowedTargets = {AnnotationTarget.CLASS, AnnotationTarget.VALUE_PARAMETER})
@Retention(AnnotationRetention.RUNTIME)
/* loaded from: classes18.dex */
public @interface BtmHybridContainer {
    static {
        Covode.recordClassIndex(11272);
    }
}
