package com.bytedance.android.live.core.utils.rxutils.autodispose;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.hotfix.base.ChangeQuickRedirect;

/* loaded from: classes23.dex */
public final class ExceptionHelper {
    public static ChangeQuickRedirect LIZ;
    public static final Throwable LIZIZ = new Termination();

    /* loaded from: classes23.dex */
    public static final class Termination extends Throwable {
        static {
            Covode.recordClassIndex(23994);
        }

        public Termination() {
            super("No further exceptions");
        }

        @Override // java.lang.Throwable
        public final synchronized Throwable fillInStackTrace() {
            MethodCollector.m14708i(1625);
            MethodCollector.m14707o(1625);
            return this;
        }
    }

    static {
        Covode.recordClassIndex(23993);
    }
}
