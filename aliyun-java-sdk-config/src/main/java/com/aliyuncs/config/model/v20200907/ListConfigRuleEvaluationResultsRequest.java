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

package com.aliyuncs.config.model.v20200907;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.config.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class ListConfigRuleEvaluationResultsRequest extends RpcAcsRequest<ListConfigRuleEvaluationResultsResponse> {
	   

	private String configRuleId;

	private String regions;

	private String nextToken;

	private String compliancePackId;

	private String complianceType;

	private String resourceTypes;

	private String resourceGroupIds;

	private Integer maxResults;
	public ListConfigRuleEvaluationResultsRequest() {
		super("Config", "2020-09-07", "ListConfigRuleEvaluationResults");
		setMethod(MethodType.GET);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getConfigRuleId() {
		return this.configRuleId;
	}

	public void setConfigRuleId(String configRuleId) {
		this.configRuleId = configRuleId;
		if(configRuleId != null){
			putQueryParameter("ConfigRuleId", configRuleId);
		}
	}

	public String getRegions() {
		return this.regions;
	}

	public void setRegions(String regions) {
		this.regions = regions;
		if(regions != null){
			putQueryParameter("Regions", regions);
		}
	}

	public String getNextToken() {
		return this.nextToken;
	}

	public void setNextToken(String nextToken) {
		this.nextToken = nextToken;
		if(nextToken != null){
			putQueryParameter("NextToken", nextToken);
		}
	}

	public String getCompliancePackId() {
		return this.compliancePackId;
	}

	public void setCompliancePackId(String compliancePackId) {
		this.compliancePackId = compliancePackId;
		if(compliancePackId != null){
			putQueryParameter("CompliancePackId", compliancePackId);
		}
	}

	public String getComplianceType() {
		return this.complianceType;
	}

	public void setComplianceType(String complianceType) {
		this.complianceType = complianceType;
		if(complianceType != null){
			putQueryParameter("ComplianceType", complianceType);
		}
	}

	public String getResourceTypes() {
		return this.resourceTypes;
	}

	public void setResourceTypes(String resourceTypes) {
		this.resourceTypes = resourceTypes;
		if(resourceTypes != null){
			putQueryParameter("ResourceTypes", resourceTypes);
		}
	}

	public String getResourceGroupIds() {
		return this.resourceGroupIds;
	}

	public void setResourceGroupIds(String resourceGroupIds) {
		this.resourceGroupIds = resourceGroupIds;
		if(resourceGroupIds != null){
			putQueryParameter("ResourceGroupIds", resourceGroupIds);
		}
	}

	public Integer getMaxResults() {
		return this.maxResults;
	}

	public void setMaxResults(Integer maxResults) {
		this.maxResults = maxResults;
		if(maxResults != null){
			putQueryParameter("MaxResults", maxResults.toString());
		}
	}

	@Override
	public Class<ListConfigRuleEvaluationResultsResponse> getResponseClass() {
		return ListConfigRuleEvaluationResultsResponse.class;
	}

}
