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

package com.aliyuncs.iotcc.model.v20210513;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.iotcc.transform.v20210513.ListGroupIpMappingRulesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListGroupIpMappingRulesResponse extends AcsResponse {

	private String requestId;

	private Integer totalCount;

	private String nextToken;

	private Integer maxResults;

	private List<GroupIpMappingRuleModels> ipMappingRules;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

	public String getNextToken() {
		return this.nextToken;
	}

	public void setNextToken(String nextToken) {
		this.nextToken = nextToken;
	}

	public Integer getMaxResults() {
		return this.maxResults;
	}

	public void setMaxResults(Integer maxResults) {
		this.maxResults = maxResults;
	}

	public List<GroupIpMappingRuleModels> getIpMappingRules() {
		return this.ipMappingRules;
	}

	public void setIpMappingRules(List<GroupIpMappingRuleModels> ipMappingRules) {
		this.ipMappingRules = ipMappingRules;
	}

	public static class GroupIpMappingRuleModels {

		private String ioTCloudConnectorGroupId;

		private String ipMappingRuleStatus;

		private String mappingIp;

		private String destinationIp;

		private String ipMappingRuleName;

		private String ipMappingRuleDescription;

		private String ipMappingRuleId;

		public String getIoTCloudConnectorGroupId() {
			return this.ioTCloudConnectorGroupId;
		}

		public void setIoTCloudConnectorGroupId(String ioTCloudConnectorGroupId) {
			this.ioTCloudConnectorGroupId = ioTCloudConnectorGroupId;
		}

		public String getIpMappingRuleStatus() {
			return this.ipMappingRuleStatus;
		}

		public void setIpMappingRuleStatus(String ipMappingRuleStatus) {
			this.ipMappingRuleStatus = ipMappingRuleStatus;
		}

		public String getMappingIp() {
			return this.mappingIp;
		}

		public void setMappingIp(String mappingIp) {
			this.mappingIp = mappingIp;
		}

		public String getDestinationIp() {
			return this.destinationIp;
		}

		public void setDestinationIp(String destinationIp) {
			this.destinationIp = destinationIp;
		}

		public String getIpMappingRuleName() {
			return this.ipMappingRuleName;
		}

		public void setIpMappingRuleName(String ipMappingRuleName) {
			this.ipMappingRuleName = ipMappingRuleName;
		}

		public String getIpMappingRuleDescription() {
			return this.ipMappingRuleDescription;
		}

		public void setIpMappingRuleDescription(String ipMappingRuleDescription) {
			this.ipMappingRuleDescription = ipMappingRuleDescription;
		}

		public String getIpMappingRuleId() {
			return this.ipMappingRuleId;
		}

		public void setIpMappingRuleId(String ipMappingRuleId) {
			this.ipMappingRuleId = ipMappingRuleId;
		}
	}

	@Override
	public ListGroupIpMappingRulesResponse getInstance(UnmarshallerContext context) {
		return	ListGroupIpMappingRulesResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
