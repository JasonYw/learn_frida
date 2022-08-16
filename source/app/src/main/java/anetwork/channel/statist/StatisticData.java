package anetwork.channel.statist;

import anet.channel.util.StringUtils;
import com.bytedance.covode.number.Covode;
import java.io.Serializable;

/* loaded from: classes20.dex */
public class StatisticData implements Serializable, Cloneable {
    public static final long serialVersionUID = -3538602124202475612L;
    public long cacheTime;
    public long dataSpeed;
    public int dnsTime;
    public long firstDataTime;
    public int isDNSTimeout;
    public boolean isRequestSuccess;
    public boolean isSSL;
    public boolean isSpdy;
    public String locationUrl;
    public String netStatSum;
    public long netTime;
    public long oneWayTime_AEngine;
    public long oneWayTime_ANet;
    public long oneWayTime_Jni;
    public long postBodyTime;
    public long processTime;
    public String quicConnectionID;
    public long recDataTime;
    public long receiveDataTime;
    public int redirectTime;
    public long responseBodySize;
    public int resultCode;
    public int retryTime;
    public long rtt;
    public long sendBeforeTime;
    public long sendSize;
    public long serverRT;
    public long spdyWaitTime;
    public long tcpConnTime;
    public long tcpLinkDate;
    public long totalSize;
    public String connectionType = "";
    public String host = "";
    public String api_v = "";
    public String ip_port = "";
    public String timeoutType = "";

    static {
        Covode.recordClassIndex(2477);
    }

    public String toString() {
        if (StringUtils.isBlank(this.netStatSum)) {
            StringBuilder sb = new StringBuilder(128);
            sb.append("isSuccess=");
            sb.append(this.isRequestSuccess);
            sb.append(",host=");
            sb.append(this.host);
            sb.append(",resultCode=");
            sb.append(this.resultCode);
            sb.append(",connType=");
            sb.append(this.connectionType);
            sb.append(",oneWayTime_ANet=");
            sb.append(this.oneWayTime_ANet);
            sb.append(",ip_port=");
            sb.append(this.ip_port);
            sb.append(",isSSL=");
            sb.append(this.isSSL);
            sb.append(",cacheTime=");
            sb.append(this.cacheTime);
            sb.append(",processTime=");
            sb.append(this.processTime);
            sb.append(",sendBeforeTime=");
            sb.append(this.sendBeforeTime);
            sb.append(",postBodyTime=");
            sb.append(this.postBodyTime);
            sb.append(",firstDataTime=");
            sb.append(this.firstDataTime);
            sb.append(",recDataTime=");
            sb.append(this.recDataTime);
            sb.append(",serverRT=");
            sb.append(this.serverRT);
            sb.append(",rtt=");
            sb.append(this.rtt);
            sb.append(",sendSize=");
            sb.append(this.sendSize);
            sb.append(",totalSize=");
            sb.append(this.totalSize);
            sb.append(",dataSpeed=");
            sb.append(this.dataSpeed);
            sb.append(",retryTime=");
            sb.append(this.retryTime);
            this.netStatSum = sb.toString();
        }
        return "StatisticData [" + this.netStatSum + "]";
    }
}
