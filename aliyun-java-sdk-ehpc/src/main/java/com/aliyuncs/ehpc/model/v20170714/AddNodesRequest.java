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

package com.aliyuncs.ehpc.model.v20170714;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.ehpc.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class AddNodesRequest extends RpcAcsRequest<AddNodesResponse> {
	   

	private String imageId;

	private Integer count;

	private String clusterId;

	private String computeSpotStrategy;

	private String imageOwnerAlias;

	private String computeSpotPriceLimit;
	public AddNodesRequest() {
		super("EHPC", "2017-07-14", "AddNodes");
		setMethod(MethodType.GET);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getImageId() {
		return this.imageId;
	}

	public void setImageId(String imageId) {
		this.imageId = imageId;
		if(imageId != null){
			putQueryParameter("ImageId", imageId);
		}
	}

	public Integer getCount() {
		return this.count;
	}

	public void setCount(Integer count) {
		this.count = count;
		if(count != null){
			putQueryParameter("Count", count.toString());
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

	public String getComputeSpotStrategy() {
		return this.computeSpotStrategy;
	}

	public void setComputeSpotStrategy(String computeSpotStrategy) {
		this.computeSpotStrategy = computeSpotStrategy;
		if(computeSpotStrategy != null){
			putQueryParameter("ComputeSpotStrategy", computeSpotStrategy);
		}
	}

	public String getImageOwnerAlias() {
		return this.imageOwnerAlias;
	}

	public void setImageOwnerAlias(String imageOwnerAlias) {
		this.imageOwnerAlias = imageOwnerAlias;
		if(imageOwnerAlias != null){
			putQueryParameter("ImageOwnerAlias", imageOwnerAlias);
		}
	}

	public String getComputeSpotPriceLimit() {
		return this.computeSpotPriceLimit;
	}

	public void setComputeSpotPriceLimit(String computeSpotPriceLimit) {
		this.computeSpotPriceLimit = computeSpotPriceLimit;
		if(computeSpotPriceLimit != null){
			putQueryParameter("ComputeSpotPriceLimit", computeSpotPriceLimit);
		}
	}

	@Override
	public Class<AddNodesResponse> getResponseClass() {
		return AddNodesResponse.class;
	}

}
