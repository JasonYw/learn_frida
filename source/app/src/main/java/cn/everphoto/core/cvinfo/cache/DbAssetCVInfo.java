package cn.everphoto.core.cvinfo.cache;

import com.bytedance.covode.number.Covode;
import com.p1594ss.android.ttve.model.VEMomentsBimResult;
import java.util.List;

/* loaded from: classes13.dex */
public class DbAssetCVInfo {
    public String assetId;
    public float[] c3Feature;
    public VEMomentsBimResult.FaceFeature[] faceFeatures;
    public float[][] faceVerifyFeatures;
    public boolean isLeader;
    public boolean isPorn;
    public String localPath;
    public VEMomentsBimResult.MomentTag[] momentTags;
    public List<Integer> peopleIds;
    public VEMomentsBimResult.ReframeInfo[] reFrameInfos;
    public VEMomentsBimResult.ScoreInfo[] scoreInfos;
    public byte[] similarityFeature;
    public int similarityId;
    public long takenTime;
    public VEMomentsBimResult.ScoreInfo totalScoreInfo;

    static {
        Covode.recordClassIndex(3540);
    }
}
