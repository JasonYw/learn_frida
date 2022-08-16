package cn.everphoto.model;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.unisus.uniservice.logger.LoggerUtil;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p003X.C106862S5w;

/* loaded from: classes4.dex */
public final class EpTemplate implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final MergedTemplateItem mergedTemplateItem;
    public final String meta;
    public final MusicEditInfo musicEditInfo;
    public final List<SegmentInfo> segmentInfoS;

    static {
        Covode.recordClassIndex(3617);
    }

    public final MergedTemplateItem getMergedTemplateItem() {
        return this.mergedTemplateItem;
    }

    public final String getMeta() {
        return this.meta;
    }

    public final MusicEditInfo getMusicEditInfo() {
        return this.musicEditInfo;
    }

    public final List<SegmentInfo> getSegmentInfoS() {
        return this.segmentInfoS;
    }

    public final String toString() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return (String) proxy.result;
        }
        return "EpTemplate(mergedTemplateItem=" + this.mergedTemplateItem + ", segmentInfoS=" + this.segmentInfoS + ", musicEditInfo=" + this.musicEditInfo + ", meta=" + this.meta + LoggerUtil.S_RIGHT_TAG;
    }

    public EpTemplate(MergedTemplateItem mergedTemplateItem, List<SegmentInfo> list, MusicEditInfo musicEditInfo, String str) {
        C106862S5w.LIZ(mergedTemplateItem, list);
        this.mergedTemplateItem = mergedTemplateItem;
        this.segmentInfoS = list;
        this.musicEditInfo = musicEditInfo;
        this.meta = str;
    }

    public /* synthetic */ EpTemplate(MergedTemplateItem mergedTemplateItem, List list, MusicEditInfo musicEditInfo, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(mergedTemplateItem, list, (i & 4) != 0 ? null : musicEditInfo, (i & 8) != 0 ? null : str);
    }
}
