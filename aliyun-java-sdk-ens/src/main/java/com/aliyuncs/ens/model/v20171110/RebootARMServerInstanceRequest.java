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

package com.aliyuncs.ens.model.v20171110;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class RebootARMServerInstanceRequest extends RpcAcsRequest<RebootARMServerInstanceResponse> {
	   

	private String serverId;

	@SerializedName("serverIds")
	private List<String> serverIds;
	public RebootARMServerInstanceRequest() {
		super("Ens", "2017-11-10", "RebootARMServerInstance", "ens");
		setMethod(MethodType.GET);
	}

	public String getServerId() {
		return this.serverId;
	}

	public void setServerId(String serverId) {
		this.serverId = serverId;
		if(serverId != null){
			putQueryParameter("ServerId", serverId);
		}
	}

	public List<String> getServerIds() {
		return this.serverIds;
	}

	public void setServerIds(List<String> serverIds) {
		this.serverIds = serverIds;	
		if (serverIds != null) {
			putQueryParameter("ServerIds" , new Gson().toJson(serverIds));
		}	
	}

	@Override
	public Class<RebootARMServerInstanceResponse> getResponseClass() {
		return RebootARMServerInstanceResponse.class;
	}

}
