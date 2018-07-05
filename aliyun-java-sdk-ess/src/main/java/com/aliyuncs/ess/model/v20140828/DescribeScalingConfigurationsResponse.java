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

package com.aliyuncs.ess.model.v20140828;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ess.transform.v20140828.DescribeScalingConfigurationsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeScalingConfigurationsResponse extends AcsResponse {

	private Integer totalCount;

	private Integer pageNumber;

	private Integer pageSize;

	private String requestId;

	private List<ScalingConfiguration> scalingConfigurations;

	public Integer getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

	public Integer getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<ScalingConfiguration> getScalingConfigurations() {
		return this.scalingConfigurations;
	}

	public void setScalingConfigurations(List<ScalingConfiguration> scalingConfigurations) {
		this.scalingConfigurations = scalingConfigurations;
	}

	public static class ScalingConfiguration {

		private String scalingConfigurationId;

		private String scalingConfigurationName;

		private String scalingGroupId;

		private String instanceName;

		private String imageId;

		private String hostName;

		private String instanceType;

		private String instanceGeneration;

		private String securityGroupId;

		private String ioOptimized;

		private String internetChargeType;

		private Integer internetMaxBandwidthIn;

		private Integer internetMaxBandwidthOut;

		private String systemDiskCategory;

		private Integer systemDiskSize;

		private String lifecycleState;

		private String creationTime;

		private Integer loadBalancerWeight;

		private String userData;

		private String keyPairName;

		private String ramRoleName;

		private String deploymentSetId;

		private String securityEnhancementStrategy;

		private String spotStrategy;

		private Boolean passwordInherit;

		private List<DataDisk> dataDisks;

		private List<Tag> tags;

		private List<SpotPriceModel> spotPriceLimit;

		private List<String> instanceTypes;

		public String getScalingConfigurationId() {
			return this.scalingConfigurationId;
		}

		public void setScalingConfigurationId(String scalingConfigurationId) {
			this.scalingConfigurationId = scalingConfigurationId;
		}

		public String getScalingConfigurationName() {
			return this.scalingConfigurationName;
		}

		public void setScalingConfigurationName(String scalingConfigurationName) {
			this.scalingConfigurationName = scalingConfigurationName;
		}

		public String getScalingGroupId() {
			return this.scalingGroupId;
		}

		public void setScalingGroupId(String scalingGroupId) {
			this.scalingGroupId = scalingGroupId;
		}

		public String getInstanceName() {
			return this.instanceName;
		}

		public void setInstanceName(String instanceName) {
			this.instanceName = instanceName;
		}

		public String getImageId() {
			return this.imageId;
		}

		public void setImageId(String imageId) {
			this.imageId = imageId;
		}

		public String getHostName() {
			return this.hostName;
		}

		public void setHostName(String hostName) {
			this.hostName = hostName;
		}

		public String getInstanceType() {
			return this.instanceType;
		}

		public void setInstanceType(String instanceType) {
			this.instanceType = instanceType;
		}

		public String getInstanceGeneration() {
			return this.instanceGeneration;
		}

		public void setInstanceGeneration(String instanceGeneration) {
			this.instanceGeneration = instanceGeneration;
		}

		public String getSecurityGroupId() {
			return this.securityGroupId;
		}

		public void setSecurityGroupId(String securityGroupId) {
			this.securityGroupId = securityGroupId;
		}

		public String getIoOptimized() {
			return this.ioOptimized;
		}

		public void setIoOptimized(String ioOptimized) {
			this.ioOptimized = ioOptimized;
		}

		public String getInternetChargeType() {
			return this.internetChargeType;
		}

		public void setInternetChargeType(String internetChargeType) {
			this.internetChargeType = internetChargeType;
		}

		public Integer getInternetMaxBandwidthIn() {
			return this.internetMaxBandwidthIn;
		}

		public void setInternetMaxBandwidthIn(Integer internetMaxBandwidthIn) {
			this.internetMaxBandwidthIn = internetMaxBandwidthIn;
		}

		public Integer getInternetMaxBandwidthOut() {
			return this.internetMaxBandwidthOut;
		}

		public void setInternetMaxBandwidthOut(Integer internetMaxBandwidthOut) {
			this.internetMaxBandwidthOut = internetMaxBandwidthOut;
		}

		public String getSystemDiskCategory() {
			return this.systemDiskCategory;
		}

		public void setSystemDiskCategory(String systemDiskCategory) {
			this.systemDiskCategory = systemDiskCategory;
		}

		public Integer getSystemDiskSize() {
			return this.systemDiskSize;
		}

		public void setSystemDiskSize(Integer systemDiskSize) {
			this.systemDiskSize = systemDiskSize;
		}

		public String getLifecycleState() {
			return this.lifecycleState;
		}

		public void setLifecycleState(String lifecycleState) {
			this.lifecycleState = lifecycleState;
		}

		public String getCreationTime() {
			return this.creationTime;
		}

		public void setCreationTime(String creationTime) {
			this.creationTime = creationTime;
		}

		public Integer getLoadBalancerWeight() {
			return this.loadBalancerWeight;
		}

		public void setLoadBalancerWeight(Integer loadBalancerWeight) {
			this.loadBalancerWeight = loadBalancerWeight;
		}

		public String getUserData() {
			return this.userData;
		}

		public void setUserData(String userData) {
			this.userData = userData;
		}

		public String getKeyPairName() {
			return this.keyPairName;
		}

		public void setKeyPairName(String keyPairName) {
			this.keyPairName = keyPairName;
		}

		public String getRamRoleName() {
			return this.ramRoleName;
		}

		public void setRamRoleName(String ramRoleName) {
			this.ramRoleName = ramRoleName;
		}

		public String getDeploymentSetId() {
			return this.deploymentSetId;
		}

		public void setDeploymentSetId(String deploymentSetId) {
			this.deploymentSetId = deploymentSetId;
		}

		public String getSecurityEnhancementStrategy() {
			return this.securityEnhancementStrategy;
		}

		public void setSecurityEnhancementStrategy(String securityEnhancementStrategy) {
			this.securityEnhancementStrategy = securityEnhancementStrategy;
		}

		public String getSpotStrategy() {
			return this.spotStrategy;
		}

		public void setSpotStrategy(String spotStrategy) {
			this.spotStrategy = spotStrategy;
		}

		public Boolean getPasswordInherit() {
			return this.passwordInherit;
		}

		public void setPasswordInherit(Boolean passwordInherit) {
			this.passwordInherit = passwordInherit;
		}

		public List<DataDisk> getDataDisks() {
			return this.dataDisks;
		}

		public void setDataDisks(List<DataDisk> dataDisks) {
			this.dataDisks = dataDisks;
		}

		public List<Tag> getTags() {
			return this.tags;
		}

		public void setTags(List<Tag> tags) {
			this.tags = tags;
		}

		public List<SpotPriceModel> getSpotPriceLimit() {
			return this.spotPriceLimit;
		}

		public void setSpotPriceLimit(List<SpotPriceModel> spotPriceLimit) {
			this.spotPriceLimit = spotPriceLimit;
		}

		public List<String> getInstanceTypes() {
			return this.instanceTypes;
		}

		public void setInstanceTypes(List<String> instanceTypes) {
			this.instanceTypes = instanceTypes;
		}

		public static class DataDisk {

			private Integer size;

			private String category;

			private String snapshotId;

			private String device;

			public Integer getSize() {
				return this.size;
			}

			public void setSize(Integer size) {
				this.size = size;
			}

			public String getCategory() {
				return this.category;
			}

			public void setCategory(String category) {
				this.category = category;
			}

			public String getSnapshotId() {
				return this.snapshotId;
			}

			public void setSnapshotId(String snapshotId) {
				this.snapshotId = snapshotId;
			}

			public String getDevice() {
				return this.device;
			}

			public void setDevice(String device) {
				this.device = device;
			}
		}

		public static class Tag {

			private String key;

			private String value;

			public String getKey() {
				return this.key;
			}

			public void setKey(String key) {
				this.key = key;
			}

			public String getValue() {
				return this.value;
			}

			public void setValue(String value) {
				this.value = value;
			}
		}

		public static class SpotPriceModel {

			private String instanceType;

			private Float priceLimit;

			public String getInstanceType() {
				return this.instanceType;
			}

			public void setInstanceType(String instanceType) {
				this.instanceType = instanceType;
			}

			public Float getPriceLimit() {
				return this.priceLimit;
			}

			public void setPriceLimit(Float priceLimit) {
				this.priceLimit = priceLimit;
			}
		}
	}

	@Override
	public DescribeScalingConfigurationsResponse getInstance(UnmarshallerContext context) {
		return	DescribeScalingConfigurationsResponseUnmarshaller.unmarshall(this, context);
	}
}
