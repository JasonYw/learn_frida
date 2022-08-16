package anet.channel.strategy;

import android.text.TextUtils;
import anet.channel.strategy.C0568l;
import com.bytedance.covode.number.Covode;
import com.bytedance.unisus.uniservice.logger.LoggerUtil;
import java.io.Serializable;

/* loaded from: classes2.dex */
public class IPConnStrategy implements IConnStrategy, Serializable {

    /* renamed from: a */
    public volatile int f20698a = 1;

    /* renamed from: b */
    public volatile int f20699b = 1;

    /* renamed from: c */
    public transient boolean f20700c;
    public volatile int cto;
    public volatile int heartbeat;

    /* renamed from: ip */
    public final String f20701ip;
    public final int port;
    public final ConnProtocol protocol;
    public volatile int retry;
    public volatile int rto;

    static {
        Covode.recordClassIndex(2296);
    }

    @Override // anet.channel.strategy.IConnStrategy
    public int getConnectionTimeout() {
        return this.cto;
    }

    @Override // anet.channel.strategy.IConnStrategy
    public int getHeartbeat() {
        return this.heartbeat;
    }

    @Override // anet.channel.strategy.IConnStrategy
    public String getIp() {
        return this.f20701ip;
    }

    @Override // anet.channel.strategy.IConnStrategy
    public int getIpSource() {
        return this.f20699b;
    }

    @Override // anet.channel.strategy.IConnStrategy
    public int getIpType() {
        return this.f20698a;
    }

    @Override // anet.channel.strategy.IConnStrategy
    public int getPort() {
        return this.port;
    }

    @Override // anet.channel.strategy.IConnStrategy
    public ConnProtocol getProtocol() {
        return this.protocol;
    }

    @Override // anet.channel.strategy.IConnStrategy
    public int getReadTimeout() {
        return this.rto;
    }

    @Override // anet.channel.strategy.IConnStrategy
    public int getRetryTimes() {
        return this.retry;
    }

    public int getUniqueId() {
        return hashCode();
    }

    public int hashCode() {
        return ((((this.f20701ip.hashCode() + 527) * 31) + this.port) * 31) + this.protocol.hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(32);
        sb.append('{');
        sb.append(this.f20701ip);
        if (this.f20698a == 0) {
            sb.append("(*)");
        }
        sb.append(LoggerUtil.BLANK_TAG);
        sb.append(this.port);
        sb.append(LoggerUtil.BLANK_TAG);
        sb.append(this.protocol);
        sb.append('}');
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof IPConnStrategy)) {
            IPConnStrategy iPConnStrategy = (IPConnStrategy) obj;
            if (this.port == iPConnStrategy.port && this.f20701ip.equals(iPConnStrategy.f20701ip) && this.protocol.equals(iPConnStrategy.protocol)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public static IPConnStrategy m20869a(String str, C0568l.C0569a c0569a) {
        ConnProtocol valueOf = ConnProtocol.valueOf(c0569a);
        if (valueOf == null) {
            return null;
        }
        return m20870a(str, c0569a.f20771a, valueOf, c0569a.f20773c, c0569a.f20774d, c0569a.f20775e, c0569a.f20776f);
    }

    public IPConnStrategy(String str, int i, ConnProtocol connProtocol, int i2, int i3, int i4, int i5) {
        this.f20701ip = str;
        this.port = i;
        this.protocol = connProtocol;
        this.cto = i2;
        this.rto = i3;
        this.retry = i4;
        this.heartbeat = i5;
    }

    /* renamed from: a */
    public static IPConnStrategy m20870a(String str, int i, ConnProtocol connProtocol, int i2, int i3, int i4, int i5) {
        if (!TextUtils.isEmpty(str) && connProtocol != null && i > 0) {
            return new IPConnStrategy(str, i, connProtocol, i2, i3, i4, i5);
        }
        return null;
    }
}
