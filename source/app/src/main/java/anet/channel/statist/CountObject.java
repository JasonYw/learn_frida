package anet.channel.statist;

import com.bytedance.covode.number.Covode;

/* loaded from: classes13.dex */
public class CountObject {
    public String arg;
    public String module;
    public String modulePoint;
    public double value;

    static {
        Covode.recordClassIndex(2264);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(64);
        sb.append("[module:");
        sb.append(this.module);
        sb.append(" modulePoint:");
        sb.append(this.modulePoint);
        sb.append(" arg:");
        sb.append(this.arg);
        sb.append(" value:");
        sb.append(this.value);
        sb.append("]");
        return sb.toString();
    }
}
