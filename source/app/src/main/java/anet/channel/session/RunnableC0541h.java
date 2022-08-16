package anet.channel.session;

import androidx.core.view.accessibility.AccessibilityEventCompat;
import anet.channel.strategy.ConnEvent;
import anet.channel.strategy.IConnStrategy;
import anet.channel.strategy.IStrategyInstance;
import anet.channel.strategy.StrategyCenter;
import anet.channel.util.ALog;
import com.bytedance.covode.number.Covode;

/* renamed from: anet.channel.session.h */
/* loaded from: classes2.dex */
public class RunnableC0541h implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ TnetSpdySession f20657a;

    static {
        Covode.recordClassIndex(2258);
    }

    @Override // java.lang.Runnable
    public void run() {
        String str;
        IConnStrategy iConnStrategy;
        if (this.f20657a.f20636y) {
            ALog.m20786e("awcn.TnetSpdySession", "send msg time out!", this.f20657a.f20360p, "pingUnRcv:", Boolean.valueOf(this.f20657a.f20636y));
            try {
                this.f20657a.handleCallbacks(AccessibilityEventCompat.TYPE_WINDOW_CONTENT_CHANGED, null);
                if (this.f20657a.f20361q != null) {
                    this.f20657a.f20361q.closeReason = "ping time out";
                }
                ConnEvent connEvent = new ConnEvent();
                connEvent.isSuccess = false;
                connEvent.isAccs = this.f20657a.f20633I;
                IStrategyInstance strategyCenter = StrategyCenter.getInstance();
                str = this.f20657a.f20348d;
                iConnStrategy = this.f20657a.f20355k;
                strategyCenter.notifyConnEvent(str, iConnStrategy, connEvent);
                this.f20657a.close(true);
            } catch (Exception unused) {
            }
        }
    }

    public RunnableC0541h(TnetSpdySession tnetSpdySession) {
        this.f20657a = tnetSpdySession;
    }
}
