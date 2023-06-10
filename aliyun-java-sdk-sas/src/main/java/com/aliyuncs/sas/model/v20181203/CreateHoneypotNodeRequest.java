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
import java.util.List;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.sas.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class CreateHoneypotNodeRequest extends RpcAcsRequest<CreateHoneypotNodeResponse> {
	   

	private Integer availableProbeNum;

	private Boolean allowHoneypotAccessInternet;

	private String nodeName;

	private List<String> securityGroupProbeIpLists;
	public CreateHoneypotNodeRequest() {
		super("Sas", "2018-12-03", "CreateHoneypotNode", "sas");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public Integer getAvailableProbeNum() {
		return this.availableProbeNum;
	}

	public void setAvailableProbeNum(Integer availableProbeNum) {
		this.availableProbeNum = availableProbeNum;
		if(availableProbeNum != null){
			putQueryParameter("AvailableProbeNum", availableProbeNum.toString());
		}
	}

	public Boolean getAllowHoneypotAccessInternet() {
		return this.allowHoneypotAccessInternet;
	}

	public void setAllowHoneypotAccessInternet(Boolean allowHoneypotAccessInternet) {
		this.allowHoneypotAccessInternet = allowHoneypotAccessInternet;
		if(allowHoneypotAccessInternet != null){
			putQueryParameter("AllowHoneypotAccessInternet", allowHoneypotAccessInternet.toString());
		}
	}

	public String getNodeName() {
		return this.nodeName;
	}

	public void setNodeName(String nodeName) {
		this.nodeName = nodeName;
		if(nodeName != null){
			putQueryParameter("NodeName", nodeName);
		}
	}

	public List<String> getSecurityGroupProbeIpLists() {
		return this.securityGroupProbeIpLists;
	}

	public void setSecurityGroupProbeIpLists(List<String> securityGroupProbeIpLists) {
		this.securityGroupProbeIpLists = securityGroupProbeIpLists;	
		if (securityGroupProbeIpLists != null) {
			for (int i = 0; i < securityGroupProbeIpLists.size(); i++) {
				putQueryParameter("SecurityGroupProbeIpList." + (i + 1) , securityGroupProbeIpLists.get(i));
			}
		}	
	}

	@Override
	public Class<CreateHoneypotNodeResponse> getResponseClass() {
		return CreateHoneypotNodeResponse.class;
	}

}
