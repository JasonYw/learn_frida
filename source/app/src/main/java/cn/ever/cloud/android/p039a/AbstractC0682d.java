package cn.ever.cloud.android.p039a;

import cn.ever.cloud.android.entity.ToDelAsset;
import com.bytedance.covode.number.Covode;
import java.util.List;

/* renamed from: cn.ever.cloud.android.a.d */
/* loaded from: classes23.dex */
public interface AbstractC0682d {
    static {
        Covode.recordClassIndex(2746);
    }

    List<ToDelAsset> batchGet();

    void delete(List<ToDelAsset> list);

    void insert(ToDelAsset toDelAsset);
}
