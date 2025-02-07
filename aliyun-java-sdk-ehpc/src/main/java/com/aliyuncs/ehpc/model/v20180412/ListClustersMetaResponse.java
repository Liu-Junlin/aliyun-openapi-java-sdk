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

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ehpc.transform.v20180412.ListClustersMetaResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListClustersMetaResponse extends AcsResponse {

	private Integer pageSize;

	private String requestId;

	private Integer pageNumber;

	private Integer totalCount;

	private List<ClusterInfoSimple> clusters;

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

	public Integer getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
	}

	public Integer getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

	public List<ClusterInfoSimple> getClusters() {
		return this.clusters;
	}

	public void setClusters(List<ClusterInfoSimple> clusters) {
		this.clusters = clusters;
	}

	public static class ClusterInfoSimple {

		private String status;

		private String vpcId;

		private String schedulerType;

		private String deployMode;

		private Boolean isComputeEss;

		private String osTag;

		private String accountType;

		private String description;

		private String name;

		private String id;

		private String location;

		private String clientVersion;

		private Boolean hasPlugin;

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getVpcId() {
			return this.vpcId;
		}

		public void setVpcId(String vpcId) {
			this.vpcId = vpcId;
		}

		public String getSchedulerType() {
			return this.schedulerType;
		}

		public void setSchedulerType(String schedulerType) {
			this.schedulerType = schedulerType;
		}

		public String getDeployMode() {
			return this.deployMode;
		}

		public void setDeployMode(String deployMode) {
			this.deployMode = deployMode;
		}

		public Boolean getIsComputeEss() {
			return this.isComputeEss;
		}

		public void setIsComputeEss(Boolean isComputeEss) {
			this.isComputeEss = isComputeEss;
		}

		public String getOsTag() {
			return this.osTag;
		}

		public void setOsTag(String osTag) {
			this.osTag = osTag;
		}

		public String getAccountType() {
			return this.accountType;
		}

		public void setAccountType(String accountType) {
			this.accountType = accountType;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getId() {
			return this.id;
		}

		public void setId(String id) {
			this.id = id;
		}

		public String getLocation() {
			return this.location;
		}

		public void setLocation(String location) {
			this.location = location;
		}

		public String getClientVersion() {
			return this.clientVersion;
		}

		public void setClientVersion(String clientVersion) {
			this.clientVersion = clientVersion;
		}

		public Boolean getHasPlugin() {
			return this.hasPlugin;
		}

		public void setHasPlugin(Boolean hasPlugin) {
			this.hasPlugin = hasPlugin;
		}
	}

	@Override
	public ListClustersMetaResponse getInstance(UnmarshallerContext context) {
		return	ListClustersMetaResponseUnmarshaller.unmarshall(this, context);
	}
}
