package com.bytedance.android.live.base.model.media;

import android.text.TextUtils;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import p003X.C109391T5d;

/* loaded from: classes11.dex */
public class VideoModel {
    public static final CoverType DEFAULT_COVER_TYPE = CoverType.LARGE;
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("allow_cache")
    public boolean allowCache;
    @SerializedName("avg_color")
    public int avgColor;
    @SerializedName("cover_medium")
    public ImageModel coverMediumModel;
    @SerializedName("cover")
    public ImageModel coverModel;
    @SerializedName("cover_thumb")
    public ImageModel coverThumbModel;
    @SerializedName("download_url")
    public List<String> downloadList;
    @SerializedName("duration")
    public double duration;
    @SerializedName(alternate = {"dynamic_cover"}, value = "cover_animated")
    public ImageModel dynamicCoverModel;
    @SerializedName("first_frame")
    public ImageModel firstFrame;
    @SerializedName("gif_type")
    public int gifType;
    @SerializedName("gif_url_list")
    public List<String> gifUrlList;
    @SerializedName(C109391T5d.LJFF)
    public int height;
    @SerializedName("long_duration")
    public float longDuration;
    @SerializedName("long_uri")
    public String longUri;
    @SerializedName("long_url")
    public List<String> longUrls;
    @SerializedName("quality_info")
    public List<Object> qualityInfo;
    @SerializedName("uri")
    public String uri;
    @SerializedName("url_list")
    public List<String> urlList;
    @SerializedName("videoLocalPath")
    public String videoLocalPath;
    @SerializedName("watermark")
    public boolean waterMark;
    @SerializedName("width")
    public int width;
    @SerializedName("preload_size")
    public int preloadSize = 512000;
    public CoverType mCoverType = DEFAULT_COVER_TYPE;

    public List<Object> getBitRate() {
        return this.qualityInfo;
    }

    public ImageModel getCoverMediumModel() {
        return this.coverMediumModel;
    }

    public ImageModel getCoverModel() {
        return this.coverModel;
    }

    public ImageModel getCoverThumbModel() {
        return this.coverThumbModel;
    }

    public CoverType getCoverType() {
        return this.mCoverType;
    }

    public List<String> getDownloadList() {
        return this.downloadList;
    }

    public double getDuration() {
        return this.duration;
    }

    public ImageModel getDynamicCoverModel() {
        return this.dynamicCoverModel;
    }

    public ImageModel getFirstFrame() {
        return this.firstFrame;
    }

    public int getGifType() {
        return this.gifType;
    }

    public List<String> getGifUrlList() {
        return this.gifUrlList;
    }

    public int getHeight() {
        return this.height;
    }

    public float getLongDuration() {
        return this.longDuration;
    }

    public String getLongUri() {
        return this.longUri;
    }

    public List<String> getLongUrls() {
        return this.longUrls;
    }

    public int getPreloadSize() {
        return this.preloadSize;
    }

    public List<Object> getQualityInfo() {
        return this.qualityInfo;
    }

    public String getUri() {
        return this.uri;
    }

    public List<String> getUrlList() {
        return this.urlList;
    }

    public String getVideoLocalPath() {
        return this.videoLocalPath;
    }

    public int getWidth() {
        return this.width;
    }

    public boolean isAllowCache() {
        return this.allowCache;
    }

    public boolean isWaterMark() {
        return this.waterMark;
    }

    static {
        Covode.recordClassIndex(14091);
    }

    /* loaded from: classes10.dex */
    public enum CoverType {
        LARGE,
        MEDIUM,
        THUMB;
        
        public static ChangeQuickRedirect changeQuickRedirect;

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static CoverType[] valuesCustom() {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 1);
            if (proxy.isSupported) {
                return (CoverType[]) proxy.result;
            }
            return (CoverType[]) values().clone();
        }

        static {
            Covode.recordClassIndex(14092);
        }

        public static CoverType valueOf(String str) {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 2);
            if (proxy.isSupported) {
                return (CoverType) proxy.result;
            }
            return (CoverType) Enum.valueOf(CoverType.class, str);
        }
    }

    public String getUnbitratedUri() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return (String) proxy.result;
        }
        if (TextUtils.isEmpty(getUri())) {
            return "";
        }
        return getUri();
    }

    public void setAllowCache(boolean z) {
        this.allowCache = z;
    }

    public void setCoverMediumModel(ImageModel imageModel) {
        this.coverMediumModel = imageModel;
    }

    public void setCoverModel(ImageModel imageModel) {
        this.coverModel = imageModel;
    }

    public void setCoverThumbModel(ImageModel imageModel) {
        this.coverThumbModel = imageModel;
    }

    public void setCoverType(CoverType coverType) {
        this.mCoverType = coverType;
    }

    public void setDownloadList(List<String> list) {
        this.downloadList = list;
    }

    public void setDuration(double d) {
        this.duration = d;
    }

    public void setDynamicCoverModel(ImageModel imageModel) {
        this.dynamicCoverModel = imageModel;
    }

    public void setFirstFrame(ImageModel imageModel) {
        this.firstFrame = imageModel;
    }

    public void setGifType(int i) {
        this.gifType = i;
    }

    public void setGifUrlList(List<String> list) {
        this.gifUrlList = list;
    }

    public void setHeight(int i) {
        this.height = i;
    }

    public void setLongDuration(float f) {
        this.longDuration = f;
    }

    public void setLongUri(String str) {
        this.longUri = str;
    }

    public void setLongUrls(List<String> list) {
        this.longUrls = list;
    }

    public void setPreloadSize(int i) {
        this.preloadSize = i;
    }

    public void setQualityInfo(List<Object> list) {
        this.qualityInfo = list;
    }

    public void setUri(String str) {
        this.uri = str;
    }

    public void setUrlList(List<String> list) {
        this.urlList = list;
    }

    public void setVideoLocalPath(String str) {
        this.videoLocalPath = str;
    }

    public void setWaterMark(boolean z) {
        this.waterMark = z;
    }

    public void setWidth(int i) {
        this.width = i;
    }
}
