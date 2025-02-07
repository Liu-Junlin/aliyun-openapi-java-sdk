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
import com.aliyuncs.http.MethodType;
import com.aliyuncs.ehpc.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class AddQueueRequest extends RpcAcsRequest<AddQueueResponse> {
	   

	private String deploymentSetId;

	private String queueName;

	private String clusterId;

	private String networkInterfaceTrafficMode;

	private Boolean useESS;
	public AddQueueRequest() {
		super("EHPC", "2018-04-12", "AddQueue");
		setMethod(MethodType.GET);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getDeploymentSetId() {
		return this.deploymentSetId;
	}

	public void setDeploymentSetId(String deploymentSetId) {
		this.deploymentSetId = deploymentSetId;
		if(deploymentSetId != null){
			putQueryParameter("DeploymentSetId", deploymentSetId);
		}
	}

	public String getQueueName() {
		return this.queueName;
	}

	public void setQueueName(String queueName) {
		this.queueName = queueName;
		if(queueName != null){
			putQueryParameter("QueueName", queueName);
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

	public Boolean getUseESS() {
		return this.useESS;
	}

	public void setUseESS(Boolean useESS) {
		this.useESS = useESS;
		if(useESS != null){
			putQueryParameter("UseESS", useESS.toString());
		}
	}

	@Override
	public Class<AddQueueResponse> getResponseClass() {
		return AddQueueResponse.class;
	}

}
