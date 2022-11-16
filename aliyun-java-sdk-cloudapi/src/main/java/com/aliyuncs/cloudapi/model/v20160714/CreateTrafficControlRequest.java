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

package com.aliyuncs.cloudapi.model.v20160714;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.cloudapi.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class CreateTrafficControlRequest extends RpcAcsRequest<CreateTrafficControlResponse> {
	   

	private String trafficControlName;

	private String description;

	private Integer userDefault;

	private Integer apiDefault;

	private String securityToken;

	private String trafficControlUnit;

	private Integer appDefault;
	public CreateTrafficControlRequest() {
		super("CloudAPI", "2016-07-14", "CreateTrafficControl", "apigateway");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getTrafficControlName() {
		return this.trafficControlName;
	}

	public void setTrafficControlName(String trafficControlName) {
		this.trafficControlName = trafficControlName;
		if(trafficControlName != null){
			putQueryParameter("TrafficControlName", trafficControlName);
		}
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
		if(description != null){
			putQueryParameter("Description", description);
		}
	}

	public Integer getUserDefault() {
		return this.userDefault;
	}

	public void setUserDefault(Integer userDefault) {
		this.userDefault = userDefault;
		if(userDefault != null){
			putQueryParameter("UserDefault", userDefault.toString());
		}
	}

	public Integer getApiDefault() {
		return this.apiDefault;
	}

	public void setApiDefault(Integer apiDefault) {
		this.apiDefault = apiDefault;
		if(apiDefault != null){
			putQueryParameter("ApiDefault", apiDefault.toString());
		}
	}

	public String getSecurityToken() {
		return this.securityToken;
	}

	public void setSecurityToken(String securityToken) {
		this.securityToken = securityToken;
		if(securityToken != null){
			putQueryParameter("SecurityToken", securityToken);
		}
	}

	public String getTrafficControlUnit() {
		return this.trafficControlUnit;
	}

	public void setTrafficControlUnit(String trafficControlUnit) {
		this.trafficControlUnit = trafficControlUnit;
		if(trafficControlUnit != null){
			putQueryParameter("TrafficControlUnit", trafficControlUnit);
		}
	}

	public Integer getAppDefault() {
		return this.appDefault;
	}

	public void setAppDefault(Integer appDefault) {
		this.appDefault = appDefault;
		if(appDefault != null){
			putQueryParameter("AppDefault", appDefault.toString());
		}
	}

	@Override
	public Class<CreateTrafficControlResponse> getResponseClass() {
		return CreateTrafficControlResponse.class;
	}

}
