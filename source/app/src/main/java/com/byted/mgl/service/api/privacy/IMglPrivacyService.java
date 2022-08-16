package com.byted.mgl.service.api.privacy;

import com.byted.mgl.service.api.privacy.audio.IPrivacyAudio;
import com.byted.mgl.service.api.privacy.camera.IPrivacyCamera;
import com.byted.mgl.service.api.privacy.clipboard.IPrivacyClipboard;
import com.byted.mgl.service.api.privacy.device.IPrivacyDeviceInfo;
import com.byted.mgl.service.api.privacy.installer.IPrivacyInstaller;
import com.byted.mgl.service.api.privacy.location.IPrivacyLocation;
import com.byted.mgl.service.api.privacy.media.IPrivacyMedia;
import com.byted.mgl.service.api.privacy.permission.IPrivacyPermission;
import com.byted.mgl.service.api.privacy.security.ISecurityBridgeControl;
import com.bytedance.covode.number.Covode;
import com.bytedance.minigame.bdpbase.service.IBdpService;

/* loaded from: classes15.dex */
public interface IMglPrivacyService extends IBdpService {
    static {
        Covode.recordClassIndex(9797);
    }

    IPrivacyAudio getAudioDelegate();

    ISecurityBridgeControl getBridgeControlDelegate();

    IPrivacyCamera getCameraDelegate();

    IPrivacyClipboard getClipboardDelegate();

    IPrivacyDeviceInfo getDeviceInfoDelegate();

    IPrivacyInstaller getInstallerDelegate();

    IPrivacyLocation getLocationDelegate();

    IPrivacyMedia getMediaDelegate();

    IPrivacyPermission getPermissionDelegate();
}
