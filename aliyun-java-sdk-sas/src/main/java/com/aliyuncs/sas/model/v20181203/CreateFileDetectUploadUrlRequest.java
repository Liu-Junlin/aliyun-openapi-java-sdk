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
public class CreateFileDetectUploadUrlRequest extends RpcAcsRequest<CreateFileDetectUploadUrlResponse> {
	   

	private List<String> hashKeyLists;

	private Integer type;

	private List<HashKeyContextList> hashKeyContextLists;
	public CreateFileDetectUploadUrlRequest() {
		super("Sas", "2018-12-03", "CreateFileDetectUploadUrl", "sas");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public List<String> getHashKeyLists() {
		return this.hashKeyLists;
	}

	public void setHashKeyLists(List<String> hashKeyLists) {
		this.hashKeyLists = hashKeyLists;	
		if (hashKeyLists != null) {
			for (int i = 0; i < hashKeyLists.size(); i++) {
				putQueryParameter("HashKeyList." + (i + 1) , hashKeyLists.get(i));
			}
		}	
	}

	public Integer getType() {
		return this.type;
	}

	public void setType(Integer type) {
		this.type = type;
		if(type != null){
			putQueryParameter("Type", type.toString());
		}
	}

	public List<HashKeyContextList> getHashKeyContextLists() {
		return this.hashKeyContextLists;
	}

	public void setHashKeyContextLists(List<HashKeyContextList> hashKeyContextLists) {
		this.hashKeyContextLists = hashKeyContextLists;	
		if (hashKeyContextLists != null) {
			for (int depth1 = 0; depth1 < hashKeyContextLists.size(); depth1++) {
				putQueryParameter("HashKeyContextList." + (depth1 + 1) + ".HashKey" , hashKeyContextLists.get(depth1).getHashKey());
				putQueryParameter("HashKeyContextList." + (depth1 + 1) + ".FileSize" , hashKeyContextLists.get(depth1).getFileSize());
			}
		}	
	}

	public static class HashKeyContextList {

		private String hashKey;

		private Integer fileSize;

		public String getHashKey() {
			return this.hashKey;
		}

		public void setHashKey(String hashKey) {
			this.hashKey = hashKey;
		}

		public Integer getFileSize() {
			return this.fileSize;
		}

		public void setFileSize(Integer fileSize) {
			this.fileSize = fileSize;
		}
	}

	@Override
	public Class<CreateFileDetectUploadUrlResponse> getResponseClass() {
		return CreateFileDetectUploadUrlResponse.class;
	}

}
