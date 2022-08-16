package com.bytedance.android.live.base.model.media;

import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.media.VideoModel;
import com.bytedance.android.live.base.model.share.ShareSourceInfo;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.google.gson.annotations.SerializedName;
import com.umeng.commonsdk.vchannel.C33968a;
import com.xiaomi.mipush.sdk.MiPushMessage;
import java.util.List;
import p003X.C132430bOG;
import p003X.UEV;
import p003X.UEW;

/* loaded from: classes11.dex */
public class Media implements AbstractC2846d {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("ad_info")
    public MediaAdInfo adInfo;
    @SerializedName("at_users")
    public List<TextExtraStruct> aiteUserItems;
    @SerializedName("allow_comment")
    public boolean allowComment;
    @SerializedName("allow_dislike")
    public boolean allowDislike;
    @SerializedName("allow_share")
    public boolean allowShare;
    public long apiTime;
    @SerializedName("author")
    public User author;
    @SerializedName("auto_play")
    public int autoPlay;
    @SerializedName("cell_height")
    public int cellHeight;
    @SerializedName("cell_style")
    public int cellStyle;
    @SerializedName("cell_width")
    public int cellWidth;
    @SerializedName("comment_delay")
    public int commentDelay;
    @SerializedName("comment_prompts")
    public String commentPrompts;
    @SerializedName("commerce")
    public UEW commerce;
    @SerializedName("create_time")
    public long createTime;
    public long danmakuShowTime;
    @SerializedName("private_info")
    public MediaDebugInfo debugInfo;
    @SerializedName(MiPushMessage.KEY_DESC)
    public String description;
    @SerializedName("display_style")
    public int displayStyle;
    @SerializedName("enable_send_flame")
    public boolean enableSendFlame;
    @SerializedName("feed_tips")
    public String feedTips;
    @SerializedName("feed_tips_type")
    public int feedTipsType;
    @SerializedName("from_ad")
    public boolean fromAd;
    @SerializedName("guide_card_id")
    public int guideCardId;
    @SerializedName("has_free_flame")
    public boolean hasFreeFlame;
    @SerializedName("has_sync_aweme")
    public boolean hasSyncAweme;
    @SerializedName("hashtag")
    public UEV hashTag;
    @SerializedName("hide_nickname")
    public boolean hideNickName;
    @SerializedName(C33968a.f42937f)

    /* renamed from: id */
    public long f25750id;
    public boolean isDeleted;
    @SerializedName("is_rich")
    public int isRich;
    @SerializedName("stats")
    public MediaItemStats itemStats;
    @SerializedName("location")
    public String location;
    public int mDetailType;
    @SerializedName("mark")
    public VideoMark mark;
    @SerializedName("recommend_reason")
    public MediaRecommendReason mediaRecommendReason;
    @SerializedName("media_type")
    public int mediaType;
    @SerializedName("song")
    public C132430bOG music;
    @SerializedName("new_cell_style")
    public int newCellStyle;
    public boolean noNeedQuery;
    @SerializedName("position")
    public String position;
    @SerializedName("share_description")
    public String shareDesc;
    @SerializedName("share_enable")
    public boolean shareEnable;
    @SerializedName("share_prompts")
    public String sharePrompts;
    @SerializedName("share_source_info")
    public ShareSourceInfo shareSourceInfo;
    @SerializedName("share_strong_guide")
    public int shareStrongGuide;
    @SerializedName("share_text")
    public String shareText;
    @SerializedName("share_tips")
    public String shareTips;
    @SerializedName("share_title")
    public String shareTitle;
    @SerializedName("share_url")
    public String shareUrl;
    @SerializedName("status")
    public int status;
    @SerializedName("title")
    public String text;
    @SerializedName("tips")
    public String tips;
    @SerializedName("tips_url")
    public String tipsUrl;
    @SerializedName("user_bury")
    public int userBury;
    @SerializedName("user_digg")
    public int userDigg;
    @SerializedName("video")
    public VideoModel videoModel;
    @SerializedName("video_pic_num")
    public int videoPicNum;
    @SerializedName("weibo_share_title")
    public String weiboShareTitle;

    static {
        Covode.recordClassIndex(14083);
    }

    public String getPlayKey() {
        return null;
    }

    public boolean isNativeAd() {
        return false;
    }

    public MediaAdInfo getAdInfo() {
        return this.adInfo;
    }

    public List<TextExtraStruct> getAiteUserItems() {
        return this.aiteUserItems;
    }

    public long getApiTime() {
        return this.apiTime;
    }

    public User getAuthor() {
        return this.author;
    }

    public int getAutoPlay() {
        return this.autoPlay;
    }

    public int getCellHeight() {
        return this.cellHeight;
    }

    public int getCellStyle() {
        return this.cellStyle;
    }

    public int getCellWidth() {
        return this.cellWidth;
    }

    public int getCommentDelay() {
        return this.commentDelay;
    }

    public String getCommentPrompts() {
        return this.commentPrompts;
    }

    public UEW getCommerce() {
        return this.commerce;
    }

    public long getCreateTime() {
        return this.createTime;
    }

    public long getDanmakuShowTime() {
        return this.danmakuShowTime;
    }

    public MediaDebugInfo getDebugInfo() {
        return this.debugInfo;
    }

    public String getDescription() {
        return this.description;
    }

    public int getDetailType() {
        return this.mDetailType;
    }

    public int getDisplayStyle() {
        return this.displayStyle;
    }

    public String getFeedTips() {
        return this.feedTips;
    }

    public int getFeedTipsType() {
        return this.feedTipsType;
    }

    public int getGuideCardId() {
        return this.guideCardId;
    }

    public UEV getHashTag() {
        return this.hashTag;
    }

    public long getId() {
        return this.f25750id;
    }

    public int getIsRich() {
        return this.isRich;
    }

    public MediaItemStats getItemStats() {
        return this.itemStats;
    }

    public String getLocation() {
        return this.location;
    }

    public VideoMark getMark() {
        return this.mark;
    }

    public MediaRecommendReason getMediaRecommendReason() {
        return this.mediaRecommendReason;
    }

    public int getMediaType() {
        return this.mediaType;
    }

    public C132430bOG getMusic() {
        return this.music;
    }

    public int getNewCellStyle() {
        return this.newCellStyle;
    }

    public String getPosition() {
        return this.position;
    }

    public String getShareDesc() {
        return this.shareDesc;
    }

    public boolean getShareEnable() {
        return this.shareEnable;
    }

    public String getSharePrompts() {
        return this.sharePrompts;
    }

    public ShareSourceInfo getShareSourceInfo() {
        return this.shareSourceInfo;
    }

    public int getShareStrongGuide() {
        return this.shareStrongGuide;
    }

    public String getShareText() {
        return this.shareText;
    }

    public String getShareTips() {
        return this.shareTips;
    }

    public String getShareTitle() {
        return this.shareTitle;
    }

    public String getShareUrl() {
        return this.shareUrl;
    }

    public int getStatus() {
        return this.status;
    }

    public String getText() {
        return this.text;
    }

    public String getTips() {
        return this.tips;
    }

    public String getTipsUrl() {
        return this.tipsUrl;
    }

    public int getUserBury() {
        return this.userBury;
    }

    public int getUserDigg() {
        return this.userDigg;
    }

    @Override // com.bytedance.android.live.base.model.media.AbstractC2846d
    public VideoModel getVideoModel() {
        return this.videoModel;
    }

    public int getVideoPicNum() {
        return this.videoPicNum;
    }

    public String getWeiboShareTitle() {
        return this.weiboShareTitle;
    }

    public boolean isAllowComment() {
        return this.allowComment;
    }

    public boolean isAllowDislike() {
        return this.allowDislike;
    }

    public boolean isAllowShare() {
        return this.allowShare;
    }

    public boolean isDeleted() {
        return this.isDeleted;
    }

    public boolean isEnableSendFlame() {
        return this.enableSendFlame;
    }

    public boolean isFromAd() {
        return this.fromAd;
    }

    public boolean isHasFreeFlame() {
        return this.hasFreeFlame;
    }

    public boolean isHasSyncAweme() {
        return this.hasSyncAweme;
    }

    public boolean isHideNickName() {
        return this.hideNickName;
    }

    public boolean isNoNeedQuery() {
        return this.noNeedQuery;
    }

    public boolean isShareEnable() {
        return this.shareEnable;
    }

    public String getAdStatus() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 5);
        if (proxy.isSupported) {
            return (String) proxy.result;
        }
        if (isNativeAd()) {
            return "ad";
        }
        if (isFromAd()) {
            return "normal";
        }
        return "";
    }

    public ImageModel getVideoCoverImage() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return (ImageModel) proxy.result;
        }
        VideoModel videoModel = this.videoModel;
        if (videoModel != null) {
            if (videoModel.getCoverType() != VideoModel.CoverType.MEDIUM) {
                return this.videoModel.getCoverModel();
            }
            return this.videoModel.getCoverMediumModel();
        }
        return null;
    }

    public boolean isBitRate() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 4);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        if (getVideoModel() == null || getVideoModel().getQualityInfo() == null || getVideoModel().getQualityInfo().size() <= 1) {
            return false;
        }
        return true;
    }

    public void setAdInfo(MediaAdInfo mediaAdInfo) {
        this.adInfo = mediaAdInfo;
    }

    public void setAiteUserItems(List<TextExtraStruct> list) {
        this.aiteUserItems = list;
    }

    public void setAllowComment(boolean z) {
        this.allowComment = z;
    }

    public void setAllowDislike(boolean z) {
        this.allowDislike = z;
    }

    public void setAllowShare(boolean z) {
        this.allowShare = z;
    }

    public void setApiTime(long j) {
        this.apiTime = j;
    }

    public void setAuthor(User user) {
        this.author = user;
    }

    public void setAutoPlay(int i) {
        this.autoPlay = i;
    }

    public void setCellHeight(int i) {
        this.cellHeight = i;
    }

    public void setCellWidth(int i) {
        this.cellWidth = i;
    }

    public void setCommentDelay(int i) {
        this.commentDelay = i;
    }

    public void setCommentPrompts(String str) {
        this.commentPrompts = str;
    }

    public void setCommerce(UEW uew) {
        this.commerce = uew;
    }

    public void setCreateTime(long j) {
        this.createTime = j;
    }

    public void setDanmakuShowTime(long j) {
        this.danmakuShowTime = j;
    }

    public void setDebugInfo(MediaDebugInfo mediaDebugInfo) {
        this.debugInfo = mediaDebugInfo;
    }

    public void setDeleted(boolean z) {
        this.isDeleted = z;
    }

    public void setDescription(String str) {
        this.description = str;
    }

    public void setDetailType(int i) {
        this.mDetailType = i;
    }

    public void setDisplayStyle(int i) {
        this.displayStyle = i;
    }

    public void setEnableSendFlame(boolean z) {
        this.enableSendFlame = z;
    }

    public void setFeedTips(String str) {
        this.feedTips = str;
    }

    public void setFeedTipsType(int i) {
        this.feedTipsType = i;
    }

    public void setFromAd(boolean z) {
        this.fromAd = z;
    }

    public void setGuideCardId(int i) {
        this.guideCardId = i;
    }

    public void setHasFreeFlame(boolean z) {
        this.hasFreeFlame = z;
    }

    public void setHasSyncAweme(boolean z) {
        this.hasSyncAweme = z;
    }

    public void setHashTag(UEV uev) {
        this.hashTag = uev;
    }

    public void setHideNickName(boolean z) {
        this.hideNickName = z;
    }

    public void setId(long j) {
        this.f25750id = j;
    }

    public void setIsRich(int i) {
        this.isRich = i;
    }

    public void setItemStats(MediaItemStats mediaItemStats) {
        this.itemStats = mediaItemStats;
    }

    public void setLocation(String str) {
        this.location = str;
    }

    public void setMark(VideoMark videoMark) {
        this.mark = videoMark;
    }

    public void setMediaRecommendReason(MediaRecommendReason mediaRecommendReason) {
        this.mediaRecommendReason = mediaRecommendReason;
    }

    public void setMediaType(int i) {
        this.mediaType = i;
    }

    public void setMusic(C132430bOG c132430bOG) {
        this.music = c132430bOG;
    }

    public void setNewCellStyle(int i) {
        this.newCellStyle = i;
    }

    public void setNoNeedQuery(boolean z) {
        this.noNeedQuery = z;
    }

    public void setPosition(String str) {
        this.position = str;
    }

    public void setShareDesc(String str) {
        this.shareDesc = str;
    }

    public void setShareEnable(boolean z) {
        this.shareEnable = z;
    }

    public void setSharePrompts(String str) {
        this.sharePrompts = str;
    }

    public void setShareSourceInfo(ShareSourceInfo shareSourceInfo) {
        this.shareSourceInfo = shareSourceInfo;
    }

    public void setShareStrongGuide(int i) {
        this.shareStrongGuide = i;
    }

    public void setShareText(String str) {
        this.shareText = str;
    }

    public void setShareTips(String str) {
        this.shareTips = str;
    }

    public void setShareTitle(String str) {
        this.shareTitle = str;
    }

    public void setShareUrl(String str) {
        this.shareUrl = str;
    }

    public void setStatus(int i) {
        this.status = i;
    }

    public void setText(String str) {
        this.text = str;
    }

    public void setTips(String str) {
        this.tips = str;
    }

    public void setTipsUrl(String str) {
        this.tipsUrl = str;
    }

    public void setUserBury(int i) {
        this.userBury = i;
    }

    public void setUserDigg(int i) {
        this.userDigg = i;
    }

    public void setVideoModel(VideoModel videoModel) {
        this.videoModel = videoModel;
    }

    public void setVideoPicNum(int i) {
        this.videoPicNum = i;
    }

    public void setWeiboShareTitle(String str) {
        this.weiboShareTitle = str;
    }

    public void setCellStyle(int i) {
        if (i != 1 && i != 2 && i != 3) {
            i = 1;
        }
        this.cellStyle = i;
    }

    public void updateItemStats(MediaItemStats mediaItemStats) {
        if (PatchProxy.proxy(new Object[]{mediaItemStats}, this, changeQuickRedirect, false, 3).isSupported || mediaItemStats == null) {
            return;
        }
        MediaItemStats mediaItemStats2 = this.itemStats;
        if (mediaItemStats2 == null) {
            this.itemStats = mediaItemStats;
            return;
        }
        mediaItemStats2.setCommentCount(mediaItemStats.getCommentCount());
        this.itemStats.setDiggCount(Math.max(mediaItemStats.getDiggCount(), this.itemStats.getDiggCount()));
        this.itemStats.setPlayCount(Math.max(mediaItemStats.getPlayCount(), this.itemStats.getPlayCount()));
        this.itemStats.setShareCount(Math.max(mediaItemStats.getShareCount(), this.itemStats.getShareCount()));
    }

    public void update(Media media) {
        if (PatchProxy.proxy(new Object[]{media}, this, changeQuickRedirect, false, 2).isSupported || media == null || media.getId() != this.f25750id) {
            return;
        }
        this.text = media.text;
        this.createTime = media.createTime;
        this.userDigg = media.userDigg;
        this.userBury = media.userBury;
        this.mediaType = media.mediaType;
        this.status = media.status;
        updateItemStats(media.itemStats);
        User user = media.author;
        if (user != null) {
            this.author = user;
        }
        VideoModel videoModel = media.videoModel;
        if (videoModel != null) {
            this.videoModel = videoModel;
        }
        this.shareUrl = media.shareUrl;
        this.shareTitle = media.shareTitle;
        this.shareDesc = media.shareDesc;
        this.shareEnable = media.shareEnable;
        this.allowShare = media.allowShare;
        this.allowComment = media.allowComment;
        this.allowDislike = media.allowDislike;
        this.cellStyle = media.cellStyle;
        this.tips = media.tips;
        this.tipsUrl = media.tipsUrl;
        MediaDebugInfo mediaDebugInfo = media.debugInfo;
        if (mediaDebugInfo != null) {
            this.debugInfo = mediaDebugInfo;
        }
        VideoMark videoMark = media.mark;
        if (videoMark != null) {
            this.mark = videoMark;
        }
        this.shareText = media.shareText;
        this.cellHeight = media.cellHeight;
        this.cellWidth = media.cellWidth;
        this.feedTipsType = media.feedTipsType;
        this.feedTips = media.feedTips;
        this.location = media.location;
        this.displayStyle = media.displayStyle;
        this.commentDelay = media.commentDelay;
        this.guideCardId = media.guideCardId;
        this.sharePrompts = media.sharePrompts;
        this.commentPrompts = media.commentPrompts;
        this.weiboShareTitle = media.weiboShareTitle;
        this.shareTips = media.shareTips;
        this.enableSendFlame = media.enableSendFlame;
        this.hideNickName = media.hideNickName;
        this.music = media.music;
        this.videoPicNum = media.videoPicNum;
        this.apiTime = media.getApiTime();
        this.noNeedQuery = media.noNeedQuery;
        UEW uew = media.commerce;
        if (uew != null) {
            this.commerce = uew;
        }
    }
}
