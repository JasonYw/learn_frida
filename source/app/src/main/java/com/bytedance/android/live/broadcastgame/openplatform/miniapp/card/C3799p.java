package com.bytedance.android.live.broadcastgame.openplatform.miniapp.card;

import android.os.SystemClock;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.unisus.uniservice.logger.LoggerUtil;
import java.util.ArrayList;
import java.util.LinkedList;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.functions.Function1;
import p003X.C106862S5w;
import p003X.C87818Kiy;

/* renamed from: com.bytedance.android.live.broadcastgame.openplatform.miniapp.card.p */
/* loaded from: classes5.dex */
public final class C3799p {
    public static ChangeQuickRedirect LIZ;
    public final LinkedList<AbstractC3798o> LIZIZ = new LinkedList<>();
    public volatile boolean LIZJ;
    public long LIZLLL;

    static {
        Covode.recordClassIndex(21646);
    }

    public final synchronized void LIZ() {
        String str;
        MethodCollector.m14708i(1512);
        boolean z = false;
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 3).isSupported) {
            MethodCollector.m14707o(1512);
            return;
        }
        this.LIZLLL = SystemClock.uptimeMillis();
        AbstractC3798o poll = this.LIZIZ.poll();
        if (poll != null) {
            z = true;
        }
        this.LIZJ = z;
        StringBuilder sb = new StringBuilder("执行队列任务 ");
        if (poll == null) {
            str = null;
        } else {
            str = poll.LIZ;
        }
        sb.append(str);
        if (poll != null) {
            poll.LIZ(this);
            MethodCollector.m14707o(1512);
            return;
        }
        MethodCollector.m14707o(1512);
    }

    private synchronized void LIZ(long j) {
        MethodCollector.m14708i(1513);
        if (PatchProxy.proxy(new Object[]{new Long(j)}, this, LIZ, false, 4).isSupported) {
            MethodCollector.m14707o(1513);
            return;
        }
        if (SystemClock.uptimeMillis() - this.LIZLLL >= j) {
            this.LIZIZ.clear();
        }
        MethodCollector.m14707o(1513);
    }

    public final synchronized C3799p LIZ(String str, Function1<? super C3799p, Unit> function1) {
        MethodCollector.m14708i(1511);
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str, function1}, this, LIZ, false, 1);
        if (proxy.isSupported) {
            C3799p c3799p = (C3799p) proxy.result;
            MethodCollector.m14707o(1511);
            return c3799p;
        }
        C106862S5w.LIZ(str, function1);
        C87818Kiy c87818Kiy = new C87818Kiy(this, function1, str, str);
        this.LIZIZ.offer(c87818Kiy);
        StringBuilder sb = new StringBuilder("添加队列任务 ");
        sb.append(c87818Kiy.LIZ);
        sb.append(LoggerUtil.BLANK_TAG);
        StringBuilder sb2 = new StringBuilder("队列中的任务");
        sb2.append(this.LIZIZ.size());
        sb2.append(" \n ");
        LinkedList<AbstractC3798o> linkedList = this.LIZIZ;
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(linkedList, 10));
        for (AbstractC3798o abstractC3798o : linkedList) {
            arrayList.add(abstractC3798o.LIZ);
        }
        sb2.append(arrayList);
        if (!this.LIZJ) {
            LIZ();
        }
        MethodCollector.m14707o(1511);
        return this;
    }

    public static /* synthetic */ void LIZ(C3799p c3799p, long j, int i, Object obj) {
        if (PatchProxy.proxy(new Object[]{c3799p, 0L, 1, null}, null, LIZ, true, 5).isSupported) {
            return;
        }
        c3799p.LIZ(10000L);
    }
}
