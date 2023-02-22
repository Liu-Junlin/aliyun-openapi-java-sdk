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

package com.aliyuncs.sas.model.v20181203;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.sas.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class DisableCustomBlockRecordRequest extends RpcAcsRequest<DisableCustomBlockRecordResponse> {
	   

	private Long resourceOwnerId;

	private String bound;

	private String blockIp;
	public DisableCustomBlockRecordRequest() {
		super("Sas", "2018-12-03", "DisableCustomBlockRecord");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public Long getResourceOwnerId() {
		return this.resourceOwnerId;
	}

	public void setResourceOwnerId(Long resourceOwnerId) {
		this.resourceOwnerId = resourceOwnerId;
		if(resourceOwnerId != null){
			putQueryParameter("ResourceOwnerId", resourceOwnerId.toString());
		}
	}

	public String getBound() {
		return this.bound;
	}

	public void setBound(String bound) {
		this.bound = bound;
		if(bound != null){
			putQueryParameter("Bound", bound);
		}
	}

	public String getBlockIp() {
		return this.blockIp;
	}

	public void setBlockIp(String blockIp) {
		this.blockIp = blockIp;
		if(blockIp != null){
			putQueryParameter("BlockIp", blockIp);
		}
	}

	@Override
	public Class<DisableCustomBlockRecordResponse> getResponseClass() {
		return DisableCustomBlockRecordResponse.class;
	}

}
