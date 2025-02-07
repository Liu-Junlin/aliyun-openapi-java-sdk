/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.aliyuncs.ecd.model.v20200930;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.ecd.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class ModifyDesktopGroupRequest extends RpcAcsRequest<ModifyDesktopGroupResponse> {
	   

	private String classify;

	private String imageId;

	private String scaleStrategyId;

	private Boolean disableSessionConfig;

	private Long bindAmount;

	private Long loadPolicy;

	private String desktopGroupName;

	private Integer allowBufferCount;

	private List<String> policyGroupIdss;

	private Long idleDisconnectDuration;

	private String desktopGroupId;

	private Integer minDesktopsCount;

	private Integer maxDesktopsCount;

	private String fileSystemId;

	private Integer allowAutoSetup;

	private String comments;

	private Long resetType;

	private String ownBundleId;

	private Long stopDuration;

	private Float ratioThreshold;

	private Long keepDuration;

	private Long connectDuration;

	private Boolean profileFollowSwitch;

	private Integer buyDesktopsCount;

	private String policyGroupId;
	public ModifyDesktopGroupRequest() {
		super("ecd", "2020-09-30", "ModifyDesktopGroup");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getClassify() {
		return this.classify;
	}

	public void setClassify(String classify) {
		this.classify = classify;
		if(classify != null){
			putQueryParameter("Classify", classify);
		}
	}

	public String getImageId() {
		return this.imageId;
	}

	public void setImageId(String imageId) {
		this.imageId = imageId;
		if(imageId != null){
			putQueryParameter("ImageId", imageId);
		}
	}

	public String getScaleStrategyId() {
		return this.scaleStrategyId;
	}

	public void setScaleStrategyId(String scaleStrategyId) {
		this.scaleStrategyId = scaleStrategyId;
		if(scaleStrategyId != null){
			putQueryParameter("ScaleStrategyId", scaleStrategyId);
		}
	}

	public Boolean getDisableSessionConfig() {
		return this.disableSessionConfig;
	}

	public void setDisableSessionConfig(Boolean disableSessionConfig) {
		this.disableSessionConfig = disableSessionConfig;
		if(disableSessionConfig != null){
			putQueryParameter("DisableSessionConfig", disableSessionConfig.toString());
		}
	}

	public Long getBindAmount() {
		return this.bindAmount;
	}

	public void setBindAmount(Long bindAmount) {
		this.bindAmount = bindAmount;
		if(bindAmount != null){
			putQueryParameter("BindAmount", bindAmount.toString());
		}
	}

	public Long getLoadPolicy() {
		return this.loadPolicy;
	}

	public void setLoadPolicy(Long loadPolicy) {
		this.loadPolicy = loadPolicy;
		if(loadPolicy != null){
			putQueryParameter("LoadPolicy", loadPolicy.toString());
		}
	}

	public String getDesktopGroupName() {
		return this.desktopGroupName;
	}

	public void setDesktopGroupName(String desktopGroupName) {
		this.desktopGroupName = desktopGroupName;
		if(desktopGroupName != null){
			putQueryParameter("DesktopGroupName", desktopGroupName);
		}
	}

	public Integer getAllowBufferCount() {
		return this.allowBufferCount;
	}

	public void setAllowBufferCount(Integer allowBufferCount) {
		this.allowBufferCount = allowBufferCount;
		if(allowBufferCount != null){
			putQueryParameter("AllowBufferCount", allowBufferCount.toString());
		}
	}

	public List<String> getPolicyGroupIdss() {
		return this.policyGroupIdss;
	}

	public void setPolicyGroupIdss(List<String> policyGroupIdss) {
		this.policyGroupIdss = policyGroupIdss;	
		if (policyGroupIdss != null) {
			for (int i = 0; i < policyGroupIdss.size(); i++) {
				putQueryParameter("PolicyGroupIds." + (i + 1) , policyGroupIdss.get(i));
			}
		}	
	}

	public Long getIdleDisconnectDuration() {
		return this.idleDisconnectDuration;
	}

	public void setIdleDisconnectDuration(Long idleDisconnectDuration) {
		this.idleDisconnectDuration = idleDisconnectDuration;
		if(idleDisconnectDuration != null){
			putQueryParameter("IdleDisconnectDuration", idleDisconnectDuration.toString());
		}
	}

	public String getDesktopGroupId() {
		return this.desktopGroupId;
	}

	public void setDesktopGroupId(String desktopGroupId) {
		this.desktopGroupId = desktopGroupId;
		if(desktopGroupId != null){
			putQueryParameter("DesktopGroupId", desktopGroupId);
		}
	}

	public Integer getMinDesktopsCount() {
		return this.minDesktopsCount;
	}

	public void setMinDesktopsCount(Integer minDesktopsCount) {
		this.minDesktopsCount = minDesktopsCount;
		if(minDesktopsCount != null){
			putQueryParameter("MinDesktopsCount", minDesktopsCount.toString());
		}
	}

	public Integer getMaxDesktopsCount() {
		return this.maxDesktopsCount;
	}

	public void setMaxDesktopsCount(Integer maxDesktopsCount) {
		this.maxDesktopsCount = maxDesktopsCount;
		if(maxDesktopsCount != null){
			putQueryParameter("MaxDesktopsCount", maxDesktopsCount.toString());
		}
	}

	public String getFileSystemId() {
		return this.fileSystemId;
	}

	public void setFileSystemId(String fileSystemId) {
		this.fileSystemId = fileSystemId;
		if(fileSystemId != null){
			putQueryParameter("FileSystemId", fileSystemId);
		}
	}

	public Integer getAllowAutoSetup() {
		return this.allowAutoSetup;
	}

	public void setAllowAutoSetup(Integer allowAutoSetup) {
		this.allowAutoSetup = allowAutoSetup;
		if(allowAutoSetup != null){
			putQueryParameter("AllowAutoSetup", allowAutoSetup.toString());
		}
	}

	public String getComments() {
		return this.comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
		if(comments != null){
			putQueryParameter("Comments", comments);
		}
	}

	public Long getResetType() {
		return this.resetType;
	}

	public void setResetType(Long resetType) {
		this.resetType = resetType;
		if(resetType != null){
			putQueryParameter("ResetType", resetType.toString());
		}
	}

	public String getOwnBundleId() {
		return this.ownBundleId;
	}

	public void setOwnBundleId(String ownBundleId) {
		this.ownBundleId = ownBundleId;
		if(ownBundleId != null){
			putQueryParameter("OwnBundleId", ownBundleId);
		}
	}

	public Long getStopDuration() {
		return this.stopDuration;
	}

	public void setStopDuration(Long stopDuration) {
		this.stopDuration = stopDuration;
		if(stopDuration != null){
			putQueryParameter("StopDuration", stopDuration.toString());
		}
	}

	public Float getRatioThreshold() {
		return this.ratioThreshold;
	}

	public void setRatioThreshold(Float ratioThreshold) {
		this.ratioThreshold = ratioThreshold;
		if(ratioThreshold != null){
			putQueryParameter("RatioThreshold", ratioThreshold.toString());
		}
	}

	public Long getKeepDuration() {
		return this.keepDuration;
	}

	public void setKeepDuration(Long keepDuration) {
		this.keepDuration = keepDuration;
		if(keepDuration != null){
			putQueryParameter("KeepDuration", keepDuration.toString());
		}
	}

	public Long getConnectDuration() {
		return this.connectDuration;
	}

	public void setConnectDuration(Long connectDuration) {
		this.connectDuration = connectDuration;
		if(connectDuration != null){
			putQueryParameter("ConnectDuration", connectDuration.toString());
		}
	}

	public Boolean getProfileFollowSwitch() {
		return this.profileFollowSwitch;
	}

	public void setProfileFollowSwitch(Boolean profileFollowSwitch) {
		this.profileFollowSwitch = profileFollowSwitch;
		if(profileFollowSwitch != null){
			putQueryParameter("ProfileFollowSwitch", profileFollowSwitch.toString());
		}
	}

	public Integer getBuyDesktopsCount() {
		return this.buyDesktopsCount;
	}

	public void setBuyDesktopsCount(Integer buyDesktopsCount) {
		this.buyDesktopsCount = buyDesktopsCount;
		if(buyDesktopsCount != null){
			putQueryParameter("BuyDesktopsCount", buyDesktopsCount.toString());
		}
	}

	public String getPolicyGroupId() {
		return this.policyGroupId;
	}

	public void setPolicyGroupId(String policyGroupId) {
		this.policyGroupId = policyGroupId;
		if(policyGroupId != null){
			putQueryParameter("PolicyGroupId", policyGroupId);
		}
	}

	@Override
	public Class<ModifyDesktopGroupResponse> getResponseClass() {
		return ModifyDesktopGroupResponse.class;
	}

}
