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

package com.aliyuncs.ehpc.model.v20180412;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.ehpc.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class AddNodesRequest extends RpcAcsRequest<AddNodesResponse> {
	   

	private String dnsConfig;

	private String imageOwnerAlias;

	private List<DataDisks> dataDiskss;

	private Integer systemDiskSize;

	private String hostNamePrefix;

	private String computeSpotInterruptionBehavior;

	private String computeSpotPriceLimit;

	private Integer autoRenewPeriod;

	private Integer period;

	private Integer count;

	private String computeSpotStrategy;

	private String hostNameSuffix;

	private Boolean sync;

	private String vSwitchId;

	private String periodUnit;

	private Boolean computeEnableHt;

	private String autoRenew;

	private String internetChargeType;

	private String createMode;

	private String zoneId;

	private Integer internetMaxBandWidthIn;

	private String imageId;

	private String systemDiskLevel;

	private String clientToken;

	private Boolean allocatePublicAddress;

	private Integer internetMaxBandWidthOut;

	private String jobQueue;

	private String systemDiskType;

	private Integer minCount;

	private String instanceType;

	private String clusterId;

	private String networkInterfaceTrafficMode;

	private Integer computeSpotDuration;

	private String ecsChargeType;
	public AddNodesRequest() {
		super("EHPC", "2018-04-12", "AddNodes");
		setMethod(MethodType.GET);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getDnsConfig() {
		return this.dnsConfig;
	}

	public void setDnsConfig(String dnsConfig) {
		this.dnsConfig = dnsConfig;
		if(dnsConfig != null){
			putQueryParameter("DnsConfig", dnsConfig);
		}
	}

	public String getImageOwnerAlias() {
		return this.imageOwnerAlias;
	}

	public void setImageOwnerAlias(String imageOwnerAlias) {
		this.imageOwnerAlias = imageOwnerAlias;
		if(imageOwnerAlias != null){
			putQueryParameter("ImageOwnerAlias", imageOwnerAlias);
		}
	}

	public List<DataDisks> getDataDiskss() {
		return this.dataDiskss;
	}

	public void setDataDiskss(List<DataDisks> dataDiskss) {
		this.dataDiskss = dataDiskss;	
		if (dataDiskss != null) {
			for (int depth1 = 0; depth1 < dataDiskss.size(); depth1++) {
				putQueryParameter("DataDisks." + (depth1 + 1) + ".DataDiskDeleteWithInstance" , dataDiskss.get(depth1).getDataDiskDeleteWithInstance());
				putQueryParameter("DataDisks." + (depth1 + 1) + ".DataDiskEncrypted" , dataDiskss.get(depth1).getDataDiskEncrypted());
				putQueryParameter("DataDisks." + (depth1 + 1) + ".DataDiskKMSKeyId" , dataDiskss.get(depth1).getDataDiskKMSKeyId());
				putQueryParameter("DataDisks." + (depth1 + 1) + ".DataDiskSize" , dataDiskss.get(depth1).getDataDiskSize());
				putQueryParameter("DataDisks." + (depth1 + 1) + ".DataDiskCategory" , dataDiskss.get(depth1).getDataDiskCategory());
				putQueryParameter("DataDisks." + (depth1 + 1) + ".DataDiskPerformanceLevel" , dataDiskss.get(depth1).getDataDiskPerformanceLevel());
			}
		}	
	}

	public Integer getSystemDiskSize() {
		return this.systemDiskSize;
	}

	public void setSystemDiskSize(Integer systemDiskSize) {
		this.systemDiskSize = systemDiskSize;
		if(systemDiskSize != null){
			putQueryParameter("SystemDiskSize", systemDiskSize.toString());
		}
	}

	public String getHostNamePrefix() {
		return this.hostNamePrefix;
	}

	public void setHostNamePrefix(String hostNamePrefix) {
		this.hostNamePrefix = hostNamePrefix;
		if(hostNamePrefix != null){
			putQueryParameter("HostNamePrefix", hostNamePrefix);
		}
	}

	public String getComputeSpotInterruptionBehavior() {
		return this.computeSpotInterruptionBehavior;
	}

	public void setComputeSpotInterruptionBehavior(String computeSpotInterruptionBehavior) {
		this.computeSpotInterruptionBehavior = computeSpotInterruptionBehavior;
		if(computeSpotInterruptionBehavior != null){
			putQueryParameter("ComputeSpotInterruptionBehavior", computeSpotInterruptionBehavior);
		}
	}

	public String getComputeSpotPriceLimit() {
		return this.computeSpotPriceLimit;
	}

	public void setComputeSpotPriceLimit(String computeSpotPriceLimit) {
		this.computeSpotPriceLimit = computeSpotPriceLimit;
		if(computeSpotPriceLimit != null){
			putQueryParameter("ComputeSpotPriceLimit", computeSpotPriceLimit);
		}
	}

	public Integer getAutoRenewPeriod() {
		return this.autoRenewPeriod;
	}

	public void setAutoRenewPeriod(Integer autoRenewPeriod) {
		this.autoRenewPeriod = autoRenewPeriod;
		if(autoRenewPeriod != null){
			putQueryParameter("AutoRenewPeriod", autoRenewPeriod.toString());
		}
	}

	public Integer getPeriod() {
		return this.period;
	}

	public void setPeriod(Integer period) {
		this.period = period;
		if(period != null){
			putQueryParameter("Period", period.toString());
		}
	}

	public Integer getCount() {
		return this.count;
	}

	public void setCount(Integer count) {
		this.count = count;
		if(count != null){
			putQueryParameter("Count", count.toString());
		}
	}

	public String getComputeSpotStrategy() {
		return this.computeSpotStrategy;
	}

	public void setComputeSpotStrategy(String computeSpotStrategy) {
		this.computeSpotStrategy = computeSpotStrategy;
		if(computeSpotStrategy != null){
			putQueryParameter("ComputeSpotStrategy", computeSpotStrategy);
		}
	}

	public String getHostNameSuffix() {
		return this.hostNameSuffix;
	}

	public void setHostNameSuffix(String hostNameSuffix) {
		this.hostNameSuffix = hostNameSuffix;
		if(hostNameSuffix != null){
			putQueryParameter("HostNameSuffix", hostNameSuffix);
		}
	}

	public Boolean getSync() {
		return this.sync;
	}

	public void setSync(Boolean sync) {
		this.sync = sync;
		if(sync != null){
			putQueryParameter("Sync", sync.toString());
		}
	}

	public String getVSwitchId() {
		return this.vSwitchId;
	}

	public void setVSwitchId(String vSwitchId) {
		this.vSwitchId = vSwitchId;
		if(vSwitchId != null){
			putQueryParameter("VSwitchId", vSwitchId);
		}
	}

	public String getPeriodUnit() {
		return this.periodUnit;
	}

	public void setPeriodUnit(String periodUnit) {
		this.periodUnit = periodUnit;
		if(periodUnit != null){
			putQueryParameter("PeriodUnit", periodUnit);
		}
	}

	public Boolean getComputeEnableHt() {
		return this.computeEnableHt;
	}

	public void setComputeEnableHt(Boolean computeEnableHt) {
		this.computeEnableHt = computeEnableHt;
		if(computeEnableHt != null){
			putQueryParameter("ComputeEnableHt", computeEnableHt.toString());
		}
	}

	public String getAutoRenew() {
		return this.autoRenew;
	}

	public void setAutoRenew(String autoRenew) {
		this.autoRenew = autoRenew;
		if(autoRenew != null){
			putQueryParameter("AutoRenew", autoRenew);
		}
	}

	public String getInternetChargeType() {
		return this.internetChargeType;
	}

	public void setInternetChargeType(String internetChargeType) {
		this.internetChargeType = internetChargeType;
		if(internetChargeType != null){
			putQueryParameter("InternetChargeType", internetChargeType);
		}
	}

	public String getCreateMode() {
		return this.createMode;
	}

	public void setCreateMode(String createMode) {
		this.createMode = createMode;
		if(createMode != null){
			putQueryParameter("CreateMode", createMode);
		}
	}

	public String getZoneId() {
		return this.zoneId;
	}

	public void setZoneId(String zoneId) {
		this.zoneId = zoneId;
		if(zoneId != null){
			putQueryParameter("ZoneId", zoneId);
		}
	}

	public Integer getInternetMaxBandWidthIn() {
		return this.internetMaxBandWidthIn;
	}

	public void setInternetMaxBandWidthIn(Integer internetMaxBandWidthIn) {
		this.internetMaxBandWidthIn = internetMaxBandWidthIn;
		if(internetMaxBandWidthIn != null){
			putQueryParameter("InternetMaxBandWidthIn", internetMaxBandWidthIn.toString());
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

	public String getSystemDiskLevel() {
		return this.systemDiskLevel;
	}

	public void setSystemDiskLevel(String systemDiskLevel) {
		this.systemDiskLevel = systemDiskLevel;
		if(systemDiskLevel != null){
			putQueryParameter("SystemDiskLevel", systemDiskLevel);
		}
	}

	public String getClientToken() {
		return this.clientToken;
	}

	public void setClientToken(String clientToken) {
		this.clientToken = clientToken;
		if(clientToken != null){
			putQueryParameter("ClientToken", clientToken);
		}
	}

	public Boolean getAllocatePublicAddress() {
		return this.allocatePublicAddress;
	}

	public void setAllocatePublicAddress(Boolean allocatePublicAddress) {
		this.allocatePublicAddress = allocatePublicAddress;
		if(allocatePublicAddress != null){
			putQueryParameter("AllocatePublicAddress", allocatePublicAddress.toString());
		}
	}

	public Integer getInternetMaxBandWidthOut() {
		return this.internetMaxBandWidthOut;
	}

	public void setInternetMaxBandWidthOut(Integer internetMaxBandWidthOut) {
		this.internetMaxBandWidthOut = internetMaxBandWidthOut;
		if(internetMaxBandWidthOut != null){
			putQueryParameter("InternetMaxBandWidthOut", internetMaxBandWidthOut.toString());
		}
	}

	public String getJobQueue() {
		return this.jobQueue;
	}

	public void setJobQueue(String jobQueue) {
		this.jobQueue = jobQueue;
		if(jobQueue != null){
			putQueryParameter("JobQueue", jobQueue);
		}
	}

	public String getSystemDiskType() {
		return this.systemDiskType;
	}

	public void setSystemDiskType(String systemDiskType) {
		this.systemDiskType = systemDiskType;
		if(systemDiskType != null){
			putQueryParameter("SystemDiskType", systemDiskType);
		}
	}

	public Integer getMinCount() {
		return this.minCount;
	}

	public void setMinCount(Integer minCount) {
		this.minCount = minCount;
		if(minCount != null){
			putQueryParameter("MinCount", minCount.toString());
		}
	}

	public String getInstanceType() {
		return this.instanceType;
	}

	public void setInstanceType(String instanceType) {
		this.instanceType = instanceType;
		if(instanceType != null){
			putQueryParameter("InstanceType", instanceType);
		}
	}

	public String getClusterId() {
		return this.clusterId;
	}

	public void setClusterId(String clusterId) {
		this.clusterId = clusterId;
		if(clusterId != null){
			putQueryParameter("ClusterId", clusterId);
		}
	}

	public String getNetworkInterfaceTrafficMode() {
		return this.networkInterfaceTrafficMode;
	}

	public void setNetworkInterfaceTrafficMode(String networkInterfaceTrafficMode) {
		this.networkInterfaceTrafficMode = networkInterfaceTrafficMode;
		if(networkInterfaceTrafficMode != null){
			putQueryParameter("NetworkInterfaceTrafficMode", networkInterfaceTrafficMode);
		}
	}

	public Integer getComputeSpotDuration() {
		return this.computeSpotDuration;
	}

	public void setComputeSpotDuration(Integer computeSpotDuration) {
		this.computeSpotDuration = computeSpotDuration;
		if(computeSpotDuration != null){
			putQueryParameter("ComputeSpotDuration", computeSpotDuration.toString());
		}
	}

	public String getEcsChargeType() {
		return this.ecsChargeType;
	}

	public void setEcsChargeType(String ecsChargeType) {
		this.ecsChargeType = ecsChargeType;
		if(ecsChargeType != null){
			putQueryParameter("EcsChargeType", ecsChargeType);
		}
	}

	public static class DataDisks {

		private Boolean dataDiskDeleteWithInstance;

		private Boolean dataDiskEncrypted;

		private String dataDiskKMSKeyId;

		private Integer dataDiskSize;

		private String dataDiskCategory;

		private String dataDiskPerformanceLevel;

		public Boolean getDataDiskDeleteWithInstance() {
			return this.dataDiskDeleteWithInstance;
		}

		public void setDataDiskDeleteWithInstance(Boolean dataDiskDeleteWithInstance) {
			this.dataDiskDeleteWithInstance = dataDiskDeleteWithInstance;
		}

		public Boolean getDataDiskEncrypted() {
			return this.dataDiskEncrypted;
		}

		public void setDataDiskEncrypted(Boolean dataDiskEncrypted) {
			this.dataDiskEncrypted = dataDiskEncrypted;
		}

		public String getDataDiskKMSKeyId() {
			return this.dataDiskKMSKeyId;
		}

		public void setDataDiskKMSKeyId(String dataDiskKMSKeyId) {
			this.dataDiskKMSKeyId = dataDiskKMSKeyId;
		}

		public Integer getDataDiskSize() {
			return this.dataDiskSize;
		}

		public void setDataDiskSize(Integer dataDiskSize) {
			this.dataDiskSize = dataDiskSize;
		}

		public String getDataDiskCategory() {
			return this.dataDiskCategory;
		}

		public void setDataDiskCategory(String dataDiskCategory) {
			this.dataDiskCategory = dataDiskCategory;
		}

		public String getDataDiskPerformanceLevel() {
			return this.dataDiskPerformanceLevel;
		}

		public void setDataDiskPerformanceLevel(String dataDiskPerformanceLevel) {
			this.dataDiskPerformanceLevel = dataDiskPerformanceLevel;
		}
	}

	@Override
	public Class<AddNodesResponse> getResponseClass() {
		return AddNodesResponse.class;
	}

}
