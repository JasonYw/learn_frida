package cn.ever.cloud.network.retrofit;

import com.bytedance.covode.number.Covode;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p003X.C106862S5w;

/* loaded from: classes8.dex */
public final class NetRequest {
    public final boolean addCommonParams;
    public final AbstractC0739b body;
    public final Object extraInfo;
    public final Map<String, String> headers;
    public final int maxLength;
    public final String method;
    public final int priorityLevel;
    public final boolean responseStreaming;
    public final String url;

    static {
        Covode.recordClassIndex(3254);
    }

    public final boolean getAddCommonParams() {
        return this.addCommonParams;
    }

    public final AbstractC0739b getBody() {
        return this.body;
    }

    public final Object getExtraInfo() {
        return this.extraInfo;
    }

    public final Map<String, String> getHeaders() {
        return this.headers;
    }

    public final int getMaxLength() {
        return this.maxLength;
    }

    public final String getMethod() {
        return this.method;
    }

    public final int getPriorityLevel() {
        return this.priorityLevel;
    }

    public final boolean getResponseStreaming() {
        return this.responseStreaming;
    }

    public final String getUrl() {
        return this.url;
    }

    public NetRequest(String str, String str2, Map<String, String> map, AbstractC0739b abstractC0739b, int i, boolean z, int i2, boolean z2, Object obj) {
        C106862S5w.LIZ(str, str2, map);
        this.method = str;
        this.url = str2;
        this.headers = map;
        this.body = abstractC0739b;
        this.priorityLevel = i;
        this.responseStreaming = z;
        this.maxLength = i2;
        this.addCommonParams = z2;
        this.extraInfo = obj;
    }

    public /* synthetic */ NetRequest(String str, String str2, Map map, AbstractC0739b abstractC0739b, int i, boolean z, int i2, boolean z2, Object obj, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, map, (i3 & 8) != 0 ? null : abstractC0739b, (i3 & 16) != 0 ? 0 : i, (i3 & 32) != 0 ? false : z, (i3 & 64) != 0 ? Integer.MAX_VALUE : i2, (i3 & 128) != 0 ? true : z2, (i3 & 256) == 0 ? obj : null);
    }
}
