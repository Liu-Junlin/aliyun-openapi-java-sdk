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

package com.aliyuncs.advisor_share.model.v20180608;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class DescribeAdvisorUserRequest extends RpcAcsRequest<DescribeAdvisorUserResponse> {
	   

	private Long associateUid;

	private Long clientUid;

	private String language;

	private String token;
	public DescribeAdvisorUserRequest() {
		super("Advisor-Share", "2018-06-08", "DescribeAdvisorUser", "advisor");
		setMethod(MethodType.POST);
	}

	public Long getAssociateUid() {
		return this.associateUid;
	}

	public void setAssociateUid(Long associateUid) {
		this.associateUid = associateUid;
		if(associateUid != null){
			putQueryParameter("AssociateUid", associateUid.toString());
		}
	}

	public Long getClientUid() {
		return this.clientUid;
	}

	public void setClientUid(Long clientUid) {
		this.clientUid = clientUid;
		if(clientUid != null){
			putQueryParameter("ClientUid", clientUid.toString());
		}
	}

	public String getLanguage() {
		return this.language;
	}

	public void setLanguage(String language) {
		this.language = language;
		if(language != null){
			putQueryParameter("Language", language);
		}
	}

	public String getToken() {
		return this.token;
	}

	public void setToken(String token) {
		this.token = token;
		if(token != null){
			putQueryParameter("Token", token);
		}
	}

	@Override
	public Class<DescribeAdvisorUserResponse> getResponseClass() {
		return DescribeAdvisorUserResponse.class;
	}

}
